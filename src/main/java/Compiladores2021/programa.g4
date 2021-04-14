grammar programa;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

ENTERO : DIGITO+ ;

LINEA : (LETRA | ENTERO | [ (){};+=])*'\n' ;

programa : { System.out.println("\n\n -->INICIO<--"); } instrucciones  { System.out.println("\n\n -->FIN<--"); } ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : LINEA { System.out.println("-> |" + $LINEA.getText().stripTrailing() + "|"); } ;

