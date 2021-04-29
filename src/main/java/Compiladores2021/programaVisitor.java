// Generated from /home/meschoyez/Docencia/UBP/TC/TC2021/Compiladores2021/src/main/java/Compiladores2021/programa.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link programaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface programaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(programaParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(programaParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(programaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(programaParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(programaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(programaParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(programaParser.FactorContext ctx);
}