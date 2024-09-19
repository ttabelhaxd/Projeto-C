from antlr4 import *
from ipdrawLexer import ipdrawLexer
from ipdrawParser import ipdrawParser
from ipdrawVisitor import ipdrawVisitor
from graphics import Point, Line, GraphWin
import math

class IPDrawInterpreter(ipdrawVisitor):
    def __init__(self, pen, win):
        self.pen = pen
        self.variables = {}
        self.win = win
        self.win.setBackground('white')

    def visitProgram(self, ctx: ipdrawParser.ProgramContext):
        return self.visitChildren(ctx)

    def visitStatement(self, ctx: ipdrawParser.StatementContext):
        return self.visitChildren(ctx)

    def visitPosition(self, ctx: ipdrawParser.PositionContext):
        x = int(ctx.INT(0).getText())
        y = int(ctx.INT(1).getText())
        self.update_position(x, y)
        #print(f"Moved to position ({self.pen['position'].getX()}, {self.pen['position'].getY()})")
        return None

    def visitPenControl(self, ctx: ipdrawParser.PenControlContext):
        control = ctx.getText()
        if control == 'up':
            self.pen['pressure'] = 0
        else:
            self.pen['pressure'] = 1
        #print(f"Pen {'down' if self.pen['pressure'] else 'up'}")
        return None

    def visitMove(self, ctx: ipdrawParser.MoveContext):
        direction = ctx.getChild(0).getText()
        distance = int(ctx.INT().getText())
        angle_rad = math.radians(self.pen['orientation'])

        if direction == 'forward':
            delta_x = distance * math.cos(angle_rad)
            delta_y = -distance * math.sin(angle_rad)
        else:  # backward
            delta_x = -distance * math.cos(angle_rad)
            delta_y = distance * math.sin(angle_rad)

        new_x = self.pen['position'].getX() + delta_x
        new_y = self.pen['position'].getY() + delta_y
        new_position = Point(new_x, new_y)

        if self.pen['pressure']:
            line = Line(self.pen['position'], new_position)
            line.setWidth(self.pen['thickness'])
            line.setFill(self.pen['color'])
            line.draw(self.win)

        self.update_position(new_x, new_y)
        #print(f"Moved {direction} {distance} units to ({new_x}, {new_y})")
        return None

    def visitRotation(self, ctx: ipdrawParser.RotationContext):
        direction = ctx.rotateDirection().getText()
        value = ctx.value().getText()

        angle = int(value.replace('º', '')) if 'º' in value else int(value)

        if direction == 'left':
            self.pen['orientation'] = (self.pen['orientation'] + angle) % 360
        else:
            self.pen['orientation'] = (self.pen['orientation'] - angle) % 360

        #print(f"Rotated {direction} by {angle} degrees to orientation {self.pen['orientation']}")
        return None

    def visitForLoop(self, ctx: ipdrawParser.ForLoopContext):
        self.visit(ctx.assignmentStatement())

        while self.visit(ctx.condition()):
            self.visit(ctx.block())
            self.visit(ctx.assignmentStatementForLoop())

        return None

    def visitUntilLoop(self, ctx: ipdrawParser.UntilLoopContext):
        while not self.visit(ctx.condition()):
            self.visit(ctx.block())
        return None

    def visitBlock(self, ctx: ipdrawParser.BlockContext):
        return self.visitChildren(ctx)

    def visitCondition(self, ctx: ipdrawParser.ConditionContext):
        return self.visit(ctx.expression())

    def visitExpression(self, ctx: ipdrawParser.ExpressionContext):
        if ctx.value():
            return self.visit(ctx.value())
        elif ctx.getChildCount() == 3:
            left = self.visit(ctx.expression(0))
            operator = ctx.getChild(1).getText()
            right = self.visit(ctx.expression(1))

            if operator in ['+', '-', '*', '/', '//', '\\\\']:
                if operator == '+':
                    return left + right
                elif operator == '-':
                    return left - right
                elif operator == '*':
                    return left * right
                elif operator == '/':
                    return left / right
                elif operator == '//':
                    return left // right
                elif operator == '\\\\':
                    return left // right
            elif operator in ['==', '!=', '<', '>', '<=', '>=']:
                if operator == '==':
                    return left == right
                elif operator == '!=':
                    return left != right
                elif operator == '<':
                    return left < right
                elif operator == '>':
                    return left > right
                elif operator == '<=':
                    return left <= right
                elif operator == '>=':
                    return left >= right
        elif ctx.getChildCount() == 5:
            left = self.visit(ctx.expression(0))
            operator = ctx.getChild(3).getText()
            right = self.visit(ctx.expression(1))
            if operator == 'and':
                return left and right
            elif operator == 'or':
                return left or right
        return None

    def visitAssignmentStatement(self, ctx: ipdrawParser.AssignmentStatementContext):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expression())
        self.variables[var_name] = value
        return None

    def visitAssignmentStatementForLoop(self, ctx: ipdrawParser.AssignmentStatementForLoopContext):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expression())
        self.variables[var_name] = value
        return None

    def visitValue(self, ctx: ipdrawParser.ValueContext):
        if ctx.ID():
            return self.variables.get(ctx.ID().getText(), 0)
        elif ctx.INT():
            return int(ctx.INT().getText())
        elif ctx.BOOL():
            return True if ctx.BOOL().getText() == 'true' else False
        elif ctx.ANGLE():
            return int(ctx.ANGLE().getText().replace('º', ''))
        return None

    def update_position(self, x, y):
        self.pen['position'] = Point(x, y)

    def visitChildren(self, node):
        result = None
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            if not child.getText().isspace():
                result = child.accept(self)
        return result

def run_interpreter(pen, input_file, win):
    with open(input_file, 'r') as file:
        input_stream = InputStream(file.read())

    lexer = ipdrawLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ipdrawParser(stream)
    tree = parser.program()

    interpreter = IPDrawInterpreter(pen, win)
    interpreter.visit(tree)

    print("Drawing complete. Close the window to exit.")
