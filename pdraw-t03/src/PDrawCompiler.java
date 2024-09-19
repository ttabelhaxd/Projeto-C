import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.stringtemplate.v4.ST;

@SuppressWarnings("CheckReturnValue")
public class PDrawCompiler extends PDrawBaseVisitor<ST> {
   private HashMap<String, String> variables = new HashMap<>();
   private String[] colors = {"white", "black", "green", "red", "blue", "yellow"};
   private List<String> pens = new ArrayList<String>();

   @Override public ST visitProgram(PDrawParser.ProgramContext ctx) {
      ST programTemplate = new ST(
               "from graphics import *\n" +
                        "import time, math, os, sys\n" +
                        "sys.path.insert(0, os.path.abspath(os.path.join(os.path.dirname(__file__), '../src')))\n" +
                        "from IPDrawInterpreter import run_interpreter\n" +
                        "<canvasDefinition>\n" +
                        "<statements>\n" +
                        "<canvasName>.getMouse() \n" +
                        "<canvasName>.close()"
         );
         variables.put("window", "win");
         for (PDrawParser.StatementContext stmt : ctx.statement()) {
            if (stmt instanceof PDrawParser.StatementDefineCanvasContext) {
               ST canvasDefinition = visit(stmt);
               variables.put("window", canvasDefinition.getAttribute("name").toString()); 
            } 
            programTemplate.add("statements", visit(stmt).render());
         }
         if(variables.get("window").equals("win")) {
            programTemplate.add("canvasDefinition", "win = GraphWin('PDraw', 500, 500)\n");
         }else {
            programTemplate.add("canvasDefinition", "");
         }
         programTemplate.add("canvasName", variables.get("window"));
         return programTemplate;
   }

   @Override public ST visitStatementDefineVariable(PDrawParser.StatementDefineVariableContext ctx) {
      return visit(ctx.defineVariable());
   }

   @Override public ST visitStatementDefineCanvas(PDrawParser.StatementDefineCanvasContext ctx) {
      return visit(ctx.defineCanvas());
   }

   @Override public ST visitStatementDefinePen(PDrawParser.StatementDefinePenContext ctx) {
      return visit(ctx.definePen());
   }

   @Override public ST visitStatementCreatePen(PDrawParser.StatementCreatePenContext ctx) {
      return visit(ctx.createPen());
   }

   @Override public ST visitStatementSetPenProperty(PDrawParser.StatementSetPenPropertyContext ctx) {
      return visit(ctx.setPenProperty());
   }

   @Override public ST visitStatementMovePen(PDrawParser.StatementMovePenContext ctx) {
      return visit(ctx.movePen());
   }

   @Override public ST visitStatementPenAction(PDrawParser.StatementPenActionContext ctx) {
      return visit(ctx.penAction());
   }

   @Override public ST visitStatementExecuteProgram(PDrawParser.StatementExecuteProgramContext ctx) {
      return visit(ctx.executeProgram());
   }

   @Override public ST visitStatementOutput(PDrawParser.StatementOutputContext ctx) {
      return visit(ctx.outputStatement());
   }

   @Override public ST visitStatementPause(PDrawParser.StatementPauseContext ctx) {
      return visit(ctx.pauseStatement());
   }

   @Override public ST visitStatementAssignment(PDrawParser.StatementAssignmentContext ctx) {
      return visit(ctx.assignmentStatement());
   }

   @Override public ST visitStatementUserInput(PDrawParser.StatementUserInputContext ctx) {
      return visit(ctx.userInputStatement());
   }

   @Override public ST visitStatementLoop(PDrawParser.StatementLoopContext ctx) {
      return visit(ctx.loopStatement());
   }

   @Override public ST visitDefineVariable(PDrawParser.DefineVariableContext ctx) {
      StringBuilder variablesDefinitions = new StringBuilder();
      for (PDrawParser.VariableContext varCtx : ctx.variableList().variable()) {
         String varName = varCtx.ID().getText();
         String varValue = varCtx.expression() != null ? visit(varCtx.expression()).render() : "None";
         variables.put(varName, varValue);
         ST varTemplate = new ST("<name> = <value>\n");
         varTemplate.add("name", varName);
         varTemplate.add("value", varValue);
         variablesDefinitions.append(varTemplate.render());
      }
      return new ST(variablesDefinitions.toString());
   }

