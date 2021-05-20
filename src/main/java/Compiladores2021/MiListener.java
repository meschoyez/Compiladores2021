package Compiladores2021;

import org.antlr.v4.runtime.tree.TerminalNode;

import Compiladores2021.programaParser.AsignacionContext;
import Compiladores2021.programaParser.ProgramaContext;

public class MiListener extends programaBaseListener {

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("\n\nInicia programa");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("Finaliza programa");
    }

    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        // TODO Auto-generated method stub
        System.out.print(" --> Asig (in) --> |" + ctx.getStart().getText() + "|");
        System.out.println(" --> |" + ctx.getText() + "|");    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        // TODO Auto-generated method stub
        System.out.print(" --> Asig (out) --> |" + ctx.getStart().getText() + "|"
                                             + ctx.getStop().getText() + "|");
        System.out.println(" --> |" + ctx.getText() + "|");
    }

/*     @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        System.out.println(" --> Token --> |" + node.getText() + "|");
    }
 */    
}
