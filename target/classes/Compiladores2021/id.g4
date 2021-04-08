grammar id;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

INT : 'int' ;
WHILE : 'while' ;

ENTRE : ('1'[2-9]) | ('2'[0-3]) ;
// CON2Y3 : DIGITO ('2'|'3') ;
CON2Y3 : DIGITO [23] ;
CON5 : DIGITO '5';

ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;
WS : [ \n\t\r]+ -> skip;
OTRO : . ;


s : ID { System.out.println("ID -> |" + $ID.getText() + "|"); } s
  | INT { System.out.println("Int -> |" + $INT.getText() + "|"); } s
  | WHILE { System.out.println("While -> |" + $WHILE.getText() + "|"); } s
  | ENTERO { System.out.println("Entero -> |" + $ENTERO.getText() + "|"); } s
  | ENTRE { System.out.println("Entre -> |" + $ENTRE.getText() + "|"); } s
  | CON5 { System.out.println("Con cinco -> |" + $CON5.getText() + "|"); } s
  | CON2Y3 { System.out.println("Con dos y tres -> |" + $CON2Y3.getText() + "|"); } s
  | OTRO { System.out.println("Otro -> |" + $OTRO.getText() + "|"); } s
  |
  ;

