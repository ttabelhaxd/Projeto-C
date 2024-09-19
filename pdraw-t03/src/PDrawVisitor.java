// Generated from PDraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PDrawParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PDrawVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PDrawParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PDrawParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDefineVariable}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefineVariable(PDrawParser.StatementDefineVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDefineCanvas}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefineCanvas(PDrawParser.StatementDefineCanvasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementDefinePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefinePen(PDrawParser.StatementDefinePenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementCreatePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementCreatePen(PDrawParser.StatementCreatePenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSetPenProperty}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSetPenProperty(PDrawParser.StatementSetPenPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementMovePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMovePen(PDrawParser.StatementMovePenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementPenAction}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPenAction(PDrawParser.StatementPenActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExecuteProgram}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExecuteProgram(PDrawParser.StatementExecuteProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementOutput}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementOutput(PDrawParser.StatementOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementPause}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPause(PDrawParser.StatementPauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(PDrawParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementUserInput}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementUserInput(PDrawParser.StatementUserInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementLoop}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLoop(PDrawParser.StatementLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#defineVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVariable(PDrawParser.DefineVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#variableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableList(PDrawParser.VariableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PDrawParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#defineCanvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineCanvas(PDrawParser.DefineCanvasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#definePen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinePen(PDrawParser.DefinePenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#penProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenProperties(PDrawParser.PenPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#createPen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePen(PDrawParser.CreatePenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#setPenProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPenProperty(PDrawParser.SetPenPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#movePen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovePen(PDrawParser.MovePenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MovePenRotation}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovePenRotation(PDrawParser.MovePenRotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MovePenMovement}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovePenMovement(PDrawParser.MovePenMovementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MovePenPressureChange}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovePenPressureChange(PDrawParser.MovePenPressureChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MovePenTo}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovePenTo(PDrawParser.MovePenToContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#rotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotation(PDrawParser.RotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#movement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovement(PDrawParser.MovementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#pressureChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPressureChange(PDrawParser.PressureChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#moveTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveTo(PDrawParser.MoveToContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#penAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenAction(PDrawParser.PenActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#actionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionSequence(PDrawParser.ActionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActionRotation}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionRotation(PDrawParser.ActionRotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActionMovement}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionMovement(PDrawParser.ActionMovementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActionPressureChange}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionPressureChange(PDrawParser.ActionPressureChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActionPause}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionPause(PDrawParser.ActionPauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#executeProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteProgram(PDrawParser.ExecuteProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(PDrawParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#pauseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPauseStatement(PDrawParser.PauseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PDrawParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#assignmentStatementForLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatementForLoop(PDrawParser.AssignmentStatementForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealUserInput(PDrawParser.RealUserInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntUserInput(PDrawParser.IntUserInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringUserInput(PDrawParser.StringUserInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#realAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealAssignmentStatement(PDrawParser.RealAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#intAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAssignmentStatement(PDrawParser.IntAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#stringAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAssignmentStatement(PDrawParser.StringAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UntilLoop}
	 * labeled alternative in {@link PDrawParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilLoop(PDrawParser.UntilLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PDrawParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(PDrawParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#untilStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilStatement(PDrawParser.UntilStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PDrawParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#untilCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilCondition(PDrawParser.UntilConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PDrawParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PDrawParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PDrawParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PDrawParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PDrawParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(PDrawParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(PDrawParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#rotateDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateDirection(PDrawParser.RotateDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#moveDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveDirection(PDrawParser.MoveDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#pressureDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPressureDirection(PDrawParser.PressureDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_operator(PDrawParser.Logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(PDrawParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PDrawParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operator(PDrawParser.Arithmetic_operatorContext ctx);
}