   @Override public ST visitVariableList(PDrawParser.VariableListContext ctx) {
      StringBuilder variablesList = new StringBuilder();
      for (PDrawParser.VariableContext varCtx : ctx.variable()) {
         variablesList.append(visit(varCtx).render());
      }
      return new ST(variablesList.toString());
   }

   @Override public ST visitVariable(PDrawParser.VariableContext ctx) {
      String varName = ctx.ID().getText();
      String varValue = ctx.expression() != null ? visit(ctx.expression()).render() : "None";
      variables.put(varName, varValue);
      ST varTemplate = new ST("<name> = <value>\n");
      varTemplate.add("name", varName);
      varTemplate.add("value", varValue);
      return varTemplate;
   }

   @Override public ST visitDefineCanvas(PDrawParser.DefineCanvasContext ctx) {
      String canvasType = ctx.ID().getText();
      String canvasName = ctx.STRING().getText();
      ST canvasTemplate = new ST("<name> = GraphWin('<canvasName>', <expression1>, <expression2>)\n");
      canvasTemplate.add("name", canvasType);
      canvasTemplate.add("canvasName", canvasName.replace("\"", ""));
      canvasTemplate.add("expression1", visit(ctx.value(0)).render());
      canvasTemplate.add("expression2", visit(ctx.value(1)).render());
      return canvasTemplate;
   }

   @Override public ST visitDefinePen(PDrawParser.DefinePenContext ctx) {
      String penType = ctx.ID().getText();
      ST penTemplate = new ST(
              "<type> = {'color': 'black', 'position': Point(0,0), 'orientation': 0, 'thickness': 1, 'pressure': 0}\n<properties>"
      );

      StringBuilder propertiesBuilder = new StringBuilder();
      for (PDrawParser.PenPropertiesContext propCtx : ctx.penProperties()) {
         propertiesBuilder.append(penType + visit(propCtx).render());
      }
      penTemplate.add("properties", propertiesBuilder.toString());
      penTemplate.add("type", penType);
      return penTemplate;
   }

   @Override public ST visitPenProperties(PDrawParser.PenPropertiesContext ctx) {
      String penType = ((PDrawParser.DefinePenContext) ctx.getParent()).ID().getText();
      ST propTemplate = new ST("['<property>'] = <value>\n");
      propTemplate.add("property", visit(ctx.property()));
      if(Arrays.asList(colors).contains(ctx.expression().getText())) {
         propTemplate.add("value", "'" + ctx.expression().value().getText() + "'");
      }else if(ctx.property().getText().equals("position")){
         propTemplate.add("value", "Point" + visit(ctx.expression()).render());
      }else if(ctx.property().getText().equals("pressure") && !ctx.expression().getText().equals("-1")){
         propTemplate.add("value", ctx.expression().getText() + " * " + penType + "['thickness']");
      }
      else {
         propTemplate.add("value", visit(ctx.expression()).render());
      }
      return propTemplate;
   }


   @Override public ST visitCreatePen(PDrawParser.CreatePenContext ctx) {
      String penName = ctx.ID(0).getText();
      String penType = (ctx.ID(1) != null) ? ctx.ID(1).getText() : "{'color': 'black', 'position': Point(0,0), 'orientation': 0, 'thickness': 1, 'pressure': 0}";
      ST createPenTemplate = new ST("<name> = <type>\n");
      createPenTemplate.add("name", penName);
      createPenTemplate.add("type", penType);
      pens.add(penName);
      return createPenTemplate;
   }

   @Override public ST visitSetPenProperty(PDrawParser.SetPenPropertyContext ctx) {
      ST propTemplate = new ST("<penType>['<property>'] = <value>\n");
      propTemplate.add("penType", ctx.ID().getText());
      propTemplate.add("property", ctx.property().getText());
      if(Arrays.asList(colors).contains(ctx.expression().getText())) {
         propTemplate.add("value", "'" + ctx.expression().getText() + "'");
      }else if(ctx.expression().getText().equals("position")){
         propTemplate.add("value", "Point" + visit(ctx.expression()).render());
      }else {
         propTemplate.add("value", visit(ctx.expression()).render());
      }
      return propTemplate;
   }

