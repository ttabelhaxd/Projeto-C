# Generated from ipdraw.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ipdrawParser import ipdrawParser
else:
    from ipdrawParser import ipdrawParser

# This class defines a complete listener for a parse tree produced by ipdrawParser.
class ipdrawListener(ParseTreeListener):

    # Enter a parse tree produced by ipdrawParser#program.
    def enterProgram(self, ctx:ipdrawParser.ProgramContext):
        pass

    # Exit a parse tree produced by ipdrawParser#program.
    def exitProgram(self, ctx:ipdrawParser.ProgramContext):
        pass


    # Enter a parse tree produced by ipdrawParser#statement.
    def enterStatement(self, ctx:ipdrawParser.StatementContext):
        pass

    # Exit a parse tree produced by ipdrawParser#statement.
    def exitStatement(self, ctx:ipdrawParser.StatementContext):
        pass


    # Enter a parse tree produced by ipdrawParser#position.
    def enterPosition(self, ctx:ipdrawParser.PositionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#position.
    def exitPosition(self, ctx:ipdrawParser.PositionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#penControl.
    def enterPenControl(self, ctx:ipdrawParser.PenControlContext):
        pass

    # Exit a parse tree produced by ipdrawParser#penControl.
    def exitPenControl(self, ctx:ipdrawParser.PenControlContext):
        pass


    # Enter a parse tree produced by ipdrawParser#move.
    def enterMove(self, ctx:ipdrawParser.MoveContext):
        pass

    # Exit a parse tree produced by ipdrawParser#move.
    def exitMove(self, ctx:ipdrawParser.MoveContext):
        pass


    # Enter a parse tree produced by ipdrawParser#rotation.
    def enterRotation(self, ctx:ipdrawParser.RotationContext):
        pass

    # Exit a parse tree produced by ipdrawParser#rotation.
    def exitRotation(self, ctx:ipdrawParser.RotationContext):
        pass


    # Enter a parse tree produced by ipdrawParser#forLoop.
    def enterForLoop(self, ctx:ipdrawParser.ForLoopContext):
        pass

    # Exit a parse tree produced by ipdrawParser#forLoop.
    def exitForLoop(self, ctx:ipdrawParser.ForLoopContext):
        pass


    # Enter a parse tree produced by ipdrawParser#untilLoop.
    def enterUntilLoop(self, ctx:ipdrawParser.UntilLoopContext):
        pass

    # Exit a parse tree produced by ipdrawParser#untilLoop.
    def exitUntilLoop(self, ctx:ipdrawParser.UntilLoopContext):
        pass


    # Enter a parse tree produced by ipdrawParser#block.
    def enterBlock(self, ctx:ipdrawParser.BlockContext):
        pass

    # Exit a parse tree produced by ipdrawParser#block.
    def exitBlock(self, ctx:ipdrawParser.BlockContext):
        pass


    # Enter a parse tree produced by ipdrawParser#condition.
    def enterCondition(self, ctx:ipdrawParser.ConditionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#condition.
    def exitCondition(self, ctx:ipdrawParser.ConditionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#expression.
    def enterExpression(self, ctx:ipdrawParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#expression.
    def exitExpression(self, ctx:ipdrawParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#assignmentStatement.
    def enterAssignmentStatement(self, ctx:ipdrawParser.AssignmentStatementContext):
        pass

    # Exit a parse tree produced by ipdrawParser#assignmentStatement.
    def exitAssignmentStatement(self, ctx:ipdrawParser.AssignmentStatementContext):
        pass


    # Enter a parse tree produced by ipdrawParser#assignmentStatementForLoop.
    def enterAssignmentStatementForLoop(self, ctx:ipdrawParser.AssignmentStatementForLoopContext):
        pass

    # Exit a parse tree produced by ipdrawParser#assignmentStatementForLoop.
    def exitAssignmentStatementForLoop(self, ctx:ipdrawParser.AssignmentStatementForLoopContext):
        pass


    # Enter a parse tree produced by ipdrawParser#relational_operator.
    def enterRelational_operator(self, ctx:ipdrawParser.Relational_operatorContext):
        pass

    # Exit a parse tree produced by ipdrawParser#relational_operator.
    def exitRelational_operator(self, ctx:ipdrawParser.Relational_operatorContext):
        pass


    # Enter a parse tree produced by ipdrawParser#arithmetic_operator.
    def enterArithmetic_operator(self, ctx:ipdrawParser.Arithmetic_operatorContext):
        pass

    # Exit a parse tree produced by ipdrawParser#arithmetic_operator.
    def exitArithmetic_operator(self, ctx:ipdrawParser.Arithmetic_operatorContext):
        pass


    # Enter a parse tree produced by ipdrawParser#logical_operator.
    def enterLogical_operator(self, ctx:ipdrawParser.Logical_operatorContext):
        pass

    # Exit a parse tree produced by ipdrawParser#logical_operator.
    def exitLogical_operator(self, ctx:ipdrawParser.Logical_operatorContext):
        pass


    # Enter a parse tree produced by ipdrawParser#rotateDirection.
    def enterRotateDirection(self, ctx:ipdrawParser.RotateDirectionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#rotateDirection.
    def exitRotateDirection(self, ctx:ipdrawParser.RotateDirectionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#value.
    def enterValue(self, ctx:ipdrawParser.ValueContext):
        pass

    # Exit a parse tree produced by ipdrawParser#value.
    def exitValue(self, ctx:ipdrawParser.ValueContext):
        pass



del ipdrawParser