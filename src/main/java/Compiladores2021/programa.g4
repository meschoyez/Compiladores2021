grammar programa;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LLAVEA : '{' ;
LLAVEC : '}' ;
PARA : '(' ;
PARC : ')' ;
MAS : '+' ;
MENOS : '-' ;
MULT: '*' ;
DIV : '/' ;
ASIGN : '=' ;
PYC : ';' ;

INT : 'int' ;
WHILE : 'while' ;

ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;


WS : [ \n\t\r]+ -> skip;
// OTRO : . ;


programa : { System.out.println("\n\n -->INICIO<--"); } instrucciones  { System.out.println("\n\n -->FIN<--"); } ;

instrucciones : instruccion instrucciones
              | bloque instrucciones
              |
              ;

bloque : LLAVEA instrucciones LLAVEC ;

instruccion : asignacion PYC
            // | declaracion
            // | iwhile
            ;

asignacion : ID ASIGN opal ;

opal : exp ;

exp : term e ;

e : MAS   term e
  | MENOS term e
  |
  ;

term : factor t;

t : MULT factor t
  | DIV  factor t
  |
  ;

factor : ID
       | ENTERO
       | PARA exp PARC
       ;

// declaracion -> int x;
//                double y;
//                int z = 0;
//                double w, q, t;
//                int a = 5, b, c = 10;

// asignacion -> x = 1;
//               z = y;

// iwhile -> while (x comp y) { instrucciones }