   @Override public ST visitMovePen(PDrawParser.MovePenContext ctx) {
      return visit(ctx.typeOfMovements());
   }

   @Override public ST visitMovePenRotation(PDrawParser.MovePenRotationContext ctx) {
      // Acessa o ID (nome da caneta) do contexto movePen
      String penName = ((PDrawParser.MovePenContext) ctx.getParent()).ID().getText();  
      String direction = ctx.rotation().rotateDirection().getText();
      String angle = ctx.rotation().value().getText().replace("º", "");

      ST rotationTemplate = new ST(
              "if '<direction>' == 'right':\n" +
                      "    <pen>['orientation'] = (<pen>['orientation'] + <angle>) % 360\n" +
                      "else:\n" +
                      "    <pen>['orientation'] = (<pen>['orientation'] - <angle>) % 360\n"
      );
      rotationTemplate.add("pen", penName);
      rotationTemplate.add("direction", direction);
      rotationTemplate.add("angle", angle);
      return rotationTemplate;
   }

   @Override public ST visitMovePenMovement(PDrawParser.MovePenMovementContext ctx) {
      String penName = ((PDrawParser.MovePenContext) ctx.getParent()).ID().getText(); 
      String direction = ctx.movement().moveDirection().getText();
      String distance = ctx.movement().value().getText();

      ST moveTemplate = new ST(
              "<pen>_position = <pen>['position']\n" +
                      "angle_rad = math.radians(<pen>['orientation'])\n" +
                      "dx = <distance> * math.cos(angle_rad)\n" +
                      "dy = <distance> * math.sin(angle_rad)\n" +
                      "if '<direction>' == 'backward':\n" +
                      "    dx = -dx\n" +
                      "    dy = -dy\n" +
                      "<pen>_new_position = Point(<pen>_position.getX() + dx, <pen>_position.getY() + dy)\n" +
                      "if <pen>['pressure'] > 0:\n" +
                      "    line = Line(<pen>_position, <pen>_new_position)\n" +
                      "    line.setWidth(<pen>['thickness'])\n" +
                      "    line.setFill(<pen>['color'])\n" +
                      "    line.draw(<window>)\n" +
                      "<pen>['position'] = <pen>_new_position\n"
      );

      moveTemplate.add("pen", penName);
      moveTemplate.add("direction", direction);
      moveTemplate.add("distance", distance);
      moveTemplate.add("window", variables.get("window"));
      return moveTemplate;
   }

   @Override public ST visitMovePenPressureChange(PDrawParser.MovePenPressureChangeContext ctx) {
      String penName = ((PDrawParser.MovePenContext) ctx.getParent()).ID().getText();  
      String pressureChange = visit(ctx.pressureChange()).render();
      ST pressureTemplate = new ST("<pen>['pressure'] = <pressureChange>\n");
      pressureTemplate.add("pen", penName);
      pressureTemplate.add("pressureChange", pressureChange);
      return pressureTemplate;
   }

   @Override public ST visitMovePenTo(PDrawParser.MovePenToContext ctx) {
      String penName = ((PDrawParser.MovePenContext) ctx.getParent()).ID().getText();  
      String x = ctx.moveTo().value(0).getText();
      String y = ctx.moveTo().value(1).getText();
      ST moveToTemplate = new ST(
              "<pen>_new_position = Point(<x>, <y>)\n" +
                      "if <pen>['pressure'] > 0:\n" +
                      "    line = Line(<pen>['position'], <pen>_new_position)\n" +
                      "    line.setWidth(<pen>['thickness'])\n" +
                      "    line.setFill(<pen>['color'])\n" +
                      "    line.draw(<window>)\n" +
                      "<pen>['position'] = <pen>_new_position\n"
      );
      moveToTemplate.add("pen", penName);
      moveToTemplate.add("x", x);
      moveToTemplate.add("y", y);
      moveToTemplate.add("window", variables.get("window"));
      return moveToTemplate;
   }

   @Override public ST visitRotation(PDrawParser.RotationContext ctx) {
      String direction = ctx.rotateDirection().getText();
      String angle = ctx.value().getText().replace("º", "");
      ST rotationTemplate = new ST(
              "if '<direction>' == 'right':\n" +
                      "    <pen>['orientation'] = (<pen>['orientation'] + <angle>) % 360\n" +
                      "else:\n" +
                      "    <pen>['orientation'] = (<pen>['orientation'] - <angle>) % 360\n"
      );
      rotationTemplate.add("direction", direction);
      rotationTemplate.add("angle", angle);
      return rotationTemplate;
   }

