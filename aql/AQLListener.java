// Generated from aql/AQL.g4 by ANTLR 4.4

package com.aerospike.aql.grammar;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AQLParser}.
 */
public interface AQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AQLParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect(@NotNull AQLParser.DisconnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#disconnect}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect(@NotNull AQLParser.DisconnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull AQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull AQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(@NotNull AQLParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(@NotNull AQLParser.BinContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(@NotNull AQLParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(@NotNull AQLParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#primaryKeyPredicate}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyPredicate(@NotNull AQLParser.PrimaryKeyPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#primaryKeyPredicate}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyPredicate(@NotNull AQLParser.PrimaryKeyPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(@NotNull AQLParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(@NotNull AQLParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#generationPredicate}.
	 * @param ctx the parse tree
	 */
	void enterGenerationPredicate(@NotNull AQLParser.GenerationPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#generationPredicate}.
	 * @param ctx the parse tree
	 */
	void exitGenerationPredicate(@NotNull AQLParser.GenerationPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_name(@NotNull AQLParser.Namespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_name(@NotNull AQLParser.Namespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull AQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull AQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(@NotNull AQLParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(@NotNull AQLParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#set_name}.
	 * @param ctx the parse tree
	 */
	void enterSet_name(@NotNull AQLParser.Set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#set_name}.
	 * @param ctx the parse tree
	 */
	void exitSet_name(@NotNull AQLParser.Set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#equalityFilter}.
	 * @param ctx the parse tree
	 */
	void enterEqualityFilter(@NotNull AQLParser.EqualityFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#equalityFilter}.
	 * @param ctx the parse tree
	 */
	void exitEqualityFilter(@NotNull AQLParser.EqualityFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(@NotNull AQLParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(@NotNull AQLParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#integerValue}.
	 * @param ctx the parse tree
	 */
	void enterIntegerValue(@NotNull AQLParser.IntegerValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#integerValue}.
	 * @param ctx the parse tree
	 */
	void exitIntegerValue(@NotNull AQLParser.IntegerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull AQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull AQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#moduleFunction}.
	 * @param ctx the parse tree
	 */
	void enterModuleFunction(@NotNull AQLParser.ModuleFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#moduleFunction}.
	 * @param ctx the parse tree
	 */
	void exitModuleFunction(@NotNull AQLParser.ModuleFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(@NotNull AQLParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(@NotNull AQLParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#filterPredicate}.
	 * @param ctx the parse tree
	 */
	void enterFilterPredicate(@NotNull AQLParser.FilterPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#filterPredicate}.
	 * @param ctx the parse tree
	 */
	void exitFilterPredicate(@NotNull AQLParser.FilterPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#operate}.
	 * @param ctx the parse tree
	 */
	void enterOperate(@NotNull AQLParser.OperateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#operate}.
	 * @param ctx the parse tree
	 */
	void exitOperate(@NotNull AQLParser.OperateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#viewType}.
	 * @param ctx the parse tree
	 */
	void enterViewType(@NotNull AQLParser.ViewTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#viewType}.
	 * @param ctx the parse tree
	 */
	void exitViewType(@NotNull AQLParser.ViewTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#aql}.
	 * @param ctx the parse tree
	 */
	void enterAql(@NotNull AQLParser.AqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#aql}.
	 * @param ctx the parse tree
	 */
	void exitAql(@NotNull AQLParser.AqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(@NotNull AQLParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(@NotNull AQLParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(@NotNull AQLParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(@NotNull AQLParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#repair}.
	 * @param ctx the parse tree
	 */
	void enterRepair(@NotNull AQLParser.RepairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#repair}.
	 * @param ctx the parse tree
	 */
	void exitRepair(@NotNull AQLParser.RepairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(@NotNull AQLParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(@NotNull AQLParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#roles}.
	 * @param ctx the parse tree
	 */
	void enterRoles(@NotNull AQLParser.RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#roles}.
	 * @param ctx the parse tree
	 */
	void exitRoles(@NotNull AQLParser.RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(@NotNull AQLParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(@NotNull AQLParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#kill_query}.
	 * @param ctx the parse tree
	 */
	void enterKill_query(@NotNull AQLParser.Kill_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#kill_query}.
	 * @param ctx the parse tree
	 */
	void exitKill_query(@NotNull AQLParser.Kill_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#revoke}.
	 * @param ctx the parse tree
	 */
	void enterRevoke(@NotNull AQLParser.RevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#revoke}.
	 * @param ctx the parse tree
	 */
	void exitRevoke(@NotNull AQLParser.RevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull AQLParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull AQLParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull AQLParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull AQLParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull AQLParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull AQLParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull AQLParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull AQLParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(@NotNull AQLParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(@NotNull AQLParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(@NotNull AQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(@NotNull AQLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(@NotNull AQLParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(@NotNull AQLParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull AQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull AQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull AQLParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull AQLParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull AQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull AQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull AQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull AQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#connect}.
	 * @param ctx the parse tree
	 */
	void enterConnect(@NotNull AQLParser.ConnectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#connect}.
	 * @param ctx the parse tree
	 */
	void exitConnect(@NotNull AQLParser.ConnectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#updateList}.
	 * @param ctx the parse tree
	 */
	void enterUpdateList(@NotNull AQLParser.UpdateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#updateList}.
	 * @param ctx the parse tree
	 */
	void exitUpdateList(@NotNull AQLParser.UpdateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull AQLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull AQLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(@NotNull AQLParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(@NotNull AQLParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(@NotNull AQLParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(@NotNull AQLParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#filePath}.
	 * @param ctx the parse tree
	 */
	void enterFilePath(@NotNull AQLParser.FilePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#filePath}.
	 * @param ctx the parse tree
	 */
	void exitFilePath(@NotNull AQLParser.FilePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#binValue}.
	 * @param ctx the parse tree
	 */
	void enterBinValue(@NotNull AQLParser.BinValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#binValue}.
	 * @param ctx the parse tree
	 */
	void exitBinValue(@NotNull AQLParser.BinValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#kill}.
	 * @param ctx the parse tree
	 */
	void enterKill(@NotNull AQLParser.KillContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#kill}.
	 * @param ctx the parse tree
	 */
	void exitKill(@NotNull AQLParser.KillContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#kill_scan}.
	 * @param ctx the parse tree
	 */
	void enterKill_scan(@NotNull AQLParser.Kill_scanContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#kill_scan}.
	 * @param ctx the parse tree
	 */
	void exitKill_scan(@NotNull AQLParser.Kill_scanContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#operateFunction}.
	 * @param ctx the parse tree
	 */
	void enterOperateFunction(@NotNull AQLParser.OperateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#operateFunction}.
	 * @param ctx the parse tree
	 */
	void exitOperateFunction(@NotNull AQLParser.OperateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#binNameList}.
	 * @param ctx the parse tree
	 */
	void enterBinNameList(@NotNull AQLParser.BinNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#binNameList}.
	 * @param ctx the parse tree
	 */
	void exitBinNameList(@NotNull AQLParser.BinNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(@NotNull AQLParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(@NotNull AQLParser.HelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull AQLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull AQLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#nameSet}.
	 * @param ctx the parse tree
	 */
	void enterNameSet(@NotNull AQLParser.NameSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#nameSet}.
	 * @param ctx the parse tree
	 */
	void exitNameSet(@NotNull AQLParser.NameSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#ttlValue}.
	 * @param ctx the parse tree
	 */
	void enterTtlValue(@NotNull AQLParser.TtlValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#ttlValue}.
	 * @param ctx the parse tree
	 */
	void exitTtlValue(@NotNull AQLParser.TtlValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(@NotNull AQLParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(@NotNull AQLParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(@NotNull AQLParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(@NotNull AQLParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#rangeFilter}.
	 * @param ctx the parse tree
	 */
	void enterRangeFilter(@NotNull AQLParser.RangeFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#rangeFilter}.
	 * @param ctx the parse tree
	 */
	void exitRangeFilter(@NotNull AQLParser.RangeFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#quit}.
	 * @param ctx the parse tree
	 */
	void enterQuit(@NotNull AQLParser.QuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#quit}.
	 * @param ctx the parse tree
	 */
	void exitQuit(@NotNull AQLParser.QuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#grant}.
	 * @param ctx the parse tree
	 */
	void enterGrant(@NotNull AQLParser.GrantContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#grant}.
	 * @param ctx the parse tree
	 */
	void exitGrant(@NotNull AQLParser.GrantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(@NotNull AQLParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(@NotNull AQLParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(@NotNull AQLParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(@NotNull AQLParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AQLParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(@NotNull AQLParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AQLParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(@NotNull AQLParser.PrimaryKeyContext ctx);
}