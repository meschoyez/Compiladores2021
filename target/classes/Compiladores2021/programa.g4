grammar programa;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LLAVEA : '{' ;
LLAVEC : '}' ;

INT : 'int' ;
WHILE : 'while' ;

ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

LINEA : (LETRA | ENTERO | [ (){};+=])*'\n' ;

// WS : [ \n\t\r]+ -> skip;
// OTRO : . ;


programa : { System.out.println("\n\n -->INICIO<--"); } instrucciones  { System.out.println("\n\n -->FIN<--"); } ;

instrucciones : instruccion instrucciones
              | bloque instrucciones
              |
              ;

bloque : LLAVEA instrucciones LLAVEC ;

instruccion : LINEA { System.out.println("-> |" + $LINEA.getText().stripTrailing() + "|"); } ;