   @Override public ST visitMovement(PDrawParser.MovementContext ctx) {
      String direction = ctx.moveDirection().getText();
      String distance = ctx.value().getText();
      ST movementTemplate = new ST(
              "<pen>_position = <pen>['position']\n" +
                      "angle_rad = math.radians(<pen>['orientation'])\n" +
                      "dx = <distance> * math.cos(angle_rad)\n" +
                      "dy = <distance> * math.sin(angle_rad)\n" +
                      "if '<direction>' == 'backward':\n" +
                      "    dx = -dx\n" +
                      "    dy = -dy\n" +
                      "<pen>_new_position = Point(<pen>_position.getX() + dx, <pen>_position.getY() + dy)\n" +
                      "if <pen>['pressure'] > 0:\n" +
                      "    line = Line(<pen>_position, <pen>_new_position)\n" +
                      "    line.setWidth(<pen>['thickness'])\n" +
                      "    line.setFill(<pen>['color'])\n" +
                      "    line.draw(<window>)\n" +
                      "<pen>['position'] = <pen>_new_position\n"
      );
      movementTemplate.add("direction", direction);
      movementTemplate.add("distance", distance);
      movementTemplate.add("window", variables.get("window"));
      return movementTemplate;
   }

   @Override public ST visitPressureChange(PDrawParser.PressureChangeContext ctx) {
      return visit(ctx.pressureDirection());
   }

   @Override public ST visitMoveTo(PDrawParser.MoveToContext ctx) {
      String x = ctx.value(0).getText();
      String y = ctx.value(1).getText();
      ST moveToTemplate = new ST(
              "<pen>_new_position = Point(<x>, <y>)\n" +
                      "if <pen>['pressure'] > 0:\n" +
                      "    line = Line(<pen>['position'], <pen>_new_position)\n" +
                      "    line.setWidth(<pen>['thickness'])\n" +
                      "    line.setFill(<pen>['color'])\n" +
                      "    line.draw(<window>)\n" +
                      "<pen>['position'] = <pen>_new_position\n"
      );
      moveToTemplate.add("x", x);
      moveToTemplate.add("y", y);
      moveToTemplate.add("window", variables.get("window"));
      return moveToTemplate;
   }

   @Override public ST visitPenAction(PDrawParser.PenActionContext ctx) {
      ST penActionTemplate = new ST("<pen><actions>");
      String penId = ctx.ID().getText();
      StringBuilder actions = new StringBuilder();

      for (PDrawParser.ActionContext actionCtx : ctx.actionSequence().action()) {
         actions.append(visit(actionCtx).render());
      }
      penActionTemplate.add("pen", penId);
      penActionTemplate.add("actions", actions.toString());
      return penActionTemplate;
   }

   @Override public ST visitActionSequence(PDrawParser.ActionSequenceContext ctx) {
      String penId = ((PDrawParser.PenActionContext) ctx.getParent()).ID().getText();
      StringBuilder actions = new StringBuilder();
      for (PDrawParser.ActionContext actionCtx : ctx.action()) {
         actions.append(penId + visit(actionCtx).render());
      }
      return new ST(actions.toString());
   }

   @Override public ST visitActionRotation(PDrawParser.ActionRotationContext ctx) {
      String penName = ((PDrawParser.PenActionContext)((PDrawParser.ActionSequenceContext) ctx.getParent()).getParent()).ID().getText();  
      String direction = ctx.rotation().rotateDirection().getText();
      String angle = ctx.rotation().value().getText().replace("º", "");

      ST rotationTemplate = new ST(
              "if '<direction>' == 'right':\n" +
                      "    <pen>['orientation'] = (<pen>['orientation'] + <angle>) % 360\n" +
                      "else:\n" +
                      "    <pen>['orientation'] = (<pen>['orientation'] - <angle>) % 360\n"
      );
      rotationTemplate.add("pen", penName);
      rotationTemplate.add("direction", direction);
      rotationTemplate.add("angle", angle);
      return rotationTemplate;
   }

