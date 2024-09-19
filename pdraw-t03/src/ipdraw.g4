grammar ipdraw;

program     : statement+ ;
statement   :  position 
              | penControl 
              | move 
              | rotation 
              | forLoop 
              | untilLoop;

position    : 'position' '(' INT ',' INT ')' ';';
penControl  : ( 'down' | 'up' ) ';';
move        : ('forward' | 'backward') INT ';';
rotation    : rotateDirection value ';';

forLoop     : 'for' '(' assignmentStatement ';' condition ';' assignmentStatementForLoop ')' block;
untilLoop   : 'until' '(' condition ')' block;

block       : '{' statement* '}' ;

condition   : expression ;

expression  :  expression arithmetic_operator expression
            | expression relational_operator expression
            | '(' expression ')' logical_operator '(' expression ')' 
            | value;

assignmentStatement : ID '=' expression;
assignmentStatementForLoop : ID '=' expression;

relational_operator : '==' | '!=' | '<' | '>' | '<=' | '>=';
arithmetic_operator : '+' | '-' | '*' | '/' | '//' | '\\\\';
logical_operator    : 'and' | 'or';

rotateDirection : 'left' | 'right';
value    : ID | INT | ANGLE | BOOL;

INT         : '-'? [0-9]+;
ID          : [a-zA-Z1-9]+;
BOOL        : 'true' | 'false';
ANGLE       : INT 'º';
WS          : [ \t\r\n]+ -> skip;
COMMENT: '%' ~[\r\n]* -> skip;
