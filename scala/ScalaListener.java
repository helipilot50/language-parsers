// Generated from scala/Scala.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScalaParser}.
 */
public interface ScalaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScalaParser#patVarDef}.
	 * @param ctx the parse tree
	 */
	void enterPatVarDef(@NotNull ScalaParser.PatVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#patVarDef}.
	 * @param ctx the parse tree
	 */
	void exitPatVarDef(@NotNull ScalaParser.PatVarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(@NotNull ScalaParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(@NotNull ScalaParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#traitDef}.
	 * @param ctx the parse tree
	 */
	void enterTraitDef(@NotNull ScalaParser.TraitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#traitDef}.
	 * @param ctx the parse tree
	 */
	void exitTraitDef(@NotNull ScalaParser.TraitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classTemplate}.
	 * @param ctx the parse tree
	 */
	void enterClassTemplate(@NotNull ScalaParser.ClassTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classTemplate}.
	 * @param ctx the parse tree
	 */
	void exitClassTemplate(@NotNull ScalaParser.ClassTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#valDcl}.
	 * @param ctx the parse tree
	 */
	void enterValDcl(@NotNull ScalaParser.ValDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#valDcl}.
	 * @param ctx the parse tree
	 */
	void exitValDcl(@NotNull ScalaParser.ValDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull ScalaParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull ScalaParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull ScalaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull ScalaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(@NotNull ScalaParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(@NotNull ScalaParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#typeDcl}.
	 * @param ctx the parse tree
	 */
	void enterTypeDcl(@NotNull ScalaParser.TypeDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#typeDcl}.
	 * @param ctx the parse tree
	 */
	void exitTypeDcl(@NotNull ScalaParser.TypeDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#refinement}.
	 * @param ctx the parse tree
	 */
	void enterRefinement(@NotNull ScalaParser.RefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#refinement}.
	 * @param ctx the parse tree
	 */
	void exitRefinement(@NotNull ScalaParser.RefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ScalaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ScalaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(@NotNull ScalaParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(@NotNull ScalaParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#traitTemplateOpt}.
	 * @param ctx the parse tree
	 */
	void enterTraitTemplateOpt(@NotNull ScalaParser.TraitTemplateOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#traitTemplateOpt}.
	 * @param ctx the parse tree
	 */
	void exitTraitTemplateOpt(@NotNull ScalaParser.TraitTemplateOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#stableId}.
	 * @param ctx the parse tree
	 */
	void enterStableId(@NotNull ScalaParser.StableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#stableId}.
	 * @param ctx the parse tree
	 */
	void exitStableId(@NotNull ScalaParser.StableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classParam}.
	 * @param ctx the parse tree
	 */
	void enterClassParam(@NotNull ScalaParser.ClassParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classParam}.
	 * @param ctx the parse tree
	 */
	void exitClassParam(@NotNull ScalaParser.ClassParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#selfInvocation}.
	 * @param ctx the parse tree
	 */
	void enterSelfInvocation(@NotNull ScalaParser.SelfInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#selfInvocation}.
	 * @param ctx the parse tree
	 */
	void exitSelfInvocation(@NotNull ScalaParser.SelfInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#refineStat}.
	 * @param ctx the parse tree
	 */
	void enterRefineStat(@NotNull ScalaParser.RefineStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#refineStat}.
	 * @param ctx the parse tree
	 */
	void exitRefineStat(@NotNull ScalaParser.RefineStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(@NotNull ScalaParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(@NotNull ScalaParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#variantTypeParam}.
	 * @param ctx the parse tree
	 */
	void enterVariantTypeParam(@NotNull ScalaParser.VariantTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#variantTypeParam}.
	 * @param ctx the parse tree
	 */
	void exitVariantTypeParam(@NotNull ScalaParser.VariantTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#traitParents}.
	 * @param ctx the parse tree
	 */
	void enterTraitParents(@NotNull ScalaParser.TraitParentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#traitParents}.
	 * @param ctx the parse tree
	 */
	void exitTraitParents(@NotNull ScalaParser.TraitParentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull ScalaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull ScalaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#typePat}.
	 * @param ctx the parse tree
	 */
	void enterTypePat(@NotNull ScalaParser.TypePatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#typePat}.
	 * @param ctx the parse tree
	 */
	void exitTypePat(@NotNull ScalaParser.TypePatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#existentialClause}.
	 * @param ctx the parse tree
	 */
	void enterExistentialClause(@NotNull ScalaParser.ExistentialClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#existentialClause}.
	 * @param ctx the parse tree
	 */
	void exitExistentialClause(@NotNull ScalaParser.ExistentialClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classQualifier}.
	 * @param ctx the parse tree
	 */
	void enterClassQualifier(@NotNull ScalaParser.ClassQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classQualifier}.
	 * @param ctx the parse tree
	 */
	void exitClassQualifier(@NotNull ScalaParser.ClassQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#templateStat}.
	 * @param ctx the parse tree
	 */
	void enterTemplateStat(@NotNull ScalaParser.TemplateStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#templateStat}.
	 * @param ctx the parse tree
	 */
	void exitTemplateStat(@NotNull ScalaParser.TemplateStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#tmplDef}.
	 * @param ctx the parse tree
	 */
	void enterTmplDef(@NotNull ScalaParser.TmplDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#tmplDef}.
	 * @param ctx the parse tree
	 */
	void exitTmplDef(@NotNull ScalaParser.TmplDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(@NotNull ScalaParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(@NotNull ScalaParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#topStat}.
	 * @param ctx the parse tree
	 */
	void enterTopStat(@NotNull ScalaParser.TopStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#topStat}.
	 * @param ctx the parse tree
	 */
	void exitTopStat(@NotNull ScalaParser.TopStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull ScalaParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull ScalaParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#simpleExpr1}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr1(@NotNull ScalaParser.SimpleExpr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#simpleExpr1}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr1(@NotNull ScalaParser.SimpleExpr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(@NotNull ScalaParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(@NotNull ScalaParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull ScalaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull ScalaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#constr}.
	 * @param ctx the parse tree
	 */
	void enterConstr(@NotNull ScalaParser.ConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#constr}.
	 * @param ctx the parse tree
	 */
	void exitConstr(@NotNull ScalaParser.ConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#resultExpr}.
	 * @param ctx the parse tree
	 */
	void enterResultExpr(@NotNull ScalaParser.ResultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#resultExpr}.
	 * @param ctx the parse tree
	 */
	void exitResultExpr(@NotNull ScalaParser.ResultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#argumentExprs}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExprs(@NotNull ScalaParser.ArgumentExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#argumentExprs}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExprs(@NotNull ScalaParser.ArgumentExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#infixType}.
	 * @param ctx the parse tree
	 */
	void enterInfixType(@NotNull ScalaParser.InfixTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#infixType}.
	 * @param ctx the parse tree
	 */
	void exitInfixType(@NotNull ScalaParser.InfixTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(@NotNull ScalaParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(@NotNull ScalaParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#importSelectors}.
	 * @param ctx the parse tree
	 */
	void enterImportSelectors(@NotNull ScalaParser.ImportSelectorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#importSelectors}.
	 * @param ctx the parse tree
	 */
	void exitImportSelectors(@NotNull ScalaParser.ImportSelectorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(@NotNull ScalaParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(@NotNull ScalaParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull ScalaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull ScalaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#funSig}.
	 * @param ctx the parse tree
	 */
	void enterFunSig(@NotNull ScalaParser.FunSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#funSig}.
	 * @param ctx the parse tree
	 */
	void exitFunSig(@NotNull ScalaParser.FunSigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#earlyDef}.
	 * @param ctx the parse tree
	 */
	void enterEarlyDef(@NotNull ScalaParser.EarlyDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#earlyDef}.
	 * @param ctx the parse tree
	 */
	void exitEarlyDef(@NotNull ScalaParser.EarlyDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterTypeParam(@NotNull ScalaParser.TypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitTypeParam(@NotNull ScalaParser.TypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#paramClauses}.
	 * @param ctx the parse tree
	 */
	void enterParamClauses(@NotNull ScalaParser.ParamClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#paramClauses}.
	 * @param ctx the parse tree
	 */
	void exitParamClauses(@NotNull ScalaParser.ParamClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#objectDef}.
	 * @param ctx the parse tree
	 */
	void enterObjectDef(@NotNull ScalaParser.ObjectDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#objectDef}.
	 * @param ctx the parse tree
	 */
	void exitObjectDef(@NotNull ScalaParser.ObjectDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#annotType}.
	 * @param ctx the parse tree
	 */
	void enterAnnotType(@NotNull ScalaParser.AnnotTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#annotType}.
	 * @param ctx the parse tree
	 */
	void exitAnnotType(@NotNull ScalaParser.AnnotTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#paramClause}.
	 * @param ctx the parse tree
	 */
	void enterParamClause(@NotNull ScalaParser.ParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#paramClause}.
	 * @param ctx the parse tree
	 */
	void exitParamClause(@NotNull ScalaParser.ParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(@NotNull ScalaParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(@NotNull ScalaParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#funTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterFunTypeParamClause(@NotNull ScalaParser.FunTypeParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#funTypeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitFunTypeParamClause(@NotNull ScalaParser.FunTypeParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#funDcl}.
	 * @param ctx the parse tree
	 */
	void enterFunDcl(@NotNull ScalaParser.FunDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#funDcl}.
	 * @param ctx the parse tree
	 */
	void exitFunDcl(@NotNull ScalaParser.FunDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#simplePattern}.
	 * @param ctx the parse tree
	 */
	void enterSimplePattern(@NotNull ScalaParser.SimplePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#simplePattern}.
	 * @param ctx the parse tree
	 */
	void exitSimplePattern(@NotNull ScalaParser.SimplePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#blockStat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(@NotNull ScalaParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#blockStat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(@NotNull ScalaParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#functionArgTypes}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgTypes(@NotNull ScalaParser.FunctionArgTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#functionArgTypes}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgTypes(@NotNull ScalaParser.FunctionArgTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#bindings}.
	 * @param ctx the parse tree
	 */
	void enterBindings(@NotNull ScalaParser.BindingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#bindings}.
	 * @param ctx the parse tree
	 */
	void exitBindings(@NotNull ScalaParser.BindingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull ScalaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull ScalaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classParamClauses}.
	 * @param ctx the parse tree
	 */
	void enterClassParamClauses(@NotNull ScalaParser.ClassParamClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classParamClauses}.
	 * @param ctx the parse tree
	 */
	void exitClassParamClauses(@NotNull ScalaParser.ClassParamClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#typeArgs}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgs(@NotNull ScalaParser.TypeArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#typeArgs}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgs(@NotNull ScalaParser.TypeArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(@NotNull ScalaParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(@NotNull ScalaParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#import_}.
	 * @param ctx the parse tree
	 */
	void enterImport_(@NotNull ScalaParser.Import_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#import_}.
	 * @param ctx the parse tree
	 */
	void exitImport_(@NotNull ScalaParser.Import_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void enterImportExpr(@NotNull ScalaParser.ImportExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void exitImportExpr(@NotNull ScalaParser.ImportExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#importSelector}.
	 * @param ctx the parse tree
	 */
	void enterImportSelector(@NotNull ScalaParser.ImportSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#importSelector}.
	 * @param ctx the parse tree
	 */
	void exitImportSelector(@NotNull ScalaParser.ImportSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#constrExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstrExpr(@NotNull ScalaParser.ConstrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#constrExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstrExpr(@NotNull ScalaParser.ConstrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(@NotNull ScalaParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(@NotNull ScalaParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#packageObject}.
	 * @param ctx the parse tree
	 */
	void enterPackageObject(@NotNull ScalaParser.PackageObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#packageObject}.
	 * @param ctx the parse tree
	 */
	void exitPackageObject(@NotNull ScalaParser.PackageObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classParents}.
	 * @param ctx the parse tree
	 */
	void enterClassParents(@NotNull ScalaParser.ClassParentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classParents}.
	 * @param ctx the parse tree
	 */
	void exitClassParents(@NotNull ScalaParser.ClassParentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#ascription}.
	 * @param ctx the parse tree
	 */
	void enterAscription(@NotNull ScalaParser.AscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#ascription}.
	 * @param ctx the parse tree
	 */
	void exitAscription(@NotNull ScalaParser.AscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatterns(@NotNull ScalaParser.PatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatterns(@NotNull ScalaParser.PatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#selfType}.
	 * @param ctx the parse tree
	 */
	void enterSelfType(@NotNull ScalaParser.SelfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#selfType}.
	 * @param ctx the parse tree
	 */
	void exitSelfType(@NotNull ScalaParser.SelfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(@NotNull ScalaParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(@NotNull ScalaParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull ScalaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull ScalaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#funDef}.
	 * @param ctx the parse tree
	 */
	void enterFunDef(@NotNull ScalaParser.FunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#funDef}.
	 * @param ctx the parse tree
	 */
	void exitFunDef(@NotNull ScalaParser.FunDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#qualId}.
	 * @param ctx the parse tree
	 */
	void enterQualId(@NotNull ScalaParser.QualIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#qualId}.
	 * @param ctx the parse tree
	 */
	void exitQualId(@NotNull ScalaParser.QualIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(@NotNull ScalaParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(@NotNull ScalaParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(@NotNull ScalaParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(@NotNull ScalaParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#varDcl}.
	 * @param ctx the parse tree
	 */
	void enterVarDcl(@NotNull ScalaParser.VarDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#varDcl}.
	 * @param ctx the parse tree
	 */
	void exitVarDcl(@NotNull ScalaParser.VarDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterGenerator(@NotNull ScalaParser.GeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitGenerator(@NotNull ScalaParser.GeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#patDef}.
	 * @param ctx the parse tree
	 */
	void enterPatDef(@NotNull ScalaParser.PatDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#patDef}.
	 * @param ctx the parse tree
	 */
	void exitPatDef(@NotNull ScalaParser.PatDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(@NotNull ScalaParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(@NotNull ScalaParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#topStatSeq}.
	 * @param ctx the parse tree
	 */
	void enterTopStatSeq(@NotNull ScalaParser.TopStatSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#topStatSeq}.
	 * @param ctx the parse tree
	 */
	void exitTopStatSeq(@NotNull ScalaParser.TopStatSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#compoundType}.
	 * @param ctx the parse tree
	 */
	void enterCompoundType(@NotNull ScalaParser.CompoundTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#compoundType}.
	 * @param ctx the parse tree
	 */
	void exitCompoundType(@NotNull ScalaParser.CompoundTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classTemplateOpt}.
	 * @param ctx the parse tree
	 */
	void enterClassTemplateOpt(@NotNull ScalaParser.ClassTemplateOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classTemplateOpt}.
	 * @param ctx the parse tree
	 */
	void exitClassTemplateOpt(@NotNull ScalaParser.ClassTemplateOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#accessQualifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessQualifier(@NotNull ScalaParser.AccessQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#accessQualifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessQualifier(@NotNull ScalaParser.AccessQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#constrAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterConstrAnnotation(@NotNull ScalaParser.ConstrAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#constrAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitConstrAnnotation(@NotNull ScalaParser.ConstrAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(@NotNull ScalaParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(@NotNull ScalaParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull ScalaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull ScalaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#constrBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstrBlock(@NotNull ScalaParser.ConstrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#constrBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstrBlock(@NotNull ScalaParser.ConstrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(@NotNull ScalaParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(@NotNull ScalaParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ScalaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ScalaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(@NotNull ScalaParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(@NotNull ScalaParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classParams}.
	 * @param ctx the parse tree
	 */
	void enterClassParams(@NotNull ScalaParser.ClassParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classParams}.
	 * @param ctx the parse tree
	 */
	void exitClassParams(@NotNull ScalaParser.ClassParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(@NotNull ScalaParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(@NotNull ScalaParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#pattern1}.
	 * @param ctx the parse tree
	 */
	void enterPattern1(@NotNull ScalaParser.Pattern1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#pattern1}.
	 * @param ctx the parse tree
	 */
	void exitPattern1(@NotNull ScalaParser.Pattern1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#pattern2}.
	 * @param ctx the parse tree
	 */
	void enterPattern2(@NotNull ScalaParser.Pattern2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#pattern2}.
	 * @param ctx the parse tree
	 */
	void exitPattern2(@NotNull ScalaParser.Pattern2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#pattern3}.
	 * @param ctx the parse tree
	 */
	void enterPattern3(@NotNull ScalaParser.Pattern3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#pattern3}.
	 * @param ctx the parse tree
	 */
	void exitPattern3(@NotNull ScalaParser.Pattern3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#packaging}.
	 * @param ctx the parse tree
	 */
	void enterPackaging(@NotNull ScalaParser.PackagingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#packaging}.
	 * @param ctx the parse tree
	 */
	void exitPackaging(@NotNull ScalaParser.PackagingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#traitTemplate}.
	 * @param ctx the parse tree
	 */
	void enterTraitTemplate(@NotNull ScalaParser.TraitTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#traitTemplate}.
	 * @param ctx the parse tree
	 */
	void exitTraitTemplate(@NotNull ScalaParser.TraitTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#enumerators}.
	 * @param ctx the parse tree
	 */
	void enterEnumerators(@NotNull ScalaParser.EnumeratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#enumerators}.
	 * @param ctx the parse tree
	 */
	void exitEnumerators(@NotNull ScalaParser.EnumeratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(@NotNull ScalaParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(@NotNull ScalaParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#existentialDcl}.
	 * @param ctx the parse tree
	 */
	void enterExistentialDcl(@NotNull ScalaParser.ExistentialDclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#existentialDcl}.
	 * @param ctx the parse tree
	 */
	void exitExistentialDcl(@NotNull ScalaParser.ExistentialDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#localModifier}.
	 * @param ctx the parse tree
	 */
	void enterLocalModifier(@NotNull ScalaParser.LocalModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#localModifier}.
	 * @param ctx the parse tree
	 */
	void exitLocalModifier(@NotNull ScalaParser.LocalModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#classParamClause}.
	 * @param ctx the parse tree
	 */
	void enterClassParamClause(@NotNull ScalaParser.ClassParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#classParamClause}.
	 * @param ctx the parse tree
	 */
	void exitClassParamClause(@NotNull ScalaParser.ClassParamClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#earlyDefs}.
	 * @param ctx the parse tree
	 */
	void enterEarlyDefs(@NotNull ScalaParser.EarlyDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#earlyDefs}.
	 * @param ctx the parse tree
	 */
	void exitEarlyDefs(@NotNull ScalaParser.EarlyDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScalaParser#typeParamClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamClause(@NotNull ScalaParser.TypeParamClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScalaParser#typeParamClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamClause(@NotNull ScalaParser.TypeParamClauseContext ctx);
}