   @Override public ST visitActionMovement(PDrawParser.ActionMovementContext ctx) {
      String penName = ((PDrawParser.PenActionContext)((PDrawParser.ActionSequenceContext) ctx.getParent()).getParent()).ID().getText();  
      String direction = ctx.movement().moveDirection().getText();
      String distance = ctx.movement().value().getText();

      ST moveTemplate = new ST(
              "<pen>_position = <pen>['position']\n" +
                      "angle_rad = math.radians(<pen>['orientation'])\n" +
                      "dx = <distance> * math.cos(angle_rad)\n" +
                      "dy = <distance> * math.sin(angle_rad)\n" +
                      "if '<direction>' == 'backward':\n" +
                      "    dx = -dx\n" +
                      "    dy = -dy\n" +
                      "<pen>_new_position = Point(<pen>_position.getX() + dx, <pen>_position.getY() + dy)\n" +
                      "if <pen>['pressure'] > 0:\n" +
                      "    line = Line(<pen>_position, <pen>_new_position)\n" +
                      "    line.setWidth(<pen>['thickness'])\n" +
                      "    line.setFill(<pen>['color'])\n" +
                      "    line.draw(<window>)\n" +
                      "<pen>['position'] = <pen>_new_position\n"
      );

      moveTemplate.add("pen", penName);
      moveTemplate.add("direction", direction);
      moveTemplate.add("distance", distance);
      moveTemplate.add("window", variables.get("window"));
      return moveTemplate;
      
   }

   @Override public ST visitActionPressureChange(PDrawParser.ActionPressureChangeContext ctx) {
      String penName = ((PDrawParser.PenActionContext)((PDrawParser.ActionSequenceContext) ctx.getParent()).getParent()).ID().getText();  
      String pressureChange = visit(ctx.pressureChange()).render();
      ST pressureTemplate = new ST("<pen>['pressure'] = <pressureChange>\n");
      pressureTemplate.add("pen", penName);
      pressureTemplate.add("pressureChange", pressureChange);
      return pressureTemplate;
   }

   @Override public ST visitActionPause(PDrawParser.ActionPauseContext ctx) {
      return visit(ctx.pauseStatement());
   }

   @Override public ST visitExecuteProgram(PDrawParser.ExecuteProgramContext ctx) {
    String id = ctx.ID().getText();
    String file = ctx.STRING().getText();
    ST executeProgramTemplate = new ST("input_file = os.path.abspath(os.path.join(os.path.dirname(__file__), '../examples/' + <file>))\n" +
                                       "run_interpreter(<id>, input_file, <window>)\n");
    executeProgramTemplate.add("id", id);
    executeProgramTemplate.add("file", file.replace('\"', '\''));
    executeProgramTemplate.add("window", variables.get("window"));
    return executeProgramTemplate;
   }


   @Override public ST visitOutputStatement(PDrawParser.OutputStatementContext ctx) {
      String message = visit(ctx.value()).render();
      ST outputTemplate = new ST("print(<message>)\n");
      outputTemplate.add("message", message);
      return outputTemplate;
   }

   @Override public ST visitPauseStatement(PDrawParser.PauseStatementContext ctx) {
      String timeValue = ctx.value().getText();
      ST pauseTemplate = new ST("time.sleep(<time>)\n");
      pauseTemplate.add("time", Integer.parseInt(timeValue) / 1000000);
      return pauseTemplate;
   }

   @Override public ST visitAssignmentStatement(PDrawParser.AssignmentStatementContext ctx) {
      String varName = ctx.ID().getText();
      String varValue = visit(ctx.expression()).render();
      ST assignTemplate = new ST("<name> = <value>\n");
      assignTemplate.add("name", varName);
      assignTemplate.add("value", varValue);
      return assignTemplate;
   }

   @Override public ST visitAssignmentStatementForLoop(PDrawParser.AssignmentStatementForLoopContext ctx) {
      String varName = ctx.ID().getText();
      String varValue = visit(ctx.expression()).render();
      ST assignTemplate = new ST("<name> = <value>\n");
      assignTemplate.add("name", varName);
      assignTemplate.add("value", varValue);
      return assignTemplate;
   }

   @Override public ST visitRealUserInput(PDrawParser.RealUserInputContext ctx) {
      return visit(ctx.realAssignmentStatement());
   }

