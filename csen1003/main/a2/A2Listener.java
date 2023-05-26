// Generated from V:/10th/1002 ACL/Task8Intellij/grammars\A2.g4 by ANTLR 4.12.0
package csen1003.main.a2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link A2Parser}.
 */
public interface A2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link A2Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(A2Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(A2Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2Parser#ss}.
	 * @param ctx the parse tree
	 */
	void enterSs(A2Parser.SsContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2Parser#ss}.
	 * @param ctx the parse tree
	 */
	void exitSs(A2Parser.SsContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2Parser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(A2Parser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2Parser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(A2Parser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link A2Parser#n}.
	 * @param ctx the parse tree
	 */
	void enterN(A2Parser.NContext ctx);
	/**
	 * Exit a parse tree produced by {@link A2Parser#n}.
	 * @param ctx the parse tree
	 */
	void exitN(A2Parser.NContext ctx);
}