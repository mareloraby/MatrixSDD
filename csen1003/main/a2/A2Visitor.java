// Generated from V:/10th/1002 ACL/Task8Intellij/grammars\A2.g4 by ANTLR 4.12.0
package csen1003.main.a2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link A2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface A2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link A2Parser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(A2Parser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2Parser#ss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSs(A2Parser.SsContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2Parser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(A2Parser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link A2Parser#n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitN(A2Parser.NContext ctx);
}