   @Override public ST visitIntUserInput(PDrawParser.IntUserInputContext ctx) {
      return visit(ctx.intAssignmentStatement());
   }

   @Override public ST visitStringUserInput(PDrawParser.StringUserInputContext ctx) {
      return visit(ctx.stringAssignmentStatement());
   }

   @Override public ST visitRealAssignmentStatement(PDrawParser.RealAssignmentStatementContext ctx) {
      String varName = visit(ctx.ID()).render();
      ST inputTemplate;
      if (ctx.value().getChild(0).getText().equals("stdin")) {
          String message = ctx.value().getChild(1).getText();
          inputTemplate = new ST("<var> = float(input(<message>))\n");
          inputTemplate.add("message", message);
      } else {
          String value = visit(ctx.value()).render();
          inputTemplate = new ST("<var> = float(<value>)\n");
          inputTemplate.add("value", value);
      }
      inputTemplate.add("var", varName);
      return inputTemplate;
   }

   @Override public ST visitIntAssignmentStatement(PDrawParser.IntAssignmentStatementContext ctx) {
      String varName = visit(ctx.ID()).render();
      ST inputTemplate;
      if (ctx.value().getChild(0).getText().equals("stdin")) {
          String message = ctx.value().getChild(1).getText();
          inputTemplate = new ST("<var> = int(input(<message>))\n");
          inputTemplate.add("message", message);
      } else {
          String value = visit(ctx.value()).render();
          inputTemplate = new ST("<var> = int(<value>)\n");
          inputTemplate.add("value", value);
      }
      inputTemplate.add("var", varName);
      return inputTemplate;
   }

   @Override public ST visitStringAssignmentStatement(PDrawParser.StringAssignmentStatementContext ctx) {
      String varName = visit(ctx.ID()).render();
      ST inputTemplate;
      if (ctx.value().getChild(0).getText().equals("stdin")) {
          String message = ctx.value().getChild(1).getText();
          inputTemplate = new ST("<var> = input(<message>)\n");
          inputTemplate.add("message", message);
      } else {
          String value = visit(ctx.value()).render();
          inputTemplate = new ST("<var> = <value>\n");
          inputTemplate.add("value", value);
      }
      inputTemplate.add("var", varName);
      return inputTemplate;
   }

   @Override public ST visitUntilLoop(PDrawParser.UntilLoopContext ctx) {
      ST untilLoopTemplate = new ST(
              "while not (<condition>):\n" +
                      "    <block>\n"
      );
      untilLoopTemplate.add("condition", visit(ctx.untilStatement().untilCondition()).render());
      untilLoopTemplate.add("block", visit(ctx.untilStatement().block()).render());
      return untilLoopTemplate;
   }

   @Override public ST visitForLoop(PDrawParser.ForLoopContext ctx) {
      ST forLoopTemplate = new ST(
              "<assignmentStart>\n" +
                      "while <condition>:\n" +
                      "    <block>\n" +
                      "    <assignmentEnd>\n"
      );
      forLoopTemplate.add("assignmentStart", visit(ctx.forStatement().assignmentStatement()).render());
      forLoopTemplate.add("condition", visit(ctx.forStatement().condition()).render());
      forLoopTemplate.add("assignmentEnd", visit(ctx.forStatement().assignmentStatementForLoop()).render());
      forLoopTemplate.add("block", visit(ctx.forStatement().block()).render());
      return forLoopTemplate;
   }

   @Override public ST visitUntilStatement(PDrawParser.UntilStatementContext ctx) {
      ST untilTemplate = new ST(
              "while not (<condition>):\n" +
                      "    <statements>\n"
      );
      untilTemplate.add("condition", visit(ctx.untilCondition()).render());

      StringBuilder statementsBuilder = new StringBuilder();
      for (PDrawParser.StatementContext stmt : ctx.block().statement()) {
         statementsBuilder.append(visit(stmt).render());
      }
      untilTemplate.add("statements", statementsBuilder.toString());
      return untilTemplate;
   }

