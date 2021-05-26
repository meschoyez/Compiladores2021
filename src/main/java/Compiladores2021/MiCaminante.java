package Compiladores2021;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import Compiladores2021.programaParser.InstruccionContext;
import Compiladores2021.programaParser.InstruccionesContext;
import Compiladores2021.programaParser.ProgramaContext;

public class MiCaminante extends programaBaseVisitor<String> {
    String texto;
    Integer indent;
    List<ErrorNode> errores;

    public MiCaminante() {
        errores = new ArrayList<>();
        initString();
    }

    /**
     * Inicia el recorrido por el arbol desde el nodo indicado
     * 
     * @param tree La raiz desde donde comenzar, puede ser un subarbol
     */
    @Override
    public String visit(ParseTree tree) {
        return super.visit(tree);
    }

    /**
     * Visita todos los nodos hijo.
     * 
     * @param ctx Contexto del nodo donde estamos parados
     */
    public String visitAllHijos(RuleContext ctx) {
        incrementarIndentacion();
        for (Integer hijo = 0; hijo < ctx.getChildCount(); hijo++) {
            addTextoNuevoNodo();
            visit(ctx.getChild(hijo));
        }
        decrementarIndentacion();
        return texto;
    }

    @Override
    public String visitInstrucciones(InstruccionesContext ctx) {
        // texto += " -<(instrucciones) " + ctx.getChildCount() + " hijos -> ";
        addTextoNodo(ctx, "instrucciones");
        visitAllHijos(ctx.getRuleContext());
        // texto += "} >- \n";
        return texto;
    }

    @Override
    public String visitInstruccion(InstruccionContext ctx) {
        addTextoNodo(ctx, "instruccion");
        visitAllHijos(ctx);
        // texto += "} >- \n";
        return texto;
    }

    @Override
    public String visitPrograma(ProgramaContext ctx) {
        // texto += " -<(prog) " + ctx.getText() + " | " + ctx.">- \n";
        // texto += " -<(prog) " + ctx.getStart() + " <-> " + ctx.getStop() + ">- \n";
        // texto += " -<(prog) {" + ctx.getStart().getText() + " <-> " +
        // ctx.getStop().getText() + "} >- \n";
        // texto += " -<(prog) {" + ctx.getChildCount() + " hijos -> ";
        addTextoNodo(ctx, "prog");
        visitAllHijos(ctx);
        // texto += "} >- \n";
        return texto;
    }

    @Override
    public String visitErrorNode(ErrorNode node) {
        addErrorNode(node);
        texto += " -<(ERROR) " + node.getText() + ">- \n";
        return texto;
    }

    public void addErrorNode (ErrorNode node) {
        errores.add(node);
    }

    public List<ErrorNode> getErrorNodes () {
        return errores;
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        addTextoHoja(node.getText());
        return texto;
    }

    private void initString() {
        texto = "\nMiVisitor\n  |\n  +--> ";
        indent = -1;
    }

    private void incrementarIndentacion() {
        indent += 1;
    }

    private void decrementarIndentacion() {
        indent -= 1;
    }

    private void addTextoNodo(RuleContext ctx, String nombre) {
        texto += "(" + nombre + ") " + ctx.getChildCount() + " Hijos\n";

    }

    private void addTextoHoja(String nombre) {
        texto += "token [" + nombre + "]\n";

    }

    private void addTextoNuevoNodo() {
        texto += "     " + "  |  ".repeat(indent) + "  +--> ";
    }

    @Override
    public String toString() {
        return texto;
    }

}
