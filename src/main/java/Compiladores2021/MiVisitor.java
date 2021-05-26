package Compiladores2021;

import Compiladores2021.programaParser.AsignacionContext;
import Compiladores2021.programaParser.InstruccionContext;

public class MiVisitor extends programaBaseVisitor<Object> {

    // @Override
    // public Object visitInstruccion(InstruccionContext ctx) {
    //     // TODO Auto-generated method stub
    //     System.out.println("--**## " + ctx.getChildCount()  + " ##**--");
    //     return super.visitInstruccion(ctx);
    // }

    @Override
    public Object visitAsignacion(AsignacionContext ctx) {
        // TODO Auto-generated method stub
        System.out.print("--**## ");
        for  (Integer h = 0; h < ctx.getChildCount(); h++){
            System.out.print(" |" + ctx.getChild(h).getText()  + "| ");
        }
        System.out.println(" ##**--");
        return super.visitAsignacion(ctx);
    }
    
}