   @Override public ST visitForStatement(PDrawParser.ForStatementContext ctx) {
      ST forTemplate = new ST(
              "for <var> in range(<start>, <end> + 1):\n" +
                      "    <statements>\n"
      );
      forTemplate.add("var", ctx.assignmentStatement().ID().getText());
      forTemplate.add("start", visit(ctx.condition().expression()).render());
      forTemplate.add("end", visit(ctx.assignmentStatementForLoop().expression()).render());

      StringBuilder statementsBuilder = new StringBuilder();
      for (PDrawParser.StatementContext stmt : ctx.block().statement()) {
         statementsBuilder.append(visit(stmt).render());
      }
      forTemplate.add("statements", statementsBuilder.toString());
      return forTemplate;
   }

   @Override public ST visitUntilCondition(PDrawParser.UntilConditionContext ctx) {
      return visit(ctx.expression());
   }

   @Override public ST visitCondition(PDrawParser.ConditionContext ctx) {
      return visit(ctx.expression());
   }

   @Override  public ST visitBlock(PDrawParser.BlockContext ctx) {
      StringBuilder blockCode = new StringBuilder();
      for (PDrawParser.StatementContext stmt : ctx.statement()) {
         blockCode.append(visit(stmt).render()).append("\n");
      }
      return new ST(blockCode.toString());
   }

   @Override public ST visitExpression(PDrawParser.ExpressionContext ctx) {
      if (ctx.value() != null) {
          return visit(ctx.value());
      } else if (ctx.arithmetic_operator() != null) {
          String left = visit(ctx.expression(0)).render();
          String right = visit(ctx.expression(1)).render();
          String op = ctx.arithmetic_operator().getText();

          if (op.equals("+") && pens.contains(left)) { // Check if left operand is a pen
              ST penVectorAdditionTemplate = new ST(
                  "<pen>\n<pen>['position'] = Point(<pen>['position'].getX() + <x>, <pen>['position'].getY() + <y>)\n"
              );
              String[] coordinates = right.replace("(", "").replace(")", "").split(",");
              penVectorAdditionTemplate.add("pen", left);
              penVectorAdditionTemplate.add("x", coordinates[0].trim());
              penVectorAdditionTemplate.add("y", coordinates[1].trim());
              return penVectorAdditionTemplate;
          }

          ST arithmeticTemplate = new ST("<left> <op> <right>");
          arithmeticTemplate.add("left", left);
          arithmeticTemplate.add("op", op);
          arithmeticTemplate.add("right", right);
          return arithmeticTemplate;
      } else if (ctx.relational_operator() != null) {
          ST relationalTemplate = new ST("<left> <op> <right>");
          relationalTemplate.add("left", visit(ctx.expression(0)).render());
          relationalTemplate.add("op", ctx.relational_operator().getText());
          relationalTemplate.add("right", visit(ctx.expression(1)).render());
          return relationalTemplate;
      } else if (ctx.cast() != null) {
          ST castTemplate = new ST("<type>(<expr>)");
          castTemplate.add("type", visit(ctx.cast()).render());
          castTemplate.add("expr", visit(ctx.expression(0)).render());
          return castTemplate;
      } else if (ctx.logical_operator() != null) {
          ST logicalTemplate = new ST("(<left> <op> <right>)");
          logicalTemplate.add("left", visit(ctx.expression(0)).render());
          logicalTemplate.add("op", ctx.logical_operator().getText());
          logicalTemplate.add("right", visit(ctx.expression(1)).render());
          return logicalTemplate;
      }
      return null;
   }

   @Override public ST visitValue(PDrawParser.ValueContext ctx) {
      if (ctx.INT() != null) {
         return new ST(ctx.INT().getText());
      }
      else if (ctx.REAL() != null) {
         return new ST(ctx.REAL().getText());
      }
      else if (ctx.HEX() != null) {
         return new ST(ctx.HEX().getText());
      }
      else if (ctx.getChild(0).getText().equals("stdin")) {
         String message = ctx.STRING().getText();
         return new ST("input(" + message + ")");
      } 
      else if (ctx.STRING() != null) {
         return new ST(ctx.STRING().getText());
      }
      else if (ctx.BOOL() != null) {
         if(ctx.BOOL().getText().equals("true")) {
            return new ST("True");
         }
         else if(ctx.BOOL().getText().equals("false")) {
            return new ST("False");
         }
         else{
            return new ST(ctx.BOOL().getText());
         }
      }
      else if (ctx.ID() != null) {
         if(ctx.getText().contains("PI")) {
            return new ST("math.pi");
         }else {
            return new ST(ctx.ID().getText());
         }
      }
      else if (ctx.ANGLE() != null) {
         return new ST(ctx.ANGLE().getText().replace("º", ""));
      }
      else if (ctx.COLOR() != null) {
         return new ST(ctx.COLOR().getText());
      }
      else if (ctx.expression().size() == 1) {
         return visit(ctx.expression(0));
      }
      else if (ctx.expression().size() == 2) {
         ST exprTemplate = new ST("(<expr1>, <expr2>)");
         exprTemplate.add("expr1", visit(ctx.expression(0)).render());
         exprTemplate.add("expr2", visit(ctx.expression(1)).render());
         return exprTemplate;
      }
      return new ST("None");
   }

