grammar id;

@header {
package Compiladores2021;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

ID : (LETRA | '_')(LETRA | DIGITO | '_') ;
OTRO : . ;


s : ID { System.out.println("ID"); } s
  | OTRO { System.out.println("Otro"); } s
  |
  ;

