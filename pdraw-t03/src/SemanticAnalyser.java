import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalyser extends PDrawBaseVisitor<Boolean> {
   public List<String> validTypes = Arrays.asList("int", "real", "string", "point", "bool");
   public HashMap<String, String> variables = new HashMap<String, String>();
   public List<String> rotatedirection = Arrays.asList("left", "right");
   public List<String> validCast = Arrays.asList("int", "real");

   public SemanticAnalyser() {
      // Adicionar PI como uma constante predefinida do tipo real
      variables.put("PI", "real");
   }

   @Override
   public Boolean visitProgram(PDrawParser.ProgramContext ctx) {
      Boolean res = true;

      for (PDrawParser.StatementContext stmtCtx : ctx.statement()) {
         Boolean stmtRes = visit(stmtCtx);
         if (stmtRes == null || !stmtRes) {
            ErrorHandling.printError(ctx, "Invalid statement.");
            res = false;
         }
      }

      return res;
   }

   @Override
   public Boolean visitStatementDefineVariable(PDrawParser.StatementDefineVariableContext ctx) {
      Boolean res = visitDefineVariable(ctx.defineVariable());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementDefineCanvas(PDrawParser.StatementDefineCanvasContext ctx) {
      Boolean res = visitDefineCanvas(ctx.defineCanvas());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementDefinePen(PDrawParser.StatementDefinePenContext ctx) {
      Boolean res = visitDefinePen(ctx.definePen());
      if (ctx.definePen().ID() == null) {
         ErrorHandling.printError(ctx, "Pen ID not defined.");
         return false;
      }
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementCreatePen(PDrawParser.StatementCreatePenContext ctx) {
      Boolean res = visitCreatePen(ctx.createPen());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementSetPenProperty(PDrawParser.StatementSetPenPropertyContext ctx) {
      Boolean res = visitSetPenProperty(ctx.setPenProperty());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementMovePen(PDrawParser.StatementMovePenContext ctx) {
      Boolean res = visitMovePen(ctx.movePen());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementPenAction(PDrawParser.StatementPenActionContext ctx) {
      Boolean res = visitPenAction(ctx.penAction());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementExecuteProgram(PDrawParser.StatementExecuteProgramContext ctx) {
      Boolean res = visitExecuteProgram(ctx.executeProgram());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementOutput(PDrawParser.StatementOutputContext ctx) {
      Boolean res = visitOutputStatement(ctx.outputStatement());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementPause(PDrawParser.StatementPauseContext ctx) {
      Boolean res = visitPauseStatement(ctx.pauseStatement());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementAssignment(PDrawParser.StatementAssignmentContext ctx) {
      Boolean res = visitAssignmentStatement(ctx.assignmentStatement());
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementUserInput(PDrawParser.StatementUserInputContext ctx) {
      Boolean res;
      if (ctx.userInputStatement() instanceof PDrawParser.RealUserInputContext) {
         res = visitRealUserInput((PDrawParser.RealUserInputContext) ctx.userInputStatement());
      } else if (ctx.userInputStatement() instanceof PDrawParser.IntUserInputContext) {
         res = visitIntUserInput((PDrawParser.IntUserInputContext) ctx.userInputStatement());
      } else {
         res = visitStringUserInput((PDrawParser.StringUserInputContext) ctx.userInputStatement());
      }
      return res != null ? res : false;
   }

   @Override
   public Boolean visitStatementLoop(PDrawParser.StatementLoopContext ctx) {
      Boolean res;
      if (ctx.loopStatement() instanceof PDrawParser.UntilLoopContext) {
         res = visitUntilLoop((PDrawParser.UntilLoopContext) ctx.loopStatement());
      } else {
         res = visitForLoop((PDrawParser.ForLoopContext) ctx.loopStatement());
      }
      return res != null ? res : false;
   }

   @Override
   public Boolean visitDefineVariable(PDrawParser.DefineVariableContext ctx) {
      if(!validTypes.contains(ctx.type().getText())){
         ErrorHandling.printError(ctx, "Invalid type '" + ctx.type().getText() + "'.");
         return false;
      }
      if (!visitType(ctx.type())) {
         return false;
      }
      for (PDrawParser.VariableContext varCtx : ctx.variableList().variable()) {
         if (!visitVariable(varCtx)) {
            return false;
         }
         variables.put(varCtx.ID().getText(), ctx.type().getText());
      }
      
      return true;
   }

   @Override
   public Boolean visitVariableList(PDrawParser.VariableListContext ctx) {
      if (ctx.variable().isEmpty()) {
         ErrorHandling.printError(ctx, "Variable list is empty.");
         return false;
      }
      for (PDrawParser.VariableContext varCtx : ctx.variable()) {
         if (!visitVariable(varCtx)) {
            return false;
         }
      }
      return true;
   }

   @Override
   public Boolean visitVariable(PDrawParser.VariableContext ctx) {
      String varName = ctx.ID().getText();
      if (variables.containsKey(varName)) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' is already declared.");
         return false;
      }
      if (ctx.expression() != null) {
         if (!visitExpression(ctx.expression())) {
            return false;
         }
      }
      return true;
   }

   @Override
   public Boolean visitDefineCanvas(PDrawParser.DefineCanvasContext ctx) {
      String canvasId = ctx.ID().getText();
      if (variables.containsKey(canvasId)) {
         System.out.println("Error: Canvas '" + canvasId + "' is already defined.");
         return false;
      }
      variables.put(canvasId, "Canvas");
      for (PDrawParser.ValueContext valueCtx : ctx.value()) {
         if (!visitValue(valueCtx)) {
            return false;
         }
      }
      return true;
   }

   @Override
   public Boolean visitDefinePen(PDrawParser.DefinePenContext ctx) {
      if (ctx.ID() == null) {
         ErrorHandling.printError(ctx, "Pen ID not defined.");
         return false;
      }
      String penId = ctx.ID().getText();
      if (variables.containsKey(penId)) {
         ErrorHandling.printError(ctx, "Pen '" + penId + "' already defined.");
         return false;
      }
      variables.put(penId, "Pen");
      for (PDrawParser.PenPropertiesContext propCtx : ctx.penProperties()) {
         if (!visitPenProperties(propCtx)) {
            return false;
         }
      }
      return true;
   }

   @Override
   public Boolean visitPenProperties(PDrawParser.PenPropertiesContext ctx) {

      if (visitProperty(ctx.property()) != null) {
         String property = ctx.property().getText();
         if (ctx.expression().value()!=null){
            if (property.equals("thickness")) {
               if (ctx.expression().value().INT() == null) {
                  ErrorHandling.printError(ctx, "Thickness must be an integer.");
                  return false;
               }
               return visitExpression(ctx.expression());
            } else if (property.equals("color")) {
               if (ctx.expression().value().COLOR() == null) {
                  ErrorHandling.printError(ctx, "Color must be a valid color.");
                  return false;
               }
               return visitExpression(ctx.expression());
            } else if (property.equals("orientation")) {
               if (ctx.expression().value().ANGLE() == null) {
                  ErrorHandling.printError(ctx, "Orientation must be a valid angle.");
                  return false;
               }
               return visitExpression(ctx.expression());
            } else if (property.equals("pressure")) {
               if (ctx.expression().value().INT() == null) {
                  ErrorHandling.printError(ctx, "Pressure must be an integer.");
                  return false;
               }
               return visitExpression(ctx.expression());

            } else if (property.equals("position")) {
               for (PDrawParser.ExpressionContext expCtx : ctx.expression().value().expression()) {
                  if (expCtx.value()!=null){
                     if (expCtx.value().INT() == null) {
                        ErrorHandling.printError(ctx, "Position must be an integer.");
                        return false;
                     }
                  }
               }
            }
            return visitProperty(ctx.property());
         }
         return visitExpression(ctx.expression());
         
      } else {
         return false;
      }
   }

   @Override
   public Boolean visitCreatePen(PDrawParser.CreatePenContext ctx) {
      String penId = ctx.ID(0).getText();
      if (variables.containsKey(penId)) {
         ErrorHandling.printError(ctx, "Pen '" + penId + "' already exists.");
         return false;
      }
      if (ctx.ID().size() > 1) {
         String optionalId = ctx.ID(1).getText();
         if (!variables.containsKey(optionalId)) {
            ErrorHandling.printError(ctx, "Pen '" + optionalId + "' not defined.");
            return false;
         }
      }
      variables.put(penId, "Pen");
      return true;
   }

   @Override
   public Boolean visitSetPenProperty(PDrawParser.SetPenPropertyContext ctx) {
      String penId = ctx.ID().getText();
      if (!variables.containsKey(penId)) {
         ErrorHandling.printError(ctx, "Pen '" + penId + "' not defined.");
         return false;
      }
      if (visitProperty(ctx.property())) {
         return visitExpression(ctx.expression());
      } else {
         return false;
      }
   }

   @Override
   public Boolean visitMovePen(PDrawParser.MovePenContext ctx) {
      String penId = ctx.ID().getText();
      if (!variables.containsKey(penId)) {
         ErrorHandling.printError(ctx, "Pen '" + penId + "' not defined.");
         return false;
      }
      if (!visit(ctx.typeOfMovements())) {
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitMovePenRotation(PDrawParser.MovePenRotationContext ctx) {
      return visitRotation(ctx.rotation());
   }

   @Override
   public Boolean visitMovePenMovement(PDrawParser.MovePenMovementContext ctx) {
      return visitMovement(ctx.movement());
   }

   @Override
   public Boolean visitMovePenPressureChange(PDrawParser.MovePenPressureChangeContext ctx) {
      return visitPressureChange(ctx.pressureChange());
   }

   @Override
   public Boolean visitMovePenTo(PDrawParser.MovePenToContext ctx) {
      return visitMoveTo(ctx.moveTo());
   }

   @Override
   public Boolean visitRotation(PDrawParser.RotationContext ctx) {
      if (!visitRotateDirection(ctx.rotateDirection())) {
         return false;
      }
      return visitValue(ctx.value());
   }

   @Override
   public Boolean visitMovement(PDrawParser.MovementContext ctx) {
      if (!visitMoveDirection(ctx.moveDirection())) {
         return false;
      }
      return visitValue(ctx.value());
   }

   @Override
   public Boolean visitPressureChange(PDrawParser.PressureChangeContext ctx) {
      if (!visitPressureDirection(ctx.pressureDirection())) {
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitMoveTo(PDrawParser.MoveToContext ctx) {
      boolean res = false;
      for (PDrawParser.ValueContext valueCtx : ctx.value()) {
         if (valueCtx.ID() != null) {
            String id = valueCtx.ID().getText();
            if (!variables.containsKey(id)) {
               ErrorHandling.printError(ctx, "Variable '" + id + "' is not defined.");
               return false;
            } else if (!variables.get(id).equals("int")) {
               ErrorHandling.printError(ctx, "Variable '" + id + "' is not of type 'int'.");
               return false;
            } else {
               res = true;
            }
         } else if (valueCtx.INT() != null) {
            res = true;
         } else {
            ErrorHandling.printError(ctx, "Coordinate must be an integer or a defined variable ID of type 'int'.");
            return false;
         }
      }
      return res;
   }

   @Override
   public Boolean visitPenAction(PDrawParser.PenActionContext ctx) {
      String id = ctx.ID().getText();
      if (!variables.containsKey(id)) {
         ErrorHandling.printError(ctx, "ID '" + id + "' not defined.");
         return false;
      }
      return visitActionSequence(ctx.actionSequence());
   }

   @Override
   public Boolean visitActionSequence(PDrawParser.ActionSequenceContext ctx) {
      for (PDrawParser.ActionContext actionCtx : ctx.action()) {
         if (!visit(actionCtx)) {
            return false;
         }
      }
      return true;
   }

   @Override
   public Boolean visitActionRotation(PDrawParser.ActionRotationContext ctx) {
      return visitRotation(ctx.rotation());
   }

   @Override
   public Boolean visitActionMovement(PDrawParser.ActionMovementContext ctx) {
      return visitMovement(ctx.movement());
   }

   @Override
   public Boolean visitActionPressureChange(PDrawParser.ActionPressureChangeContext ctx) {
      return visitPressureChange(ctx.pressureChange());
   }

   @Override
   public Boolean visitActionPause(PDrawParser.ActionPauseContext ctx) {
      return visitPauseStatement(ctx.pauseStatement());
   }

   @Override
   public Boolean visitExecuteProgram(PDrawParser.ExecuteProgramContext ctx) {
      String programId = ctx.ID().getText();
      if (!variables.containsKey(programId)) {
         ErrorHandling.printError(ctx, "Program '" + programId + "' not defined.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitOutputStatement(PDrawParser.OutputStatementContext ctx) {
      if (!visitValue(ctx.value())) {
         return false;
      }
      if (ctx.ID() != null) {
         String id = ctx.ID().getText();
         if (!variables.containsKey(id)) {
            ErrorHandling.printError(ctx, "ID '" + id + "' not defined.");
            return false;
         }
      }
      return true;
   }

   @Override
   public Boolean visitPauseStatement(PDrawParser.PauseStatementContext ctx) {
      return visitValue(ctx.value());
   }

   @Override
   public Boolean visitAssignmentStatement(PDrawParser.AssignmentStatementContext ctx) {
      String varName = ctx.ID().getText();
      if (!variables.containsKey(varName)) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' is not declared.");
         return false;
      }
      String varType = variables.get(varName);
      if (ctx.expression().value()!=null){
         if (varType.equals("int")){
            if (ctx.expression().value().INT() == null) {
               ErrorHandling.printError(ctx, "Variable '" + varName + "' is of type 'int'.");
               return false;
            }
         } else if (varType.equals("real")){
            if (ctx.expression().value().REAL() == null) {
               ErrorHandling.printError(ctx, "Variable '" + varName + "' is of type 'real'.");
               return false;
            }
         } else if (varType.equals("string")){
            if (ctx.expression().value().STRING() == null) {
               ErrorHandling.printError(ctx, "Variable '" + varName + "' is of type 'string'.");
               return false;
            }
         } else if (varType.equals("bool")){
            if (ctx.expression().value().BOOL() == null) {
               ErrorHandling.printError(ctx, "Variable '" + varName + "' is of type 'bool'.");
               return false;
            }
         } else if (varType.equals("point")){
            if (ctx.expression().value().expression().size() != 2) {
               ErrorHandling.printError(ctx, "Variable '" + varName + "' is of type 'point'.");
               return false;
            }
            
         }
      }

      return visit(ctx.expression());
   }

   @Override
   public Boolean visitAssignmentStatementForLoop(PDrawParser.AssignmentStatementForLoopContext ctx) {
      String varName = ctx.ID().getText();
      if (!variables.containsKey(varName)) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' is not declared.");
         return false;
      }
      return visit(ctx.expression());
   }

   @Override
   public Boolean visitRealUserInput(PDrawParser.RealUserInputContext ctx) {
      return visit(ctx.realAssignmentStatement());
   }

   @Override
   public Boolean visitIntUserInput(PDrawParser.IntUserInputContext ctx) {
      return visit(ctx.intAssignmentStatement());
   }

   @Override
   public Boolean visitStringUserInput(PDrawParser.StringUserInputContext ctx) {
      return visit(ctx.stringAssignmentStatement());
   }

   @Override
   public Boolean visitRealAssignmentStatement(PDrawParser.RealAssignmentStatementContext ctx) {
      String varName = ctx.ID().getText();
      if (!variables.containsKey(varName) || !variables.get(varName).equals("real")) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' not declared or not of type 'real'.");
         return false;
      }
      return visitValue(ctx.value());
   }

   @Override
   public Boolean visitIntAssignmentStatement(PDrawParser.IntAssignmentStatementContext ctx) {
      String varName = ctx.ID().getText();
      if (!variables.containsKey(varName) || !variables.get(varName).equals("int")) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' not declared or not of type 'int'.");
         return false;
      }
      return visitValue(ctx.value());
   }

   @Override
   public Boolean visitStringAssignmentStatement(PDrawParser.StringAssignmentStatementContext ctx) {
      String varName = ctx.ID().getText();
      if (!variables.containsKey(varName)) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' not declared.");
         return false;
      }
      if (!variables.get(varName).equals("string")) {
         ErrorHandling.printError(ctx, "Variable '" + varName + "' not of type 'string'.");
         return false;
      }
      return visitValue(ctx.value());
   }

   @Override
   public Boolean visitUntilLoop(PDrawParser.UntilLoopContext ctx) {
      return visitUntilStatement(ctx.untilStatement());
   }

   @Override
   public Boolean visitForLoop(PDrawParser.ForLoopContext ctx) {
      return visitForStatement(ctx.forStatement());
   }

   @Override
   public Boolean visitUntilStatement(PDrawParser.UntilStatementContext ctx) {
      Boolean conditionValid = visitUntilCondition(ctx.untilCondition());
      if (!conditionValid) {
         ErrorHandling.printError(ctx, "Error: Invalid until statement condition.");
         return false;
      }
      return visitBlock(ctx.block());
   }

   @Override
   public Boolean visitForStatement(PDrawParser.ForStatementContext ctx) {
      Boolean initValid = visitAssignmentStatement(ctx.assignmentStatement());
      if (!initValid) {
         ErrorHandling.printError(ctx, "Error: Invalid for statement initialization.");
         return false;
      }
      Boolean conditionValid = visitCondition(ctx.condition());
      if (!conditionValid) {
         ErrorHandling.printError(ctx, "Error: Invalid for statement condition.");
         return false;
      }
      Boolean updateValid = visitAssignmentStatementForLoop(ctx.assignmentStatementForLoop());
      if (!updateValid) {
         ErrorHandling.printError(ctx, "Error: Invalid for statement update.");
         return false;
      }
      return visitBlock(ctx.block());
   }

   @Override
   public Boolean visitUntilCondition(PDrawParser.UntilConditionContext ctx) {
      return visitExpression(ctx.expression());
   }

   @Override
   public Boolean visitCondition(PDrawParser.ConditionContext ctx) {
      return visitExpression(ctx.expression());
   }

   @Override
   public Boolean visitBlock(PDrawParser.BlockContext ctx) {
      Boolean res = true;
      for (PDrawParser.StatementContext stmtCtx : ctx.statement()) {
         Boolean stmtRes = visit(stmtCtx);
         if (stmtRes == null || !stmtRes) {
            res = false;
         }
      }
      return res;
   }

   @Override
   public Boolean visitExpression(PDrawParser.ExpressionContext ctx) {
      if (ctx.arithmetic_operator() != null) {
         Boolean left = visit(ctx.expression(0));
         Boolean right = visit(ctx.expression(1));
         if (left == null || right == null || !left || !right) {
            return false;
         }
         return true;
      }

      if (ctx.relational_operator() != null) {
         Boolean left = visit(ctx.expression(0));
         Boolean right = visit(ctx.expression(1));
         if (left == null || right == null || !left || !right) {
            return false;
         }
         return true;
      }

      if (ctx.cast() != null) {
         if (!visit(ctx.cast())) {
            return false;
         }
         return visit(ctx.expression(0));
      }

      if (ctx.logical_operator() != null) {
         Boolean left = visit(ctx.expression(0));
         Boolean right = visit(ctx.expression(1));
         if (left == null || right == null || !left || !right) {
            return false;
         }
         return true;
      }

      if (ctx.value() != null) {
         return visit(ctx.value());
      } else if (ctx.expression().size() == 1) {
         return visit(ctx.expression(0));
      }

      return false;
   }

   @Override
   public Boolean visitValue(PDrawParser.ValueContext ctx) {
      if (ctx.COLOR() != null) {
         List<String> validColors = Arrays.asList("white", "black", "green", "red", "blue", "yellow");
         String color = ctx.COLOR().getText();
         if (!validColors.contains(color)) {
            ErrorHandling.printError(ctx, "Invalid color '" + color + "'.");
            return false;
         }
         return true;
      } else if (ctx.BOOL() != null) {
         return true;
      } else if (ctx.INT() != null) {
         return true;
      } else if (ctx.REAL() != null) {
         return true;
      } else if (ctx.HEX() != null) {
         return true;
      } else if (ctx.STRING() != null) {
         return true;
      } else if (ctx.ID() != null) {
         String id = ctx.ID().getText();
         if (!variables.containsKey(id)) {
            ErrorHandling.printError(ctx, "Variable '" + id + "' is not declared.");
            return false;
         }
         return true;
      } else if (ctx.ANGLE() != null) {
         if (!ctx.ANGLE().getText().endsWith("º")) {
            ErrorHandling.printError(ctx, "Invalid angle '" + ctx.ANGLE().getText() + "'.");
            return false;
         }

         return true;
      } else if (ctx.expression() != null) {
         for (PDrawParser.ExpressionContext expCtx : ctx.expression()) {
            if (!visitExpression(expCtx)) {
               return false;
            }
         }
         return true;
      } else if (ctx.STRING() != null && ctx.getText().startsWith("stdin")) {
         return true;
      }

      ErrorHandling.printError(ctx, "Invalid value.");
      return false;
   }

   @Override
   public Boolean visitType(PDrawParser.TypeContext ctx) {
      String type = ctx.getText();
      if (!validTypes.contains(type)) {
         ErrorHandling.printError(ctx, "Invalid type '" + type + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitCast(PDrawParser.CastContext ctx) {
      String cast = ctx.getText();
      if (!validCast.contains(cast)) {
         ErrorHandling.printError(ctx, "Invalid type '" + cast + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitProperty(PDrawParser.PropertyContext ctx) {
      String property = ctx.getText();
      List<String> validProperties = Arrays.asList("color", "position", "orientation", "thickness", "pressure");
      if (!validProperties.contains(property)) {
         ErrorHandling.printError(ctx, "Invalid property '" + property + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitRotateDirection(PDrawParser.RotateDirectionContext ctx) {
      String direction = ctx.getText();
      if (!rotatedirection.contains(direction)) {
         ErrorHandling.printError(ctx, "Invalid rotation direction '" + direction + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitMoveDirection(PDrawParser.MoveDirectionContext ctx) {
      String direction = ctx.getText();
      List<String> validDirections = Arrays.asList("forward", "backward");
      if (!validDirections.contains(direction)) {
         ErrorHandling.printError(ctx, "Invalid move direction '" + direction + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitPressureDirection(PDrawParser.PressureDirectionContext ctx) {
      String direction = ctx.getText();
      List<String> validDirections = Arrays.asList("up", "down");
      if (!validDirections.contains(direction)) {
         ErrorHandling.printError(ctx, "Invalid pressure direction '" + direction + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitLogical_operator(PDrawParser.Logical_operatorContext ctx) {
      String Logical_operator = ctx.getText();
      List<String> validLogicalOperators = Arrays.asList("and", "or");
      if (!validLogicalOperators.contains(Logical_operator)) {
         ErrorHandling.printError(ctx, "Invalid logical operator '" + Logical_operator + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitRelational_operator(PDrawParser.Relational_operatorContext ctx) {
      String Relational_operator = ctx.getText();
      List<String> validRelationalOperators = Arrays.asList("==", "!=", "<", ">", "<=", ">=");
      if (!validRelationalOperators.contains(Relational_operator)) {
         ErrorHandling.printError(ctx, "Invalid relational operator '" + Relational_operator + "'.");
         return false;
      }
      return true;
   }

   @Override
   public Boolean visitArithmetic_operator(PDrawParser.Arithmetic_operatorContext ctx) {
      String Arithmetic_operator = ctx.getText();
      List<String> validArithmeticOperators = Arrays.asList("+", "-", "*", "/", "//", "\\\\");
      if (!validArithmeticOperators.contains(Arithmetic_operator)) {
         ErrorHandling.printError(ctx, "Invalid arithmetic operator '" + Arithmetic_operator + "'.");
         return false;
      }
      return true;
   }
}
