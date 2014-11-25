// Generated from clojure/Clojure.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClojureParser}.
 */
public interface ClojureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClojureParser#special_form}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_form(@NotNull ClojureParser.Special_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#special_form}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_form(@NotNull ClojureParser.Special_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull ClojureParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull ClojureParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(@NotNull ClojureParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(@NotNull ClojureParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull ClojureParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull ClojureParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(@NotNull ClojureParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(@NotNull ClojureParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void enterMeta_data(@NotNull ClojureParser.Meta_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void exitMeta_data(@NotNull ClojureParser.Meta_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(@NotNull ClojureParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(@NotNull ClojureParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(@NotNull ClojureParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(@NotNull ClojureParser.Var_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull ClojureParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull ClojureParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterReader_macro(@NotNull ClojureParser.Reader_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitReader_macro(@NotNull ClojureParser.Reader_macroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(@NotNull ClojureParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(@NotNull ClojureParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ClojureParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ClojureParser.LiteralContext ctx);
}