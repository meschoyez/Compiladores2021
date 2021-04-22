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

WS : [ \n\t\r]+ -> skip;
// OTRO : . ;


programa : { System.out.println("\n\n -->INICIO<--"); } instrucciones  { System.out.println("\n\n -->FIN<--"); } ;

instrucciones : instruccion instrucciones
              | bloque instrucciones
              |
              ;

bloque : LLAVEA instrucciones LLAVEC ;

instruccion : declaracion
            | asignacion
            | iwhile
            ;

// declaracion -> int x;
//                double y;
//                int z = 0;
//                double w, q, t;
//                int a = 5, b, c = 10;

// asignacion -> x = 1;
//               z = y;

// iwhile -> while (x comp y) { instrucciones }
