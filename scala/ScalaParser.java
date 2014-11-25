// Generated from scala/Scala.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScalaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__60=1, T__59=2, T__58=3, T__57=4, T__56=5, T__55=6, T__54=7, T__53=8, 
		T__52=9, T__51=10, T__50=11, T__49=12, T__48=13, T__47=14, T__46=15, T__45=16, 
		T__44=17, T__43=18, T__42=19, T__41=20, T__40=21, T__39=22, T__38=23, 
		T__37=24, T__36=25, T__35=26, T__34=27, T__33=28, T__32=29, T__31=30, 
		T__30=31, T__29=32, T__28=33, T__27=34, T__26=35, T__25=36, T__24=37, 
		T__23=38, T__22=39, T__21=40, T__20=41, T__19=42, T__18=43, T__17=44, 
		T__16=45, T__15=46, T__14=47, T__13=48, T__12=49, T__11=50, T__10=51, 
		T__9=52, T__8=53, T__7=54, T__6=55, T__5=56, T__4=57, T__3=58, T__2=59, 
		T__1=60, T__0=61, BooleanLiteral=62, CharacterLiteral=63, StringLiteral=64, 
		SymbolLiteral=65, IntegerLiteral=66, FloatingPointLiteral=67, Id=68, Varid=69, 
		Nl=70, Semi=71, Paren=72, Delim=73, Comment=74;
	public static final String[] tokenNames = {
		"<INVALID>", "'private'", "'finally'", "'new'", "'>:'", "'while'", "'{'", 
		"'='", "'<:'", "'for'", "'override'", "'null'", "'package'", "'do'", "'('", 
		"','", "'<-'", "'var'", "'abstract'", "'sealed'", "'forSome'", "']'", 
		"'~'", "'@'", "'type'", "'#'", "'protected'", "'match'", "'<%'", "'final'", 
		"'+'", "'lazy'", "'def'", "'catch'", "'trait'", "'return'", "'class'", 
		"'extends'", "'}'", "'if'", "'try'", "'yield'", "'*'", "'this'", "'object'", 
		"'.'", "'case'", "'throw'", "':'", "'['", "'|'", "'with'", "'val'", "'_'", 
		"'!'", "'=>'", "'else'", "'implicit'", "'super'", "')'", "'import'", "'-'", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "SymbolLiteral", 
		"IntegerLiteral", "FloatingPointLiteral", "Id", "Varid", "Nl", "Semi", 
		"Paren", "Delim", "Comment"
	};
	public static final int
		RULE_literal = 0, RULE_qualId = 1, RULE_ids = 2, RULE_stableId = 3, RULE_classQualifier = 4, 
		RULE_type = 5, RULE_functionArgTypes = 6, RULE_existentialClause = 7, 
		RULE_existentialDcl = 8, RULE_infixType = 9, RULE_compoundType = 10, RULE_annotType = 11, 
		RULE_simpleType = 12, RULE_typeArgs = 13, RULE_types = 14, RULE_refinement = 15, 
		RULE_refineStat = 16, RULE_typePat = 17, RULE_ascription = 18, RULE_expr = 19, 
		RULE_expr1 = 20, RULE_postfixExpr = 21, RULE_infixExpr = 22, RULE_prefixExpr = 23, 
		RULE_simpleExpr1 = 24, RULE_exprs = 25, RULE_argumentExprs = 26, RULE_blockExpr = 27, 
		RULE_block = 28, RULE_blockStat = 29, RULE_resultExpr = 30, RULE_enumerators = 31, 
		RULE_generator = 32, RULE_caseClauses = 33, RULE_caseClause = 34, RULE_guard = 35, 
		RULE_pattern = 36, RULE_pattern1 = 37, RULE_pattern2 = 38, RULE_pattern3 = 39, 
		RULE_simplePattern = 40, RULE_patterns = 41, RULE_typeParamClause = 42, 
		RULE_funTypeParamClause = 43, RULE_variantTypeParam = 44, RULE_typeParam = 45, 
		RULE_paramClauses = 46, RULE_paramClause = 47, RULE_params = 48, RULE_param = 49, 
		RULE_paramType = 50, RULE_classParamClauses = 51, RULE_classParamClause = 52, 
		RULE_classParams = 53, RULE_classParam = 54, RULE_bindings = 55, RULE_binding = 56, 
		RULE_modifier = 57, RULE_localModifier = 58, RULE_accessModifier = 59, 
		RULE_accessQualifier = 60, RULE_annotation = 61, RULE_constrAnnotation = 62, 
		RULE_templateBody = 63, RULE_templateStat = 64, RULE_selfType = 65, RULE_import_ = 66, 
		RULE_importExpr = 67, RULE_importSelectors = 68, RULE_importSelector = 69, 
		RULE_dcl = 70, RULE_valDcl = 71, RULE_varDcl = 72, RULE_funDcl = 73, RULE_funSig = 74, 
		RULE_typeDcl = 75, RULE_patVarDef = 76, RULE_def = 77, RULE_patDef = 78, 
		RULE_varDef = 79, RULE_funDef = 80, RULE_typeDef = 81, RULE_tmplDef = 82, 
		RULE_classDef = 83, RULE_traitDef = 84, RULE_objectDef = 85, RULE_classTemplateOpt = 86, 
		RULE_traitTemplateOpt = 87, RULE_classTemplate = 88, RULE_traitTemplate = 89, 
		RULE_classParents = 90, RULE_traitParents = 91, RULE_constr = 92, RULE_earlyDefs = 93, 
		RULE_earlyDef = 94, RULE_constrExpr = 95, RULE_constrBlock = 96, RULE_selfInvocation = 97, 
		RULE_topStatSeq = 98, RULE_topStat = 99, RULE_packaging = 100, RULE_packageObject = 101, 
		RULE_compilationUnit = 102;
	public static final String[] ruleNames = {
		"literal", "qualId", "ids", "stableId", "classQualifier", "type", "functionArgTypes", 
		"existentialClause", "existentialDcl", "infixType", "compoundType", "annotType", 
		"simpleType", "typeArgs", "types", "refinement", "refineStat", "typePat", 
		"ascription", "expr", "expr1", "postfixExpr", "infixExpr", "prefixExpr", 
		"simpleExpr1", "exprs", "argumentExprs", "blockExpr", "block", "blockStat", 
		"resultExpr", "enumerators", "generator", "caseClauses", "caseClause", 
		"guard", "pattern", "pattern1", "pattern2", "pattern3", "simplePattern", 
		"patterns", "typeParamClause", "funTypeParamClause", "variantTypeParam", 
		"typeParam", "paramClauses", "paramClause", "params", "param", "paramType", 
		"classParamClauses", "classParamClause", "classParams", "classParam", 
		"bindings", "binding", "modifier", "localModifier", "accessModifier", 
		"accessQualifier", "annotation", "constrAnnotation", "templateBody", "templateStat", 
		"selfType", "import_", "importExpr", "importSelectors", "importSelector", 
		"dcl", "valDcl", "varDcl", "funDcl", "funSig", "typeDcl", "patVarDef", 
		"def", "patDef", "varDef", "funDef", "typeDef", "tmplDef", "classDef", 
		"traitDef", "objectDef", "classTemplateOpt", "traitTemplateOpt", "classTemplate", 
		"traitTemplate", "classParents", "traitParents", "constr", "earlyDefs", 
		"earlyDef", "constrExpr", "constrBlock", "selfInvocation", "topStatSeq", 
		"topStat", "packaging", "packageObject", "compilationUnit"
	};

	@Override
	public String getGrammarFileName() { return "Scala.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScalaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ScalaParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(ScalaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ScalaParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ScalaParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ScalaParser.CharacterLiteral, 0); }
		public TerminalNode SymbolLiteral() { return getToken(ScalaParser.SymbolLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(206); match(T__0);
					}
				}

				setState(209); match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(210); match(T__0);
					}
				}

				setState(213); match(FloatingPointLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214); match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215); match(CharacterLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(216); match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217); match(SymbolLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218); match(T__50);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualIdContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public QualIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterQualId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitQualId(this);
		}
	}

	public final QualIdContext qualId() throws RecognitionException {
		QualIdContext _localctx = new QualIdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_qualId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(Id);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(222); match(T__16);
				setState(223); match(Id);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdsContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitIds(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(Id);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(230); match(T__46);
				setState(231); match(Id);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StableIdContext extends ParserRuleContext {
		public ClassQualifierContext classQualifier() {
			return getRuleContext(ClassQualifierContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public StableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterStableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitStableId(this);
		}
	}

	public final StableIdContext stableId() throws RecognitionException {
		StableIdContext _localctx = new StableIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stableId);
		int _la;
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(237); match(Id);
					}
					break;
				case 2:
					{
					setState(240);
					_la = _input.LA(1);
					if (_la==Id) {
						{
						setState(238); match(Id);
						setState(239); match(T__16);
						}
					}

					setState(242); match(T__18);
					}
					break;
				}
				setState(245); match(T__16);
				setState(246); match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(247); match(Id);
					setState(248); match(T__16);
					}
				}

				setState(251); match(T__3);
				setState(253);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(252); classQualifier();
					}
				}

				setState(255); match(T__16);
				setState(256); match(Id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassQualifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassQualifier(this);
		}
	}

	public final ClassQualifierContext classQualifier() throws RecognitionException {
		ClassQualifierContext _localctx = new ClassQualifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(T__12);
			setState(260); match(Id);
			setState(261); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public FunctionArgTypesContext functionArgTypes() {
			return getRuleContext(FunctionArgTypesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExistentialClauseContext existentialClause() {
			return getRuleContext(ExistentialClauseContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); functionArgTypes();
				setState(264); match(T__6);
				setState(265); type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267); infixType();
				setState(269);
				_la = _input.LA(1);
				if (_la==T__41) {
					{
					setState(268); existentialClause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgTypesContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<ParamTypeContext> paramType() {
			return getRuleContexts(ParamTypeContext.class);
		}
		public ParamTypeContext paramType(int i) {
			return getRuleContext(ParamTypeContext.class,i);
		}
		public FunctionArgTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunctionArgTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunctionArgTypes(this);
		}
	}

	public final FunctionArgTypesContext functionArgTypes() throws RecognitionException {
		FunctionArgTypesContext _localctx = new FunctionArgTypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionArgTypes);
		int _la;
		try {
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(T__47);
				setState(283);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__55) | (1L << T__47) | (1L << T__18) | (1L << T__6) | (1L << T__3))) != 0) || _la==Id || _la==Nl) {
					{
					setState(275); paramType();
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__46) {
						{
						{
						setState(276); match(T__46);
						setState(277); paramType();
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(285); match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistentialClauseContext extends ParserRuleContext {
		public ExistentialDclContext existentialDcl(int i) {
			return getRuleContext(ExistentialDclContext.class,i);
		}
		public List<ExistentialDclContext> existentialDcl() {
			return getRuleContexts(ExistentialDclContext.class);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public ExistentialClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExistentialClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExistentialClause(this);
		}
	}

	public final ExistentialClauseContext existentialClause() throws RecognitionException {
		ExistentialClauseContext _localctx = new ExistentialClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_existentialClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(T__41);
			setState(289); match(T__55);
			setState(290); existentialDcl();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(291); match(Semi);
				setState(292); existentialDcl();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistentialDclContext extends ParserRuleContext {
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public TypeDclContext typeDcl() {
			return getRuleContext(TypeDclContext.class,0);
		}
		public ExistentialDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existentialDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExistentialDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExistentialDcl(this);
		}
	}

	public final ExistentialDclContext existentialDcl() throws RecognitionException {
		ExistentialDclContext _localctx = new ExistentialDclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_existentialDcl);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(300); match(T__37);
				setState(301); typeDcl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); match(T__9);
				setState(303); valDcl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixTypeContext extends ParserRuleContext {
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public List<CompoundTypeContext> compoundType() {
			return getRuleContexts(CompoundTypeContext.class);
		}
		public CompoundTypeContext compoundType(int i) {
			return getRuleContext(CompoundTypeContext.class,i);
		}
		public InfixTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterInfixType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitInfixType(this);
		}
	}

	public final InfixTypeContext infixType() throws RecognitionException {
		InfixTypeContext _localctx = new InfixTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_infixType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306); compoundType();
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307); match(Id);
					setState(309);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(308); match(Nl);
						}
						break;
					}
					setState(311); compoundType();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundTypeContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public RefinementContext refinement() {
			return getRuleContext(RefinementContext.class,0);
		}
		public CompoundTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCompoundType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCompoundType(this);
		}
	}

	public final CompoundTypeContext compoundType() throws RecognitionException {
		CompoundTypeContext _localctx = new CompoundTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compoundType);
		int _la;
		try {
			setState(329);
			switch (_input.LA(1)) {
			case T__47:
			case T__18:
			case T__3:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(317); annotType();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(318); match(T__10);
					setState(319); annotType();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(325); refinement();
					}
					break;
				}
				}
				break;
			case T__55:
			case Nl:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); refinement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAnnotType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAnnotType(this);
		}
	}

	public final AnnotTypeContext annotType() throws RecognitionException {
		AnnotTypeContext _localctx = new AnnotTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_annotType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331); simpleType(0);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332); annotation();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		return simpleType(0);
	}

	private SimpleTypeContext simpleType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, _parentState);
		SimpleTypeContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_simpleType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(339); stableId();
				}
				break;
			case 2:
				{
				setState(346);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(340); stableId();
					}
					break;
				case 2:
					{
					setState(343);
					_la = _input.LA(1);
					if (_la==Id) {
						{
						setState(341); match(Id);
						setState(342); match(T__16);
						}
					}

					setState(345); match(T__18);
					}
					break;
				}
				setState(348); match(T__16);
				setState(349); match(T__37);
				}
				break;
			case 3:
				{
				setState(350); match(T__47);
				setState(351); types();
				setState(352); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType);
						setState(356);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(357); typeArgs();
						}
						break;
					case 2:
						{
						_localctx = new SimpleTypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleType);
						setState(358);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(359); match(T__36);
						setState(360); match(Id);
						}
						break;
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeArgsContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeArgs(this);
		}
	}

	public final TypeArgsContext typeArgs() throws RecognitionException {
		TypeArgsContext _localctx = new TypeArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(T__12);
			setState(367); types();
			setState(368); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); type();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(371); match(T__46);
				setState(372); type();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefinementContext extends ParserRuleContext {
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public List<RefineStatContext> refineStat() {
			return getRuleContexts(RefineStatContext.class);
		}
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public RefineStatContext refineStat(int i) {
			return getRuleContext(RefineStatContext.class,i);
		}
		public RefinementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterRefinement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitRefinement(this);
		}
	}

	public final RefinementContext refinement() throws RecognitionException {
		RefinementContext _localctx = new RefinementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_refinement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if (_la==Nl) {
				{
				setState(378); match(Nl);
				}
			}

			setState(381); match(T__55);
			setState(382); refineStat();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(383); match(Semi);
				setState(384); refineStat();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefineStatContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public RefineStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refineStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterRefineStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitRefineStat(this);
		}
	}

	public final RefineStatContext refineStat() throws RecognitionException {
		RefineStatContext _localctx = new RefineStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_refineStat);
		try {
			setState(396);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); dcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); match(T__37);
				setState(394); typeDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypePatContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypePatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypePat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypePat(this);
		}
	}

	public final TypePatContext typePat() throws RecognitionException {
		TypePatContext _localctx = new TypePatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typePat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AscriptionContext extends ParserRuleContext {
		public InfixTypeContext infixType() {
			return getRuleContext(InfixTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAscription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAscription(this);
		}
	}

	public final AscriptionContext ascription() throws RecognitionException {
		AscriptionContext _localctx = new AscriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ascription);
		int _la;
		try {
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400); match(T__13);
				setState(401); infixType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); match(T__13);
				setState(404); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(403); annotation();
					}
					}
					setState(406); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__38 );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408); match(T__13);
				setState(409); match(T__8);
				setState(410); match(T__19);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			setState(424);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				switch (_input.LA(1)) {
				case T__47:
					{
					setState(413); bindings();
					}
					break;
				case T__4:
				case Id:
					{
					setState(415);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(414); match(T__4);
						}
					}

					setState(417); match(Id);
					}
					break;
				case T__8:
					{
					setState(418); match(T__8);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421); match(T__6);
				setState(422); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423); expr1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Semi() { return getToken(ScalaParser.Semi, 0); }
		public EnumeratorsContext enumerators() {
			return getRuleContext(EnumeratorsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public AscriptionContext ascription() {
			return getRuleContext(AscriptionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExpr1(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr1);
		int _la;
		try {
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426); match(T__22);
				setState(427); match(T__47);
				setState(428); expr();
				setState(429); match(T__2);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Nl) {
					{
					{
					setState(430); match(Nl);
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436); expr();
				setState(442);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(438);
					_la = _input.LA(1);
					if (_la==Semi) {
						{
						setState(437); match(Semi);
						}
					}

					setState(440); match(T__5);
					setState(441); expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); match(T__56);
				setState(445); match(T__47);
				setState(446); expr();
				setState(447); match(T__2);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Nl) {
					{
					{
					setState(448); match(Nl);
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(454); expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456); match(T__21);
				setState(462);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(457); match(T__55);
					setState(458); block();
					setState(459); match(T__23);
					}
					break;
				case 2:
					{
					setState(461); expr();
					}
					break;
				}
				setState(469);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(464); match(T__28);
					setState(465); match(T__55);
					setState(466); caseClauses();
					setState(467); match(T__23);
					}
					break;
				}
				setState(473);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(471); match(T__59);
					setState(472); expr();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475); match(T__48);
				setState(476); expr();
				setState(478);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(477); match(Semi);
					}
				}

				setState(480); match(T__56);
				setState(481); match(T__47);
				setState(482); expr();
				setState(483); match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(485); match(T__52);
				setState(494);
				switch (_input.LA(1)) {
				case T__47:
					{
					setState(486); match(T__47);
					setState(487); enumerators();
					setState(488); match(T__2);
					}
					break;
				case T__55:
					{
					setState(490); match(T__55);
					setState(491); enumerators();
					setState(492); match(T__23);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Nl) {
					{
					{
					setState(496); match(Nl);
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(502); match(T__20);
					}
				}

				setState(505); expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(507); match(T__14);
				setState(508); expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(509); match(T__26);
				setState(511);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(510); expr();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(523);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(513); match(T__58);
					setState(516);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(514); classTemplate();
						}
						break;
					case 2:
						{
						setState(515); templateBody();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(518); blockExpr();
					}
					break;
				case 3:
					{
					setState(519); simpleExpr1(0);
					setState(521);
					_la = _input.LA(1);
					if (_la==T__8) {
						{
						setState(520); match(T__8);
						}
					}

					}
					break;
				}
				setState(525); match(T__16);
				}
				setState(527); match(Id);
				setState(528); match(T__54);
				setState(529); expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(531); simpleExpr1(0);
				setState(532); argumentExprs();
				setState(533); match(T__54);
				setState(534); expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(536); postfixExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(537); postfixExpr();
				setState(538); ascription();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(540); postfixExpr();
				setState(541); match(T__34);
				setState(542); match(T__55);
				setState(543); caseClauses();
				setState(544); match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExprContext extends ParserRuleContext {
		public InfixExprContext infixExpr() {
			return getRuleContext(InfixExprContext.class,0);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPostfixExpr(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548); infixExpr(0);
			setState(553);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(549); match(Id);
				setState(551);
				_la = _input.LA(1);
				if (_la==Nl) {
					{
					setState(550); match(Nl);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixExprContext extends ParserRuleContext {
		public List<InfixExprContext> infixExpr() {
			return getRuleContexts(InfixExprContext.class);
		}
		public InfixExprContext infixExpr(int i) {
			return getRuleContext(InfixExprContext.class,i);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public InfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterInfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitInfixExpr(this);
		}
	}

	public final InfixExprContext infixExpr() throws RecognitionException {
		return infixExpr(0);
	}

	private InfixExprContext infixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixExprContext _localctx = new InfixExprContext(_ctx, _parentState);
		InfixExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_infixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(556); prefixExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InfixExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_infixExpr);
					setState(558);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(559); match(Id);
					setState(561);
					_la = _input.LA(1);
					if (_la==Nl) {
						{
						setState(560); match(Nl);
						}
					}

					setState(563); infixExpr(2);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrefixExprContext extends ParserRuleContext {
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPrefixExpr(this);
		}
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prefixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(569);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__31) | (1L << T__7) | (1L << T__0))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(572); match(T__58);
				setState(575);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(573); classTemplate();
					}
					break;
				case 2:
					{
					setState(574); templateBody();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(577); blockExpr();
				}
				break;
			case 3:
				{
				setState(578); simpleExpr1(0);
				setState(580);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(579); match(T__8);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpr1Context extends ParserRuleContext {
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeArgsContext typeArgs() {
			return getRuleContext(TypeArgsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public SimpleExpr1Context simpleExpr1() {
			return getRuleContext(SimpleExpr1Context.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public SimpleExpr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimpleExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimpleExpr1(this);
		}
	}

	public final SimpleExpr1Context simpleExpr1() throws RecognitionException {
		return simpleExpr1(0);
	}

	private SimpleExpr1Context simpleExpr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpr1Context _localctx = new SimpleExpr1Context(_ctx, _parentState);
		SimpleExpr1Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_simpleExpr1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(585); literal();
				}
				break;
			case 2:
				{
				setState(586); stableId();
				}
				break;
			case 3:
				{
				setState(589);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(587); match(Id);
					setState(588); match(T__16);
					}
				}

				setState(591); match(T__18);
				}
				break;
			case 4:
				{
				setState(592); match(T__8);
				}
				break;
			case 5:
				{
				setState(593); match(T__47);
				setState(595);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__39) | (1L << T__31) | (1L << T__26) | (1L << T__22) | (1L << T__21) | (1L << T__18) | (1L << T__14) | (1L << T__8) | (1L << T__7) | (1L << T__4) | (1L << T__3) | (1L << T__0) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Id - 64)))) != 0)) {
					{
					setState(594); exprs();
					}
				}

				setState(597); match(T__2);
				}
				break;
			case 6:
				{
				setState(604);
				switch (_input.LA(1)) {
				case T__58:
					{
					setState(598); match(T__58);
					setState(601);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(599); classTemplate();
						}
						break;
					case 2:
						{
						setState(600); templateBody();
						}
						break;
					}
					}
					break;
				case T__55:
					{
					setState(603); blockExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606); match(T__16);
				setState(607); match(Id);
				}
				break;
			case 7:
				{
				setState(615);
				switch (_input.LA(1)) {
				case T__58:
					{
					setState(609); match(T__58);
					setState(612);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(610); classTemplate();
						}
						break;
					case 2:
						{
						setState(611); templateBody();
						}
						break;
					}
					}
					break;
				case T__55:
					{
					setState(614); blockExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(617); typeArgs();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExpr1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr1);
					setState(621);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(622); argumentExprs();
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628); expr();
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(629); match(T__46);
					setState(630); expr();
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentExprsContext extends ParserRuleContext {
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public BlockExprContext blockExpr() {
			return getRuleContext(BlockExprContext.class,0);
		}
		public ArgumentExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterArgumentExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitArgumentExprs(this);
		}
	}

	public final ArgumentExprsContext argumentExprs() throws RecognitionException {
		ArgumentExprsContext _localctx = new ArgumentExprsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentExprs);
		int _la;
		try {
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636); match(T__47);
				setState(638);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__39) | (1L << T__31) | (1L << T__26) | (1L << T__22) | (1L << T__21) | (1L << T__18) | (1L << T__14) | (1L << T__8) | (1L << T__7) | (1L << T__4) | (1L << T__3) | (1L << T__0) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Id - 64)))) != 0)) {
					{
					setState(637); exprs();
					}
				}

				setState(640); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); match(T__47);
				setState(645);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(642); exprs();
					setState(643); match(T__46);
					}
					break;
				}
				setState(647); postfixExpr();
				setState(648); match(T__13);
				setState(649); match(T__8);
				setState(650); match(T__19);
				setState(651); match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				_la = _input.LA(1);
				if (_la==Nl) {
					{
					setState(653); match(Nl);
					}
				}

				setState(656); blockExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockExprContext extends ParserRuleContext {
		public CaseClausesContext caseClauses() {
			return getRuleContext(CaseClausesContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBlockExpr(this);
		}
	}

	public final BlockExprContext blockExpr() throws RecognitionException {
		BlockExprContext _localctx = new BlockExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockExpr);
		try {
			setState(667);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659); match(T__55);
				setState(660); caseClauses();
				setState(661); match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663); match(T__55);
				setState(664); block();
				setState(665); match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public ResultExprContext resultExpr() {
			return getRuleContext(ResultExprContext.class,0);
		}
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669); blockStat();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(670); match(Semi);
				setState(671); blockStat();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__58) | (1L << T__56) | (1L << T__55) | (1L << T__52) | (1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__39) | (1L << T__31) | (1L << T__26) | (1L << T__22) | (1L << T__21) | (1L << T__18) | (1L << T__14) | (1L << T__8) | (1L << T__7) | (1L << T__4) | (1L << T__3) | (1L << T__0) | (1L << BooleanLiteral) | (1L << CharacterLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (SymbolLiteral - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (Id - 64)))) != 0)) {
				{
				setState(677); resultExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatContext extends ParserRuleContext {
		public List<LocalModifierContext> localModifier() {
			return getRuleContexts(LocalModifierContext.class);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public LocalModifierContext localModifier(int i) {
			return getRuleContext(LocalModifierContext.class,i);
		}
		public BlockStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBlockStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBlockStat(this);
		}
	}

	public final BlockStatContext blockStat() throws RecognitionException {
		BlockStatContext _localctx = new BlockStatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockStat);
		int _la;
		try {
			setState(706);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680); import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(681); annotation();
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(688);
				_la = _input.LA(1);
				if (_la==T__30 || _la==T__4) {
					{
					setState(687);
					_la = _input.LA(1);
					if ( !(_la==T__30 || _la==T__4) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(690); def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(691); annotation();
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__42) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) {
					{
					{
					setState(697); localModifier();
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703); tmplDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(704); expr1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultExprContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public BindingsContext bindings() {
			return getRuleContext(BindingsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CompoundTypeContext compoundType() {
			return getRuleContext(CompoundTypeContext.class,0);
		}
		public ResultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterResultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitResultExpr(this);
		}
	}

	public final ResultExprContext resultExpr() throws RecognitionException {
		ResultExprContext _localctx = new ResultExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_resultExpr);
		int _la;
		try {
			setState(724);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708); expr1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				switch (_input.LA(1)) {
				case T__47:
					{
					setState(709); bindings();
					}
					break;
				case T__8:
				case T__4:
				case Id:
					{
					setState(715);
					switch (_input.LA(1)) {
					case T__4:
					case Id:
						{
						setState(711);
						_la = _input.LA(1);
						if (_la==T__4) {
							{
							setState(710); match(T__4);
							}
						}

						setState(713); match(Id);
						}
						break;
					case T__8:
						{
						setState(714); match(T__8);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(717); match(T__13);
					setState(718); compoundType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(721); match(T__6);
				setState(722); block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorsContext extends ParserRuleContext {
		public List<GeneratorContext> generator() {
			return getRuleContexts(GeneratorContext.class);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public GeneratorContext generator(int i) {
			return getRuleContext(GeneratorContext.class,i);
		}
		public EnumeratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterEnumerators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitEnumerators(this);
		}
	}

	public final EnumeratorsContext enumerators() throws RecognitionException {
		EnumeratorsContext _localctx = new EnumeratorsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumerators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726); generator();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(727); match(Semi);
				setState(728); generator();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratorContext extends ParserRuleContext {
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitGenerator(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734); pattern1();
			setState(735); match(T__45);
			setState(736); expr();
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(746);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						setState(738);
						_la = _input.LA(1);
						if (_la==Semi) {
							{
							setState(737); match(Semi);
							}
						}

						setState(740); guard();
						}
						break;
					case 2:
						{
						setState(741); match(Semi);
						setState(742); pattern1();
						setState(743); match(T__54);
						setState(744); expr();
						}
						break;
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCaseClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCaseClauses(this);
		}
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(751); caseClause();
				}
				}
				setState(754); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCaseClause(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756); match(T__15);
			setState(757); pattern();
			setState(759);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(758); guard();
				}
			}

			setState(761); match(T__6);
			setState(762); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitGuard(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764); match(T__22);
			setState(765); postfixExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public List<Pattern1Context> pattern1() {
			return getRuleContexts(Pattern1Context.class);
		}
		public Pattern1Context pattern1(int i) {
			return getRuleContext(Pattern1Context.class,i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); pattern1();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(768); match(T__11);
				setState(769); pattern1();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern1Context extends ParserRuleContext {
		public Pattern2Context pattern2() {
			return getRuleContext(Pattern2Context.class,0);
		}
		public TypePatContext typePat() {
			return getRuleContext(TypePatContext.class,0);
		}
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public Pattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern1(this);
		}
	}

	public final Pattern1Context pattern1() throws RecognitionException {
		Pattern1Context _localctx = new Pattern1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_pattern1);
		try {
			setState(782);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(775); match(Varid);
				setState(776); match(T__13);
				setState(777); typePat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778); match(T__8);
				setState(779); match(T__13);
				setState(780); typePat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(781); pattern2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern2Context extends ParserRuleContext {
		public Pattern3Context pattern3() {
			return getRuleContext(Pattern3Context.class,0);
		}
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public Pattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern2(this);
		}
	}

	public final Pattern2Context pattern2() throws RecognitionException {
		Pattern2Context _localctx = new Pattern2Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_pattern2);
		int _la;
		try {
			setState(790);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784); match(Varid);
				setState(787);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(785); match(T__38);
					setState(786); pattern3();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789); pattern3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern3Context extends ParserRuleContext {
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public SimplePatternContext simplePattern(int i) {
			return getRuleContext(SimplePatternContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public List<SimplePatternContext> simplePattern() {
			return getRuleContexts(SimplePatternContext.class);
		}
		public Pattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPattern3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPattern3(this);
		}
	}

	public final Pattern3Context pattern3() throws RecognitionException {
		Pattern3Context _localctx = new Pattern3Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_pattern3);
		int _la;
		try {
			setState(804);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792); simplePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793); simplePattern();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Id) {
					{
					{
					setState(794); match(Id);
					setState(796);
					_la = _input.LA(1);
					if (_la==Nl) {
						{
						setState(795); match(Nl);
						}
					}

					setState(798); simplePattern();
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplePatternContext extends ParserRuleContext {
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public TerminalNode Varid() { return getToken(ScalaParser.Varid, 0); }
		public SimplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSimplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSimplePattern(this);
		}
	}

	public final SimplePatternContext simplePattern() throws RecognitionException {
		SimplePatternContext _localctx = new SimplePatternContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simplePattern);
		int _la;
		try {
			setState(836);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807); match(Varid);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808); literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809); stableId();
				setState(814);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(810); match(T__47);
					setState(811); patterns();
					setState(812); match(T__2);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(816); stableId();
				setState(817); match(T__47);
				setState(821);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(818); patterns();
					setState(819); match(T__46);
					}
					break;
				}
				setState(825);
				_la = _input.LA(1);
				if (_la==Varid) {
					{
					setState(823); match(Varid);
					setState(824); match(T__38);
					}
				}

				setState(827); match(T__8);
				setState(828); match(T__19);
				setState(829); match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(831); match(T__47);
				setState(833);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(832); patterns();
					}
					break;
				}
				setState(835); match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternsContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternsContext patterns(int i) {
			return getRuleContext(PatternsContext.class,i);
		}
		public List<PatternsContext> patterns() {
			return getRuleContexts(PatternsContext.class);
		}
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPatterns(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_patterns);
		int _la;
		try {
			int _alt;
			setState(852);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838); pattern();
				setState(843);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(839); match(T__46);
						setState(840); patterns();
						}
						} 
					}
					setState(845);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(846); match(T__8);
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParamClauseContext extends ParserRuleContext {
		public List<VariantTypeParamContext> variantTypeParam() {
			return getRuleContexts(VariantTypeParamContext.class);
		}
		public VariantTypeParamContext variantTypeParam(int i) {
			return getRuleContext(VariantTypeParamContext.class,i);
		}
		public TypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeParamClause(this);
		}
	}

	public final TypeParamClauseContext typeParamClause() throws RecognitionException {
		TypeParamClauseContext _localctx = new TypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854); match(T__12);
			setState(855); variantTypeParam();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(856); match(T__46);
				setState(857); variantTypeParam();
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunTypeParamClauseContext extends ParserRuleContext {
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public FunTypeParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funTypeParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunTypeParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunTypeParamClause(this);
		}
	}

	public final FunTypeParamClauseContext funTypeParamClause() throws RecognitionException {
		FunTypeParamClauseContext _localctx = new FunTypeParamClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_funTypeParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865); match(T__12);
			setState(866); typeParam();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(867); match(T__46);
				setState(868); typeParam();
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantTypeParamContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public VariantTypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantTypeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterVariantTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitVariantTypeParam(this);
		}
	}

	public final VariantTypeParamContext variantTypeParam() throws RecognitionException {
		VariantTypeParamContext _localctx = new VariantTypeParamContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variantTypeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(876); annotation();
				}
			}

			setState(880);
			_la = _input.LA(1);
			if (_la==T__31 || _la==T__0) {
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(882); typeParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParamContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeParam(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(886);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(885); typeParamClause();
				}
			}

			setState(890);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(888); match(T__57);
				setState(889); type();
				}
			}

			setState(894);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(892); match(T__53);
				setState(893); type();
				}
			}

			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(896); match(T__33);
				setState(897); type();
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(903); match(T__13);
				setState(904); type();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamClausesContext extends ParserRuleContext {
		public List<ParamClauseContext> paramClause() {
			return getRuleContexts(ParamClauseContext.class);
		}
		public ParamClauseContext paramClause(int i) {
			return getRuleContext(ParamClauseContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public ParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParamClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParamClauses(this);
		}
	}

	public final ParamClausesContext paramClauses() throws RecognitionException {
		ParamClausesContext _localctx = new ParamClausesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_paramClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(910); paramClause();
					}
					} 
				}
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(924);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(917);
				_la = _input.LA(1);
				if (_la==Nl) {
					{
					setState(916); match(Nl);
					}
				}

				setState(919); match(T__47);
				setState(920); match(T__4);
				setState(921); params();
				setState(922); match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamClauseContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public ParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParamClause(this);
		}
	}

	public final ParamClauseContext paramClause() throws RecognitionException {
		ParamClauseContext _localctx = new ParamClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_paramClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			_la = _input.LA(1);
			if (_la==Nl) {
				{
				setState(926); match(Nl);
				}
			}

			setState(929); match(T__47);
			setState(931);
			_la = _input.LA(1);
			if (_la==T__38 || _la==Id) {
				{
				setState(930); params();
				}
			}

			setState(933); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935); param();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(936); match(T__46);
				setState(937); param();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(943); annotation();
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(949); match(Id);
			setState(952);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(950); match(T__13);
				setState(951); paramType();
				}
			}

			setState(956);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(954); match(T__54);
				setState(955); expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterParamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitParamType(this);
		}
	}

	public final ParamTypeContext paramType() throws RecognitionException {
		ParamTypeContext _localctx = new ParamTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_paramType);
		try {
			setState(964);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958); type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(959); match(T__6);
				setState(960); type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(961); type();
				setState(962); match(T__19);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamClausesContext extends ParserRuleContext {
		public List<ClassParamClauseContext> classParamClause() {
			return getRuleContexts(ClassParamClauseContext.class);
		}
		public ClassParamClauseContext classParamClause(int i) {
			return getRuleContext(ClassParamClauseContext.class,i);
		}
		public ClassParamsContext classParams() {
			return getRuleContext(ClassParamsContext.class,0);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public ClassParamClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParamClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParamClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParamClauses(this);
		}
	}

	public final ClassParamClausesContext classParamClauses() throws RecognitionException {
		ClassParamClausesContext _localctx = new ClassParamClausesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classParamClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(966); classParamClause();
					}
					} 
				}
				setState(971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(980);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(973);
				_la = _input.LA(1);
				if (_la==Nl) {
					{
					setState(972); match(Nl);
					}
				}

				setState(975); match(T__47);
				setState(976); match(T__4);
				setState(977); classParams();
				setState(978); match(T__2);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamClauseContext extends ParserRuleContext {
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public ClassParamsContext classParams() {
			return getRuleContext(ClassParamsContext.class,0);
		}
		public ClassParamClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParamClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParamClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParamClause(this);
		}
	}

	public final ClassParamClauseContext classParamClause() throws RecognitionException {
		ClassParamClauseContext _localctx = new ClassParamClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classParamClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if (_la==Nl) {
				{
				setState(982); match(Nl);
				}
			}

			setState(985); match(T__47);
			setState(987);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__44) | (1L << T__43) | (1L << T__42) | (1L << T__38) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__9) | (1L << T__4))) != 0) || _la==Id) {
				{
				setState(986); classParams();
				}
			}

			setState(989); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamsContext extends ParserRuleContext {
		public List<ClassParamContext> classParam() {
			return getRuleContexts(ClassParamContext.class);
		}
		public ClassParamContext classParam(int i) {
			return getRuleContext(ClassParamContext.class,i);
		}
		public ClassParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParams(this);
		}
	}

	public final ClassParamsContext classParams() throws RecognitionException {
		ClassParamsContext _localctx = new ClassParamsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_classParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); classParam();
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(992); match(T__46);
				setState(993); classParam();
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParamContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ParamTypeContext paramType() {
			return getRuleContext(ParamTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParam(this);
		}
	}

	public final ClassParamContext classParam() throws RecognitionException {
		ClassParamContext _localctx = new ClassParamContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_classParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(999); annotation();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__43) | (1L << T__42) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) {
				{
				{
				setState(1005); modifier();
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1012);
			_la = _input.LA(1);
			if (_la==T__44 || _la==T__9) {
				{
				setState(1011);
				_la = _input.LA(1);
				if ( !(_la==T__44 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1014); match(Id);
			setState(1015); match(T__13);
			setState(1016); paramType();
			setState(1019);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(1017); match(T__54);
				setState(1018); expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingsContext extends ParserRuleContext {
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public BindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBindings(this);
		}
	}

	public final BindingsContext bindings() throws RecognitionException {
		BindingsContext _localctx = new BindingsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bindings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); match(T__47);
			setState(1022); binding();
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(1023); match(T__46);
				setState(1024); binding();
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1035);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1033); match(T__13);
				setState(1034); type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public LocalModifierContext localModifier() {
			return getRuleContext(LocalModifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_modifier);
		try {
			setState(1040);
			switch (_input.LA(1)) {
			case T__43:
			case T__42:
			case T__32:
			case T__30:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037); localModifier();
				}
				break;
			case T__60:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038); accessModifier();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 3);
				{
				setState(1039); match(T__51);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalModifierContext extends ParserRuleContext {
		public LocalModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterLocalModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitLocalModifier(this);
		}
	}

	public final LocalModifierContext localModifier() throws RecognitionException {
		LocalModifierContext _localctx = new LocalModifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_localModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__42) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessQualifierContext accessQualifier() {
			return getRuleContext(AccessQualifierContext.class,0);
		}
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			_la = _input.LA(1);
			if ( !(_la==T__60 || _la==T__35) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1046);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1045); accessQualifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessQualifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public AccessQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAccessQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAccessQualifier(this);
		}
	}

	public final AccessQualifierContext accessQualifier() throws RecognitionException {
		AccessQualifierContext _localctx = new AccessQualifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_accessQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048); match(T__12);
			setState(1049);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1050); match(T__40);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1052); match(T__38);
			setState(1053); simpleType(0);
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1054); argumentExprs();
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrAnnotationContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public ArgumentExprsContext argumentExprs() {
			return getRuleContext(ArgumentExprsContext.class,0);
		}
		public ConstrAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstrAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstrAnnotation(this);
		}
	}

	public final ConstrAnnotationContext constrAnnotation() throws RecognitionException {
		ConstrAnnotationContext _localctx = new ConstrAnnotationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constrAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); match(T__38);
			setState(1061); simpleType(0);
			setState(1062); argumentExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBodyContext extends ParserRuleContext {
		public TemplateStatContext templateStat(int i) {
			return getRuleContext(TemplateStatContext.class,i);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public List<TemplateStatContext> templateStat() {
			return getRuleContexts(TemplateStatContext.class);
		}
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public SelfTypeContext selfType() {
			return getRuleContext(SelfTypeContext.class,0);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTemplateBody(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_templateBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_la = _input.LA(1);
			if (_la==Nl) {
				{
				setState(1064); match(Nl);
				}
			}

			setState(1067); match(T__55);
			setState(1069);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1068); selfType();
				}
				break;
			}
			setState(1071); templateStat();
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1072); match(Semi);
				setState(1073); templateStat();
				}
				}
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateStatContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public TemplateStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTemplateStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTemplateStat(this);
		}
	}

	public final TemplateStatContext templateStat() throws RecognitionException {
		TemplateStatContext _localctx = new TemplateStatContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_templateStat);
		int _la;
		try {
			setState(1116);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081); import_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(1082); annotation();
					setState(1084);
					_la = _input.LA(1);
					if (_la==Nl) {
						{
						setState(1083); match(Nl);
						}
					}

					}
					}
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__43) | (1L << T__42) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) {
					{
					{
					setState(1091); modifier();
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097); def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(1098); annotation();
					setState(1100);
					_la = _input.LA(1);
					if (_la==Nl) {
						{
						setState(1099); match(Nl);
						}
					}

					}
					}
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__43) | (1L << T__42) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) {
					{
					{
					setState(1107); modifier();
					}
					}
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1113); dcl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1114); expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfTypeContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SelfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSelfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSelfType(this);
		}
	}

	public final SelfTypeContext selfType() throws RecognitionException {
		SelfTypeContext _localctx = new SelfTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_selfType);
		int _la;
		try {
			setState(1129);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118); match(Id);
				setState(1121);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(1119); match(T__13);
					setState(1120); type();
					}
				}

				setState(1123); match(T__6);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124); match(T__18);
				setState(1125); match(T__13);
				setState(1126); type();
				setState(1127); match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_Context extends ParserRuleContext {
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public Import_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImport_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImport_(this);
		}
	}

	public final Import_Context import_() throws RecognitionException {
		Import_Context _localctx = new Import_Context(_ctx, getState());
		enterRule(_localctx, 132, RULE_import_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131); match(T__1);
			setState(1132); importExpr();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(1133); match(T__46);
				setState(1134); importExpr();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportExprContext extends ParserRuleContext {
		public ImportSelectorsContext importSelectors() {
			return getRuleContext(ImportSelectorsContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public StableIdContext stableId() {
			return getRuleContext(StableIdContext.class,0);
		}
		public ImportExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImportExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImportExpr(this);
		}
	}

	public final ImportExprContext importExpr() throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_importExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); stableId();
			setState(1141); match(T__16);
			setState(1145);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(1142); match(Id);
				}
				break;
			case T__8:
				{
				setState(1143); match(T__8);
				}
				break;
			case T__55:
				{
				setState(1144); importSelectors();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSelectorsContext extends ParserRuleContext {
		public List<ImportSelectorContext> importSelector() {
			return getRuleContexts(ImportSelectorContext.class);
		}
		public ImportSelectorContext importSelector(int i) {
			return getRuleContext(ImportSelectorContext.class,i);
		}
		public ImportSelectorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelectors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImportSelectors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImportSelectors(this);
		}
	}

	public final ImportSelectorsContext importSelectors() throws RecognitionException {
		ImportSelectorsContext _localctx = new ImportSelectorsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_importSelectors);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); match(T__55);
			setState(1153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1148); importSelector();
					setState(1149); match(T__46);
					}
					} 
				}
				setState(1155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1158);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(1156); importSelector();
				}
				break;
			case T__8:
				{
				setState(1157); match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1160); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSelectorContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(ScalaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ScalaParser.Id, i);
		}
		public ImportSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterImportSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitImportSelector(this);
		}
	}

	public final ImportSelectorContext importSelector() throws RecognitionException {
		ImportSelectorContext _localctx = new ImportSelectorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_importSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); match(Id);
			setState(1167);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1163); match(T__6);
				setState(1164); match(Id);
				}
				break;
			case 2:
				{
				setState(1165); match(T__6);
				setState(1166); match(T__8);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclContext extends ParserRuleContext {
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public FunDclContext funDcl() {
			return getRuleContext(FunDclContext.class,0);
		}
		public ValDclContext valDcl() {
			return getRuleContext(ValDclContext.class,0);
		}
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public TypeDclContext typeDcl() {
			return getRuleContext(TypeDclContext.class,0);
		}
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dcl);
		int _la;
		try {
			setState(1183);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(1169); match(T__9);
				setState(1170); valDcl();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171); match(T__44);
				setState(1172); varDcl();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173); match(T__29);
				setState(1174); funDcl();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(1175); match(T__37);
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Nl) {
					{
					{
					setState(1176); match(Nl);
					}
					}
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1182); typeDcl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValDclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ValDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterValDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitValDcl(this);
		}
	}

	public final ValDclContext valDcl() throws RecognitionException {
		ValDclContext _localctx = new ValDclContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_valDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185); ids();
			setState(1186); match(T__13);
			setState(1187); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public VarDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterVarDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitVarDcl(this);
		}
	}

	public final VarDclContext varDcl() throws RecognitionException {
		VarDclContext _localctx = new VarDclContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_varDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189); ids();
			setState(1190); match(T__13);
			setState(1191); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunSigContext funSig() {
			return getRuleContext(FunSigContext.class,0);
		}
		public FunDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunDcl(this);
		}
	}

	public final FunDclContext funDcl() throws RecognitionException {
		FunDclContext _localctx = new FunDclContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_funDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193); funSig();
			setState(1196);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1194); match(T__13);
				setState(1195); type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunSigContext extends ParserRuleContext {
		public FunTypeParamClauseContext funTypeParamClause() {
			return getRuleContext(FunTypeParamClauseContext.class,0);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ParamClausesContext paramClauses() {
			return getRuleContext(ParamClausesContext.class,0);
		}
		public FunSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funSig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunSig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunSig(this);
		}
	}

	public final FunSigContext funSig() throws RecognitionException {
		FunSigContext _localctx = new FunSigContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_funSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198); match(Id);
			setState(1200);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1199); funTypeParamClause();
				}
			}

			setState(1202); paramClauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDclContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TypeDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeDcl(this);
		}
	}

	public final TypeDclContext typeDcl() throws RecognitionException {
		TypeDclContext _localctx = new TypeDclContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204); match(Id);
			setState(1206);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1205); typeParamClause();
				}
			}

			setState(1210);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(1208); match(T__57);
				setState(1209); type();
				}
			}

			setState(1214);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(1212); match(T__53);
				setState(1213); type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatVarDefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public PatVarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patVarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPatVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPatVarDef(this);
		}
	}

	public final PatVarDefContext patVarDef() throws RecognitionException {
		PatVarDefContext _localctx = new PatVarDefContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_patVarDef);
		try {
			setState(1220);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216); match(T__9);
				setState(1217); patDef();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(1218); match(T__44);
				setState(1219); varDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public PatVarDefContext patVarDef() {
			return getRuleContext(PatVarDefContext.class,0);
		}
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public FunDefContext funDef() {
			return getRuleContext(FunDefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_def);
		int _la;
		try {
			setState(1234);
			switch (_input.LA(1)) {
			case T__44:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222); patVarDef();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223); match(T__29);
				setState(1224); funDef();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225); match(T__37);
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Nl) {
					{
					{
					setState(1226); match(Nl);
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1232); typeDef();
				}
				break;
			case T__27:
			case T__25:
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(1233); tmplDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatDefContext extends ParserRuleContext {
		public List<Pattern2Context> pattern2() {
			return getRuleContexts(Pattern2Context.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Pattern2Context pattern2(int i) {
			return getRuleContext(Pattern2Context.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public PatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPatDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPatDef(this);
		}
	}

	public final PatDefContext patDef() throws RecognitionException {
		PatDefContext _localctx = new PatDefContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_patDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236); pattern2();
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(1237); match(T__46);
				setState(1238); pattern2();
				}
				}
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1244); match(T__13);
				setState(1245); type();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1251); match(T__54);
			setState(1252); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public PatDefContext patDef() {
			return getRuleContext(PatDefContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_varDef);
		try {
			setState(1261);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254); patDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255); ids();
				setState(1256); match(T__13);
				setState(1257); type();
				setState(1258); match(T__54);
				setState(1259); match(T__8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunDefContext extends ParserRuleContext {
		public ParamClauseContext paramClause() {
			return getRuleContext(ParamClauseContext.class,0);
		}
		public ConstrBlockContext constrBlock() {
			return getRuleContext(ConstrBlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public ConstrExprContext constrExpr() {
			return getRuleContext(ConstrExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunSigContext funSig() {
			return getRuleContext(FunSigContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamClausesContext paramClauses() {
			return getRuleContext(ParamClausesContext.class,0);
		}
		public FunDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterFunDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitFunDef(this);
		}
	}

	public final FunDefContext funDef() throws RecognitionException {
		FunDefContext _localctx = new FunDefContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_funDef);
		int _la;
		try {
			setState(1288);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263); funSig();
				setState(1266);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(1264); match(T__13);
					setState(1265); type();
					}
				}

				setState(1268); match(T__54);
				setState(1269); expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271); funSig();
				setState(1273);
				_la = _input.LA(1);
				if (_la==Nl) {
					{
					setState(1272); match(Nl);
					}
				}

				setState(1275); match(T__55);
				setState(1276); block();
				setState(1277); match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1279); match(T__18);
				setState(1280); paramClause();
				setState(1281); paramClauses();
				setState(1286);
				switch (_input.LA(1)) {
				case T__54:
					{
					setState(1282); match(T__54);
					setState(1283); constrExpr();
					}
					break;
				case Nl:
					{
					setState(1284); match(Nl);
					setState(1285); constrBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); match(Id);
			setState(1292);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1291); typeParamClause();
				}
			}

			setState(1294); match(T__54);
			setState(1295); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TmplDefContext extends ParserRuleContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public TraitDefContext traitDef() {
			return getRuleContext(TraitDefContext.class,0);
		}
		public TmplDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tmplDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTmplDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTmplDef(this);
		}
	}

	public final TmplDefContext tmplDef() throws RecognitionException {
		TmplDefContext _localctx = new TmplDefContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tmplDef);
		int _la;
		try {
			setState(1307);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(1297); match(T__15);
					}
				}

				setState(1300); match(T__25);
				setState(1301); classDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302); match(T__15);
				setState(1303); match(T__17);
				setState(1304); objectDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305); match(T__27);
				setState(1306); traitDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefContext extends ParserRuleContext {
		public List<ConstrAnnotationContext> constrAnnotation() {
			return getRuleContexts(ConstrAnnotationContext.class);
		}
		public ConstrAnnotationContext constrAnnotation(int i) {
			return getRuleContext(ConstrAnnotationContext.class,i);
		}
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassParamClausesContext classParamClauses() {
			return getRuleContext(ClassParamClausesContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ClassTemplateOptContext classTemplateOpt() {
			return getRuleContext(ClassTemplateOptContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassDef(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309); match(Id);
			setState(1311);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1310); typeParamClause();
				}
			}

			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(1313); constrAnnotation();
				}
				}
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1320);
			_la = _input.LA(1);
			if (_la==T__60 || _la==T__35) {
				{
				setState(1319); accessModifier();
				}
			}

			setState(1322); classParamClauses();
			setState(1323); classTemplateOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public TraitTemplateOptContext traitTemplateOpt() {
			return getRuleContext(TraitTemplateOptContext.class,0);
		}
		public TypeParamClauseContext typeParamClause() {
			return getRuleContext(TypeParamClauseContext.class,0);
		}
		public TraitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitDef(this);
		}
	}

	public final TraitDefContext traitDef() throws RecognitionException {
		TraitDefContext _localctx = new TraitDefContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_traitDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325); match(Id);
			setState(1327);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1326); typeParamClause();
				}
			}

			setState(1329); traitTemplateOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectDefContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(ScalaParser.Id, 0); }
		public ClassTemplateOptContext classTemplateOpt() {
			return getRuleContext(ClassTemplateOptContext.class,0);
		}
		public ObjectDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterObjectDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitObjectDef(this);
		}
	}

	public final ObjectDefContext objectDef() throws RecognitionException {
		ObjectDefContext _localctx = new ObjectDefContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_objectDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331); match(Id);
			setState(1332); classTemplateOpt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTemplateOptContext extends ParserRuleContext {
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ClassTemplateContext classTemplate() {
			return getRuleContext(ClassTemplateContext.class,0);
		}
		public ClassTemplateOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTemplateOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassTemplateOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassTemplateOpt(this);
		}
	}

	public final ClassTemplateOptContext classTemplateOpt() throws RecognitionException {
		ClassTemplateOptContext _localctx = new ClassTemplateOptContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_classTemplateOpt);
		int _la;
		try {
			setState(1342);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334); match(T__24);
				setState(1335); classTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1337);
					_la = _input.LA(1);
					if (_la==T__24) {
						{
						setState(1336); match(T__24);
						}
					}

					setState(1339); templateBody();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitTemplateOptContext extends ParserRuleContext {
		public TraitTemplateContext traitTemplate() {
			return getRuleContext(TraitTemplateContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TraitTemplateOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitTemplateOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitTemplateOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitTemplateOpt(this);
		}
	}

	public final TraitTemplateOptContext traitTemplateOpt() throws RecognitionException {
		TraitTemplateOptContext _localctx = new TraitTemplateOptContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_traitTemplateOpt);
		int _la;
		try {
			setState(1352);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344); match(T__24);
				setState(1345); traitTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1347);
					_la = _input.LA(1);
					if (_la==T__24) {
						{
						setState(1346); match(T__24);
						}
					}

					setState(1349); templateBody();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTemplateContext extends ParserRuleContext {
		public ClassParentsContext classParents() {
			return getRuleContext(ClassParentsContext.class,0);
		}
		public EarlyDefsContext earlyDefs() {
			return getRuleContext(EarlyDefsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public ClassTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassTemplate(this);
		}
	}

	public final ClassTemplateContext classTemplate() throws RecognitionException {
		ClassTemplateContext _localctx = new ClassTemplateContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_classTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(1354); earlyDefs();
				}
			}

			setState(1357); classParents();
			setState(1359);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1358); templateBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitTemplateContext extends ParserRuleContext {
		public EarlyDefsContext earlyDefs() {
			return getRuleContext(EarlyDefsContext.class,0);
		}
		public TraitParentsContext traitParents() {
			return getRuleContext(TraitParentsContext.class,0);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TraitTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitTemplate(this);
		}
	}

	public final TraitTemplateContext traitTemplate() throws RecognitionException {
		TraitTemplateContext _localctx = new TraitTemplateContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_traitTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(1361); earlyDefs();
				}
			}

			setState(1364); traitParents();
			setState(1366);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1365); templateBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassParentsContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public ConstrContext constr() {
			return getRuleContext(ConstrContext.class,0);
		}
		public ClassParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classParents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterClassParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitClassParents(this);
		}
	}

	public final ClassParentsContext classParents() throws RecognitionException {
		ClassParentsContext _localctx = new ClassParentsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_classParents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); constr();
			setState(1373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1369); match(T__10);
					setState(1370); annotType();
					}
					} 
				}
				setState(1375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitParentsContext extends ParserRuleContext {
		public List<AnnotTypeContext> annotType() {
			return getRuleContexts(AnnotTypeContext.class);
		}
		public AnnotTypeContext annotType(int i) {
			return getRuleContext(AnnotTypeContext.class,i);
		}
		public TraitParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitParents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTraitParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTraitParents(this);
		}
	}

	public final TraitParentsContext traitParents() throws RecognitionException {
		TraitParentsContext _localctx = new TraitParentsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_traitParents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376); annotType();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(1377); match(T__10);
				setState(1378); annotType();
				}
				}
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrContext extends ParserRuleContext {
		public AnnotTypeContext annotType() {
			return getRuleContext(AnnotTypeContext.class,0);
		}
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstr(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1384); annotType();
			setState(1388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1385); argumentExprs();
					}
					} 
				}
				setState(1390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EarlyDefsContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public EarlyDefContext earlyDef(int i) {
			return getRuleContext(EarlyDefContext.class,i);
		}
		public List<EarlyDefContext> earlyDef() {
			return getRuleContexts(EarlyDefContext.class);
		}
		public EarlyDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_earlyDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterEarlyDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitEarlyDefs(this);
		}
	}

	public final EarlyDefsContext earlyDefs() throws RecognitionException {
		EarlyDefsContext _localctx = new EarlyDefsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_earlyDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391); match(T__55);
			setState(1400);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__44) | (1L << T__43) | (1L << T__42) | (1L << T__38) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__9) | (1L << T__4))) != 0)) {
				{
				setState(1392); earlyDef();
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Semi) {
					{
					{
					setState(1393); match(Semi);
					setState(1394); earlyDef();
					}
					}
					setState(1399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1402); match(T__23);
			setState(1403); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EarlyDefContext extends ParserRuleContext {
		public PatVarDefContext patVarDef() {
			return getRuleContext(PatVarDefContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public EarlyDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_earlyDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterEarlyDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitEarlyDef(this);
		}
	}

	public final EarlyDefContext earlyDef() throws RecognitionException {
		EarlyDefContext _localctx = new EarlyDefContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_earlyDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(1405); annotation();
				setState(1407);
				_la = _input.LA(1);
				if (_la==Nl) {
					{
					setState(1406); match(Nl);
					}
				}

				}
				}
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__43) | (1L << T__42) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) {
				{
				{
				setState(1414); modifier();
				}
				}
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1420); patVarDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrExprContext extends ParserRuleContext {
		public ConstrBlockContext constrBlock() {
			return getRuleContext(ConstrBlockContext.class,0);
		}
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public ConstrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstrExpr(this);
		}
	}

	public final ConstrExprContext constrExpr() throws RecognitionException {
		ConstrExprContext _localctx = new ConstrExprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constrExpr);
		try {
			setState(1424);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422); selfInvocation();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423); constrBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrBlockContext extends ParserRuleContext {
		public BlockStatContext blockStat(int i) {
			return getRuleContext(BlockStatContext.class,i);
		}
		public List<BlockStatContext> blockStat() {
			return getRuleContexts(BlockStatContext.class);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public SelfInvocationContext selfInvocation() {
			return getRuleContext(SelfInvocationContext.class,0);
		}
		public ConstrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterConstrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitConstrBlock(this);
		}
	}

	public final ConstrBlockContext constrBlock() throws RecognitionException {
		ConstrBlockContext _localctx = new ConstrBlockContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_constrBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426); match(T__55);
			setState(1427); selfInvocation();
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1428); match(Semi);
				setState(1429); blockStat();
				}
				}
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1435); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfInvocationContext extends ParserRuleContext {
		public ArgumentExprsContext argumentExprs(int i) {
			return getRuleContext(ArgumentExprsContext.class,i);
		}
		public List<ArgumentExprsContext> argumentExprs() {
			return getRuleContexts(ArgumentExprsContext.class);
		}
		public SelfInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterSelfInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitSelfInvocation(this);
		}
	}

	public final SelfInvocationContext selfInvocation() throws RecognitionException {
		SelfInvocationContext _localctx = new SelfInvocationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_selfInvocation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1437); match(T__18);
			setState(1439); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1438); argumentExprs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1441); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopStatSeqContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public List<TopStatContext> topStat() {
			return getRuleContexts(TopStatContext.class);
		}
		public TopStatContext topStat(int i) {
			return getRuleContext(TopStatContext.class,i);
		}
		public TopStatSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTopStatSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTopStatSeq(this);
		}
	}

	public final TopStatSeqContext topStatSeq() throws RecognitionException {
		TopStatSeqContext _localctx = new TopStatSeqContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_topStatSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443); topStat();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1444); match(Semi);
				setState(1445); topStat();
				}
				}
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopStatContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public List<TerminalNode> Nl() { return getTokens(ScalaParser.Nl); }
		public TerminalNode Nl(int i) {
			return getToken(ScalaParser.Nl, i);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PackagingContext packaging() {
			return getRuleContext(PackagingContext.class,0);
		}
		public PackageObjectContext packageObject() {
			return getRuleContext(PackageObjectContext.class,0);
		}
		public TmplDefContext tmplDef() {
			return getRuleContext(TmplDefContext.class,0);
		}
		public Import_Context import_() {
			return getRuleContext(Import_Context.class,0);
		}
		public TopStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterTopStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitTopStat(this);
		}
	}

	public final TopStatContext topStat() throws RecognitionException {
		TopStatContext _localctx = new TopStatContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_topStat);
		int _la;
		try {
			setState(1471);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(1451); annotation();
					setState(1453);
					_la = _input.LA(1);
					if (_la==Nl) {
						{
						setState(1452); match(Nl);
						}
					}

					}
					}
					setState(1459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__51) | (1L << T__43) | (1L << T__42) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__4))) != 0)) {
					{
					{
					setState(1460); modifier();
					}
					}
					setState(1465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1466); tmplDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467); import_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1468); packaging();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1469); packageObject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagingContext extends ParserRuleContext {
		public TerminalNode Nl() { return getToken(ScalaParser.Nl, 0); }
		public TopStatSeqContext topStatSeq() {
			return getRuleContext(TopStatSeqContext.class,0);
		}
		public QualIdContext qualId() {
			return getRuleContext(QualIdContext.class,0);
		}
		public PackagingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packaging; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPackaging(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPackaging(this);
		}
	}

	public final PackagingContext packaging() throws RecognitionException {
		PackagingContext _localctx = new PackagingContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_packaging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473); match(T__49);
			setState(1474); qualId();
			setState(1476);
			_la = _input.LA(1);
			if (_la==Nl) {
				{
				setState(1475); match(Nl);
				}
			}

			setState(1478); match(T__55);
			setState(1479); topStatSeq();
			setState(1480); match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageObjectContext extends ParserRuleContext {
		public ObjectDefContext objectDef() {
			return getRuleContext(ObjectDefContext.class,0);
		}
		public PackageObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterPackageObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitPackageObject(this);
		}
	}

	public final PackageObjectContext packageObject() throws RecognitionException {
		PackageObjectContext _localctx = new PackageObjectContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_packageObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482); match(T__49);
			setState(1483); match(T__17);
			setState(1484); objectDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public QualIdContext qualId(int i) {
			return getRuleContext(QualIdContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(ScalaParser.Semi); }
		public TopStatSeqContext topStatSeq() {
			return getRuleContext(TopStatSeqContext.class,0);
		}
		public TerminalNode Semi(int i) {
			return getToken(ScalaParser.Semi, i);
		}
		public List<QualIdContext> qualId() {
			return getRuleContexts(QualIdContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScalaListener ) ((ScalaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_compilationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1486); match(T__49);
					setState(1487); qualId();
					setState(1488); match(Semi);
					}
					} 
				}
				setState(1494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			setState(1495); topStatSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return simpleType_sempred((SimpleTypeContext)_localctx, predIndex);
		case 22: return infixExpr_sempred((InfixExprContext)_localctx, predIndex);
		case 24: return simpleExpr1_sempred((SimpleExpr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleType_sempred(SimpleTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean infixExpr_sempred(InfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simpleExpr1_sempred(SimpleExpr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u05dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\5\2\u00d2\n\2"+
		"\3\2\3\2\5\2\u00d6\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00de\n\2\3\3\3\3\3"+
		"\3\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\4\3\4\3\4\7\4\u00eb\n\4\f\4\16"+
		"\4\u00ee\13\4\3\5\3\5\3\5\5\5\u00f3\n\5\3\5\5\5\u00f6\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00fc\n\5\3\5\3\5\5\5\u0100\n\5\3\5\3\5\5\5\u0104\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0110\n\7\5\7\u0112\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0119\n\b\f\b\16\b\u011c\13\b\5\b\u011e\n\b\3\b\5\b\u0121"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u0128\n\t\f\t\16\t\u012b\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u0133\n\n\3\13\3\13\3\13\5\13\u0138\n\13\3\13\7\13\u013b"+
		"\n\13\f\13\16\13\u013e\13\13\3\f\3\f\3\f\7\f\u0143\n\f\f\f\16\f\u0146"+
		"\13\f\3\f\5\f\u0149\n\f\3\f\5\f\u014c\n\f\3\r\3\r\7\r\u0150\n\r\f\r\16"+
		"\r\u0153\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u015a\n\16\3\16\5\16\u015d"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0165\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u016c\n\16\f\16\16\16\u016f\13\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\u0178\n\20\f\20\16\20\u017b\13\20\3\21\5\21\u017e\n\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0184\n\21\f\21\16\21\u0187\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\5\22\u018f\n\22\3\23\3\23\3\24\3\24\3\24\3\24\6\24"+
		"\u0197\n\24\r\24\16\24\u0198\3\24\3\24\3\24\5\24\u019e\n\24\3\25\3\25"+
		"\5\25\u01a2\n\25\3\25\3\25\5\25\u01a6\n\25\3\25\3\25\3\25\5\25\u01ab\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\7\26\u01b2\n\26\f\26\16\26\u01b5\13\26\3"+
		"\26\3\26\5\26\u01b9\n\26\3\26\3\26\5\26\u01bd\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u01c4\n\26\f\26\16\26\u01c7\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01d1\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u01d8\n"+
		"\26\3\26\3\26\5\26\u01dc\n\26\3\26\3\26\3\26\5\26\u01e1\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01f1"+
		"\n\26\3\26\7\26\u01f4\n\26\f\26\16\26\u01f7\13\26\3\26\5\26\u01fa\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0202\n\26\3\26\3\26\3\26\5\26\u0207"+
		"\n\26\3\26\3\26\3\26\5\26\u020c\n\26\5\26\u020e\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0225\n\26\3\27\3\27\3\27\5\27\u022a\n\27\5\27"+
		"\u022c\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0234\n\30\3\30\7\30\u0237"+
		"\n\30\f\30\16\30\u023a\13\30\3\31\5\31\u023d\n\31\3\31\3\31\3\31\5\31"+
		"\u0242\n\31\3\31\3\31\3\31\5\31\u0247\n\31\5\31\u0249\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0250\n\32\3\32\3\32\3\32\3\32\5\32\u0256\n\32\3\32"+
		"\3\32\3\32\3\32\5\32\u025c\n\32\3\32\5\32\u025f\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u0267\n\32\3\32\5\32\u026a\n\32\3\32\3\32\5\32\u026e"+
		"\n\32\3\32\3\32\7\32\u0272\n\32\f\32\16\32\u0275\13\32\3\33\3\33\3\33"+
		"\7\33\u027a\n\33\f\33\16\33\u027d\13\33\3\34\3\34\5\34\u0281\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0288\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0291\n\34\3\34\5\34\u0294\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u029e\n\35\3\36\3\36\3\36\7\36\u02a3\n\36\f\36\16\36\u02a6"+
		"\13\36\3\36\5\36\u02a9\n\36\3\37\3\37\7\37\u02ad\n\37\f\37\16\37\u02b0"+
		"\13\37\3\37\5\37\u02b3\n\37\3\37\3\37\7\37\u02b7\n\37\f\37\16\37\u02ba"+
		"\13\37\3\37\7\37\u02bd\n\37\f\37\16\37\u02c0\13\37\3\37\3\37\3\37\5\37"+
		"\u02c5\n\37\3 \3 \3 \5 \u02ca\n \3 \3 \5 \u02ce\n \3 \3 \5 \u02d2\n \3"+
		" \3 \3 \5 \u02d7\n \3!\3!\3!\7!\u02dc\n!\f!\16!\u02df\13!\3\"\3\"\3\""+
		"\3\"\5\"\u02e5\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u02ed\n\"\f\"\16\"\u02f0"+
		"\13\"\3#\6#\u02f3\n#\r#\16#\u02f4\3$\3$\3$\5$\u02fa\n$\3$\3$\3$\3%\3%"+
		"\3%\3&\3&\3&\7&\u0305\n&\f&\16&\u0308\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\5\'\u0311\n\'\3(\3(\3(\5(\u0316\n(\3(\5(\u0319\n(\3)\3)\3)\3)\5)\u031f"+
		"\n)\3)\7)\u0322\n)\f)\16)\u0325\13)\5)\u0327\n)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u0331\n*\3*\3*\3*\3*\3*\5*\u0338\n*\3*\3*\5*\u033c\n*\3*\3*\3*\3"+
		"*\3*\3*\5*\u0344\n*\3*\5*\u0347\n*\3+\3+\3+\7+\u034c\n+\f+\16+\u034f\13"+
		"+\3+\7+\u0352\n+\f+\16+\u0355\13+\5+\u0357\n+\3,\3,\3,\3,\7,\u035d\n,"+
		"\f,\16,\u0360\13,\3,\3,\3-\3-\3-\3-\7-\u0368\n-\f-\16-\u036b\13-\3-\3"+
		"-\3.\5.\u0370\n.\3.\5.\u0373\n.\3.\3.\3/\3/\5/\u0379\n/\3/\3/\5/\u037d"+
		"\n/\3/\3/\5/\u0381\n/\3/\3/\7/\u0385\n/\f/\16/\u0388\13/\3/\3/\7/\u038c"+
		"\n/\f/\16/\u038f\13/\3\60\7\60\u0392\n\60\f\60\16\60\u0395\13\60\3\60"+
		"\5\60\u0398\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u039f\n\60\3\61\5\61\u03a2"+
		"\n\61\3\61\3\61\5\61\u03a6\n\61\3\61\3\61\3\62\3\62\3\62\7\62\u03ad\n"+
		"\62\f\62\16\62\u03b0\13\62\3\63\7\63\u03b3\n\63\f\63\16\63\u03b6\13\63"+
		"\3\63\3\63\3\63\5\63\u03bb\n\63\3\63\3\63\5\63\u03bf\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u03c7\n\64\3\65\7\65\u03ca\n\65\f\65\16\65\u03cd"+
		"\13\65\3\65\5\65\u03d0\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u03d7\n\65\3"+
		"\66\5\66\u03da\n\66\3\66\3\66\5\66\u03de\n\66\3\66\3\66\3\67\3\67\3\67"+
		"\7\67\u03e5\n\67\f\67\16\67\u03e8\13\67\38\78\u03eb\n8\f8\168\u03ee\13"+
		"8\38\78\u03f1\n8\f8\168\u03f4\138\38\58\u03f7\n8\38\38\38\38\38\58\u03fe"+
		"\n8\39\39\39\39\79\u0404\n9\f9\169\u0407\139\39\39\3:\3:\3:\5:\u040e\n"+
		":\3;\3;\3;\5;\u0413\n;\3<\3<\3=\3=\5=\u0419\n=\3>\3>\3>\3>\3?\3?\3?\7"+
		"?\u0422\n?\f?\16?\u0425\13?\3@\3@\3@\3@\3A\5A\u042c\nA\3A\3A\5A\u0430"+
		"\nA\3A\3A\3A\7A\u0435\nA\fA\16A\u0438\13A\3A\3A\3B\3B\3B\5B\u043f\nB\7"+
		"B\u0441\nB\fB\16B\u0444\13B\3B\7B\u0447\nB\fB\16B\u044a\13B\3B\3B\3B\5"+
		"B\u044f\nB\7B\u0451\nB\fB\16B\u0454\13B\3B\7B\u0457\nB\fB\16B\u045a\13"+
		"B\3B\3B\3B\5B\u045f\nB\3C\3C\3C\5C\u0464\nC\3C\3C\3C\3C\3C\3C\5C\u046c"+
		"\nC\3D\3D\3D\3D\7D\u0472\nD\fD\16D\u0475\13D\3E\3E\3E\3E\3E\5E\u047c\n"+
		"E\3F\3F\3F\3F\7F\u0482\nF\fF\16F\u0485\13F\3F\3F\5F\u0489\nF\3F\3F\3G"+
		"\3G\3G\3G\3G\5G\u0492\nG\3H\3H\3H\3H\3H\3H\3H\3H\7H\u049c\nH\fH\16H\u049f"+
		"\13H\3H\5H\u04a2\nH\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\5K\u04af\nK\3L\3"+
		"L\5L\u04b3\nL\3L\3L\3M\3M\5M\u04b9\nM\3M\3M\5M\u04bd\nM\3M\3M\5M\u04c1"+
		"\nM\3N\3N\3N\3N\5N\u04c7\nN\3O\3O\3O\3O\3O\7O\u04ce\nO\fO\16O\u04d1\13"+
		"O\3O\3O\5O\u04d5\nO\3P\3P\3P\7P\u04da\nP\fP\16P\u04dd\13P\3P\3P\7P\u04e1"+
		"\nP\fP\16P\u04e4\13P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u04f0\nQ\3R\3R\3"+
		"R\5R\u04f5\nR\3R\3R\3R\3R\3R\5R\u04fc\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\5R\u0509\nR\5R\u050b\nR\3S\3S\5S\u050f\nS\3S\3S\3S\3T\5T\u0515\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\5T\u051e\nT\3U\3U\5U\u0522\nU\3U\7U\u0525\nU\f"+
		"U\16U\u0528\13U\3U\5U\u052b\nU\3U\3U\3U\3V\3V\5V\u0532\nV\3V\3V\3W\3W"+
		"\3W\3X\3X\3X\5X\u053c\nX\3X\5X\u053f\nX\5X\u0541\nX\3Y\3Y\3Y\5Y\u0546"+
		"\nY\3Y\5Y\u0549\nY\5Y\u054b\nY\3Z\5Z\u054e\nZ\3Z\3Z\5Z\u0552\nZ\3[\5["+
		"\u0555\n[\3[\3[\5[\u0559\n[\3\\\3\\\3\\\7\\\u055e\n\\\f\\\16\\\u0561\13"+
		"\\\3]\3]\3]\7]\u0566\n]\f]\16]\u0569\13]\3^\3^\7^\u056d\n^\f^\16^\u0570"+
		"\13^\3_\3_\3_\3_\7_\u0576\n_\f_\16_\u0579\13_\5_\u057b\n_\3_\3_\3_\3`"+
		"\3`\5`\u0582\n`\7`\u0584\n`\f`\16`\u0587\13`\3`\7`\u058a\n`\f`\16`\u058d"+
		"\13`\3`\3`\3a\3a\5a\u0593\na\3b\3b\3b\3b\7b\u0599\nb\fb\16b\u059c\13b"+
		"\3b\3b\3c\3c\6c\u05a2\nc\rc\16c\u05a3\3d\3d\3d\7d\u05a9\nd\fd\16d\u05ac"+
		"\13d\3e\3e\5e\u05b0\ne\7e\u05b2\ne\fe\16e\u05b5\13e\3e\7e\u05b8\ne\fe"+
		"\16e\u05bb\13e\3e\3e\3e\3e\3e\5e\u05c2\ne\3f\3f\3f\5f\u05c7\nf\3f\3f\3"+
		"f\3f\3g\3g\3g\3g\3h\3h\3h\3h\7h\u05d5\nh\fh\16h\u05d8\13h\3h\3h\3h\2\5"+
		"\32.\62i\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\2\n\6\2\30"+
		"\30  88??\4\2!!;;\4\2  ??\4\2\67\67FF\4\2\23\23\66\66\6\2\24\25\37\37"+
		"!!;;\4\2\3\3\34\34\4\2--FF\u0678\2\u00dd\3\2\2\2\4\u00df\3\2\2\2\6\u00e7"+
		"\3\2\2\2\b\u0103\3\2\2\2\n\u0105\3\2\2\2\f\u0111\3\2\2\2\16\u0120\3\2"+
		"\2\2\20\u0122\3\2\2\2\22\u0132\3\2\2\2\24\u0134\3\2\2\2\26\u014b\3\2\2"+
		"\2\30\u014d\3\2\2\2\32\u0164\3\2\2\2\34\u0170\3\2\2\2\36\u0174\3\2\2\2"+
		" \u017d\3\2\2\2\"\u018e\3\2\2\2$\u0190\3\2\2\2&\u019d\3\2\2\2(\u01aa\3"+
		"\2\2\2*\u0224\3\2\2\2,\u0226\3\2\2\2.\u022d\3\2\2\2\60\u023c\3\2\2\2\62"+
		"\u026d\3\2\2\2\64\u0276\3\2\2\2\66\u0293\3\2\2\28\u029d\3\2\2\2:\u029f"+
		"\3\2\2\2<\u02c4\3\2\2\2>\u02d6\3\2\2\2@\u02d8\3\2\2\2B\u02e0\3\2\2\2D"+
		"\u02f2\3\2\2\2F\u02f6\3\2\2\2H\u02fe\3\2\2\2J\u0301\3\2\2\2L\u0310\3\2"+
		"\2\2N\u0318\3\2\2\2P\u0326\3\2\2\2R\u0346\3\2\2\2T\u0356\3\2\2\2V\u0358"+
		"\3\2\2\2X\u0363\3\2\2\2Z\u036f\3\2\2\2\\\u0376\3\2\2\2^\u0393\3\2\2\2"+
		"`\u03a1\3\2\2\2b\u03a9\3\2\2\2d\u03b4\3\2\2\2f\u03c6\3\2\2\2h\u03cb\3"+
		"\2\2\2j\u03d9\3\2\2\2l\u03e1\3\2\2\2n\u03ec\3\2\2\2p\u03ff\3\2\2\2r\u040a"+
		"\3\2\2\2t\u0412\3\2\2\2v\u0414\3\2\2\2x\u0416\3\2\2\2z\u041a\3\2\2\2|"+
		"\u041e\3\2\2\2~\u0426\3\2\2\2\u0080\u042b\3\2\2\2\u0082\u045e\3\2\2\2"+
		"\u0084\u046b\3\2\2\2\u0086\u046d\3\2\2\2\u0088\u0476\3\2\2\2\u008a\u047d"+
		"\3\2\2\2\u008c\u048c\3\2\2\2\u008e\u04a1\3\2\2\2\u0090\u04a3\3\2\2\2\u0092"+
		"\u04a7\3\2\2\2\u0094\u04ab\3\2\2\2\u0096\u04b0\3\2\2\2\u0098\u04b6\3\2"+
		"\2\2\u009a\u04c6\3\2\2\2\u009c\u04d4\3\2\2\2\u009e\u04d6\3\2\2\2\u00a0"+
		"\u04ef\3\2\2\2\u00a2\u050a\3\2\2\2\u00a4\u050c\3\2\2\2\u00a6\u051d\3\2"+
		"\2\2\u00a8\u051f\3\2\2\2\u00aa\u052f\3\2\2\2\u00ac\u0535\3\2\2\2\u00ae"+
		"\u0540\3\2\2\2\u00b0\u054a\3\2\2\2\u00b2\u054d\3\2\2\2\u00b4\u0554\3\2"+
		"\2\2\u00b6\u055a\3\2\2\2\u00b8\u0562\3\2\2\2\u00ba\u056a\3\2\2\2\u00bc"+
		"\u0571\3\2\2\2\u00be\u0585\3\2\2\2\u00c0\u0592\3\2\2\2\u00c2\u0594\3\2"+
		"\2\2\u00c4\u059f\3\2\2\2\u00c6\u05a5\3\2\2\2\u00c8\u05c1\3\2\2\2\u00ca"+
		"\u05c3\3\2\2\2\u00cc\u05cc\3\2\2\2\u00ce\u05d6\3\2\2\2\u00d0\u00d2\7?"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00de\7D\2\2\u00d4\u00d6\7?\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2"+
		"\2\u00d6\u00d7\3\2\2\2\u00d7\u00de\7E\2\2\u00d8\u00de\7@\2\2\u00d9\u00de"+
		"\7A\2\2\u00da\u00de\7B\2\2\u00db\u00de\7C\2\2\u00dc\u00de\7\r\2\2\u00dd"+
		"\u00d1\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\3\3\2\2\2\u00df\u00e4\7F\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e3\7F\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\5\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ec\7F\2\2\u00e8\u00e9"+
		"\7\21\2\2\u00e9\u00eb\7F\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\7\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f6\7F\2\2\u00f0\u00f1\7F\2\2\u00f1\u00f3\7/\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\7-\2\2\u00f5"+
		"\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7/"+
		"\2\2\u00f8\u0104\7F\2\2\u00f9\u00fa\7F\2\2\u00fa\u00fc\7/\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7<\2\2\u00fe"+
		"\u0100\5\n\6\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\7/\2\2\u0102\u0104\7F\2\2\u0103\u00f5\3\2\2\2\u0103\u00fb"+
		"\3\2\2\2\u0104\t\3\2\2\2\u0105\u0106\7\63\2\2\u0106\u0107\7F\2\2\u0107"+
		"\u0108\7\27\2\2\u0108\13\3\2\2\2\u0109\u010a\5\16\b\2\u010a\u010b\79\2"+
		"\2\u010b\u010c\5\f\7\2\u010c\u0112\3\2\2\2\u010d\u010f\5\24\13\2\u010e"+
		"\u0110\5\20\t\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3"+
		"\2\2\2\u0111\u0109\3\2\2\2\u0111\u010d\3\2\2\2\u0112\r\3\2\2\2\u0113\u0121"+
		"\5\24\13\2\u0114\u011d\7\20\2\2\u0115\u011a\5f\64\2\u0116\u0117\7\21\2"+
		"\2\u0117\u0119\5f\64\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0115\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\7="+
		"\2\2\u0120\u0113\3\2\2\2\u0120\u0114\3\2\2\2\u0121\17\3\2\2\2\u0122\u0123"+
		"\7\26\2\2\u0123\u0124\7\b\2\2\u0124\u0129\5\22\n\2\u0125\u0126\7I\2\2"+
		"\u0126\u0128\5\22\n\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7(\2\2\u012d\21\3\2\2\2\u012e\u012f\7\32\2\2\u012f\u0133\5\u0098"+
		"M\2\u0130\u0131\7\66\2\2\u0131\u0133\5\u0090I\2\u0132\u012e\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\23\3\2\2\2\u0134\u013c\5\26\f\2\u0135\u0137\7F\2"+
		"\2\u0136\u0138\7H\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013b\5\26\f\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\25\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0144\5\30\r\2\u0140\u0141\7\65\2\2\u0141\u0143\5\30\r"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\5 \21\2\u0148"+
		"\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014c\5 "+
		"\21\2\u014b\u013f\3\2\2\2\u014b\u014a\3\2\2\2\u014c\27\3\2\2\2\u014d\u0151"+
		"\5\32\16\2\u014e\u0150\5|?\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\31\3\2\2\2\u0153\u0151\3\2\2"+
		"\2\u0154\u0155\b\16\1\2\u0155\u0165\5\b\5\2\u0156\u015d\5\b\5\2\u0157"+
		"\u0158\7F\2\2\u0158\u015a\7/\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2"+
		"\2\u015a\u015b\3\2\2\2\u015b\u015d\7-\2\2\u015c\u0156\3\2\2\2\u015c\u0159"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7/\2\2\u015f\u0165\7\32\2\2\u0160"+
		"\u0161\7\20\2\2\u0161\u0162\5\36\20\2\u0162\u0163\7=\2\2\u0163\u0165\3"+
		"\2\2\2\u0164\u0154\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u0160\3\2\2\2\u0165"+
		"\u016d\3\2\2\2\u0166\u0167\f\7\2\2\u0167\u016c\5\34\17\2\u0168\u0169\f"+
		"\6\2\2\u0169\u016a\7\33\2\2\u016a\u016c\7F\2\2\u016b\u0166\3\2\2\2\u016b"+
		"\u0168\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\33\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\63\2\2\u0171\u0172"+
		"\5\36\20\2\u0172\u0173\7\27\2\2\u0173\35\3\2\2\2\u0174\u0179\5\f\7\2\u0175"+
		"\u0176\7\21\2\2\u0176\u0178\5\f\7\2\u0177\u0175\3\2\2\2\u0178\u017b\3"+
		"\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\37\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017e\7H\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7\b\2\2\u0180\u0185\5\"\22\2\u0181"+
		"\u0182\7I\2\2\u0182\u0184\5\"\22\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0189\7(\2\2\u0189!\3\2\2\2\u018a\u018f\5\u008eH"+
		"\2\u018b\u018c\7\32\2\2\u018c\u018f\5\u00a4S\2\u018d\u018f\3\2\2\2\u018e"+
		"\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018d\3\2\2\2\u018f#\3\2\2\2"+
		"\u0190\u0191\5\f\7\2\u0191%\3\2\2\2\u0192\u0193\7\62\2\2\u0193\u019e\5"+
		"\24\13\2\u0194\u0196\7\62\2\2\u0195\u0197\5|?\2\u0196\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019e\3\2"+
		"\2\2\u019a\u019b\7\62\2\2\u019b\u019c\7\67\2\2\u019c\u019e\7,\2\2\u019d"+
		"\u0192\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u019a\3\2\2\2\u019e\'\3\2\2\2"+
		"\u019f\u01a6\5p9\2\u01a0\u01a2\7;\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a6\7F\2\2\u01a4\u01a6\7\67\2\2\u01a5"+
		"\u019f\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a8\79\2\2\u01a8\u01ab\5(\25\2\u01a9\u01ab\5*\26\2\u01aa"+
		"\u01a5\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab)\3\2\2\2\u01ac\u01ad\7)\2\2\u01ad"+
		"\u01ae\7\20\2\2\u01ae\u01af\5(\25\2\u01af\u01b3\7=\2\2\u01b0\u01b2\7H"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01bc\5("+
		"\25\2\u01b7\u01b9\7I\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\7:\2\2\u01bb\u01bd\5(\25\2\u01bc\u01b8\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u0225\3\2\2\2\u01be\u01bf\7\7\2\2\u01bf"+
		"\u01c0\7\20\2\2\u01c0\u01c1\5(\25\2\u01c1\u01c5\7=\2\2\u01c2\u01c4\7H"+
		"\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\5("+
		"\25\2\u01c9\u0225\3\2\2\2\u01ca\u01d0\7*\2\2\u01cb\u01cc\7\b\2\2\u01cc"+
		"\u01cd\5:\36\2\u01cd\u01ce\7(\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01d1\5(\25"+
		"\2\u01d0\u01cb\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d7\3\2\2\2\u01d2\u01d3"+
		"\7#\2\2\u01d3\u01d4\7\b\2\2\u01d4\u01d5\5D#\2\u01d5\u01d6\7(\2\2\u01d6"+
		"\u01d8\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01db\3\2"+
		"\2\2\u01d9\u01da\7\4\2\2\u01da\u01dc\5(\25\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u0225\3\2\2\2\u01dd\u01de\7\17\2\2\u01de\u01e0\5"+
		"(\25\2\u01df\u01e1\7I\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\7\7\2\2\u01e3\u01e4\7\20\2\2\u01e4\u01e5\5"+
		"(\25\2\u01e5\u01e6\7=\2\2\u01e6\u0225\3\2\2\2\u01e7\u01f0\7\13\2\2\u01e8"+
		"\u01e9\7\20\2\2\u01e9\u01ea\5@!\2\u01ea\u01eb\7=\2\2\u01eb\u01f1\3\2\2"+
		"\2\u01ec\u01ed\7\b\2\2\u01ed\u01ee\5@!\2\u01ee\u01ef\7(\2\2\u01ef\u01f1"+
		"\3\2\2\2\u01f0\u01e8\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1\u01f5\3\2\2\2\u01f2"+
		"\u01f4\7H\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01fa\7+\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fc\5(\25\2\u01fc\u0225\3\2\2\2\u01fd\u01fe\7\61\2\2\u01fe"+
		"\u0225\5(\25\2\u01ff\u0201\7%\2\2\u0200\u0202\5(\25\2\u0201\u0200\3\2"+
		"\2\2\u0201\u0202\3\2\2\2\u0202\u0225\3\2\2\2\u0203\u0206\7\5\2\2\u0204"+
		"\u0207\5\u00b2Z\2\u0205\u0207\5\u0080A\2\u0206\u0204\3\2\2\2\u0206\u0205"+
		"\3\2\2\2\u0207\u020e\3\2\2\2\u0208\u020e\58\35\2\u0209\u020b\5\62\32\2"+
		"\u020a\u020c\7\67\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e"+
		"\3\2\2\2\u020d\u0203\3\2\2\2\u020d\u0208\3\2\2\2\u020d\u0209\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\7/\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7F\2"+
		"\2\u0212\u0213\7\t\2\2\u0213\u0214\5(\25\2\u0214\u0225\3\2\2\2\u0215\u0216"+
		"\5\62\32\2\u0216\u0217\5\66\34\2\u0217\u0218\7\t\2\2\u0218\u0219\5(\25"+
		"\2\u0219\u0225\3\2\2\2\u021a\u0225\5,\27\2\u021b\u021c\5,\27\2\u021c\u021d"+
		"\5&\24\2\u021d\u0225\3\2\2\2\u021e\u021f\5,\27\2\u021f\u0220\7\35\2\2"+
		"\u0220\u0221\7\b\2\2\u0221\u0222\5D#\2\u0222\u0223\7(\2\2\u0223\u0225"+
		"\3\2\2\2\u0224\u01ac\3\2\2\2\u0224\u01be\3\2\2\2\u0224\u01ca\3\2\2\2\u0224"+
		"\u01dd\3\2\2\2\u0224\u01e7\3\2\2\2\u0224\u01fd\3\2\2\2\u0224\u01ff\3\2"+
		"\2\2\u0224\u020d\3\2\2\2\u0224\u0215\3\2\2\2\u0224\u021a\3\2\2\2\u0224"+
		"\u021b\3\2\2\2\u0224\u021e\3\2\2\2\u0225+\3\2\2\2\u0226\u022b\5.\30\2"+
		"\u0227\u0229\7F\2\2\u0228\u022a\7H\2\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0227\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"-\3\2\2\2\u022d\u022e\b\30\1\2\u022e\u022f\5\60\31\2\u022f\u0238\3\2\2"+
		"\2\u0230\u0231\f\3\2\2\u0231\u0233\7F\2\2\u0232\u0234\7H\2\2\u0233\u0232"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\5.\30\4\u0236"+
		"\u0230\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239/\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\t\2\2\2\u023c\u023b"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0248\3\2\2\2\u023e\u0241\7\5\2\2\u023f"+
		"\u0242\5\u00b2Z\2\u0240\u0242\5\u0080A\2\u0241\u023f\3\2\2\2\u0241\u0240"+
		"\3\2\2\2\u0242\u0249\3\2\2\2\u0243\u0249\58\35\2\u0244\u0246\5\62\32\2"+
		"\u0245\u0247\7\67\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249"+
		"\3\2\2\2\u0248\u023e\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244\3\2\2\2\u0249"+
		"\61\3\2\2\2\u024a\u024b\b\32\1\2\u024b\u026e\5\2\2\2\u024c\u026e\5\b\5"+
		"\2\u024d\u024e\7F\2\2\u024e\u0250\7/\2\2\u024f\u024d\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u026e\7-\2\2\u0252\u026e\7\67\2\2\u0253"+
		"\u0255\7\20\2\2\u0254\u0256\5\64\33\2\u0255\u0254\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u026e\7=\2\2\u0258\u025b\7\5\2\2\u0259"+
		"\u025c\5\u00b2Z\2\u025a\u025c\5\u0080A\2\u025b\u0259\3\2\2\2\u025b\u025a"+
		"\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025f\58\35\2\u025e\u0258\3\2\2\2\u025e"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\7/\2\2\u0261\u0262\7F\2"+
		"\2\u0262\u026e\3\2\2\2\u0263\u0266\7\5\2\2\u0264\u0267\5\u00b2Z\2\u0265"+
		"\u0267\5\u0080A\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u026a"+
		"\3\2\2\2\u0268\u026a\58\35\2\u0269\u0263\3\2\2\2\u0269\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\5\34\17\2\u026c\u026e\3\2\2\2\u026d\u024a\3"+
		"\2\2\2\u026d\u024c\3\2\2\2\u026d\u024f\3\2\2\2\u026d\u0252\3\2\2\2\u026d"+
		"\u0253\3\2\2\2\u026d\u025e\3\2\2\2\u026d\u0269\3\2\2\2\u026e\u0273\3\2"+
		"\2\2\u026f\u0270\f\3\2\2\u0270\u0272\5\66\34\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\63\3\2\2"+
		"\2\u0275\u0273\3\2\2\2\u0276\u027b\5(\25\2\u0277\u0278\7\21\2\2\u0278"+
		"\u027a\5(\25\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2"+
		"\2\2\u027b\u027c\3\2\2\2\u027c\65\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0280"+
		"\7\20\2\2\u027f\u0281\5\64\33\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2"+
		"\2\u0281\u0282\3\2\2\2\u0282\u0294\7=\2\2\u0283\u0287\7\20\2\2\u0284\u0285"+
		"\5\64\33\2\u0285\u0286\7\21\2\2\u0286\u0288\3\2\2\2\u0287\u0284\3\2\2"+
		"\2\u0287\u0288\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\5,\27\2\u028a\u028b"+
		"\7\62\2\2\u028b\u028c\7\67\2\2\u028c\u028d\7,\2\2\u028d\u028e\7=\2\2\u028e"+
		"\u0294\3\2\2\2\u028f\u0291\7H\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\u0294\58\35\2\u0293\u027e\3\2\2\2\u0293"+
		"\u0283\3\2\2\2\u0293\u0290\3\2\2\2\u0294\67\3\2\2\2\u0295\u0296\7\b\2"+
		"\2\u0296\u0297\5D#\2\u0297\u0298\7(\2\2\u0298\u029e\3\2\2\2\u0299\u029a"+
		"\7\b\2\2\u029a\u029b\5:\36\2\u029b\u029c\7(\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u0295\3\2\2\2\u029d\u0299\3\2\2\2\u029e9\3\2\2\2\u029f\u02a4\5<\37\2"+
		"\u02a0\u02a1\7I\2\2\u02a1\u02a3\5<\37\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6"+
		"\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a7\u02a9\5> \2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2"+
		"\2\u02a9;\3\2\2\2\u02aa\u02c5\5\u0086D\2\u02ab\u02ad\5|?\2\u02ac\u02ab"+
		"\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\t\3\2\2\u02b2\u02b1\3\2"+
		"\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02c5\5\u009cO\2\u02b5"+
		"\u02b7\5|?\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2"+
		"\2\u02b8\u02b9\3\2\2\2\u02b9\u02be\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bd"+
		"\5v<\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c5\5\u00a6"+
		"T\2\u02c2\u02c5\5*\26\2\u02c3\u02c5\3\2\2\2\u02c4\u02aa\3\2\2\2\u02c4"+
		"\u02ae\3\2\2\2\u02c4\u02b8\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2"+
		"\2\2\u02c5=\3\2\2\2\u02c6\u02d7\5*\26\2\u02c7\u02d2\5p9\2\u02c8\u02ca"+
		"\7;\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02ce\7F\2\2\u02cc\u02ce\7\67\2\2\u02cd\u02c9\3\2\2\2\u02cd\u02cc\3\2"+
		"\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\7\62\2\2\u02d0\u02d2\5\26\f\2\u02d1"+
		"\u02c7\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\79"+
		"\2\2\u02d4\u02d5\5:\36\2\u02d5\u02d7\3\2\2\2\u02d6\u02c6\3\2\2\2\u02d6"+
		"\u02d1\3\2\2\2\u02d7?\3\2\2\2\u02d8\u02dd\5B\"\2\u02d9\u02da\7I\2\2\u02da"+
		"\u02dc\5B\"\2\u02db\u02d9\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02deA\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1"+
		"\5L\'\2\u02e1\u02e2\7\22\2\2\u02e2\u02ee\5(\25\2\u02e3\u02e5\7I\2\2\u02e4"+
		"\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02ed\5H"+
		"%\2\u02e7\u02e8\7I\2\2\u02e8\u02e9\5L\'\2\u02e9\u02ea\7\t\2\2\u02ea\u02eb"+
		"\5(\25\2\u02eb\u02ed\3\2\2\2\u02ec\u02e4\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ed"+
		"\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02efC\3\2\2\2"+
		"\u02f0\u02ee\3\2\2\2\u02f1\u02f3\5F$\2\u02f2\u02f1\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5E\3\2\2\2\u02f6"+
		"\u02f7\7\60\2\2\u02f7\u02f9\5J&\2\u02f8\u02fa\5H%\2\u02f9\u02f8\3\2\2"+
		"\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\79\2\2\u02fc\u02fd"+
		"\5:\36\2\u02fdG\3\2\2\2\u02fe\u02ff\7)\2\2\u02ff\u0300\5,\27\2\u0300I"+
		"\3\2\2\2\u0301\u0306\5L\'\2\u0302\u0303\7\64\2\2\u0303\u0305\5L\'\2\u0304"+
		"\u0302\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307K\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7G\2\2\u030a\u030b"+
		"\7\62\2\2\u030b\u0311\5$\23\2\u030c\u030d\7\67\2\2\u030d\u030e\7\62\2"+
		"\2\u030e\u0311\5$\23\2\u030f\u0311\5N(\2\u0310\u0309\3\2\2\2\u0310\u030c"+
		"\3\2\2\2\u0310\u030f\3\2\2\2\u0311M\3\2\2\2\u0312\u0315\7G\2\2\u0313\u0314"+
		"\7\31\2\2\u0314\u0316\5P)\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u0319\3\2\2\2\u0317\u0319\5P)\2\u0318\u0312\3\2\2\2\u0318\u0317\3\2\2"+
		"\2\u0319O\3\2\2\2\u031a\u0327\5R*\2\u031b\u0323\5R*\2\u031c\u031e\7F\2"+
		"\2\u031d\u031f\7H\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u0322\5R*\2\u0321\u031c\3\2\2\2\u0322\u0325\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0326\u031a\3\2\2\2\u0326\u031b\3\2\2\2\u0327Q\3\2\2\2\u0328\u0347"+
		"\7\67\2\2\u0329\u0347\7G\2\2\u032a\u0347\5\2\2\2\u032b\u0330\5\b\5\2\u032c"+
		"\u032d\7\20\2\2\u032d\u032e\5T+\2\u032e\u032f\7=\2\2\u032f\u0331\3\2\2"+
		"\2\u0330\u032c\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0347\3\2\2\2\u0332\u0333"+
		"\5\b\5\2\u0333\u0337\7\20\2\2\u0334\u0335\5T+\2\u0335\u0336\7\21\2\2\u0336"+
		"\u0338\3\2\2\2\u0337\u0334\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u033a\7G\2\2\u033a\u033c\7\31\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\7\67\2\2\u033e\u033f\7"+
		",\2\2\u033f\u0340\7=\2\2\u0340\u0347\3\2\2\2\u0341\u0343\7\20\2\2\u0342"+
		"\u0344\5T+\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\3\2\2"+
		"\2\u0345\u0347\7=\2\2\u0346\u0328\3\2\2\2\u0346\u0329\3\2\2\2\u0346\u032a"+
		"\3\2\2\2\u0346\u032b\3\2\2\2\u0346\u0332\3\2\2\2\u0346\u0341\3\2\2\2\u0347"+
		"S\3\2\2\2\u0348\u034d\5J&\2\u0349\u034a\7\21\2\2\u034a\u034c\5T+\2\u034b"+
		"\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u0357\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0352\7\67\2\2\u0351"+
		"\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0348\3\2\2\2\u0356"+
		"\u0353\3\2\2\2\u0357U\3\2\2\2\u0358\u0359\7\63\2\2\u0359\u035e\5Z.\2\u035a"+
		"\u035b\7\21\2\2\u035b\u035d\5Z.\2\u035c\u035a\3\2\2\2\u035d\u0360\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360"+
		"\u035e\3\2\2\2\u0361\u0362\7\27\2\2\u0362W\3\2\2\2\u0363\u0364\7\63\2"+
		"\2\u0364\u0369\5\\/\2\u0365\u0366\7\21\2\2\u0366\u0368\5\\/\2\u0367\u0365"+
		"\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036c\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\7\27\2\2\u036dY\3\2\2\2"+
		"\u036e\u0370\5|?\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372"+
		"\3\2\2\2\u0371\u0373\t\4\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u0374\3\2\2\2\u0374\u0375\5\\/\2\u0375[\3\2\2\2\u0376\u0378\t\5\2\2\u0377"+
		"\u0379\5V,\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037c\3\2\2"+
		"\2\u037a\u037b\7\6\2\2\u037b\u037d\5\f\7\2\u037c\u037a\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037f\7\n\2\2\u037f\u0381\5\f\7\2\u0380"+
		"\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0386\3\2\2\2\u0382\u0383\7\36"+
		"\2\2\u0383\u0385\5\f\7\2\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386"+
		"\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038d\3\2\2\2\u0388\u0386\3\2"+
		"\2\2\u0389\u038a\7\62\2\2\u038a\u038c\5\f\7\2\u038b\u0389\3\2\2\2\u038c"+
		"\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e]\3\2\2\2"+
		"\u038f\u038d\3\2\2\2\u0390\u0392\5`\61\2\u0391\u0390\3\2\2\2\u0392\u0395"+
		"\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u039e\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0396\u0398\7H\2\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u0399\3\2\2\2\u0399\u039a\7\20\2\2\u039a\u039b\7;\2\2\u039b"+
		"\u039c\5b\62\2\u039c\u039d\7=\2\2\u039d\u039f\3\2\2\2\u039e\u0397\3\2"+
		"\2\2\u039e\u039f\3\2\2\2\u039f_\3\2\2\2\u03a0\u03a2\7H\2\2\u03a1\u03a0"+
		"\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\7\20\2\2"+
		"\u03a4\u03a6\5b\62\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u03a8\7=\2\2\u03a8a\3\2\2\2\u03a9\u03ae\5d\63\2\u03aa\u03ab"+
		"\7\21\2\2\u03ab\u03ad\5d\63\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2"+
		"\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03afc\3\2\2\2\u03b0\u03ae\3"+
		"\2\2\2\u03b1\u03b3\5|?\2\u03b2\u03b1\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4"+
		"\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4\3\2"+
		"\2\2\u03b7\u03ba\7F\2\2\u03b8\u03b9\7\62\2\2\u03b9\u03bb\5f\64\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03bd\7\t"+
		"\2\2\u03bd\u03bf\5(\25\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"e\3\2\2\2\u03c0\u03c7\5\f\7\2\u03c1\u03c2\79\2\2\u03c2\u03c7\5\f\7\2\u03c3"+
		"\u03c4\5\f\7\2\u03c4\u03c5\7,\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c0\3\2"+
		"\2\2\u03c6\u03c1\3\2\2\2\u03c6\u03c3\3\2\2\2\u03c7g\3\2\2\2\u03c8\u03ca"+
		"\5j\66\2\u03c9\u03c8\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb"+
		"\u03cc\3\2\2\2\u03cc\u03d6\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03d0\7H"+
		"\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\7\20\2\2\u03d2\u03d3\7;\2\2\u03d3\u03d4\5l\67\2\u03d4\u03d5\7="+
		"\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03cf\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"i\3\2\2\2\u03d8\u03da\7H\2\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dd\7\20\2\2\u03dc\u03de\5l\67\2\u03dd\u03dc\3"+
		"\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\7=\2\2\u03e0"+
		"k\3\2\2\2\u03e1\u03e6\5n8\2\u03e2\u03e3\7\21\2\2\u03e3\u03e5\5n8\2\u03e4"+
		"\u03e2\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7m\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03eb\5|?\2\u03ea\u03e9"+
		"\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03f2\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f1\5t;\2\u03f0\u03ef\3\2\2"+
		"\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f6"+
		"\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f7\t\6\2\2\u03f6\u03f5\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\7F\2\2\u03f9\u03fa\7\62"+
		"\2\2\u03fa\u03fd\5f\64\2\u03fb\u03fc\7\t\2\2\u03fc\u03fe\5(\25\2\u03fd"+
		"\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03feo\3\2\2\2\u03ff\u0400\7\20\2\2"+
		"\u0400\u0405\5r:\2\u0401\u0402\7\21\2\2\u0402\u0404\5r:\2\u0403\u0401"+
		"\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u0409\7=\2\2\u0409q\3\2\2\2\u040a"+
		"\u040d\t\5\2\2\u040b\u040c\7\62\2\2\u040c\u040e\5\f\7\2\u040d\u040b\3"+
		"\2\2\2\u040d\u040e\3\2\2\2\u040es\3\2\2\2\u040f\u0413\5v<\2\u0410\u0413"+
		"\5x=\2\u0411\u0413\7\f\2\2\u0412\u040f\3\2\2\2\u0412\u0410\3\2\2\2\u0412"+
		"\u0411\3\2\2\2\u0413u\3\2\2\2\u0414\u0415\t\7\2\2\u0415w\3\2\2\2\u0416"+
		"\u0418\t\b\2\2\u0417\u0419\5z>\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2"+
		"\2\u0419y\3\2\2\2\u041a\u041b\7\63\2\2\u041b\u041c\t\t\2\2\u041c\u041d"+
		"\7\27\2\2\u041d{\3\2\2\2\u041e\u041f\7\31\2\2\u041f\u0423\5\32\16\2\u0420"+
		"\u0422\5\66\34\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3"+
		"\2\2\2\u0423\u0424\3\2\2\2\u0424}\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427"+
		"\7\31\2\2\u0427\u0428\5\32\16\2\u0428\u0429\5\66\34\2\u0429\177\3\2\2"+
		"\2\u042a\u042c\7H\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d"+
		"\3\2\2\2\u042d\u042f\7\b\2\2\u042e\u0430\5\u0084C\2\u042f\u042e\3\2\2"+
		"\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0436\5\u0082B\2\u0432"+
		"\u0433\7I\2\2\u0433\u0435\5\u0082B\2\u0434\u0432\3\2\2\2\u0435\u0438\3"+
		"\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438"+
		"\u0436\3\2\2\2\u0439\u043a\7(\2\2\u043a\u0081\3\2\2\2\u043b\u045f\5\u0086"+
		"D\2\u043c\u043e\5|?\2\u043d\u043f\7H\2\2\u043e\u043d\3\2\2\2\u043e\u043f"+
		"\3\2\2\2\u043f\u0441\3\2\2\2\u0440\u043c\3\2\2\2\u0441\u0444\3\2\2\2\u0442"+
		"\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0448\3\2\2\2\u0444\u0442\3\2"+
		"\2\2\u0445\u0447\5t;\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446"+
		"\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b"+
		"\u045f\5\u009cO\2\u044c\u044e\5|?\2\u044d\u044f\7H\2\2\u044e\u044d\3\2"+
		"\2\2\u044e\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u044c\3\2\2\2\u0451"+
		"\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0458\3\2"+
		"\2\2\u0454\u0452\3\2\2\2\u0455\u0457\5t;\2\u0456\u0455\3\2\2\2\u0457\u045a"+
		"\3\2\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2\2\2\u045a"+
		"\u0458\3\2\2\2\u045b\u045f\5\u008eH\2\u045c\u045f\5(\25\2\u045d\u045f"+
		"\3\2\2\2\u045e\u043b\3\2\2\2\u045e\u0442\3\2\2\2\u045e\u0452\3\2\2\2\u045e"+
		"\u045c\3\2\2\2\u045e\u045d\3\2\2\2\u045f\u0083\3\2\2\2\u0460\u0463\7F"+
		"\2\2\u0461\u0462\7\62\2\2\u0462\u0464\5\f\7\2\u0463\u0461\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u046c\79\2\2\u0466\u0467\7-\2"+
		"\2\u0467\u0468\7\62\2\2\u0468\u0469\5\f\7\2\u0469\u046a\79\2\2\u046a\u046c"+
		"\3\2\2\2\u046b\u0460\3\2\2\2\u046b\u0466\3\2\2\2\u046c\u0085\3\2\2\2\u046d"+
		"\u046e\7>\2\2\u046e\u0473\5\u0088E\2\u046f\u0470\7\21\2\2\u0470\u0472"+
		"\5\u0088E\2\u0471\u046f\3\2\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2"+
		"\2\u0473\u0474\3\2\2\2\u0474\u0087\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u0477"+
		"\5\b\5\2\u0477\u047b\7/\2\2\u0478\u047c\7F\2\2\u0479\u047c\7\67\2\2\u047a"+
		"\u047c\5\u008aF\2\u047b\u0478\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047a"+
		"\3\2\2\2\u047c\u0089\3\2\2\2\u047d\u0483\7\b\2\2\u047e\u047f\5\u008cG"+
		"\2\u047f\u0480\7\21\2\2\u0480\u0482\3\2\2\2\u0481\u047e\3\2\2\2\u0482"+
		"\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0488\3\2"+
		"\2\2\u0485\u0483\3\2\2\2\u0486\u0489\5\u008cG\2\u0487\u0489\7\67\2\2\u0488"+
		"\u0486\3\2\2\2\u0488\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7("+
		"\2\2\u048b\u008b\3\2\2\2\u048c\u0491\7F\2\2\u048d\u048e\79\2\2\u048e\u0492"+
		"\7F\2\2\u048f\u0490\79\2\2\u0490\u0492\7\67\2\2\u0491\u048d\3\2\2\2\u0491"+
		"\u048f\3\2\2\2\u0492\u008d\3\2\2\2\u0493\u0494\7\66\2\2\u0494\u04a2\5"+
		"\u0090I\2\u0495\u0496\7\23\2\2\u0496\u04a2\5\u0092J\2\u0497\u0498\7\""+
		"\2\2\u0498\u04a2\5\u0094K\2\u0499\u049d\7\32\2\2\u049a\u049c\7H\2\2\u049b"+
		"\u049a\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d\u049e\3\2"+
		"\2\2\u049e\u04a0\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a2\5\u0098M\2\u04a1"+
		"\u0493\3\2\2\2\u04a1\u0495\3\2\2\2\u04a1\u0497\3\2\2\2\u04a1\u0499\3\2"+
		"\2\2\u04a2\u008f\3\2\2\2\u04a3\u04a4\5\6\4\2\u04a4\u04a5\7\62\2\2\u04a5"+
		"\u04a6\5\f\7\2\u04a6\u0091\3\2\2\2\u04a7\u04a8\5\6\4\2\u04a8\u04a9\7\62"+
		"\2\2\u04a9\u04aa\5\f\7\2\u04aa\u0093\3\2\2\2\u04ab\u04ae\5\u0096L\2\u04ac"+
		"\u04ad\7\62\2\2\u04ad\u04af\5\f\7\2\u04ae\u04ac\3\2\2\2\u04ae\u04af\3"+
		"\2\2\2\u04af\u0095\3\2\2\2\u04b0\u04b2\7F\2\2\u04b1\u04b3\5X-\2\u04b2"+
		"\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\5^"+
		"\60\2\u04b5\u0097\3\2\2\2\u04b6\u04b8\7F\2\2\u04b7\u04b9\5V,\2\u04b8\u04b7"+
		"\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04bb\7\6\2\2\u04bb"+
		"\u04bd\5\f\7\2\u04bc\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04c0\3\2"+
		"\2\2\u04be\u04bf\7\n\2\2\u04bf\u04c1\5\f\7\2\u04c0\u04be\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u0099\3\2\2\2\u04c2\u04c3\7\66\2\2\u04c3\u04c7\5"+
		"\u009eP\2\u04c4\u04c5\7\23\2\2\u04c5\u04c7\5\u00a0Q\2\u04c6\u04c2\3\2"+
		"\2\2\u04c6\u04c4\3\2\2\2\u04c7\u009b\3\2\2\2\u04c8\u04d5\5\u009aN\2\u04c9"+
		"\u04ca\7\"\2\2\u04ca\u04d5\5\u00a2R\2\u04cb\u04cf\7\32\2\2\u04cc\u04ce"+
		"\7H\2\2\u04cd\u04cc\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf\u04cd\3\2\2\2\u04cf"+
		"\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d2\u04d5\5\u00a4"+
		"S\2\u04d3\u04d5\5\u00a6T\2\u04d4\u04c8\3\2\2\2\u04d4\u04c9\3\2\2\2\u04d4"+
		"\u04cb\3\2\2\2\u04d4\u04d3\3\2\2\2\u04d5\u009d\3\2\2\2\u04d6\u04db\5N"+
		"(\2\u04d7\u04d8\7\21\2\2\u04d8\u04da\5N(\2\u04d9\u04d7\3\2\2\2\u04da\u04dd"+
		"\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04e2\3\2\2\2\u04dd"+
		"\u04db\3\2\2\2\u04de\u04df\7\62\2\2\u04df\u04e1\5\f\7\2\u04e0\u04de\3"+
		"\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e5\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e6\7\t\2\2\u04e6\u04e7\5("+
		"\25\2\u04e7\u009f\3\2\2\2\u04e8\u04f0\5\u009eP\2\u04e9\u04ea\5\6\4\2\u04ea"+
		"\u04eb\7\62\2\2\u04eb\u04ec\5\f\7\2\u04ec\u04ed\7\t\2\2\u04ed\u04ee\7"+
		"\67\2\2\u04ee\u04f0\3\2\2\2\u04ef\u04e8\3\2\2\2\u04ef\u04e9\3\2\2\2\u04f0"+
		"\u00a1\3\2\2\2\u04f1\u04f4\5\u0096L\2\u04f2\u04f3\7\62\2\2\u04f3\u04f5"+
		"\5\f\7\2\u04f4\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f7\7\t\2\2\u04f7\u04f8\5(\25\2\u04f8\u050b\3\2\2\2\u04f9\u04fb\5\u0096"+
		"L\2\u04fa\u04fc\7H\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd"+
		"\3\2\2\2\u04fd\u04fe\7\b\2\2\u04fe\u04ff\5:\36\2\u04ff\u0500\7(\2\2\u0500"+
		"\u050b\3\2\2\2\u0501\u0502\7-\2\2\u0502\u0503\5`\61\2\u0503\u0508\5^\60"+
		"\2\u0504\u0505\7\t\2\2\u0505\u0509\5\u00c0a\2\u0506\u0507\7H\2\2\u0507"+
		"\u0509\5\u00c2b\2\u0508\u0504\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u050b"+
		"\3\2\2\2\u050a\u04f1\3\2\2\2\u050a\u04f9\3\2\2\2\u050a\u0501\3\2\2\2\u050b"+
		"\u00a3\3\2\2\2\u050c\u050e\7F\2\2\u050d\u050f\5V,\2\u050e\u050d\3\2\2"+
		"\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\7\t\2\2\u0511\u0512"+
		"\5\f\7\2\u0512\u00a5\3\2\2\2\u0513\u0515\7\60\2\2\u0514\u0513\3\2\2\2"+
		"\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\7&\2\2\u0517\u051e"+
		"\5\u00a8U\2\u0518\u0519\7\60\2\2\u0519\u051a\7.\2\2\u051a\u051e\5\u00ac"+
		"W\2\u051b\u051c\7$\2\2\u051c\u051e\5\u00aaV\2\u051d\u0514\3\2\2\2\u051d"+
		"\u0518\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u00a7\3\2\2\2\u051f\u0521\7F"+
		"\2\2\u0520\u0522\5V,\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0526"+
		"\3\2\2\2\u0523\u0525\5~@\2\u0524\u0523\3\2\2\2\u0525\u0528\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u052a\3\2\2\2\u0528\u0526\3\2"+
		"\2\2\u0529\u052b\5x=\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c"+
		"\3\2\2\2\u052c\u052d\5h\65\2\u052d\u052e\5\u00aeX\2\u052e\u00a9\3\2\2"+
		"\2\u052f\u0531\7F\2\2\u0530\u0532\5V,\2\u0531\u0530\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\5\u00b0Y\2\u0534\u00ab\3\2\2"+
		"\2\u0535\u0536\7F\2\2\u0536\u0537\5\u00aeX\2\u0537\u00ad\3\2\2\2\u0538"+
		"\u0539\7\'\2\2\u0539\u0541\5\u00b2Z\2\u053a\u053c\7\'\2\2\u053b\u053a"+
		"\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\5\u0080A"+
		"\2\u053e\u053b\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u0538"+
		"\3\2\2\2\u0540\u053e\3\2\2\2\u0541\u00af\3\2\2\2\u0542\u0543\7\'\2\2\u0543"+
		"\u054b\5\u00b4[\2\u0544\u0546\7\'\2\2\u0545\u0544\3\2\2\2\u0545\u0546"+
		"\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549\5\u0080A\2\u0548\u0545\3\2\2"+
		"\2\u0548\u0549\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u0542\3\2\2\2\u054a\u0548"+
		"\3\2\2\2\u054b\u00b1\3\2\2\2\u054c\u054e\5\u00bc_\2\u054d\u054c\3\2\2"+
		"\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\5\u00b6\\\2\u0550"+
		"\u0552\5\u0080A\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u00b3"+
		"\3\2\2\2\u0553\u0555\5\u00bc_\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2"+
		"\2\u0555\u0556\3\2\2\2\u0556\u0558\5\u00b8]\2\u0557\u0559\5\u0080A\2\u0558"+
		"\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u00b5\3\2\2\2\u055a\u055f\5\u00ba"+
		"^\2\u055b\u055c\7\65\2\2\u055c\u055e\5\30\r\2\u055d\u055b\3\2\2\2\u055e"+
		"\u0561\3\2\2\2\u055f\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u00b7\3\2"+
		"\2\2\u0561\u055f\3\2\2\2\u0562\u0567\5\30\r\2\u0563\u0564\7\65\2\2\u0564"+
		"\u0566\5\30\r\2\u0565\u0563\3\2\2\2\u0566\u0569\3\2\2\2\u0567\u0565\3"+
		"\2\2\2\u0567\u0568\3\2\2\2\u0568\u00b9\3\2\2\2\u0569\u0567\3\2\2\2\u056a"+
		"\u056e\5\30\r\2\u056b\u056d\5\66\34\2\u056c\u056b\3\2\2\2\u056d\u0570"+
		"\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u00bb\3\2\2\2\u0570"+
		"\u056e\3\2\2\2\u0571\u057a\7\b\2\2\u0572\u0577\5\u00be`\2\u0573\u0574"+
		"\7I\2\2\u0574\u0576\5\u00be`\2\u0575\u0573\3\2\2\2\u0576\u0579\3\2\2\2"+
		"\u0577\u0575\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u0577"+
		"\3\2\2\2\u057a\u0572\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057d\7(\2\2\u057d\u057e\7\65\2\2\u057e\u00bd\3\2\2\2\u057f\u0581\5|"+
		"?\2\u0580\u0582\7H\2\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0584"+
		"\3\2\2\2\u0583\u057f\3\2\2\2\u0584\u0587\3\2\2\2\u0585\u0583\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u058b\3\2\2\2\u0587\u0585\3\2\2\2\u0588\u058a\5t"+
		";\2\u0589\u0588\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b"+
		"\u058c\3\2\2\2\u058c\u058e\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u058f\5\u009a"+
		"N\2\u058f\u00bf\3\2\2\2\u0590\u0593\5\u00c4c\2\u0591\u0593\5\u00c2b\2"+
		"\u0592\u0590\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u00c1\3\2\2\2\u0594\u0595"+
		"\7\b\2\2\u0595\u059a\5\u00c4c\2\u0596\u0597\7I\2\2\u0597\u0599\5<\37\2"+
		"\u0598\u0596\3\2\2\2\u0599\u059c\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b"+
		"\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a\3\2\2\2\u059d\u059e\7(\2\2\u059e"+
		"\u00c3\3\2\2\2\u059f\u05a1\7-\2\2\u05a0\u05a2\5\66\34\2\u05a1\u05a0\3"+
		"\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u00c5\3\2\2\2\u05a5\u05aa\5\u00c8e\2\u05a6\u05a7\7I\2\2\u05a7\u05a9\5"+
		"\u00c8e\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2"+
		"\u05aa\u05ab\3\2\2\2\u05ab\u00c7\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05af"+
		"\5|?\2\u05ae\u05b0\7H\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"+
		"\u05b2\3\2\2\2\u05b1\u05ad\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3\u05b1\3\2"+
		"\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b9\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b6"+
		"\u05b8\5t;\2\u05b7\u05b6\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2"+
		"\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05c2"+
		"\5\u00a6T\2\u05bd\u05c2\5\u0086D\2\u05be\u05c2\5\u00caf\2\u05bf\u05c2"+
		"\5\u00ccg\2\u05c0\u05c2\3\2\2\2\u05c1\u05b3\3\2\2\2\u05c1\u05bd\3\2\2"+
		"\2\u05c1\u05be\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c0\3\2\2\2\u05c2\u00c9"+
		"\3\2\2\2\u05c3\u05c4\7\16\2\2\u05c4\u05c6\5\4\3\2\u05c5\u05c7\7H\2\2\u05c6"+
		"\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\7\b"+
		"\2\2\u05c9\u05ca\5\u00c6d\2\u05ca\u05cb\7(\2\2\u05cb\u00cb\3\2\2\2\u05cc"+
		"\u05cd\7\16\2\2\u05cd\u05ce\7.\2\2\u05ce\u05cf\5\u00acW\2\u05cf\u00cd"+
		"\3\2\2\2\u05d0\u05d1\7\16\2\2\u05d1\u05d2\5\4\3\2\u05d2\u05d3\7I\2\2\u05d3"+
		"\u05d5\3\2\2\2\u05d4\u05d0\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d4\3\2"+
		"\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9"+
		"\u05da\5\u00c6d\2\u05da\u00cf\3\2\2\2\u00d4\u00d1\u00d5\u00dd\u00e4\u00ec"+
		"\u00f2\u00f5\u00fb\u00ff\u0103\u010f\u0111\u011a\u011d\u0120\u0129\u0132"+
		"\u0137\u013c\u0144\u0148\u014b\u0151\u0159\u015c\u0164\u016b\u016d\u0179"+
		"\u017d\u0185\u018e\u0198\u019d\u01a1\u01a5\u01aa\u01b3\u01b8\u01bc\u01c5"+
		"\u01d0\u01d7\u01db\u01e0\u01f0\u01f5\u01f9\u0201\u0206\u020b\u020d\u0224"+
		"\u0229\u022b\u0233\u0238\u023c\u0241\u0246\u0248\u024f\u0255\u025b\u025e"+
		"\u0266\u0269\u026d\u0273\u027b\u0280\u0287\u0290\u0293\u029d\u02a4\u02a8"+
		"\u02ae\u02b2\u02b8\u02be\u02c4\u02c9\u02cd\u02d1\u02d6\u02dd\u02e4\u02ec"+
		"\u02ee\u02f4\u02f9\u0306\u0310\u0315\u0318\u031e\u0323\u0326\u0330\u0337"+
		"\u033b\u0343\u0346\u034d\u0353\u0356\u035e\u0369\u036f\u0372\u0378\u037c"+
		"\u0380\u0386\u038d\u0393\u0397\u039e\u03a1\u03a5\u03ae\u03b4\u03ba\u03be"+
		"\u03c6\u03cb\u03cf\u03d6\u03d9\u03dd\u03e6\u03ec\u03f2\u03f6\u03fd\u0405"+
		"\u040d\u0412\u0418\u0423\u042b\u042f\u0436\u043e\u0442\u0448\u044e\u0452"+
		"\u0458\u045e\u0463\u046b\u0473\u047b\u0483\u0488\u0491\u049d\u04a1\u04ae"+
		"\u04b2\u04b8\u04bc\u04c0\u04c6\u04cf\u04d4\u04db\u04e2\u04ef\u04f4\u04fb"+
		"\u0508\u050a\u050e\u0514\u051d\u0521\u0526\u052a\u0531\u053b\u053e\u0540"+
		"\u0545\u0548\u054a\u054d\u0551\u0554\u0558\u055f\u0567\u056e\u0577\u057a"+
		"\u0581\u0585\u058b\u0592\u059a\u05a3\u05aa\u05af\u05b3\u05b9\u05c1\u05c6"+
		"\u05d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}