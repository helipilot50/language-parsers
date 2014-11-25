// Generated from go/GoLang.g4 by ANTLR 4.4

package pl.project13.jo.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, IMPORT=2, FUNC=3, NEWLINE=4, Number=5, WS=6, SEMI=7, DOT=8, 
		STAR=9, PROTECTED=10, PRIVATE=11, ABSTRACT=12, STATIC=13, FINAL=14, STRICTFP=15, 
		COMMA=16, LBRACE=17, RBRACE=18, LBRACKET=19, RBRACKET=20, LPAREN=21, RPAREN=22, 
		VOID=23, INTERFACE=24, THROW=25, THROWS=26, EQ=27, NATIVE=28, SYNCHRONIZED=29, 
		TRANSIENT=30, VOLATILE=31, BOOLEAN=32, CHAR=33, BYTE=34, SHORT=35, INT=36, 
		LONG=37, FLOAT=38, DOUBLE=39, QUES=40, EXTENDS=41, ELLIPSIS=42, THIS=43, 
		SUPER=44, NULL=45, TRUE=46, FALSE=47, AT=48, DEFAULT=49, COLON=50, IF=51, 
		ELSE=52, FOR=53, WHILE=54, DO=55, TRY=56, FINALLY=57, SWITCH=58, RETURN=59, 
		BREAK=60, CONTINUE=61, CATCH=62, CASE=63, ENUM=64, ASSERT=65, PLUSPLUS=66, 
		SUBSUB=67, TILDE=68, BANG=69, NEW=70, SLASH=71, PERCENT=72, PLUS=73, SUB=74, 
		EQEQ=75, BANGEQ=76, AMP=77, CARET=78, PIPE=79, AMPAMP=80, PIPEPIPE=81, 
		CARETEQ=82, PLUSEQ=83, SUBEQ=84, STAREQ=85, SLASHEQ=86, AMPEQ=87, BAREQ=88, 
		PERCENTEQ=89, GT=90, LT=91, INSTANCEOF=92, CONST=93, GOTO=94, IntegerLiteral=95, 
		FloatingPointLiteral=96, CharacterLiteral=97, StringLiteral=98, Identifier=99, 
		WhiteSpace=100, LineTerminator=101, SlashComment=102, EndOfLineComment=103;
	public static final String[] tokenNames = {
		"<INVALID>", "'package'", "'import'", "'func'", "'\n'", "Number", "WS", 
		"';'", "'.'", "'*'", "'protected'", "'private'", "'abstract'", "'static'", 
		"'final'", "'strictfp'", "','", "'{'", "'}'", "'['", "']'", "'('", "')'", 
		"'void'", "'interface'", "'throw'", "'throws'", "'='", "'native'", "'synchronized'", 
		"'transient'", "'volatile'", "'boolean'", "'char'", "'byte'", "'short'", 
		"'int'", "'long'", "'float'", "'double'", "'?'", "'extends'", "'...'", 
		"'this'", "'super'", "'null'", "'true'", "'false'", "'@'", "'default'", 
		"':'", "'if'", "'else'", "'for'", "'while'", "'do'", "'try'", "'finally'", 
		"'switch'", "'return'", "'break'", "'continue'", "'catch'", "'case'", 
		"'enum'", "'assert'", "'++'", "'--'", "'~'", "'!'", "'new'", "'/'", "'%'", 
		"'+'", "'-'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'^='", 
		"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", "'>'", "'<'", 
		"'instanceof'", "'const'", "'goto'", "IntegerLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "Identifier", "WhiteSpace", "LineTerminator", 
		"SlashComment", "EndOfLineComment"
	};
	public static final int
		RULE_sourceFile = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_funcDeclaration = 3, RULE_statement = 4, RULE_ifStamement = 5, RULE_elseStatement = 6, 
		RULE_booleanExpression = 7, RULE_returnType = 8, RULE_funcArguments = 9, 
		RULE_returnArguments = 10, RULE_funcName = 11, RULE_packagePrefix = 12;
	public static final String[] ruleNames = {
		"sourceFile", "packageDeclaration", "importDeclaration", "funcDeclaration", 
		"statement", "ifStamement", "elseStatement", "booleanExpression", "returnType", 
		"funcArguments", "returnArguments", "funcName", "packagePrefix"
	};

	@Override
	public String getGrammarFileName() { return "GoLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	int WHITESPACE = 1;
	int COMMENTS = 2;

	public GoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceFileContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public List<FuncDeclarationContext> funcDeclaration() {
			return getRuleContexts(FuncDeclarationContext.class);
		}
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public FuncDeclarationContext funcDeclaration(int i) {
			return getRuleContext(FuncDeclarationContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); packageDeclaration();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(27); importDeclaration();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(33); funcDeclaration();
				}
				}
				setState(38);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public TerminalNode PACKAGE() { return getToken(GoLangParser.PACKAGE, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(PACKAGE);
			setState(40); match(Identifier);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode LineTerminator() { return getToken(GoLangParser.LineTerminator, 0); }
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public TerminalNode IMPORT() { return getToken(GoLangParser.IMPORT, 0); }
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); match(IMPORT);
				setState(43); match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); match(IMPORT);
				setState(45); match(LPAREN);
				{
				setState(46); match(StringLiteral);
				setState(47); match(LineTerminator);
				}
				setState(49); match(RPAREN);
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

	public static class FuncDeclarationContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GoLangParser.RBRACE, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GoLangParser.LBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode FUNC() { return getToken(GoLangParser.FUNC, 0); }
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFuncDeclaration(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(FUNC);
			setState(53); funcName();
			setState(54); match(LPAREN);
			setState(55); match(RPAREN);
			setState(57);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(56); returnType();
				}
			}

			setState(59); match(LBRACE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (IF - 51)) | (1L << (RETURN - 51)) | (1L << (Identifier - 51)))) != 0)) {
				{
				{
				setState(60); statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public FuncArgumentsContext funcArguments() {
			return getRuleContext(FuncArgumentsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(GoLangParser.RETURN, 0); }
		public TerminalNode LPAREN() { return getToken(GoLangParser.LPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(GoLangParser.NEWLINE, 0); }
		public TerminalNode RPAREN() { return getToken(GoLangParser.RPAREN, 0); }
		public ReturnArgumentsContext returnArguments() {
			return getRuleContext(ReturnArgumentsContext.class,0);
		}
		public IfStamementContext ifStamement() {
			return getRuleContext(IfStamementContext.class,0);
		}
		public PackagePrefixContext packagePrefix() {
			return getRuleContext(PackagePrefixContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(80);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); packagePrefix();
				setState(69); match(DOT);
				setState(70); funcName();
				setState(71); match(LPAREN);
				setState(72); funcArguments();
				setState(73); match(RPAREN);
				setState(75);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(74); match(NEWLINE);
					}
				}

				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); ifStamement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); match(RETURN);
				setState(79); returnArguments();
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

	public static class IfStamementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GoLangParser.IF, 0); }
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStamementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStamement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterIfStamement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitIfStamement(this);
		}
	}

	public final IfStamementContext ifStamement() throws RecognitionException {
		IfStamementContext _localctx = new IfStamementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStamement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(IF);
			setState(83); booleanExpression(0);
			setState(84); statement();
			setState(85); elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GoLangParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitElseStatement(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(ELSE);
			setState(88); statement();
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(GoLangParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(GoLangParser.TRUE, 0); }
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode PIPEPIPE() { return getToken(GoLangParser.PIPEPIPE, 0); }
		public TerminalNode AMPAMP() { return getToken(GoLangParser.AMPAMP, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(91); match(TRUE);
				}
				break;
			case 2:
				{
				setState(92); match(FALSE);
				}
				break;
			case 3:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(96);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(97); match(AMPAMP);
						setState(98); booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new BooleanExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(99);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(100); match(PIPEPIPE);
						setState(101); booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitReturnType(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(Identifier);
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

	public static class FuncArgumentsContext extends ParserRuleContext {
		public FuncArgumentsContext funcArguments() {
			return getRuleContext(FuncArgumentsContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public FuncArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFuncArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFuncArguments(this);
		}
	}

	public final FuncArgumentsContext funcArguments() throws RecognitionException {
		FuncArgumentsContext _localctx = new FuncArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcArguments);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(StringLiteral);
				setState(111); match(COMMA);
				setState(112); funcArguments();
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

	public static class ReturnArgumentsContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GoLangParser.StringLiteral, 0); }
		public ReturnArgumentsContext returnArguments() {
			return getRuleContext(ReturnArgumentsContext.class,0);
		}
		public ReturnArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterReturnArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitReturnArguments(this);
		}
	}

	public final ReturnArgumentsContext returnArguments() throws RecognitionException {
		ReturnArgumentsContext _localctx = new ReturnArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnArguments);
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(StringLiteral);
				setState(117); match(COMMA);
				setState(118); returnArguments();
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

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(Identifier);
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

	public static class PackagePrefixContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GoLangParser.Identifier, 0); }
		public PackagePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).enterPackagePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoLangListener ) ((GoLangListener)listener).exitPackagePrefix(this);
		}
	}

	public final PackagePrefixContext packagePrefix() throws RecognitionException {
		PackagePrefixContext _localctx = new PackagePrefixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_packagePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(Identifier);
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
		case 7: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3i\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\5\6S\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\ta\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13t\n\13"+
		"\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\16\3\16\3\16\2\3\20\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\2\u0080\2\34\3\2\2\2\4)\3\2\2\2\6\64\3\2\2\2\b"+
		"\66\3\2\2\2\nR\3\2\2\2\fT\3\2\2\2\16Y\3\2\2\2\20`\3\2\2\2\22m\3\2\2\2"+
		"\24s\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34 \5\4\3\2\35\37\5\6"+
		"\4\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!&\3\2\2\2\" \3\2"+
		"\2\2#%\5\b\5\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(&"+
		"\3\2\2\2)*\7\3\2\2*+\7e\2\2+\5\3\2\2\2,-\7\4\2\2-\65\7d\2\2./\7\4\2\2"+
		"/\60\7\27\2\2\60\61\7d\2\2\61\62\7g\2\2\62\63\3\2\2\2\63\65\7\30\2\2\64"+
		",\3\2\2\2\64.\3\2\2\2\65\7\3\2\2\2\66\67\7\5\2\2\678\5\30\r\289\7\27\2"+
		"\29;\7\30\2\2:<\5\22\n\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=A\7\23\2\2>@\5"+
		"\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7"+
		"\24\2\2E\t\3\2\2\2FG\5\32\16\2GH\7\n\2\2HI\5\30\r\2IJ\7\27\2\2JK\5\24"+
		"\13\2KM\7\30\2\2LN\7\6\2\2ML\3\2\2\2MN\3\2\2\2NS\3\2\2\2OS\5\f\7\2PQ\7"+
		"=\2\2QS\5\26\f\2RF\3\2\2\2RO\3\2\2\2RP\3\2\2\2S\13\3\2\2\2TU\7\65\2\2"+
		"UV\5\20\t\2VW\5\n\6\2WX\5\16\b\2X\r\3\2\2\2YZ\7\66\2\2Z[\5\n\6\2[\17\3"+
		"\2\2\2\\]\b\t\1\2]a\7\60\2\2^a\7\61\2\2_a\3\2\2\2`\\\3\2\2\2`^\3\2\2\2"+
		"`_\3\2\2\2aj\3\2\2\2bc\f\4\2\2cd\7R\2\2di\5\20\t\5ef\f\3\2\2fg\7S\2\2"+
		"gi\5\20\t\4hb\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\21\3\2"+
		"\2\2lj\3\2\2\2mn\7e\2\2n\23\3\2\2\2ot\7d\2\2pq\7d\2\2qr\7\22\2\2rt\5\24"+
		"\13\2so\3\2\2\2sp\3\2\2\2t\25\3\2\2\2uz\7d\2\2vw\7d\2\2wx\7\22\2\2xz\5"+
		"\26\f\2yu\3\2\2\2yv\3\2\2\2z\27\3\2\2\2{|\7e\2\2|\31\3\2\2\2}~\7e\2\2"+
		"~\33\3\2\2\2\16 &\64;AMR`hjsy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}