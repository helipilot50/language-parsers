// Generated from smalltalk/Smalltalk.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmalltalkParser}.
 */
public interface SmalltalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(@NotNull SmalltalkParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(@NotNull SmalltalkParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unaryTail}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTail(@NotNull SmalltalkParser.UnaryTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unaryTail}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTail(@NotNull SmalltalkParser.UnaryTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#blockParamList}.
	 * @param ctx the parse tree
	 */
	void enterBlockParamList(@NotNull SmalltalkParser.BlockParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#blockParamList}.
	 * @param ctx the parse tree
	 */
	void exitBlockParamList(@NotNull SmalltalkParser.BlockParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(@NotNull SmalltalkParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(@NotNull SmalltalkParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#keywordSend}.
	 * @param ctx the parse tree
	 */
	void enterKeywordSend(@NotNull SmalltalkParser.KeywordSendContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#keywordSend}.
	 * @param ctx the parse tree
	 */
	void exitKeywordSend(@NotNull SmalltalkParser.KeywordSendContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMessage(@NotNull SmalltalkParser.UnaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMessage(@NotNull SmalltalkParser.UnaryMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#temps}.
	 * @param ctx the parse tree
	 */
	void enterTemps(@NotNull SmalltalkParser.TempsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#temps}.
	 * @param ctx the parse tree
	 */
	void exitTemps(@NotNull SmalltalkParser.TempsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#stFloat}.
	 * @param ctx the parse tree
	 */
	void enterStFloat(@NotNull SmalltalkParser.StFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#stFloat}.
	 * @param ctx the parse tree
	 */
	void exitStFloat(@NotNull SmalltalkParser.StFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull SmalltalkParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull SmalltalkParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull SmalltalkParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull SmalltalkParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#dynamicDictionary}.
	 * @param ctx the parse tree
	 */
	void enterDynamicDictionary(@NotNull SmalltalkParser.DynamicDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#dynamicDictionary}.
	 * @param ctx the parse tree
	 */
	void exitDynamicDictionary(@NotNull SmalltalkParser.DynamicDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SmalltalkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SmalltalkParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(@NotNull SmalltalkParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(@NotNull SmalltalkParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpressions}
	 * labeled alternative in {@link SmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressions(@NotNull SmalltalkParser.StatementExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpressions}
	 * labeled alternative in {@link SmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressions(@NotNull SmalltalkParser.StatementExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#literalArrayRest}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArrayRest(@NotNull SmalltalkParser.LiteralArrayRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#literalArrayRest}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArrayRest(@NotNull SmalltalkParser.LiteralArrayRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#cascade}.
	 * @param ctx the parse tree
	 */
	void enterCascade(@NotNull SmalltalkParser.CascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#cascade}.
	 * @param ctx the parse tree
	 */
	void exitCascade(@NotNull SmalltalkParser.CascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#stInteger}.
	 * @param ctx the parse tree
	 */
	void enterStInteger(@NotNull SmalltalkParser.StIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#stInteger}.
	 * @param ctx the parse tree
	 */
	void exitStInteger(@NotNull SmalltalkParser.StIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#binarySend}.
	 * @param ctx the parse tree
	 */
	void enterBinarySend(@NotNull SmalltalkParser.BinarySendContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#binarySend}.
	 * @param ctx the parse tree
	 */
	void exitBinarySend(@NotNull SmalltalkParser.BinarySendContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(@NotNull SmalltalkParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(@NotNull SmalltalkParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(@NotNull SmalltalkParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(@NotNull SmalltalkParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpressionsAnswer}
	 * labeled alternative in {@link SmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionsAnswer(@NotNull SmalltalkParser.StatementExpressionsAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpressionsAnswer}
	 * labeled alternative in {@link SmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionsAnswer(@NotNull SmalltalkParser.StatementExpressionsAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull SmalltalkParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull SmalltalkParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull SmalltalkParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull SmalltalkParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#numberExp}.
	 * @param ctx the parse tree
	 */
	void enterNumberExp(@NotNull SmalltalkParser.NumberExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#numberExp}.
	 * @param ctx the parse tree
	 */
	void exitNumberExp(@NotNull SmalltalkParser.NumberExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull SmalltalkParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull SmalltalkParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(@NotNull SmalltalkParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(@NotNull SmalltalkParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unarySend}.
	 * @param ctx the parse tree
	 */
	void enterUnarySend(@NotNull SmalltalkParser.UnarySendContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unarySend}.
	 * @param ctx the parse tree
	 */
	void exitUnarySend(@NotNull SmalltalkParser.UnarySendContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#keywordMessage}.
	 * @param ctx the parse tree
	 */
	void enterKeywordMessage(@NotNull SmalltalkParser.KeywordMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#keywordMessage}.
	 * @param ctx the parse tree
	 */
	void exitKeywordMessage(@NotNull SmalltalkParser.KeywordMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(@NotNull SmalltalkParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(@NotNull SmalltalkParser.SubexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull SmalltalkParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull SmalltalkParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#bareSymbol}.
	 * @param ctx the parse tree
	 */
	void enterBareSymbol(@NotNull SmalltalkParser.BareSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#bareSymbol}.
	 * @param ctx the parse tree
	 */
	void exitBareSymbol(@NotNull SmalltalkParser.BareSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#dynamicArray}.
	 * @param ctx the parse tree
	 */
	void enterDynamicArray(@NotNull SmalltalkParser.DynamicArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#dynamicArray}.
	 * @param ctx the parse tree
	 */
	void exitDynamicArray(@NotNull SmalltalkParser.DynamicArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(@NotNull SmalltalkParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(@NotNull SmalltalkParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#pseudoVariable}.
	 * @param ctx the parse tree
	 */
	void enterPseudoVariable(@NotNull SmalltalkParser.PseudoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#pseudoVariable}.
	 * @param ctx the parse tree
	 */
	void exitPseudoVariable(@NotNull SmalltalkParser.PseudoVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SmalltalkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SmalltalkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementAnswer}
	 * labeled alternative in {@link SmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatementAnswer(@NotNull SmalltalkParser.StatementAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementAnswer}
	 * labeled alternative in {@link SmalltalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatementAnswer(@NotNull SmalltalkParser.StatementAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#bareLiteralArray}.
	 * @param ctx the parse tree
	 */
	void enterBareLiteralArray(@NotNull SmalltalkParser.BareLiteralArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#bareLiteralArray}.
	 * @param ctx the parse tree
	 */
	void exitBareLiteralArray(@NotNull SmalltalkParser.BareLiteralArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#unarySelector}.
	 * @param ctx the parse tree
	 */
	void enterUnarySelector(@NotNull SmalltalkParser.UnarySelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#unarySelector}.
	 * @param ctx the parse tree
	 */
	void exitUnarySelector(@NotNull SmalltalkParser.UnarySelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SmalltalkParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SmalltalkParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull SmalltalkParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull SmalltalkParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#binaryMessage}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMessage(@NotNull SmalltalkParser.BinaryMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#binaryMessage}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMessage(@NotNull SmalltalkParser.BinaryMessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#charConstant}.
	 * @param ctx the parse tree
	 */
	void enterCharConstant(@NotNull SmalltalkParser.CharConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#charConstant}.
	 * @param ctx the parse tree
	 */
	void exitCharConstant(@NotNull SmalltalkParser.CharConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#parsetimeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterParsetimeLiteral(@NotNull SmalltalkParser.ParsetimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#parsetimeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitParsetimeLiteral(@NotNull SmalltalkParser.ParsetimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(@NotNull SmalltalkParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(@NotNull SmalltalkParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#keywordPair}.
	 * @param ctx the parse tree
	 */
	void enterKeywordPair(@NotNull SmalltalkParser.KeywordPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#keywordPair}.
	 * @param ctx the parse tree
	 */
	void exitKeywordPair(@NotNull SmalltalkParser.KeywordPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#binaryTail}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTail(@NotNull SmalltalkParser.BinaryTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#binaryTail}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTail(@NotNull SmalltalkParser.BinaryTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#literalArray}.
	 * @param ctx the parse tree
	 */
	void enterLiteralArray(@NotNull SmalltalkParser.LiteralArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#literalArray}.
	 * @param ctx the parse tree
	 */
	void exitLiteralArray(@NotNull SmalltalkParser.LiteralArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull SmalltalkParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull SmalltalkParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#runtimeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRuntimeLiteral(@NotNull SmalltalkParser.RuntimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#runtimeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRuntimeLiteral(@NotNull SmalltalkParser.RuntimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmalltalkParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull SmalltalkParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmalltalkParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull SmalltalkParser.OperandContext ctx);
}