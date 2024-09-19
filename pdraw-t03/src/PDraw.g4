grammar PDraw;

program : statement* EOF;

// Define all the statements
statement : defineVariable          #StatementDefineVariable
          | defineCanvas            #StatementDefineCanvas
          | definePen               #StatementDefinePen
          | createPen               #StatementCreatePen
          | setPenProperty          #StatementSetPenProperty
          | movePen                 #StatementMovePen
          | penAction               #StatementPenAction
          | executeProgram          #StatementExecuteProgram
          | outputStatement         #StatementOutput
          | pauseStatement          #StatementPause
          | assignmentStatement     #StatementAssignment
          | userInputStatement      #StatementUserInput
          | loopStatement           #StatementLoop;

defineVariable : type variableList ';';

variableList : variable (',' variable)*;
variable : ID ('=' expression)?;

defineCanvas : 'define' 'canvas' ID STRING '(' value ',' value ')' ';';

definePen : 'define' 'pen' ID '{' penProperties* '}' ';';
penProperties : property '=' expression ';';

createPen : 'pen' ID '=' 'new' (ID)? ';';

setPenProperty : ID '<-' property expression ';';

movePen : ID typeOfMovements ';';
      
typeOfMovements :   rotation              #MovePenRotation 
                  | movement              #MovePenMovement
                  | pressureChange        #MovePenPressureChange
                  | moveTo                #MovePenTo;
            
rotation : rotateDirection value;
movement : moveDirection value;
pressureChange : pressureDirection;
moveTo : '<-' 'position' '(' value ',' value ')' ';';

penAction : ID actionSequence ';';

actionSequence : action (action)*;

// Define a single action
action : rotation                   #ActionRotation
       | movement                   #ActionMovement
       | pressureChange             #ActionPressureChange
       | pauseStatement             #ActionPause;

executeProgram : ID '<-' 'execute' STRING ';';

outputStatement : value '->' ('stdout' | ID) ';';

pauseStatement : 'pause' value (';')?;

assignmentStatement : ID '=' expression ';';
assignmentStatementForLoop : ID '=' expression;                         // Statement for for loop

// Statements for user input
userInputStatement : realAssignmentStatement          #RealUserInput
                   | intAssignmentStatement           #IntUserInput
                   | stringAssignmentStatement        #StringUserInput;

realAssignmentStatement : 'real' ID '=' 'real' '(' value ')' ';';
intAssignmentStatement : 'int' ID '=' 'int' '(' value ')' ';';
stringAssignmentStatement : 'string' ID '=' 'string' '(' value ')' ';';

loopStatement : untilStatement                        #UntilLoop
              | forStatement                          #ForLoop;

untilStatement : 'until' '(' untilCondition ')' block;
forStatement : 'for' '(' assignmentStatement condition assignmentStatementForLoop ')' block;

untilCondition : expression;
condition : expression ';';
block : '{' statement* '}' ';';

expression : value                                                      //expression including values
           | expression arithmetic_operator expression                  //expression including arithmetic operations
           | expression relational_operator expression                  //expression including relational operations
           | cast '(' expression ')'                                    //expression including casting
           | '(' expression ')' logical_operator '(' expression ')';    //expression including logical operations

value : INT
      | REAL
      | HEX
      | STRING
      | 'stdin' STRING
      | BOOL
      | ID
      | ANGLE
      | COLOR
      | '(' expression (',' expression)? ')';

type : 'int' | 'real' | 'string' | 'point' | 'bool';                    //all types of variable
cast : 'int' | 'real';                                                  //all types of casting

property : 'color' | 'position' | 'orientation' | 'thickness' | 'pressure';   //all properties of pen

rotateDirection : 'left' | 'right';
moveDirection : 'forward' | 'backward';
pressureDirection : 'up' | 'down';

logical_operator : 'or' | 'and';
relational_operator : '==' | '<' | '>' | '!=' | '<=' | '>=';
arithmetic_operator : '+' | '-' | '*' | '/' | '//' | '\\\\';

INT : '-'? [0-9]+;
REAL : '-'? [0-9]* '.' [0-9]+;
HEX : '#' [0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f];
COLOR:
	'white'
	| 'black'
	| 'green'
	| 'red'
	| 'blue'
	| 'yellow'; //all colors of pen

STRING : '"' ~["]* '"';
BOOL : 'true' | 'false';
ANGLE : INT 'º';
ID: [a-zA-Z1-9]+;

WS : [ \t\r\n]+ -> skip;
COMMENT: '%' ~[\r\n]* -> skip;
