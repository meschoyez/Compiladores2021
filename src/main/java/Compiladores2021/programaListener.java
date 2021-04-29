// Generated from /home/meschoyez/Docencia/UBP/TC/TC2021/Compiladores2021/src/main/java/Compiladores2021/programa.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programaParser}.
 */
public interface programaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(programaParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(programaParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(programaParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(programaParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(programaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(programaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(programaParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(programaParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(programaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(programaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(programaParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(programaParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(programaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(programaParser.FactorContext ctx);
}