   @Override public ST visitType(PDrawParser.TypeContext ctx) {
      String type = ctx.getText();
      ST res = null;

      if (type.equals("int")) {
         res = new ST("int");
      } else if (type.equals("real")) {
         res = new ST("float");
      } else if (type.equals("string")) {
         res = new ST("string");
      } else if (type.equals("point")) {
         res = new ST("point");
      } else if (type.equals("bool")) {
         res = new ST("bool");
      }

      return res;
   }

   @Override public ST visitCast(PDrawParser.CastContext ctx) {
      String castType = ctx.getText();
      ST res = null;

      if (castType.equals("int")) {
         res = new ST("int");
      } else if (castType.equals("real")) {
         res = new ST("float");
      }

      return res;
   }

   @Override
   public ST visitProperty(PDrawParser.PropertyContext ctx) {
      String property = ctx.getText();
      ST res = null;

      if (property.equals("color")) {
         res = new ST("color");
      } else if (property.equals("position")) {
         res = new ST("position");
      } else if (property.equals("orientation")) {
         res = new ST("orientation");
      } else if (property.equals("thickness")) {
         res = new ST("thickness");
      } else if (property.equals("pressure")) {
         res = new ST("pressure");
      }

      return res;
   }

   @Override
   public ST visitRotateDirection(PDrawParser.RotateDirectionContext ctx) {
      String direction = ctx.getText();
      ST res = null;

      if (direction.equals("left")) {
         res = new ST("left");
      } else if (direction.equals("right")) {
         res = new ST("right");
      }

      return res;
   }

   @Override public ST visitMoveDirection(PDrawParser.MoveDirectionContext ctx) {
      String direction = ctx.getText();
      ST res = null;

      if (direction.equals("forward")) {
         res = new ST("forward");
      } else if (direction.equals("backward")) {
         res = new ST("backward");
      }

      return res;
   }

   @Override public ST visitPressureDirection(PDrawParser.PressureDirectionContext ctx) {
      String direction = ctx.getText();
      ST res = null;

      if (direction.equals("up")) {
         res = new ST("-1");
      } else if (direction.equals("down")) {
         res = new ST("1");
      }

      return res;
   }

   @Override public ST visitLogical_operator(PDrawParser.Logical_operatorContext ctx) {
      String operator = ctx.getText();
      ST res = null;

      if (operator.equals("or")) {
         res = new ST("or");
      } else if (operator.equals("and")) {
         res = new ST("and");
      }

      return res;
   }

   @Override public ST visitRelational_operator(PDrawParser.Relational_operatorContext ctx) {
      String operator = ctx.getText();
      ST res = null;

      switch (operator) {
         case "==":
            res = new ST("==");
            break;
         case "<":
            res = new ST("<");
            break;
         case ">":
            res = new ST(">");
            break;
         case "!=":
            res = new ST("!=");
            break;
         case "<=":
            res = new ST("<=");
            break;
         case ">=":
            res = new ST(">=");
            break;
      }

      return res;
   }

   @Override
   public ST visitArithmetic_operator(PDrawParser.Arithmetic_operatorContext ctx) {
      String operator = ctx.getText();
      ST res = null;

      switch (operator) {
         case "+":
            res = new ST("+");
            break;
         case "-":
            res = new ST("-");
            break;
         case "*":
            res = new ST("*");
            break;
         case "/":
            res = new ST("/");
            break;
         case "//":
            res = new ST("//");
            break;
         case "\\\\":
            res = new ST("%");
            break;
      }

      return res;
   }
}
