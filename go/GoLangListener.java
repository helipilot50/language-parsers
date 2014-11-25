// Generated from go/GoLang.g4 by ANTLR 4.4

package pl.project13.jo.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoLangParser}.
 */
public interface GoLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoLangParser#packagePrefix}.
	 * @param ctx the parse tree
	 */
	void enterPackagePrefix(@NotNull GoLangParser.PackagePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#packagePrefix}.
	 * @param ctx the parse tree
	 */
	void exitPackagePrefix(@NotNull GoLangParser.PackagePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#returnArguments}.
	 * @param ctx the parse tree
	 */
	void enterReturnArguments(@NotNull GoLangParser.ReturnArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#returnArguments}.
	 * @param ctx the parse tree
	 */
	void exitReturnArguments(@NotNull GoLangParser.ReturnArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(@NotNull GoLangParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(@NotNull GoLangParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull GoLangParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull GoLangParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(@NotNull GoLangParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(@NotNull GoLangParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull GoLangParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull GoLangParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(@NotNull GoLangParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(@NotNull GoLangParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GoLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GoLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull GoLangParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull GoLangParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(@NotNull GoLangParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(@NotNull GoLangParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#funcArguments}.
	 * @param ctx the parse tree
	 */
	void enterFuncArguments(@NotNull GoLangParser.FuncArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#funcArguments}.
	 * @param ctx the parse tree
	 */
	void exitFuncArguments(@NotNull GoLangParser.FuncArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#ifStamement}.
	 * @param ctx the parse tree
	 */
	void enterIfStamement(@NotNull GoLangParser.IfStamementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#ifStamement}.
	 * @param ctx the parse tree
	 */
	void exitIfStamement(@NotNull GoLangParser.IfStamementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoLangParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(@NotNull GoLangParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoLangParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(@NotNull GoLangParser.ReturnTypeContext ctx);
}