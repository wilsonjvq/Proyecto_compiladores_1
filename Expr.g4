grammar Expr;

// Parser rules (Producciones o no terminales)
programa:
	bloque
;

bloque:
	LL_LEFT decls instrs LL_RIGHT
;

decls:
	| decls decl
;

decl:
	tipo T_ID T_ENDL
;

tipo: tipo C_LEFT T_INT C_RIGHT
	| T_BASICO_A
  | T_BASICO_B
;

instrs:
	| instrs instr
;

instr: loc T_ASIGN bool T_ENDL
	| T_IF P_LEFT bool P_RIGHT instr
	| T_IF P_LEFT bool P_RIGHT instr T_ELSE instr
	| T_WHILE P_LEFT bool P_RIGHT instr
	| T_DO instr T_WHILE P_LEFT bool P_RIGHT T_ENDL
	| T_BREAK T_ENDL 
	| bloque
;

loc: loc C_LEFT bool C_RIGHT
	| T_ID
;

bool: bool T_OR comb
	| comb
;

comb: comb T_AND igualdad
	| igualdad
;

igualdad: igualdad T_IGUAL rel
	| igualdad T_DIF rel
	| rel
;

rel: expr T_MENOR expr
	| expr T_MENORIGUAL expr
	| expr T_MAYORIGUAL expr
	| expr T_MAYOR expr
	| expr
;

expr: expr T_PLUS term
	| expr T_MINUS term
	| term
;

term: term T_MULTIPLY unario
	| term T_DIVIDE unario
	| unario
;

unario: T_NEG unario
	| T_MINUS unario
	| factor
;

factor: P_LEFT bool P_RIGHT
	| loc
	| T_INT
	| T_FLOAT
	| T_TRUE
	| T_FALSE
;

// Lexer rules (Tokens o terminales)
T_FLOAT: [0-9]+.[0-9]+;
T_INT: [0-9]+;
T_PLUS: '+';
T_MINUS: '-';
T_MULTIPLY: '*';
T_DIVIDE: '/';
P_LEFT: '(';
P_RIGHT: ')';
LL_LEFT: '{';
LL_RIGHT: '}';
C_LEFT: '[';
C_RIGHT: ']';
T_TRUE: 'true';
T_FALSE: 'false';
T_ASIGN: '=';
T_ENDL: ';';
T_IF: 'if';
T_ELSE: 'else';  
T_WHILE: 'while'; 
T_DO: 'do';    
T_BREAK: 'break'; 
T_OR: '||';    
T_AND: '&&';    
T_IGUAL: '==';    
T_DIF: '!=';    
T_MENOR: '<';     
T_MAYOR:      '>';
T_MENORIGUAL: '<=';
T_MAYORIGUAL: '>=';
T_NEG:        '!';
T_BASICO_A:   'int';
T_BASICO_B:   'float';
T_ID:         [a-zA-Z][_a-zA-Z0-9]*;
WS: [ \t\r\n]+ -> skip;//Espacio en blanco

///////////////////////////////////////////////////////////////////

//Ejecutar en (cmd - Comand Prompt:
//java -jar antlr-4.13.0-complete.jar -Dlanguage=Python3 Expr.g4

//Siempre para empezar el uso, en la terminal de comandos (CMD), realice un set del PATH antlr:

//doskey antlr4=java org.antlr.v4.Tool $*
//doskey grun =java org.antlr.v4.gui.TestRig $*
//>>> SET CLASSPATH=.;C:\Proyecto_compiladores;%CLASSPATH%
//>>> antlr4

//Visitors:
//antlr4 -Dlanguage=Python3 -visitor Expr.g4
//Listener:
//antlr4 -Dlanguage=Python3 -listener Expr.g4

//Prueba:
//antlr4 Expr.g4
//javac Expr*.java

//grun Expr programa -tree
//15*3-10/5+7*2**3-1
//Control+Z
//Enter

//grun Expr programa -gui
//15*3-10/5+7*2**3-1
//Control+Z
//Enter