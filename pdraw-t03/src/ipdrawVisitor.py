# Generated from ipdraw.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ipdrawParser import ipdrawParser
else:
    from ipdrawParser import ipdrawParser

# This class defines a complete generic visitor for a parse tree produced by ipdrawParser.

class ipdrawVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ipdrawParser#program.
    def visitProgram(self, ctx:ipdrawParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#statement.
    def visitStatement(self, ctx:ipdrawParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#position.
    def visitPosition(self, ctx:ipdrawParser.PositionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#penControl.
    def visitPenControl(self, ctx:ipdrawParser.PenControlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#move.
    def visitMove(self, ctx:ipdrawParser.MoveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#rotation.
    def visitRotation(self, ctx:ipdrawParser.RotationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#forLoop.
    def visitForLoop(self, ctx:ipdrawParser.ForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#untilLoop.
    def visitUntilLoop(self, ctx:ipdrawParser.UntilLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#block.
    def visitBlock(self, ctx:ipdrawParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#condition.
    def visitCondition(self, ctx:ipdrawParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#expression.
    def visitExpression(self, ctx:ipdrawParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#assignmentStatement.
    def visitAssignmentStatement(self, ctx:ipdrawParser.AssignmentStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#assignmentStatementForLoop.
    def visitAssignmentStatementForLoop(self, ctx:ipdrawParser.AssignmentStatementForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#relational_operator.
    def visitRelational_operator(self, ctx:ipdrawParser.Relational_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#arithmetic_operator.
    def visitArithmetic_operator(self, ctx:ipdrawParser.Arithmetic_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#logical_operator.
    def visitLogical_operator(self, ctx:ipdrawParser.Logical_operatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#rotateDirection.
    def visitRotateDirection(self, ctx:ipdrawParser.RotateDirectionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#value.
    def visitValue(self, ctx:ipdrawParser.ValueContext):
        return self.visitChildren(ctx)



del ipdrawParser