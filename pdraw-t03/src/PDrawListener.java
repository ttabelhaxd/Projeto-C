// Generated from PDraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PDrawParser}.
 */
public interface PDrawListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PDrawParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PDrawParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PDrawParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDefineVariable}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefineVariable(PDrawParser.StatementDefineVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDefineVariable}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefineVariable(PDrawParser.StatementDefineVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDefineCanvas}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefineCanvas(PDrawParser.StatementDefineCanvasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDefineCanvas}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefineCanvas(PDrawParser.StatementDefineCanvasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementDefinePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefinePen(PDrawParser.StatementDefinePenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementDefinePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefinePen(PDrawParser.StatementDefinePenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementCreatePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementCreatePen(PDrawParser.StatementCreatePenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementCreatePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementCreatePen(PDrawParser.StatementCreatePenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementSetPenProperty}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSetPenProperty(PDrawParser.StatementSetPenPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementSetPenProperty}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSetPenProperty(PDrawParser.StatementSetPenPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementMovePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementMovePen(PDrawParser.StatementMovePenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementMovePen}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementMovePen(PDrawParser.StatementMovePenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementPenAction}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPenAction(PDrawParser.StatementPenActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementPenAction}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPenAction(PDrawParser.StatementPenActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExecuteProgram}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExecuteProgram(PDrawParser.StatementExecuteProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExecuteProgram}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExecuteProgram(PDrawParser.StatementExecuteProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementOutput}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementOutput(PDrawParser.StatementOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementOutput}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementOutput(PDrawParser.StatementOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementPause}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPause(PDrawParser.StatementPauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementPause}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPause(PDrawParser.StatementPauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(PDrawParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(PDrawParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementUserInput}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementUserInput(PDrawParser.StatementUserInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementUserInput}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementUserInput(PDrawParser.StatementUserInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementLoop}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLoop(PDrawParser.StatementLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementLoop}
	 * labeled alternative in {@link PDrawParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLoop(PDrawParser.StatementLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#defineVariable}.
	 * @param ctx the parse tree
	 */
	void enterDefineVariable(PDrawParser.DefineVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#defineVariable}.
	 * @param ctx the parse tree
	 */
	void exitDefineVariable(PDrawParser.DefineVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(PDrawParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(PDrawParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PDrawParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PDrawParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#defineCanvas}.
	 * @param ctx the parse tree
	 */
	void enterDefineCanvas(PDrawParser.DefineCanvasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#defineCanvas}.
	 * @param ctx the parse tree
	 */
	void exitDefineCanvas(PDrawParser.DefineCanvasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#definePen}.
	 * @param ctx the parse tree
	 */
	void enterDefinePen(PDrawParser.DefinePenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#definePen}.
	 * @param ctx the parse tree
	 */
	void exitDefinePen(PDrawParser.DefinePenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#penProperties}.
	 * @param ctx the parse tree
	 */
	void enterPenProperties(PDrawParser.PenPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#penProperties}.
	 * @param ctx the parse tree
	 */
	void exitPenProperties(PDrawParser.PenPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#createPen}.
	 * @param ctx the parse tree
	 */
	void enterCreatePen(PDrawParser.CreatePenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#createPen}.
	 * @param ctx the parse tree
	 */
	void exitCreatePen(PDrawParser.CreatePenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#setPenProperty}.
	 * @param ctx the parse tree
	 */
	void enterSetPenProperty(PDrawParser.SetPenPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#setPenProperty}.
	 * @param ctx the parse tree
	 */
	void exitSetPenProperty(PDrawParser.SetPenPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#movePen}.
	 * @param ctx the parse tree
	 */
	void enterMovePen(PDrawParser.MovePenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#movePen}.
	 * @param ctx the parse tree
	 */
	void exitMovePen(PDrawParser.MovePenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MovePenRotation}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void enterMovePenRotation(PDrawParser.MovePenRotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MovePenRotation}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void exitMovePenRotation(PDrawParser.MovePenRotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MovePenMovement}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void enterMovePenMovement(PDrawParser.MovePenMovementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MovePenMovement}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void exitMovePenMovement(PDrawParser.MovePenMovementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MovePenPressureChange}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void enterMovePenPressureChange(PDrawParser.MovePenPressureChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MovePenPressureChange}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void exitMovePenPressureChange(PDrawParser.MovePenPressureChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MovePenTo}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void enterMovePenTo(PDrawParser.MovePenToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MovePenTo}
	 * labeled alternative in {@link PDrawParser#typeOfMovements}.
	 * @param ctx the parse tree
	 */
	void exitMovePenTo(PDrawParser.MovePenToContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#rotation}.
	 * @param ctx the parse tree
	 */
	void enterRotation(PDrawParser.RotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#rotation}.
	 * @param ctx the parse tree
	 */
	void exitRotation(PDrawParser.RotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#movement}.
	 * @param ctx the parse tree
	 */
	void enterMovement(PDrawParser.MovementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#movement}.
	 * @param ctx the parse tree
	 */
	void exitMovement(PDrawParser.MovementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#pressureChange}.
	 * @param ctx the parse tree
	 */
	void enterPressureChange(PDrawParser.PressureChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#pressureChange}.
	 * @param ctx the parse tree
	 */
	void exitPressureChange(PDrawParser.PressureChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#moveTo}.
	 * @param ctx the parse tree
	 */
	void enterMoveTo(PDrawParser.MoveToContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#moveTo}.
	 * @param ctx the parse tree
	 */
	void exitMoveTo(PDrawParser.MoveToContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void enterPenAction(PDrawParser.PenActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#penAction}.
	 * @param ctx the parse tree
	 */
	void exitPenAction(PDrawParser.PenActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#actionSequence}.
	 * @param ctx the parse tree
	 */
	void enterActionSequence(PDrawParser.ActionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#actionSequence}.
	 * @param ctx the parse tree
	 */
	void exitActionSequence(PDrawParser.ActionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionRotation}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionRotation(PDrawParser.ActionRotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionRotation}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionRotation(PDrawParser.ActionRotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionMovement}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionMovement(PDrawParser.ActionMovementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionMovement}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionMovement(PDrawParser.ActionMovementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionPressureChange}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionPressureChange(PDrawParser.ActionPressureChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionPressureChange}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionPressureChange(PDrawParser.ActionPressureChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActionPause}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionPause(PDrawParser.ActionPauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActionPause}
	 * labeled alternative in {@link PDrawParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionPause(PDrawParser.ActionPauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#executeProgram}.
	 * @param ctx the parse tree
	 */
	void enterExecuteProgram(PDrawParser.ExecuteProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#executeProgram}.
	 * @param ctx the parse tree
	 */
	void exitExecuteProgram(PDrawParser.ExecuteProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(PDrawParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(PDrawParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#pauseStatement}.
	 * @param ctx the parse tree
	 */
	void enterPauseStatement(PDrawParser.PauseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#pauseStatement}.
	 * @param ctx the parse tree
	 */
	void exitPauseStatement(PDrawParser.PauseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PDrawParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PDrawParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#assignmentStatementForLoop}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatementForLoop(PDrawParser.AssignmentStatementForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#assignmentStatementForLoop}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatementForLoop(PDrawParser.AssignmentStatementForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 */
	void enterRealUserInput(PDrawParser.RealUserInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 */
	void exitRealUserInput(PDrawParser.RealUserInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntUserInput(PDrawParser.IntUserInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntUserInput(PDrawParser.IntUserInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringUserInput(PDrawParser.StringUserInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringUserInput}
	 * labeled alternative in {@link PDrawParser#userInputStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringUserInput(PDrawParser.StringUserInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#realAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterRealAssignmentStatement(PDrawParser.RealAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#realAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitRealAssignmentStatement(PDrawParser.RealAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#intAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterIntAssignmentStatement(PDrawParser.IntAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#intAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitIntAssignmentStatement(PDrawParser.IntAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#stringAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringAssignmentStatement(PDrawParser.StringAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#stringAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringAssignmentStatement(PDrawParser.StringAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UntilLoop}
	 * labeled alternative in {@link PDrawParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterUntilLoop(PDrawParser.UntilLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UntilLoop}
	 * labeled alternative in {@link PDrawParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitUntilLoop(PDrawParser.UntilLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PDrawParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PDrawParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PDrawParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PDrawParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#untilStatement}.
	 * @param ctx the parse tree
	 */
	void enterUntilStatement(PDrawParser.UntilStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#untilStatement}.
	 * @param ctx the parse tree
	 */
	void exitUntilStatement(PDrawParser.UntilStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PDrawParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PDrawParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#untilCondition}.
	 * @param ctx the parse tree
	 */
	void enterUntilCondition(PDrawParser.UntilConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#untilCondition}.
	 * @param ctx the parse tree
	 */
	void exitUntilCondition(PDrawParser.UntilConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PDrawParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PDrawParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PDrawParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PDrawParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PDrawParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PDrawParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PDrawParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PDrawParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PDrawParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PDrawParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(PDrawParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(PDrawParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(PDrawParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(PDrawParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#rotateDirection}.
	 * @param ctx the parse tree
	 */
	void enterRotateDirection(PDrawParser.RotateDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#rotateDirection}.
	 * @param ctx the parse tree
	 */
	void exitRotateDirection(PDrawParser.RotateDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#moveDirection}.
	 * @param ctx the parse tree
	 */
	void enterMoveDirection(PDrawParser.MoveDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#moveDirection}.
	 * @param ctx the parse tree
	 */
	void exitMoveDirection(PDrawParser.MoveDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#pressureDirection}.
	 * @param ctx the parse tree
	 */
	void enterPressureDirection(PDrawParser.PressureDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#pressureDirection}.
	 * @param ctx the parse tree
	 */
	void exitPressureDirection(PDrawParser.PressureDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operator(PDrawParser.Logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operator(PDrawParser.Logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(PDrawParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(PDrawParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PDrawParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(PDrawParser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PDrawParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(PDrawParser.Arithmetic_operatorContext ctx);
}