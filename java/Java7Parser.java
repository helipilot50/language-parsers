// Generated from java/Java7.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java7Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__88=1, T__87=2, T__86=3, T__85=4, T__84=5, T__83=6, T__82=7, T__81=8, 
		T__80=9, T__79=10, T__78=11, T__77=12, T__76=13, T__75=14, T__74=15, T__73=16, 
		T__72=17, T__71=18, T__70=19, T__69=20, T__68=21, T__67=22, T__66=23, 
		T__65=24, T__64=25, T__63=26, T__62=27, T__61=28, T__60=29, T__59=30, 
		T__58=31, T__57=32, T__56=33, T__55=34, T__54=35, T__53=36, T__52=37, 
		T__51=38, T__50=39, T__49=40, T__48=41, T__47=42, T__46=43, T__45=44, 
		T__44=45, T__43=46, T__42=47, T__41=48, T__40=49, T__39=50, T__38=51, 
		T__37=52, T__36=53, T__35=54, T__34=55, T__33=56, T__32=57, T__31=58, 
		T__30=59, T__29=60, T__28=61, T__27=62, T__26=63, T__25=64, T__24=65, 
		T__23=66, T__22=67, T__21=68, T__20=69, T__19=70, T__18=71, T__17=72, 
		T__16=73, T__15=74, T__14=75, T__13=76, T__12=77, T__11=78, T__10=79, 
		T__9=80, T__8=81, T__7=82, T__6=83, T__5=84, T__4=85, T__3=86, T__2=87, 
		T__1=88, T__0=89, HexLiteral=90, DecimalLiteral=91, OctalLiteral=92, BinaryLiteral=93, 
		FloatingPointLiteral=94, CharacterLiteral=95, StringLiteral=96, ENUM=97, 
		ASSERT=98, Identifier=99, WS=100, COMMENT=101, LINE_COMMENT=102;
	public static final String[] tokenNames = {
		"<INVALID>", "'default'", "'+='", "'private'", "'%='", "'finally'", "'char'", 
		"'interface'", "'new'", "'!='", "'float'", "'while'", "'void'", "'{'", 
		"'^='", "'&&'", "'byte'", "'='", "'^'", "'for'", "'|='", "'int'", "'null'", 
		"'do'", "'('", "'package'", "'-='", "','", "'/='", "'false'", "'throws'", 
		"'volatile'", "'abstract'", "'implements'", "'boolean'", "'long'", "'++'", 
		"'<'", "']'", "'~'", "'transient'", "'@'", "'static'", "'protected'", 
		"'final'", "'+'", "'*='", "'/'", "'strictfp'", "'continue'", "'catch'", 
		"'native'", "'&='", "'return'", "'true'", "'class'", "'||'", "';'", "'instanceof'", 
		"'}'", "'extends'", "'if'", "'try'", "'?'", "'break'", "'short'", "'double'", 
		"'synchronized'", "'&'", "'switch'", "'*'", "'this'", "'.'", "'case'", 
		"'throw'", "'...'", "':'", "'['", "'=='", "'--'", "'|'", "'public'", "'>'", 
		"'!'", "'%'", "'else'", "'super'", "')'", "'-'", "'import'", "HexLiteral", 
		"DecimalLiteral", "OctalLiteral", "BinaryLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "StringLiteral", "'enum'", "'assert'", "Identifier", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classOrInterfaceDeclaration = 4, RULE_classDeclaration = 5, 
		RULE_normalClassDeclaration = 6, RULE_typeParameters = 7, RULE_typeParameter = 8, 
		RULE_bound = 9, RULE_enumDeclaration = 10, RULE_enumConstants = 11, RULE_interfaceDeclaration = 12, 
		RULE_normalInterfaceDeclaration = 13, RULE_classBody = 14, RULE_interfaceBody = 15, 
		RULE_classBodyDeclaration = 16, RULE_memberDecl = 17, RULE_fieldDeclaration = 18, 
		RULE_block = 19, RULE_blockStatement = 20, RULE_enumConstant = 21, RULE_typeList = 22, 
		RULE_typeArguments = 23, RULE_typeArgument = 24, RULE_interfaceMemberDecl = 25, 
		RULE_methodDeclaration = 26, RULE_constructorDeclaration = 27, RULE_variableModifier = 28, 
		RULE_interfaceMethodOrFieldDecl = 29, RULE_interfaceMethodOrFieldRest = 30, 
		RULE_interfaceMethodDeclaratorRest = 31, RULE_interfaceGenericMethodDecl = 32, 
		RULE_voidInterfaceMethodDeclaratorRest = 33, RULE_constantDeclarator = 34, 
		RULE_variableDeclarators = 35, RULE_variableDeclarator = 36, RULE_constantDeclaratorsRest = 37, 
		RULE_constantDeclaratorRest = 38, RULE_variableDeclaratorId = 39, RULE_variableInitializer = 40, 
		RULE_arrayInitializer = 41, RULE_modifier = 42, RULE_packageOrTypeName = 43, 
		RULE_enumConstantName = 44, RULE_typeName = 45, RULE_typeRef = 46, RULE_classOrInterfaceType = 47, 
		RULE_primitiveType = 48, RULE_qualifiedIdentifierList = 49, RULE_formalParameters = 50, 
		RULE_formalParameterDeclarations = 51, RULE_formalParameterVariables = 52, 
		RULE_methodBody = 53, RULE_explicitConstructorInvocation = 54, RULE_qualifiedIdentifier = 55, 
		RULE_literal = 56, RULE_integerLiteral = 57, RULE_booleanLiteral = 58, 
		RULE_annotation = 59, RULE_annotationName = 60, RULE_elementValuePairs = 61, 
		RULE_elementValuePair = 62, RULE_elementValue = 63, RULE_elementValueArrayInitializer = 64, 
		RULE_annotationTypeDeclaration = 65, RULE_annotationTypeElement = 66, 
		RULE_annotationMethod = 67, RULE_defaultValue = 68, RULE_localVariableDeclaration = 69, 
		RULE_statement = 70, RULE_tryStatement = 71, RULE_catchClause = 72, RULE_resources = 73, 
		RULE_resource = 74, RULE_switchBlock = 75, RULE_switchBlockStatementGroup = 76, 
		RULE_switchLabel = 77, RULE_forControl = 78, RULE_forInit = 79, RULE_enhancedForControl = 80, 
		RULE_forUpdate = 81, RULE_parExpression = 82, RULE_expressionList = 83, 
		RULE_statementExpression = 84, RULE_constantExpression = 85, RULE_expression = 86, 
		RULE_primary = 87, RULE_creator = 88, RULE_createdName = 89, RULE_innerCreator = 90, 
		RULE_explicitGenericInvocation = 91, RULE_arrayCreatorRest = 92, RULE_classCreatorRest = 93, 
		RULE_nonWildcardTypeArguments = 94, RULE_arguments = 95;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"classOrInterfaceDeclaration", "classDeclaration", "normalClassDeclaration", 
		"typeParameters", "typeParameter", "bound", "enumDeclaration", "enumConstants", 
		"interfaceDeclaration", "normalInterfaceDeclaration", "classBody", "interfaceBody", 
		"classBodyDeclaration", "memberDecl", "fieldDeclaration", "block", "blockStatement", 
		"enumConstant", "typeList", "typeArguments", "typeArgument", "interfaceMemberDecl", 
		"methodDeclaration", "constructorDeclaration", "variableModifier", "interfaceMethodOrFieldDecl", 
		"interfaceMethodOrFieldRest", "interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", 
		"voidInterfaceMethodDeclaratorRest", "constantDeclarator", "variableDeclarators", 
		"variableDeclarator", "constantDeclaratorsRest", "constantDeclaratorRest", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "modifier", 
		"packageOrTypeName", "enumConstantName", "typeName", "typeRef", "classOrInterfaceType", 
		"primitiveType", "qualifiedIdentifierList", "formalParameters", "formalParameterDeclarations", 
		"formalParameterVariables", "methodBody", "explicitConstructorInvocation", 
		"qualifiedIdentifier", "literal", "integerLiteral", "booleanLiteral", 
		"annotation", "annotationName", "elementValuePairs", "elementValuePair", 
		"elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeElement", "annotationMethod", "defaultValue", "localVariableDeclaration", 
		"statement", "tryStatement", "catchClause", "resources", "resource", "switchBlock", 
		"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", "enhancedForControl", 
		"forUpdate", "parExpression", "expressionList", "statementExpression", 
		"constantExpression", "expression", "primary", "creator", "createdName", 
		"innerCreator", "explicitGenericInvocation", "arrayCreatorRest", "classCreatorRest", 
		"nonWildcardTypeArguments", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java7.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java7Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java7Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(192); packageDeclaration();
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(195); importDeclaration();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__82) | (1L << T__58) | (1L << T__57) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__41) | (1L << T__38) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__22 - 67)) | (1L << (T__8 - 67)) | (1L << (ENUM - 67)))) != 0)) {
				{
				{
				setState(201); typeDeclaration();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); match(EOF);
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
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(209); annotation();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215); match(T__64);
			setState(216); qualifiedIdentifier();
			setState(217); match(T__32);
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
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(T__0);
			setState(221);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(220); match(T__47);
				}
			}

			setState(223); qualifiedIdentifier();
			setState(226);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(224); match(T__17);
				setState(225); match(T__19);
				}
			}

			setState(228); match(T__32);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case T__86:
			case T__82:
			case T__58:
			case T__57:
			case T__49:
			case T__48:
			case T__47:
			case T__46:
			case T__45:
			case T__41:
			case T__38:
			case T__34:
			case T__22:
			case T__8:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); classOrInterfaceDeclaration();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(T__32);
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

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceDeclaration(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234); modifier();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(242);
			switch (_input.LA(1)) {
			case T__34:
			case ENUM:
				{
				setState(240); classDeclaration();
				}
				break;
			case T__82:
			case T__48:
				{
				setState(241); interfaceDeclaration();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclaration);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); enumDeclaration();
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

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(T__34);
			setState(249); match(Identifier);
			setState(251);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(250); typeParameters();
				}
			}

			setState(255);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(253); match(T__29);
				setState(254); typeRef();
				}
			}

			setState(259);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(257); match(T__56);
				setState(258); typeList();
				}
			}

			setState(261); classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(T__52);
			setState(264); typeParameter();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(265); match(T__62);
				setState(266); typeParameter();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272); match(T__7);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public BoundContext bound() {
			return getRuleContext(BoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(Identifier);
			setState(277);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(275); match(T__29);
				setState(276); bound();
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

	public static class BoundContext extends ParserRuleContext {
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBound(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); classOrInterfaceType();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(280); match(T__21);
				setState(281); classOrInterfaceType();
				}
				}
				setState(286);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(Java7Parser.ENUM, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(ENUM);
			setState(288); match(Identifier);
			setState(291);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(289); match(T__56);
				setState(290); typeList();
				}
			}

			setState(293); match(T__76);
			setState(295);
			_la = _input.LA(1);
			if (_la==T__62 || _la==T__48 || _la==Identifier) {
				{
				setState(294); enumConstants();
				}
			}

			setState(304);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(297); match(T__32);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__79) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__68) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__52) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__41) | (1L << T__38) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__8 - 65)) | (1L << (ENUM - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					{
					setState(298); classBodyDeclaration();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(306); match(T__30);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumConstants);
		int _la;
		try {
			int _alt;
			setState(320);
			switch (_input.LA(1)) {
			case T__48:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); enumConstant();
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309); match(T__62);
						setState(310); enumConstant();
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(317);
				_la = _input.LA(1);
				if (_la==T__62) {
					{
					setState(316); match(T__62);
					}
				}

				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); match(T__62);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceDeclaration);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(322); normalInterfaceDeclaration();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); annotationTypeDeclaration();
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

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(T__82);
			setState(327); match(Identifier);
			setState(329);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(328); typeParameters();
				}
			}

			setState(333);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(331); match(T__29);
				setState(332); typeList();
				}
			}

			setState(335); interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(T__76);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__79) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__68) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__52) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__41) | (1L << T__38) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__8 - 65)) | (1L << (ENUM - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(338); classBodyDeclaration();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344); match(T__30);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl(int i) {
			return getRuleContext(InterfaceMemberDeclContext.class,i);
		}
		public List<InterfaceMemberDeclContext> interfaceMemberDecl() {
			return getRuleContexts(InterfaceMemberDeclContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(T__76);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__52) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__41) | (1L << T__38) | (1L << T__34) | (1L << T__32))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__8 - 65)) | (1L << (ENUM - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(355);
				switch (_input.LA(1)) {
				case T__86:
				case T__83:
				case T__82:
				case T__79:
				case T__77:
				case T__73:
				case T__68:
				case T__58:
				case T__57:
				case T__55:
				case T__54:
				case T__52:
				case T__49:
				case T__48:
				case T__47:
				case T__46:
				case T__45:
				case T__41:
				case T__38:
				case T__34:
				case T__24:
				case T__23:
				case T__22:
				case T__8:
				case ENUM:
				case Identifier:
					{
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(347); modifier();
							}
							} 
						}
						setState(352);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(353); interfaceMemberDecl();
					}
					break;
				case T__32:
					{
					setState(354); match(T__32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(360); match(T__30);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(363); modifier();
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(369); memberDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(370); match(T__47);
					}
				}

				setState(373); block();
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

	public static class MemberDeclContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMemberDecl(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_memberDecl);
		try {
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377); fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378); constructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(379); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380); classDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); typeRef();
			setState(384); variableDeclarators();
			setState(385); match(T__32);
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
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(T__76);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__60) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__36) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__28) | (1L << T__27))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__20 - 64)) | (1L << (T__18 - 64)) | (1L << (T__15 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__3 - 64)) | (1L << (T__1 - 64)) | (1L << (HexLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(388); blockStatement();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394); match(T__30);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blockStatement);
		try {
			setState(401);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); localVariableDeclaration();
				setState(397); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399); classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400); statement();
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(403); annotation();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409); match(Identifier);
			setState(411);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(410); arguments();
				}
			}

			setState(414);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(413); classBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<ClassOrInterfaceTypeContext> classOrInterfaceType() {
			return getRuleContexts(ClassOrInterfaceTypeContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType(int i) {
			return getRuleContext(ClassOrInterfaceTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); classOrInterfaceType();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(417); match(T__62);
				setState(418); classOrInterfaceType();
				}
				}
				setState(423);
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(T__52);
			setState(425); typeArgument();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(426); match(T__62);
				setState(427); typeArgument();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433); match(T__7);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeArgument);
		int _la;
		try {
			setState(441);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(435); classOrInterfaceType();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(436); match(T__26);
				setState(439);
				_la = _input.LA(1);
				if (_la==T__29 || _la==T__3) {
					{
					setState(437);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(438); classOrInterfaceType();
					}
				}

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

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMemberDecl(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_interfaceMemberDecl);
		try {
			setState(450);
			switch (_input.LA(1)) {
			case T__83:
			case T__79:
			case T__73:
			case T__68:
			case T__55:
			case T__54:
			case T__24:
			case T__23:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); interfaceMethodOrFieldDecl();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); interfaceGenericMethodDecl();
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 3);
				{
				setState(445); match(T__77);
				setState(446); match(Identifier);
				setState(447); voidInterfaceMethodDeclaratorRest();
				}
				break;
			case T__82:
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(448); interfaceDeclaration();
				}
				break;
			case T__34:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(449); classDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(452); typeParameters();
				}
			}

			setState(457);
			switch (_input.LA(1)) {
			case T__83:
			case T__79:
			case T__73:
			case T__68:
			case T__55:
			case T__54:
			case T__24:
			case T__23:
			case Identifier:
				{
				setState(455); typeRef();
				}
				break;
			case T__77:
				{
				setState(456); match(T__77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(459); match(Identifier);
			setState(460); formalParameters();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(461); match(T__12);
				setState(462); match(T__51);
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(468); match(T__59);
				setState(469); qualifiedIdentifierList();
				}
			}

			setState(474);
			switch (_input.LA(1)) {
			case T__76:
				{
				setState(472); methodBody();
				}
				break;
			case T__32:
				{
				setState(473); match(T__32);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(476); typeParameters();
				}
			}

			setState(479); match(Identifier);
			setState(480); formalParameters();
			setState(483);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(481); match(T__59);
				setState(482); qualifiedIdentifierList();
				}
			}

			setState(485); match(T__76);
			setState(487);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(486); explicitConstructorInvocation();
				}
				break;
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__60) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__36) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__28) | (1L << T__27))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__20 - 64)) | (1L << (T__18 - 64)) | (1L << (T__15 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__3 - 64)) | (1L << (T__1 - 64)) | (1L << (HexLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(489); blockStatement();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495); match(T__30);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableModifier);
		try {
			setState(499);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(497); match(T__45);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); annotation();
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

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); typeRef();
			setState(502); match(Identifier);
			setState(503); interfaceMethodOrFieldRest();
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

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodOrFieldRest(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodOrFieldRest);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case T__72:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(505); constantDeclaratorsRest();
				setState(506); match(T__32);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); interfaceMethodDeclaratorRest();
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

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); formalParameters();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(512); match(T__12);
				setState(513); match(T__51);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(519); match(T__59);
				setState(520); qualifiedIdentifierList();
				}
			}

			setState(523); match(T__32);
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

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInterfaceGenericMethodDecl(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); typeParameters();
			setState(528);
			switch (_input.LA(1)) {
			case T__83:
			case T__79:
			case T__73:
			case T__68:
			case T__55:
			case T__54:
			case T__24:
			case T__23:
			case Identifier:
				{
				setState(526); typeRef();
				}
				break;
			case T__77:
				{
				setState(527); match(T__77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530); match(Identifier);
			setState(531); interfaceMethodDeclaratorRest();
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

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public QualifiedIdentifierListContext qualifiedIdentifierList() {
			return getRuleContext(QualifiedIdentifierListContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); formalParameters();
			setState(536);
			_la = _input.LA(1);
			if (_la==T__59) {
				{
				setState(534); match(T__59);
				setState(535); qualifiedIdentifierList();
				}
			}

			setState(538); match(T__32);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); match(Identifier);
			setState(541); constantDeclaratorRest();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); variableDeclarator();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(544); match(T__62);
				setState(545); variableDeclarator();
				}
				}
				setState(550);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); variableDeclaratorId();
			setState(554);
			_la = _input.LA(1);
			if (_la==T__72) {
				{
				setState(552); match(T__72);
				setState(553); variableInitializer();
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

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorsRest(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); constantDeclaratorRest();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(557); match(T__62);
				setState(558); constantDeclarator();
				}
				}
				setState(563);
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

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantDeclaratorRest(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(564); match(T__12);
				setState(565); match(T__51);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571); match(T__72);
			setState(572); variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); match(Identifier);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(575); match(T__12);
				setState(576); match(T__51);
				}
				}
				setState(581);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableInitializer);
		try {
			setState(584);
			switch (_input.LA(1)) {
			case T__76:
				enterOuterAlt(_localctx, 1);
				{
				setState(582); arrayInitializer();
				}
				break;
			case T__83:
			case T__81:
			case T__79:
			case T__77:
			case T__73:
			case T__68:
			case T__67:
			case T__65:
			case T__60:
			case T__55:
			case T__54:
			case T__53:
			case T__50:
			case T__44:
			case T__35:
			case T__24:
			case T__23:
			case T__18:
			case T__10:
			case T__6:
			case T__3:
			case T__1:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(583); expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586); match(T__76);
			setState(598);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(587); variableInitializer();
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(588); match(T__62);
						setState(589); variableInitializer();
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(596);
				_la = _input.LA(1);
				if (_la==T__62) {
					{
					setState(595); match(T__62);
					}
				}

				}
			}

			setState(600); match(T__30);
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
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_modifier);
		try {
			setState(614);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(602); annotation();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(603); match(T__8);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(604); match(T__46);
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 4);
				{
				setState(605); match(T__86);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 5);
				{
				setState(606); match(T__47);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 6);
				{
				setState(607); match(T__57);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 7);
				{
				setState(608); match(T__45);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 8);
				{
				setState(609); match(T__38);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 9);
				{
				setState(610); match(T__22);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 10);
				{
				setState(611); match(T__49);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 11);
				{
				setState(612); match(T__58);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 12);
				{
				setState(613); match(T__41);
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

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); qualifiedIdentifier();
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); match(Identifier);
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

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620); qualifiedIdentifier();
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

	public static class TypeRefContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTypeRef(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeRef);
		try {
			int _alt;
			setState(638);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(622); classOrInterfaceType();
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(623); match(T__12);
						setState(624); match(T__51);
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			case T__83:
			case T__79:
			case T__73:
			case T__68:
			case T__55:
			case T__54:
			case T__24:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); primitiveType();
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(631); match(T__12);
						setState(632); match(T__51);
						}
						} 
					}
					setState(637);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(Identifier);
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(641); typeArguments();
				}
				break;
			}
			setState(651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(644); match(T__17);
					setState(645); match(Identifier);
					setState(647);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(646); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_la = _input.LA(1);
			if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__83 - 6)) | (1L << (T__79 - 6)) | (1L << (T__73 - 6)) | (1L << (T__68 - 6)) | (1L << (T__55 - 6)) | (1L << (T__54 - 6)) | (1L << (T__24 - 6)) | (1L << (T__23 - 6)))) != 0)) ) {
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

	public static class QualifiedIdentifierListContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifierList(this);
		}
	}

	public final QualifiedIdentifierListContext qualifiedIdentifierList() throws RecognitionException {
		QualifiedIdentifierListContext _localctx = new QualifiedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_qualifiedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656); qualifiedIdentifier();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(657); match(T__62);
				setState(658); qualifiedIdentifier();
				}
				}
				setState(663);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclarationsContext formalParameterDeclarations() {
			return getRuleContext(FormalParameterDeclarationsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); match(T__65);
			setState(666);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__79) | (1L << T__73) | (1L << T__68) | (1L << T__55) | (1L << T__54) | (1L << T__48) | (1L << T__45))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(665); formalParameterDeclarations();
				}
			}

			setState(668); match(T__2);
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

	public static class FormalParameterDeclarationsContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterVariablesContext formalParameterVariables() {
			return getRuleContext(FormalParameterVariablesContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public FormalParameterDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterDeclarations(this);
		}
	}

	public final FormalParameterDeclarationsContext formalParameterDeclarations() throws RecognitionException {
		FormalParameterDeclarationsContext _localctx = new FormalParameterDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_formalParameterDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__45) {
				{
				{
				setState(670); variableModifier();
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676); typeRef();
			setState(677); formalParameterVariables();
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

	public static class FormalParameterVariablesContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclarationsContext formalParameterDeclarations() {
			return getRuleContext(FormalParameterDeclarationsContext.class,0);
		}
		public FormalParameterVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterFormalParameterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitFormalParameterVariables(this);
		}
	}

	public final FormalParameterVariablesContext formalParameterVariables() throws RecognitionException {
		FormalParameterVariablesContext _localctx = new FormalParameterVariablesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalParameterVariables);
		int _la;
		try {
			setState(686);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(679); match(T__14);
				setState(680); variableDeclaratorId();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(681); variableDeclaratorId();
				setState(684);
				_la = _input.LA(1);
				if (_la==T__62) {
					{
					setState(682); match(T__62);
					setState(683); formalParameterDeclarations();
					}
				}

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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); block();
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

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(706);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(690); nonWildcardTypeArguments();
					}
				}

				setState(693);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(694); arguments();
				setState(695); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697); primary();
				setState(698); match(T__17);
				setState(700);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(699); nonWildcardTypeArguments();
					}
				}

				setState(702); match(T__3);
				setState(703); arguments();
				setState(704); match(T__32);
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

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitQualifiedIdentifier(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708); match(Identifier);
			setState(713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(709); match(T__17);
					setState(710); match(Identifier);
					}
					} 
				}
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(Java7Parser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java7Parser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java7Parser.CharacterLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(722);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(716); integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(717); match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(718); match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(719); match(StringLiteral);
				}
				break;
			case T__60:
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(720); booleanLiteral();
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 6);
				{
				setState(721); match(T__67);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(Java7Parser.DecimalLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(Java7Parser.HexLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(Java7Parser.BinaryLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(Java7Parser.OctalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (HexLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (OctalLiteral - 90)) | (1L << (BinaryLiteral - 90)))) != 0)) ) {
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_la = _input.LA(1);
			if ( !(_la==T__60 || _la==T__35) ) {
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

	public static class AnnotationContext extends ParserRuleContext {
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(T__48);
			setState(729); annotationName();
			setState(736);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(730); match(T__65);
				setState(733);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(731); elementValuePairs();
					}
					break;
				case 2:
					{
					setState(732); elementValue();
					}
					break;
				}
				setState(735); match(T__2);
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

	public static class AnnotationNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); match(Identifier);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(739); match(T__17);
				setState(740); match(Identifier);
				}
				}
				setState(745);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); elementValuePair();
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(747); match(T__62);
				setState(748); elementValuePair();
				}
				}
				setState(753);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); match(Identifier);
			setState(755); match(T__72);
			setState(756); elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementValue);
		try {
			setState(761);
			switch (_input.LA(1)) {
			case T__83:
			case T__81:
			case T__79:
			case T__77:
			case T__73:
			case T__68:
			case T__67:
			case T__65:
			case T__60:
			case T__55:
			case T__54:
			case T__53:
			case T__50:
			case T__44:
			case T__35:
			case T__24:
			case T__23:
			case T__18:
			case T__10:
			case T__6:
			case T__3:
			case T__1:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case BinaryLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(758); expression(0);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(759); annotation();
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 3);
				{
				setState(760); elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763); match(T__76);
			setState(772);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(764); elementValue();
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(765); match(T__62);
						setState(766); elementValue();
						}
						} 
					}
					setState(771);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
			}

			setState(775);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(774); match(T__62);
				}
			}

			setState(777); match(T__30);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public AnnotationTypeElementContext annotationTypeElement(int i) {
			return getRuleContext(AnnotationTypeElementContext.class,i);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<AnnotationTypeElementContext> annotationTypeElement() {
			return getRuleContexts(AnnotationTypeElementContext.class);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationTypeDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(779); match(T__48);
			setState(780); match(T__82);
			setState(781); match(Identifier);
			setState(782); match(T__76);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__79) | (1L << T__73) | (1L << T__68) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__41) | (1L << T__38) | (1L << T__34))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__22 - 65)) | (1L << (T__8 - 65)) | (1L << (ENUM - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(786);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(783); modifier();
						}
						} 
					}
					setState(788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(789); annotationTypeElement();
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795); match(T__30);
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

	public static class AnnotationTypeElementContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationMethodContext annotationMethod() {
			return getRuleContext(AnnotationMethodContext.class,0);
		}
		public AnnotationTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationTypeElement(this);
		}
	}

	public final AnnotationTypeElementContext annotationTypeElement() throws RecognitionException {
		AnnotationTypeElementContext _localctx = new AnnotationTypeElementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationTypeElement);
		int _la;
		try {
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797); typeRef();
				setState(800);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(798); annotationMethod();
					}
					break;
				case 2:
					{
					setState(799); variableDeclarators();
					}
					break;
				}
				setState(802); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804); classDeclaration();
				setState(806);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(805); match(T__32);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(808); normalInterfaceDeclaration();
				setState(810);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(809); match(T__32);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(812); enumDeclaration();
				setState(814);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(813); match(T__32);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(816); annotationTypeDeclaration();
				setState(818);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(817); match(T__32);
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

	public static class AnnotationMethodContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterAnnotationMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitAnnotationMethod(this);
		}
	}

	public final AnnotationMethodContext annotationMethod() throws RecognitionException {
		AnnotationMethodContext _localctx = new AnnotationMethodContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822); match(Identifier);
			setState(823); match(T__65);
			setState(824); match(T__2);
			setState(826);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(825); defaultValue();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828); match(T__88);
			setState(829); elementValue();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__45) {
				{
				{
				setState(831); variableModifier();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(837); typeRef();
			setState(838); variableDeclarators();
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
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(Java7Parser.ASSERT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		int _la;
		try {
			setState(907);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840); block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841); match(ASSERT);
				setState(842); expression(0);
				setState(845);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(843); match(T__13);
					setState(844); expression(0);
					}
				}

				setState(847); match(T__32);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(849); match(T__28);
				setState(850); parExpression();
				setState(851); statement();
				setState(854);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(852); match(T__4);
					setState(853); statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856); match(T__70);
				setState(857); match(T__65);
				setState(858); forControl();
				setState(859); match(T__2);
				setState(860); statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(862); match(T__78);
				setState(863); parExpression();
				setState(864); statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(866); match(T__66);
				setState(867); statement();
				setState(868); match(T__78);
				setState(869); parExpression();
				setState(870); match(T__32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(872); tryStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(873); match(T__20);
				setState(874); parExpression();
				setState(875); switchBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(877); match(T__22);
				setState(878); parExpression();
				setState(879); block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(881); match(T__36);
				setState(883);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(882); expression(0);
					}
				}

				setState(885); match(T__32);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(886); match(T__15);
				setState(887); expression(0);
				setState(888); match(T__32);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(890); match(T__25);
				setState(892);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(891); match(Identifier);
					}
				}

				setState(894); match(T__32);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(895); match(T__40);
				setState(897);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(896); match(Identifier);
					}
				}

				setState(899); match(T__32);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(900); match(T__32);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(901); statementExpression();
				setState(902); match(T__32);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(904); match(Identifier);
				setState(905); match(T__13);
				setState(906); statement();
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

	public static class TryStatementContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tryStatement);
		int _la;
		try {
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909); match(T__27);
				setState(910); match(T__65);
				setState(911); resources();
				setState(912); match(T__2);
				setState(913); block();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__39) {
					{
					{
					setState(914); catchClause();
					}
					}
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(922);
				_la = _input.LA(1);
				if (_la==T__84) {
					{
					setState(920); match(T__84);
					setState(921); block();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(924); match(T__27);
				setState(925); block();
				setState(937);
				switch (_input.LA(1)) {
				case T__39:
					{
					setState(927); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(926); catchClause();
						}
						}
						setState(929); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__39 );
					setState(933);
					_la = _input.LA(1);
					if (_la==T__84) {
						{
						setState(931); match(T__84);
						setState(932); block();
						}
					}

					}
					break;
				case T__84:
					{
					setState(935); match(T__84);
					setState(936); block();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941); match(T__39);
			setState(942); match(T__65);
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__45) {
				{
				{
				setState(943); variableModifier();
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(949); typeRef();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(950); match(T__9);
				setState(951); typeRef();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957); match(Identifier);
			setState(958); match(T__2);
			setState(959); block();
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

	public static class ResourcesContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resources);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(961); resource();
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(962); match(T__32);
					setState(963); resource();
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(970);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(969); match(T__32);
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

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__45) {
				{
				{
				setState(972); variableModifier();
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(978); classOrInterfaceType();
			setState(979); variableDeclaratorId();
			setState(980); match(T__72);
			setState(981); expression(0);
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(983); match(T__76);
			setState(987);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(984); switchBlockStatementGroup();
					}
					} 
				}
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__88 || _la==T__16) {
				{
				{
				setState(990); switchLabel();
				}
				}
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(996); match(T__30);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(999); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(998); switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1001); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__83) | (1L << T__82) | (1L << T__81) | (1L << T__79) | (1L << T__78) | (1L << T__77) | (1L << T__76) | (1L << T__73) | (1L << T__70) | (1L << T__68) | (1L << T__67) | (1L << T__66) | (1L << T__65) | (1L << T__60) | (1L << T__58) | (1L << T__57) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__41) | (1L << T__40) | (1L << T__38) | (1L << T__36) | (1L << T__35) | (1L << T__34) | (1L << T__32) | (1L << T__28) | (1L << T__27))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__25 - 64)) | (1L << (T__24 - 64)) | (1L << (T__23 - 64)) | (1L << (T__22 - 64)) | (1L << (T__20 - 64)) | (1L << (T__18 - 64)) | (1L << (T__15 - 64)) | (1L << (T__10 - 64)) | (1L << (T__8 - 64)) | (1L << (T__6 - 64)) | (1L << (T__3 - 64)) | (1L << (T__1 - 64)) | (1L << (HexLiteral - 64)) | (1L << (DecimalLiteral - 64)) | (1L << (OctalLiteral - 64)) | (1L << (BinaryLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (ENUM - 64)) | (1L << (ASSERT - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(1003); blockStatement();
				}
				}
				setState(1008);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switchLabel);
		try {
			setState(1019);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009); match(T__16);
				setState(1010); constantExpression();
				setState(1011); match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013); match(T__16);
				setState(1014); enumConstantName();
				setState(1015); match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1017); match(T__88);
				setState(1018); match(T__13);
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

	public static class ForControlContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forControl);
		int _la;
		try {
			setState(1033);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021); enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__45) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1022); forInit();
					}
				}

				setState(1025); match(T__32);
				setState(1027);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1026); expression(0);
					}
				}

				setState(1029); match(T__32);
				setState(1031);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1030); forUpdate();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forInit);
		try {
			setState(1037);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035); localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036); expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48 || _la==T__45) {
				{
				{
				setState(1039); variableModifier();
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045); typeRef();
			setState(1046); match(Identifier);
			setState(1047); match(T__13);
			setState(1048); expression(0);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050); expressionList();
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052); match(T__65);
			setState(1053); expression(0);
			setState(1054); match(T__2);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056); expression(0);
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__62) {
				{
				{
				setState(1057); match(T__62);
				setState(1058); expression(0);
				}
				}
				setState(1063);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064); expression(0);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1069);
				_la = _input.LA(1);
				if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (T__53 - 36)) | (1L << (T__44 - 36)) | (1L << (T__10 - 36)) | (1L << (T__1 - 36)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1070); expression(17);
				}
				break;
			case 2:
				{
				setState(1071);
				_la = _input.LA(1);
				if ( !(_la==T__50 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1072); expression(16);
				}
				break;
			case 3:
				{
				setState(1073); match(T__65);
				setState(1074); typeRef();
				setState(1075); match(T__2);
				setState(1076); expression(15);
				}
				break;
			case 4:
				{
				setState(1078); primary();
				}
				break;
			case 5:
				{
				setState(1079); match(T__81);
				setState(1080); creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1207);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1083);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1084);
						_la = _input.LA(1);
						if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (T__42 - 47)) | (1L << (T__19 - 47)) | (1L << (T__5 - 47)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1085); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1086);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1087);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1088); expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1089);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1097);
						switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
						case 1:
							{
							setState(1090); match(T__52);
							setState(1091); match(T__52);
							}
							break;
						case 2:
							{
							setState(1092); match(T__7);
							setState(1093); match(T__7);
							setState(1094); match(T__7);
							}
							break;
						case 3:
							{
							setState(1095); match(T__7);
							setState(1096); match(T__7);
							}
							break;
						}
						setState(1099); expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1100);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1107);
						switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
						case 1:
							{
							setState(1101); match(T__52);
							setState(1102); match(T__72);
							}
							break;
						case 2:
							{
							setState(1103); match(T__7);
							setState(1104); match(T__72);
							}
							break;
						case 3:
							{
							setState(1105); match(T__7);
							}
							break;
						case 4:
							{
							setState(1106); match(T__52);
							}
							break;
						}
						setState(1109); expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1110);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1111);
						_la = _input.LA(1);
						if ( !(_la==T__80 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1112); expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1114); match(T__21);
						setState(1115); expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1117); match(T__71);
						setState(1118); expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1120); match(T__9);
						setState(1121); expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1123); match(T__74);
						setState(1124); expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1126); match(T__33);
						setState(1127); expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1129); match(T__26);
						setState(1130); expression(0);
						setState(1131); match(T__13);
						setState(1132); expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1134);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1154);
						switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
						case 1:
							{
							setState(1135); match(T__75);
							}
							break;
						case 2:
							{
							setState(1136); match(T__87);
							}
							break;
						case 3:
							{
							setState(1137); match(T__63);
							}
							break;
						case 4:
							{
							setState(1138); match(T__43);
							}
							break;
						case 5:
							{
							setState(1139); match(T__61);
							}
							break;
						case 6:
							{
							setState(1140); match(T__37);
							}
							break;
						case 7:
							{
							setState(1141); match(T__69);
							}
							break;
						case 8:
							{
							setState(1142); match(T__72);
							}
							break;
						case 9:
							{
							setState(1143); match(T__7);
							setState(1144); match(T__7);
							setState(1145); match(T__72);
							}
							break;
						case 10:
							{
							setState(1146); match(T__7);
							setState(1147); match(T__7);
							setState(1148); match(T__7);
							setState(1149); match(T__72);
							}
							break;
						case 11:
							{
							setState(1150); match(T__52);
							setState(1151); match(T__52);
							setState(1152); match(T__72);
							}
							break;
						case 12:
							{
							setState(1153); match(T__85);
							}
							break;
						}
						setState(1156); expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1158); match(T__17);
						setState(1159); match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1161); match(T__17);
						setState(1162); match(T__18);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1163);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1164); match(T__17);
						setState(1165); match(T__3);
						setState(1166); match(T__65);
						setState(1168);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1167); expressionList();
							}
						}

						setState(1170); match(T__2);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1171);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1172); match(T__17);
						setState(1173); match(T__81);
						setState(1174); match(Identifier);
						setState(1175); match(T__65);
						setState(1177);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1176); expressionList();
							}
						}

						setState(1179); match(T__2);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1180);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1181); match(T__17);
						setState(1182); match(T__3);
						setState(1183); match(T__17);
						setState(1184); match(Identifier);
						setState(1186);
						switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
						case 1:
							{
							setState(1185); arguments();
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1188);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1189); match(T__17);
						setState(1190); explicitGenericInvocation();
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1191);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1192); match(T__12);
						setState(1193); expression(0);
						setState(1194); match(T__51);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1197); match(T__65);
						setState(1199);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1198); expressionList();
							}
						}

						setState(1201); match(T__2);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1203);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1205); match(T__31);
						setState(1206); typeRef();
						}
						break;
					}
					} 
				}
				setState(1211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_primary);
		try {
			setState(1227);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1212); match(T__65);
				setState(1213); expression(0);
				setState(1214); match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216); match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217); match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218); literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1219); match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1220); typeRef();
				setState(1221); match(T__17);
				setState(1222); match(T__34);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1224); match(T__77);
				setState(1225); match(T__17);
				setState(1226); match(T__34);
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

	public static class CreatorContext extends ParserRuleContext {
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_creator);
		try {
			setState(1238);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1229); nonWildcardTypeArguments();
				setState(1230); createdName();
				setState(1231); classCreatorRest();
				}
				break;
			case T__83:
			case T__79:
			case T__73:
			case T__68:
			case T__55:
			case T__54:
			case T__24:
			case T__23:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233); createdName();
				setState(1236);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(1234); arrayCreatorRest();
					}
					break;
				case T__65:
					{
					setState(1235); classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java7Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java7Parser.Identifier, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_createdName);
		int _la;
		try {
			setState(1259);
			switch (_input.LA(1)) {
			case T__83:
			case T__79:
			case T__73:
			case T__68:
			case T__55:
			case T__54:
			case T__24:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240); primitiveType();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241); match(Identifier);
				setState(1245);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1242); typeArguments();
					}
					break;
				case 2:
					{
					setState(1243); match(T__52);
					setState(1244); match(T__7);
					}
					break;
				}
				setState(1256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(1247); match(T__17);
					setState(1248); match(Identifier);
					setState(1252);
					switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
					case 1:
						{
						setState(1249); typeArguments();
						}
						break;
					case 2:
						{
						setState(1250); match(T__52);
						setState(1251); match(T__7);
						}
						break;
					}
					}
					}
					setState(1258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_innerCreator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1261); nonWildcardTypeArguments();
				}
				break;
			case 2:
				{
				setState(1262); match(T__52);
				setState(1263); match(T__7);
				}
				break;
			}
			setState(1266); match(Identifier);
			setState(1267); classCreatorRest();
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java7Parser.Identifier, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269); nonWildcardTypeArguments();
			setState(1270); match(Identifier);
			setState(1271); arguments();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1273); match(T__12);
			setState(1302);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1274); match(T__51);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(1275); match(T__12);
					setState(1276); match(T__51);
					}
					}
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1282); arrayInitializer();
				}
				break;
			case 2:
				{
				setState(1283); expression(0);
				setState(1284); match(T__51);
				setState(1291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1285); match(T__12);
						setState(1286); expression(0);
						setState(1287); match(T__51);
						}
						} 
					}
					setState(1293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1294); match(T__12);
						setState(1295); match(T__51);
						}
						} 
					}
					setState(1300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(1301); match(T__51);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304); arguments();
			setState(1306);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1305); classBody();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308); match(T__52);
			setState(1309); typeList();
			setState(1310); match(T__7);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java7Listener ) ((Java7Listener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312); match(T__65);
			setState(1314);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__81) | (1L << T__79) | (1L << T__77) | (1L << T__73) | (1L << T__68) | (1L << T__67) | (1L << T__65) | (1L << T__60) | (1L << T__55) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__44) | (1L << T__35))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__24 - 65)) | (1L << (T__23 - 65)) | (1L << (T__18 - 65)) | (1L << (T__10 - 65)) | (1L << (T__6 - 65)) | (1L << (T__3 - 65)) | (1L << (T__1 - 65)) | (1L << (HexLiteral - 65)) | (1L << (DecimalLiteral - 65)) | (1L << (OctalLiteral - 65)) | (1L << (BinaryLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1313); expressionList();
				}
			}

			setState(1316); match(T__2);
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
		case 86: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		case 4: return precpred(_ctx, 8);
		case 5: return precpred(_ctx, 7);
		case 6: return precpred(_ctx, 6);
		case 7: return precpred(_ctx, 5);
		case 8: return precpred(_ctx, 4);
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		case 11: return precpred(_ctx, 1);
		case 12: return precpred(_ctx, 26);
		case 13: return precpred(_ctx, 25);
		case 14: return precpred(_ctx, 24);
		case 15: return precpred(_ctx, 23);
		case 16: return precpred(_ctx, 22);
		case 17: return precpred(_ctx, 21);
		case 18: return precpred(_ctx, 20);
		case 19: return precpred(_ctx, 19);
		case 20: return precpred(_ctx, 18);
		case 21: return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3h\u0529\4\2\t\2\4"+
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
		"`\t`\4a\ta\3\2\5\2\u00c4\n\2\3\2\7\2\u00c7\n\2\f\2\16\2\u00ca\13\2\3\2"+
		"\7\2\u00cd\n\2\f\2\16\2\u00d0\13\2\3\2\3\2\3\3\7\3\u00d5\n\3\f\3\16\3"+
		"\u00d8\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00e0\n\4\3\4\3\4\3\4\5\4\u00e5"+
		"\n\4\3\4\3\4\3\5\3\5\5\5\u00eb\n\5\3\6\7\6\u00ee\n\6\f\6\16\6\u00f1\13"+
		"\6\3\6\3\6\5\6\u00f5\n\6\3\7\3\7\5\7\u00f9\n\7\3\b\3\b\3\b\5\b\u00fe\n"+
		"\b\3\b\3\b\5\b\u0102\n\b\3\b\3\b\5\b\u0106\n\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\7\t\u010e\n\t\f\t\16\t\u0111\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u0118\n\n\3"+
		"\13\3\13\3\13\7\13\u011d\n\13\f\13\16\13\u0120\13\13\3\f\3\f\3\f\3\f\5"+
		"\f\u0126\n\f\3\f\3\f\5\f\u012a\n\f\3\f\3\f\7\f\u012e\n\f\f\f\16\f\u0131"+
		"\13\f\5\f\u0133\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u013a\n\r\f\r\16\r\u013d\13"+
		"\r\3\r\5\r\u0140\n\r\3\r\5\r\u0143\n\r\3\16\3\16\5\16\u0147\n\16\3\17"+
		"\3\17\3\17\5\17\u014c\n\17\3\17\3\17\5\17\u0150\n\17\3\17\3\17\3\20\3"+
		"\20\7\20\u0156\n\20\f\20\16\20\u0159\13\20\3\20\3\20\3\21\3\21\7\21\u015f"+
		"\n\21\f\21\16\21\u0162\13\21\3\21\3\21\7\21\u0166\n\21\f\21\16\21\u0169"+
		"\13\21\3\21\3\21\3\22\3\22\7\22\u016f\n\22\f\22\16\22\u0172\13\22\3\22"+
		"\3\22\5\22\u0176\n\22\3\22\5\22\u0179\n\22\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0180\n\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u0188\n\25\f\25\16\25"+
		"\u018b\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0194\n\26\3\27\7"+
		"\27\u0197\n\27\f\27\16\27\u019a\13\27\3\27\3\27\5\27\u019e\n\27\3\27\5"+
		"\27\u01a1\n\27\3\30\3\30\3\30\7\30\u01a6\n\30\f\30\16\30\u01a9\13\30\3"+
		"\31\3\31\3\31\3\31\7\31\u01af\n\31\f\31\16\31\u01b2\13\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\5\32\u01ba\n\32\5\32\u01bc\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01c5\n\33\3\34\5\34\u01c8\n\34\3\34\3\34\5\34\u01cc"+
		"\n\34\3\34\3\34\3\34\3\34\7\34\u01d2\n\34\f\34\16\34\u01d5\13\34\3\34"+
		"\3\34\5\34\u01d9\n\34\3\34\3\34\5\34\u01dd\n\34\3\35\5\35\u01e0\n\35\3"+
		"\35\3\35\3\35\3\35\5\35\u01e6\n\35\3\35\3\35\5\35\u01ea\n\35\3\35\7\35"+
		"\u01ed\n\35\f\35\16\35\u01f0\13\35\3\35\3\35\3\36\3\36\5\36\u01f6\n\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u0200\n \3!\3!\3!\7!\u0205\n!\f!\16"+
		"!\u0208\13!\3!\3!\5!\u020c\n!\3!\3!\3\"\3\"\3\"\5\"\u0213\n\"\3\"\3\""+
		"\3\"\3#\3#\3#\5#\u021b\n#\3#\3#\3$\3$\3$\3%\3%\3%\7%\u0225\n%\f%\16%\u0228"+
		"\13%\3&\3&\3&\5&\u022d\n&\3\'\3\'\3\'\7\'\u0232\n\'\f\'\16\'\u0235\13"+
		"\'\3(\3(\7(\u0239\n(\f(\16(\u023c\13(\3(\3(\3(\3)\3)\3)\7)\u0244\n)\f"+
		")\16)\u0247\13)\3*\3*\5*\u024b\n*\3+\3+\3+\3+\7+\u0251\n+\f+\16+\u0254"+
		"\13+\3+\5+\u0257\n+\5+\u0259\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u0269\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\7\60\u0274\n\60\f\60"+
		"\16\60\u0277\13\60\3\60\3\60\3\60\7\60\u027c\n\60\f\60\16\60\u027f\13"+
		"\60\5\60\u0281\n\60\3\61\3\61\5\61\u0285\n\61\3\61\3\61\3\61\5\61\u028a"+
		"\n\61\7\61\u028c\n\61\f\61\16\61\u028f\13\61\3\62\3\62\3\63\3\63\3\63"+
		"\7\63\u0296\n\63\f\63\16\63\u0299\13\63\3\64\3\64\5\64\u029d\n\64\3\64"+
		"\3\64\3\65\7\65\u02a2\n\65\f\65\16\65\u02a5\13\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u02af\n\66\5\66\u02b1\n\66\3\67\3\67\38\58\u02b6"+
		"\n8\38\38\38\38\38\38\38\58\u02bf\n8\38\38\38\38\58\u02c5\n8\39\39\39"+
		"\79\u02ca\n9\f9\169\u02cd\139\3:\3:\3:\3:\3:\3:\5:\u02d5\n:\3;\3;\3<\3"+
		"<\3=\3=\3=\3=\3=\5=\u02e0\n=\3=\5=\u02e3\n=\3>\3>\3>\7>\u02e8\n>\f>\16"+
		">\u02eb\13>\3?\3?\3?\7?\u02f0\n?\f?\16?\u02f3\13?\3@\3@\3@\3@\3A\3A\3"+
		"A\5A\u02fc\nA\3B\3B\3B\3B\7B\u0302\nB\fB\16B\u0305\13B\5B\u0307\nB\3B"+
		"\5B\u030a\nB\3B\3B\3C\3C\3C\3C\3C\7C\u0313\nC\fC\16C\u0316\13C\3C\7C\u0319"+
		"\nC\fC\16C\u031c\13C\3C\3C\3D\3D\3D\5D\u0323\nD\3D\3D\3D\3D\5D\u0329\n"+
		"D\3D\3D\5D\u032d\nD\3D\3D\5D\u0331\nD\3D\3D\5D\u0335\nD\5D\u0337\nD\3"+
		"E\3E\3E\3E\5E\u033d\nE\3F\3F\3F\3G\7G\u0343\nG\fG\16G\u0346\13G\3G\3G"+
		"\3G\3H\3H\3H\3H\3H\5H\u0350\nH\3H\3H\3H\3H\3H\3H\3H\5H\u0359\nH\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\5H\u0376\nH\3H\3H\3H\3H\3H\3H\3H\5H\u037f\nH\3H\3H\3H\5H\u0384"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u038e\nH\3I\3I\3I\3I\3I\3I\7I\u0396\nI"+
		"\fI\16I\u0399\13I\3I\3I\5I\u039d\nI\3I\3I\3I\6I\u03a2\nI\rI\16I\u03a3"+
		"\3I\3I\5I\u03a8\nI\3I\3I\5I\u03ac\nI\5I\u03ae\nI\3J\3J\3J\7J\u03b3\nJ"+
		"\fJ\16J\u03b6\13J\3J\3J\3J\7J\u03bb\nJ\fJ\16J\u03be\13J\3J\3J\3J\3J\3"+
		"K\3K\3K\7K\u03c7\nK\fK\16K\u03ca\13K\3K\5K\u03cd\nK\3L\7L\u03d0\nL\fL"+
		"\16L\u03d3\13L\3L\3L\3L\3L\3L\3M\3M\7M\u03dc\nM\fM\16M\u03df\13M\3M\7"+
		"M\u03e2\nM\fM\16M\u03e5\13M\3M\3M\3N\6N\u03ea\nN\rN\16N\u03eb\3N\7N\u03ef"+
		"\nN\fN\16N\u03f2\13N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03fe\nO\3P\3P\5"+
		"P\u0402\nP\3P\3P\5P\u0406\nP\3P\3P\5P\u040a\nP\5P\u040c\nP\3Q\3Q\5Q\u0410"+
		"\nQ\3R\7R\u0413\nR\fR\16R\u0416\13R\3R\3R\3R\3R\3R\3S\3S\3T\3T\3T\3T\3"+
		"U\3U\3U\7U\u0426\nU\fU\16U\u0429\13U\3V\3V\3W\3W\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\5X\u043c\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\5X\u044c\nX\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0456\nX\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0485\nX\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u0493\nX\3X\3X\3X\3X\3X\3X\3X\5X\u049c"+
		"\nX\3X\3X\3X\3X\3X\3X\3X\5X\u04a5\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\5X\u04b2\nX\3X\3X\3X\3X\3X\3X\7X\u04ba\nX\fX\16X\u04bd\13X\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04ce\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5"+
		"Z\u04d7\nZ\5Z\u04d9\nZ\3[\3[\3[\3[\3[\5[\u04e0\n[\3[\3[\3[\3[\3[\5[\u04e7"+
		"\n[\7[\u04e9\n[\f[\16[\u04ec\13[\5[\u04ee\n[\3\\\3\\\3\\\5\\\u04f3\n\\"+
		"\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3^\3^\7^\u0500\n^\f^\16^\u0503\13^\3^\3"+
		"^\3^\3^\3^\3^\3^\7^\u050c\n^\f^\16^\u050f\13^\3^\3^\7^\u0513\n^\f^\16"+
		"^\u0516\13^\3^\5^\u0519\n^\3_\3_\5_\u051d\n_\3`\3`\3`\3`\3a\3a\5a\u0525"+
		"\na\3a\3a\3a\2\3\u00aeb\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\2\r\4\2>>XX\b\2\b\b\f\f\22\22\27"+
		"\27$%CD\4\2IIXX\3\2\\_\4\2\37\3788\6\2&&//QQZZ\4\2))UU\5\2\61\61HHVV\4"+
		"\2//ZZ\4\2\13\13PP\4\2&&QQ\u05bb\2\u00c3\3\2\2\2\4\u00d6\3\2\2\2\6\u00dd"+
		"\3\2\2\2\b\u00ea\3\2\2\2\n\u00ef\3\2\2\2\f\u00f8\3\2\2\2\16\u00fa\3\2"+
		"\2\2\20\u0109\3\2\2\2\22\u0114\3\2\2\2\24\u0119\3\2\2\2\26\u0121\3\2\2"+
		"\2\30\u0142\3\2\2\2\32\u0146\3\2\2\2\34\u0148\3\2\2\2\36\u0153\3\2\2\2"+
		" \u015c\3\2\2\2\"\u0178\3\2\2\2$\u017f\3\2\2\2&\u0181\3\2\2\2(\u0185\3"+
		"\2\2\2*\u0193\3\2\2\2,\u0198\3\2\2\2.\u01a2\3\2\2\2\60\u01aa\3\2\2\2\62"+
		"\u01bb\3\2\2\2\64\u01c4\3\2\2\2\66\u01c7\3\2\2\28\u01df\3\2\2\2:\u01f5"+
		"\3\2\2\2<\u01f7\3\2\2\2>\u01ff\3\2\2\2@\u0201\3\2\2\2B\u020f\3\2\2\2D"+
		"\u0217\3\2\2\2F\u021e\3\2\2\2H\u0221\3\2\2\2J\u0229\3\2\2\2L\u022e\3\2"+
		"\2\2N\u023a\3\2\2\2P\u0240\3\2\2\2R\u024a\3\2\2\2T\u024c\3\2\2\2V\u0268"+
		"\3\2\2\2X\u026a\3\2\2\2Z\u026c\3\2\2\2\\\u026e\3\2\2\2^\u0280\3\2\2\2"+
		"`\u0282\3\2\2\2b\u0290\3\2\2\2d\u0292\3\2\2\2f\u029a\3\2\2\2h\u02a3\3"+
		"\2\2\2j\u02b0\3\2\2\2l\u02b2\3\2\2\2n\u02c4\3\2\2\2p\u02c6\3\2\2\2r\u02d4"+
		"\3\2\2\2t\u02d6\3\2\2\2v\u02d8\3\2\2\2x\u02da\3\2\2\2z\u02e4\3\2\2\2|"+
		"\u02ec\3\2\2\2~\u02f4\3\2\2\2\u0080\u02fb\3\2\2\2\u0082\u02fd\3\2\2\2"+
		"\u0084\u030d\3\2\2\2\u0086\u0336\3\2\2\2\u0088\u0338\3\2\2\2\u008a\u033e"+
		"\3\2\2\2\u008c\u0344\3\2\2\2\u008e\u038d\3\2\2\2\u0090\u03ad\3\2\2\2\u0092"+
		"\u03af\3\2\2\2\u0094\u03c3\3\2\2\2\u0096\u03d1\3\2\2\2\u0098\u03d9\3\2"+
		"\2\2\u009a\u03e9\3\2\2\2\u009c\u03fd\3\2\2\2\u009e\u040b\3\2\2\2\u00a0"+
		"\u040f\3\2\2\2\u00a2\u0414\3\2\2\2\u00a4\u041c\3\2\2\2\u00a6\u041e\3\2"+
		"\2\2\u00a8\u0422\3\2\2\2\u00aa\u042a\3\2\2\2\u00ac\u042c\3\2\2\2\u00ae"+
		"\u043b\3\2\2\2\u00b0\u04cd\3\2\2\2\u00b2\u04d8\3\2\2\2\u00b4\u04ed\3\2"+
		"\2\2\u00b6\u04f2\3\2\2\2\u00b8\u04f7\3\2\2\2\u00ba\u04fb\3\2\2\2\u00bc"+
		"\u051a\3\2\2\2\u00be\u051e\3\2\2\2\u00c0\u0522\3\2\2\2\u00c2\u00c4\5\4"+
		"\3\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5"+
		"\u00c7\5\6\4\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cd\5\b\5\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7\2\2\3\u00d2\3\3\2\2\2\u00d3\u00d5\5x=\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\33\2\2\u00da\u00db\5p9\2\u00db"+
		"\u00dc\7;\2\2\u00dc\5\3\2\2\2\u00dd\u00df\7[\2\2\u00de\u00e0\7,\2\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\5p"+
		"9\2\u00e2\u00e3\7J\2\2\u00e3\u00e5\7H\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7;\2\2\u00e7\7\3\2\2\2\u00e8"+
		"\u00eb\5\n\6\2\u00e9\u00eb\7;\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2"+
		"\2\2\u00eb\t\3\2\2\2\u00ec\u00ee\5V,\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f5\5\f\7\2\u00f3\u00f5\5\32\16\2\u00f4\u00f2\3"+
		"\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\13\3\2\2\2\u00f6\u00f9\5\16\b\2\u00f7"+
		"\u00f9\5\26\f\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\r\3\2\2"+
		"\2\u00fa\u00fb\79\2\2\u00fb\u00fd\7e\2\2\u00fc\u00fe\5\20\t\2\u00fd\u00fc"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\7>\2\2\u0100"+
		"\u0102\5^\60\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0104\7#\2\2\u0104\u0106\5.\30\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\36\20\2\u0108\17\3\2"+
		"\2\2\u0109\u010a\7\'\2\2\u010a\u010f\5\22\n\2\u010b\u010c\7\35\2\2\u010c"+
		"\u010e\5\22\n\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0113\7T\2\2\u0113\21\3\2\2\2\u0114\u0117\7e\2\2\u0115\u0116\7>\2\2\u0116"+
		"\u0118\5\24\13\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\23\3\2"+
		"\2\2\u0119\u011e\5`\61\2\u011a\u011b\7F\2\2\u011b\u011d\5`\61\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\25\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7c\2\2\u0122\u0125"+
		"\7e\2\2\u0123\u0124\7#\2\2\u0124\u0126\5.\30\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\7\17\2\2\u0128\u012a\5"+
		"\30\r\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0132\3\2\2\2\u012b"+
		"\u012f\7;\2\2\u012c\u012e\5\"\22\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\7=\2\2\u0135\27\3\2\2\2\u0136\u013b\5,\27\2\u0137\u0138"+
		"\7\35\2\2\u0138\u013a\5,\27\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u0140\7\35\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2"+
		"\u0140\u0143\3\2\2\2\u0141\u0143\7\35\2\2\u0142\u0136\3\2\2\2\u0142\u0141"+
		"\3\2\2\2\u0143\31\3\2\2\2\u0144\u0147\5\34\17\2\u0145\u0147\5\u0084C\2"+
		"\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\33\3\2\2\2\u0148\u0149"+
		"\7\t\2\2\u0149\u014b\7e\2\2\u014a\u014c\5\20\t\2\u014b\u014a\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014e\7>\2\2\u014e\u0150\5.\30"+
		"\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\5 \21\2\u0152\35\3\2\2\2\u0153\u0157\7\17\2\2\u0154\u0156\5\"\22\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7=\2\2\u015b"+
		"\37\3\2\2\2\u015c\u0167\7\17\2\2\u015d\u015f\5V,\2\u015e\u015d\3\2\2\2"+
		"\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0166\5\64\33\2\u0164\u0166\7;\2\2"+
		"\u0165\u0160\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016b\7=\2\2\u016b!\3\2\2\2\u016c\u0179\7;\2\2\u016d\u016f\5V,\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0179\5$\23\2\u0174"+
		"\u0176\7,\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\5(\25\2\u0178\u016c\3\2\2\2\u0178\u0170\3\2\2\2\u0178"+
		"\u0175\3\2\2\2\u0179#\3\2\2\2\u017a\u0180\5\66\34\2\u017b\u0180\5&\24"+
		"\2\u017c\u0180\58\35\2\u017d\u0180\5\32\16\2\u017e\u0180\5\f\7\2\u017f"+
		"\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u017e\3\2\2\2\u0180%\3\2\2\2\u0181\u0182\5^\60\2\u0182\u0183"+
		"\5H%\2\u0183\u0184\7;\2\2\u0184\'\3\2\2\2\u0185\u0189\7\17\2\2\u0186\u0188"+
		"\5*\26\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7="+
		"\2\2\u018d)\3\2\2\2\u018e\u018f\5\u008cG\2\u018f\u0190\7;\2\2\u0190\u0194"+
		"\3\2\2\2\u0191\u0194\5\n\6\2\u0192\u0194\5\u008eH\2\u0193\u018e\3\2\2"+
		"\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194+\3\2\2\2\u0195\u0197"+
		"\5x=\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\7e"+
		"\2\2\u019c\u019e\5\u00c0a\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u01a1\5\36\20\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1-\3\2\2\2\u01a2\u01a7\5`\61\2\u01a3\u01a4\7\35\2\2\u01a4\u01a6"+
		"\5`\61\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8/\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\'\2\2"+
		"\u01ab\u01b0\5\62\32\2\u01ac\u01ad\7\35\2\2\u01ad\u01af\5\62\32\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\7T\2\2\u01b4"+
		"\61\3\2\2\2\u01b5\u01bc\5`\61\2\u01b6\u01b9\7A\2\2\u01b7\u01b8\t\2\2\2"+
		"\u01b8\u01ba\5`\61\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bc\63\3\2\2\2\u01bd"+
		"\u01c5\5<\37\2\u01be\u01c5\5B\"\2\u01bf\u01c0\7\16\2\2\u01c0\u01c1\7e"+
		"\2\2\u01c1\u01c5\5D#\2\u01c2\u01c5\5\32\16\2\u01c3\u01c5\5\f\7\2\u01c4"+
		"\u01bd\3\2\2\2\u01c4\u01be\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c3\3\2\2\2\u01c5\65\3\2\2\2\u01c6\u01c8\5\20\t\2\u01c7\u01c6"+
		"\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01cc\5^\60\2\u01ca"+
		"\u01cc\7\16\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3"+
		"\2\2\2\u01cd\u01ce\7e\2\2\u01ce\u01d3\5f\64\2\u01cf\u01d0\7O\2\2\u01d0"+
		"\u01d2\7(\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d8\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d7\7 \2\2\u01d7\u01d9\5d\63\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01dc\3\2\2\2\u01da\u01dd\5l\67\2\u01db\u01dd\7;\2\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\67\3\2\2\2\u01de\u01e0\5\20\t"+
		"\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2"+
		"\7e\2\2\u01e2\u01e5\5f\64\2\u01e3\u01e4\7 \2\2\u01e4\u01e6\5d\63\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\7\17"+
		"\2\2\u01e8\u01ea\5n8\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ee"+
		"\3\2\2\2\u01eb\u01ed\5*\26\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u01f2\7=\2\2\u01f29\3\2\2\2\u01f3\u01f6\7.\2\2\u01f4\u01f6"+
		"\5x=\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6;\3\2\2\2\u01f7\u01f8"+
		"\5^\60\2\u01f8\u01f9\7e\2\2\u01f9\u01fa\5> \2\u01fa=\3\2\2\2\u01fb\u01fc"+
		"\5L\'\2\u01fc\u01fd\7;\2\2\u01fd\u0200\3\2\2\2\u01fe\u0200\5@!\2\u01ff"+
		"\u01fb\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200?\3\2\2\2\u0201\u0206\5f\64\2"+
		"\u0202\u0203\7O\2\2\u0203\u0205\7(\2\2\u0204\u0202\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020b\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\7 \2\2\u020a\u020c\5d\63\2\u020b\u0209\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7;\2\2\u020e"+
		"A\3\2\2\2\u020f\u0212\5\20\t\2\u0210\u0213\5^\60\2\u0211\u0213\7\16\2"+
		"\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215"+
		"\7e\2\2\u0215\u0216\5@!\2\u0216C\3\2\2\2\u0217\u021a\5f\64\2\u0218\u0219"+
		"\7 \2\2\u0219\u021b\5d\63\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\7;\2\2\u021dE\3\2\2\2\u021e\u021f\7e\2\2\u021f"+
		"\u0220\5N(\2\u0220G\3\2\2\2\u0221\u0226\5J&\2\u0222\u0223\7\35\2\2\u0223"+
		"\u0225\5J&\2\u0224\u0222\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2"+
		"\2\u0226\u0227\3\2\2\2\u0227I\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022c"+
		"\5P)\2\u022a\u022b\7\23\2\2\u022b\u022d\5R*\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022dK\3\2\2\2\u022e\u0233\5N(\2\u022f\u0230\7\35\2\2\u0230"+
		"\u0232\5F$\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234M\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237"+
		"\7O\2\2\u0237\u0239\7(\2\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2"+
		"\2\2\u023d\u023e\7\23\2\2\u023e\u023f\5R*\2\u023fO\3\2\2\2\u0240\u0245"+
		"\7e\2\2\u0241\u0242\7O\2\2\u0242\u0244\7(\2\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246Q\3\2\2\2"+
		"\u0247\u0245\3\2\2\2\u0248\u024b\5T+\2\u0249\u024b\5\u00aeX\2\u024a\u0248"+
		"\3\2\2\2\u024a\u0249\3\2\2\2\u024bS\3\2\2\2\u024c\u0258\7\17\2\2\u024d"+
		"\u0252\5R*\2\u024e\u024f\7\35\2\2\u024f\u0251\5R*\2\u0250\u024e\3\2\2"+
		"\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0256"+
		"\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0257\7\35\2\2\u0256\u0255\3\2\2\2"+
		"\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u024d\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\7=\2\2\u025bU\3\2\2\2\u025c\u0269"+
		"\5x=\2\u025d\u0269\7S\2\2\u025e\u0269\7-\2\2\u025f\u0269\7\5\2\2\u0260"+
		"\u0269\7,\2\2\u0261\u0269\7\"\2\2\u0262\u0269\7.\2\2\u0263\u0269\7\65"+
		"\2\2\u0264\u0269\7E\2\2\u0265\u0269\7*\2\2\u0266\u0269\7!\2\2\u0267\u0269"+
		"\7\62\2\2\u0268\u025c\3\2\2\2\u0268\u025d\3\2\2\2\u0268\u025e\3\2\2\2"+
		"\u0268\u025f\3\2\2\2\u0268\u0260\3\2\2\2\u0268\u0261\3\2\2\2\u0268\u0262"+
		"\3\2\2\2\u0268\u0263\3\2\2\2\u0268\u0264\3\2\2\2\u0268\u0265\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269W\3\2\2\2\u026a\u026b\5p9\2\u026b"+
		"Y\3\2\2\2\u026c\u026d\7e\2\2\u026d[\3\2\2\2\u026e\u026f\5p9\2\u026f]\3"+
		"\2\2\2\u0270\u0275\5`\61\2\u0271\u0272\7O\2\2\u0272\u0274\7(\2\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0281\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027d\5b\62\2\u0279"+
		"\u027a\7O\2\2\u027a\u027c\7(\2\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2"+
		"\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d"+
		"\3\2\2\2\u0280\u0270\3\2\2\2\u0280\u0278\3\2\2\2\u0281_\3\2\2\2\u0282"+
		"\u0284\7e\2\2\u0283\u0285\5\60\31\2\u0284\u0283\3\2\2\2\u0284\u0285\3"+
		"\2\2\2\u0285\u028d\3\2\2\2\u0286\u0287\7J\2\2\u0287\u0289\7e\2\2\u0288"+
		"\u028a\5\60\31\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3"+
		"\2\2\2\u028b\u0286\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028ea\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\t\3\2\2"+
		"\u0291c\3\2\2\2\u0292\u0297\5p9\2\u0293\u0294\7\35\2\2\u0294\u0296\5p"+
		"9\2\u0295\u0293\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298e\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029c\7\32\2\2"+
		"\u029b\u029d\5h\65\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u029f\7Y\2\2\u029fg\3\2\2\2\u02a0\u02a2\5:\36\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\5^\60\2\u02a7\u02a8\5j"+
		"\66\2\u02a8i\3\2\2\2\u02a9\u02aa\7M\2\2\u02aa\u02b1\5P)\2\u02ab\u02ae"+
		"\5P)\2\u02ac\u02ad\7\35\2\2\u02ad\u02af\5h\65\2\u02ae\u02ac\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a9\3\2\2\2\u02b0\u02ab\3\2"+
		"\2\2\u02b1k\3\2\2\2\u02b2\u02b3\5(\25\2\u02b3m\3\2\2\2\u02b4\u02b6\5\u00be"+
		"`\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b8\t\4\2\2\u02b8\u02b9\5\u00c0a\2\u02b9\u02ba\7;\2\2\u02ba\u02c5\3"+
		"\2\2\2\u02bb\u02bc\5\u00b0Y\2\u02bc\u02be\7J\2\2\u02bd\u02bf\5\u00be`"+
		"\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\7X\2\2\u02c1\u02c2\5\u00c0a\2\u02c2\u02c3\7;\2\2\u02c3\u02c5\3\2\2\2"+
		"\u02c4\u02b5\3\2\2\2\u02c4\u02bb\3\2\2\2\u02c5o\3\2\2\2\u02c6\u02cb\7"+
		"e\2\2\u02c7\u02c8\7J\2\2\u02c8\u02ca\7e\2\2\u02c9\u02c7\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02ccq\3\2\2\2"+
		"\u02cd\u02cb\3\2\2\2\u02ce\u02d5\5t;\2\u02cf\u02d5\7`\2\2\u02d0\u02d5"+
		"\7a\2\2\u02d1\u02d5\7b\2\2\u02d2\u02d5\5v<\2\u02d3\u02d5\7\30\2\2\u02d4"+
		"\u02ce\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3\2\2\2\u02d4\u02d1\3\2"+
		"\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3\3\2\2\2\u02d5s\3\2\2\2\u02d6\u02d7"+
		"\t\5\2\2\u02d7u\3\2\2\2\u02d8\u02d9\t\6\2\2\u02d9w\3\2\2\2\u02da\u02db"+
		"\7+\2\2\u02db\u02e2\5z>\2\u02dc\u02df\7\32\2\2\u02dd\u02e0\5|?\2\u02de"+
		"\u02e0\5\u0080A\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02df\u02e0"+
		"\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\7Y\2\2\u02e2\u02dc\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3y\3\2\2\2\u02e4\u02e9\7e\2\2\u02e5\u02e6\7J\2\2\u02e6"+
		"\u02e8\7e\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02ea{\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02f1"+
		"\5~@\2\u02ed\u02ee\7\35\2\2\u02ee\u02f0\5~@\2\u02ef\u02ed\3\2\2\2\u02f0"+
		"\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2}\3\2\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f4\u02f5\7e\2\2\u02f5\u02f6\7\23\2\2\u02f6\u02f7"+
		"\5\u0080A\2\u02f7\177\3\2\2\2\u02f8\u02fc\5\u00aeX\2\u02f9\u02fc\5x=\2"+
		"\u02fa\u02fc\5\u0082B\2\u02fb\u02f8\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fc\u0081\3\2\2\2\u02fd\u0306\7\17\2\2\u02fe\u0303\5"+
		"\u0080A\2\u02ff\u0300\7\35\2\2\u0300\u0302\5\u0080A\2\u0301\u02ff\3\2"+
		"\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u02fe\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u0309\3\2\2\2\u0308\u030a\7\35\2\2\u0309\u0308\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\7=\2\2\u030c\u0083\3\2"+
		"\2\2\u030d\u030e\7+\2\2\u030e\u030f\7\t\2\2\u030f\u0310\7e\2\2\u0310\u031a"+
		"\7\17\2\2\u0311\u0313\5V,\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u0319\5\u0086D\2\u0318\u0314\3\2\2\2\u0319\u031c\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031d\u031e\7=\2\2\u031e\u0085\3\2\2\2\u031f\u0322\5^\60\2\u0320"+
		"\u0323\5\u0088E\2\u0321\u0323\5H%\2\u0322\u0320\3\2\2\2\u0322\u0321\3"+
		"\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\7;\2\2\u0325\u0337\3\2\2\2\u0326"+
		"\u0328\5\f\7\2\u0327\u0329\7;\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2"+
		"\2\2\u0329\u0337\3\2\2\2\u032a\u032c\5\34\17\2\u032b\u032d\7;\2\2\u032c"+
		"\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0337\3\2\2\2\u032e\u0330\5\26"+
		"\f\2\u032f\u0331\7;\2\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0337\3\2\2\2\u0332\u0334\5\u0084C\2\u0333\u0335\7;\2\2\u0334\u0333\3"+
		"\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u031f\3\2\2\2\u0336"+
		"\u0326\3\2\2\2\u0336\u032a\3\2\2\2\u0336\u032e\3\2\2\2\u0336\u0332\3\2"+
		"\2\2\u0337\u0087\3\2\2\2\u0338\u0339\7e\2\2\u0339\u033a\7\32\2\2\u033a"+
		"\u033c\7Y\2\2\u033b\u033d\5\u008aF\2\u033c\u033b\3\2\2\2\u033c\u033d\3"+
		"\2\2\2\u033d\u0089\3\2\2\2\u033e\u033f\7\3\2\2\u033f\u0340\5\u0080A\2"+
		"\u0340\u008b\3\2\2\2\u0341\u0343\5:\36\2\u0342\u0341\3\2\2\2\u0343\u0346"+
		"\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0347\u0348\5^\60\2\u0348\u0349\5H%\2\u0349\u008d\3\2\2"+
		"\2\u034a\u038e\5(\25\2\u034b\u034c\7d\2\2\u034c\u034f\5\u00aeX\2\u034d"+
		"\u034e\7N\2\2\u034e\u0350\5\u00aeX\2\u034f\u034d\3\2\2\2\u034f\u0350\3"+
		"\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\7;\2\2\u0352\u038e\3\2\2\2\u0353"+
		"\u0354\7?\2\2\u0354\u0355\5\u00a6T\2\u0355\u0358\5\u008eH\2\u0356\u0357"+
		"\7W\2\2\u0357\u0359\5\u008eH\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2"+
		"\u0359\u038e\3\2\2\2\u035a\u035b\7\25\2\2\u035b\u035c\7\32\2\2\u035c\u035d"+
		"\5\u009eP\2\u035d\u035e\7Y\2\2\u035e\u035f\5\u008eH\2\u035f\u038e\3\2"+
		"\2\2\u0360\u0361\7\r\2\2\u0361\u0362\5\u00a6T\2\u0362\u0363\5\u008eH\2"+
		"\u0363\u038e\3\2\2\2\u0364\u0365\7\31\2\2\u0365\u0366\5\u008eH\2\u0366"+
		"\u0367\7\r\2\2\u0367\u0368\5\u00a6T\2\u0368\u0369\7;\2\2\u0369\u038e\3"+
		"\2\2\2\u036a\u038e\5\u0090I\2\u036b\u036c\7G\2\2\u036c\u036d\5\u00a6T"+
		"\2\u036d\u036e\5\u0098M\2\u036e\u038e\3\2\2\2\u036f\u0370\7E\2\2\u0370"+
		"\u0371\5\u00a6T\2\u0371\u0372\5(\25\2\u0372\u038e\3\2\2\2\u0373\u0375"+
		"\7\67\2\2\u0374\u0376\5\u00aeX\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2"+
		"\2\u0376\u0377\3\2\2\2\u0377\u038e\7;\2\2\u0378\u0379\7L\2\2\u0379\u037a"+
		"\5\u00aeX\2\u037a\u037b\7;\2\2\u037b\u038e\3\2\2\2\u037c\u037e\7B\2\2"+
		"\u037d\u037f\7e\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380\u038e\7;\2\2\u0381\u0383\7\63\2\2\u0382\u0384\7e\2\2\u0383"+
		"\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u038e\7;"+
		"\2\2\u0386\u038e\7;\2\2\u0387\u0388\5\u00aaV\2\u0388\u0389\7;\2\2\u0389"+
		"\u038e\3\2\2\2\u038a\u038b\7e\2\2\u038b\u038c\7N\2\2\u038c\u038e\5\u008e"+
		"H\2\u038d\u034a\3\2\2\2\u038d\u034b\3\2\2\2\u038d\u0353\3\2\2\2\u038d"+
		"\u035a\3\2\2\2\u038d\u0360\3\2\2\2\u038d\u0364\3\2\2\2\u038d\u036a\3\2"+
		"\2\2\u038d\u036b\3\2\2\2\u038d\u036f\3\2\2\2\u038d\u0373\3\2\2\2\u038d"+
		"\u0378\3\2\2\2\u038d\u037c\3\2\2\2\u038d\u0381\3\2\2\2\u038d\u0386\3\2"+
		"\2\2\u038d\u0387\3\2\2\2\u038d\u038a\3\2\2\2\u038e\u008f\3\2\2\2\u038f"+
		"\u0390\7@\2\2\u0390\u0391\7\32\2\2\u0391\u0392\5\u0094K\2\u0392\u0393"+
		"\7Y\2\2\u0393\u0397\5(\25\2\u0394\u0396\5\u0092J\2\u0395\u0394\3\2\2\2"+
		"\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039c"+
		"\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039b\7\7\2\2\u039b\u039d\5(\25\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03ae\3\2\2\2\u039e\u039f\7@"+
		"\2\2\u039f\u03ab\5(\25\2\u03a0\u03a2\5\u0092J\2\u03a1\u03a0\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a7\3\2"+
		"\2\2\u03a5\u03a6\7\7\2\2\u03a6\u03a8\5(\25\2\u03a7\u03a5\3\2\2\2\u03a7"+
		"\u03a8\3\2\2\2\u03a8\u03ac\3\2\2\2\u03a9\u03aa\7\7\2\2\u03aa\u03ac\5("+
		"\25\2\u03ab\u03a1\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad"+
		"\u038f\3\2\2\2\u03ad\u039e\3\2\2\2\u03ae\u0091\3\2\2\2\u03af\u03b0\7\64"+
		"\2\2\u03b0\u03b4\7\32\2\2\u03b1\u03b3\5:\36\2\u03b2\u03b1\3\2\2\2\u03b3"+
		"\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2"+
		"\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03bc\5^\60\2\u03b8\u03b9\7R\2\2\u03b9"+
		"\u03bb\5^\60\2\u03ba\u03b8\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf"+
		"\u03c0\7e\2\2\u03c0\u03c1\7Y\2\2\u03c1\u03c2\5(\25\2\u03c2\u0093\3\2\2"+
		"\2\u03c3\u03c8\5\u0096L\2\u03c4\u03c5\7;\2\2\u03c5\u03c7\5\u0096L\2\u03c6"+
		"\u03c4\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2"+
		"\2\2\u03c9\u03cc\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cd\7;\2\2\u03cc"+
		"\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u0095\3\2\2\2\u03ce\u03d0\5:"+
		"\36\2\u03cf\u03ce\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\5`"+
		"\61\2\u03d5\u03d6\5P)\2\u03d6\u03d7\7\23\2\2\u03d7\u03d8\5\u00aeX\2\u03d8"+
		"\u0097\3\2\2\2\u03d9\u03dd\7\17\2\2\u03da\u03dc\5\u009aN\2\u03db\u03da"+
		"\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u03e3\3\2\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e2\5\u009cO\2\u03e1\u03e0"+
		"\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e6\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e7\7=\2\2\u03e7\u0099\3\2"+
		"\2\2\u03e8\u03ea\5\u009cO\2\u03e9\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03f0\3\2\2\2\u03ed\u03ef\5*"+
		"\26\2\u03ee\u03ed\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u009b\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\7K"+
		"\2\2\u03f4\u03f5\5\u00acW\2\u03f5\u03f6\7N\2\2\u03f6\u03fe\3\2\2\2\u03f7"+
		"\u03f8\7K\2\2\u03f8\u03f9\5Z.\2\u03f9\u03fa\7N\2\2\u03fa\u03fe\3\2\2\2"+
		"\u03fb\u03fc\7\3\2\2\u03fc\u03fe\7N\2\2\u03fd\u03f3\3\2\2\2\u03fd\u03f7"+
		"\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u009d\3\2\2\2\u03ff\u040c\5\u00a2R"+
		"\2\u0400\u0402\5\u00a0Q\2\u0401\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402"+
		"\u0403\3\2\2\2\u0403\u0405\7;\2\2\u0404\u0406\5\u00aeX\2\u0405\u0404\3"+
		"\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\7;\2\2\u0408"+
		"\u040a\5\u00a4S\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c"+
		"\3\2\2\2\u040b\u03ff\3\2\2\2\u040b\u0401\3\2\2\2\u040c\u009f\3\2\2\2\u040d"+
		"\u0410\5\u008cG\2\u040e\u0410\5\u00a8U\2\u040f\u040d\3\2\2\2\u040f\u040e"+
		"\3\2\2\2\u0410\u00a1\3\2\2\2\u0411\u0413\5:\36\2\u0412\u0411\3\2\2\2\u0413"+
		"\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2"+
		"\2\2\u0416\u0414\3\2\2\2\u0417\u0418\5^\60\2\u0418\u0419\7e\2\2\u0419"+
		"\u041a\7N\2\2\u041a\u041b\5\u00aeX\2\u041b\u00a3\3\2\2\2\u041c\u041d\5"+
		"\u00a8U\2\u041d\u00a5\3\2\2\2\u041e\u041f\7\32\2\2\u041f\u0420\5\u00ae"+
		"X\2\u0420\u0421\7Y\2\2\u0421\u00a7\3\2\2\2\u0422\u0427\5\u00aeX\2\u0423"+
		"\u0424\7\35\2\2\u0424\u0426\5\u00aeX\2\u0425\u0423\3\2\2\2\u0426\u0429"+
		"\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u00a9\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u042a\u042b\5\u00aeX\2\u042b\u00ab\3\2\2\2\u042c\u042d"+
		"\5\u00aeX\2\u042d\u00ad\3\2\2\2\u042e\u042f\bX\1\2\u042f\u0430\t\7\2\2"+
		"\u0430\u043c\5\u00aeX\23\u0431\u0432\t\b\2\2\u0432\u043c\5\u00aeX\22\u0433"+
		"\u0434\7\32\2\2\u0434\u0435\5^\60\2\u0435\u0436\7Y\2\2\u0436\u0437\5\u00ae"+
		"X\21\u0437\u043c\3\2\2\2\u0438\u043c\5\u00b0Y\2\u0439\u043a\7\n\2\2\u043a"+
		"\u043c\5\u00b2Z\2\u043b\u042e\3\2\2\2\u043b\u0431\3\2\2\2\u043b\u0433"+
		"\3\2\2\2\u043b\u0438\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u04bb\3\2\2\2\u043d"+
		"\u043e\f\17\2\2\u043e\u043f\t\t\2\2\u043f\u04ba\5\u00aeX\20\u0440\u0441"+
		"\f\16\2\2\u0441\u0442\t\n\2\2\u0442\u04ba\5\u00aeX\17\u0443\u044b\f\r"+
		"\2\2\u0444\u0445\7\'\2\2\u0445\u044c\7\'\2\2\u0446\u0447\7T\2\2\u0447"+
		"\u0448\7T\2\2\u0448\u044c\7T\2\2\u0449\u044a\7T\2\2\u044a\u044c\7T\2\2"+
		"\u044b\u0444\3\2\2\2\u044b\u0446\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u044d"+
		"\3\2\2\2\u044d\u04ba\5\u00aeX\16\u044e\u0455\f\f\2\2\u044f\u0450\7\'\2"+
		"\2\u0450\u0456\7\23\2\2\u0451\u0452\7T\2\2\u0452\u0456\7\23\2\2\u0453"+
		"\u0456\7T\2\2\u0454\u0456\7\'\2\2\u0455\u044f\3\2\2\2\u0455\u0451\3\2"+
		"\2\2\u0455\u0453\3\2\2\2\u0455\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u04ba\5\u00aeX\r\u0458\u0459\f\n\2\2\u0459\u045a\t\13\2\2\u045a\u04ba"+
		"\5\u00aeX\13\u045b\u045c\f\t\2\2\u045c\u045d\7F\2\2\u045d\u04ba\5\u00ae"+
		"X\n\u045e\u045f\f\b\2\2\u045f\u0460\7\24\2\2\u0460\u04ba\5\u00aeX\t\u0461"+
		"\u0462\f\7\2\2\u0462\u0463\7R\2\2\u0463\u04ba\5\u00aeX\b\u0464\u0465\f"+
		"\6\2\2\u0465\u0466\7\21\2\2\u0466\u04ba\5\u00aeX\7\u0467\u0468\f\5\2\2"+
		"\u0468\u0469\7:\2\2\u0469\u04ba\5\u00aeX\6\u046a\u046b\f\4\2\2\u046b\u046c"+
		"\7A\2\2\u046c\u046d\5\u00aeX\2\u046d\u046e\7N\2\2\u046e\u046f\5\u00ae"+
		"X\5\u046f\u04ba\3\2\2\2\u0470\u0484\f\3\2\2\u0471\u0485\7\20\2\2\u0472"+
		"\u0485\7\4\2\2\u0473\u0485\7\34\2\2\u0474\u0485\7\60\2\2\u0475\u0485\7"+
		"\36\2\2\u0476\u0485\7\66\2\2\u0477\u0485\7\26\2\2\u0478\u0485\7\23\2\2"+
		"\u0479\u047a\7T\2\2\u047a\u047b\7T\2\2\u047b\u0485\7\23\2\2\u047c\u047d"+
		"\7T\2\2\u047d\u047e\7T\2\2\u047e\u047f\7T\2\2\u047f\u0485\7\23\2\2\u0480"+
		"\u0481\7\'\2\2\u0481\u0482\7\'\2\2\u0482\u0485\7\23\2\2\u0483\u0485\7"+
		"\6\2\2\u0484\u0471\3\2\2\2\u0484\u0472\3\2\2\2\u0484\u0473\3\2\2\2\u0484"+
		"\u0474\3\2\2\2\u0484\u0475\3\2\2\2\u0484\u0476\3\2\2\2\u0484\u0477\3\2"+
		"\2\2\u0484\u0478\3\2\2\2\u0484\u0479\3\2\2\2\u0484\u047c\3\2\2\2\u0484"+
		"\u0480\3\2\2\2\u0484\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u04ba\5\u00ae"+
		"X\4\u0487\u0488\f\34\2\2\u0488\u0489\7J\2\2\u0489\u04ba\7e\2\2\u048a\u048b"+
		"\f\33\2\2\u048b\u048c\7J\2\2\u048c\u04ba\7I\2\2\u048d\u048e\f\32\2\2\u048e"+
		"\u048f\7J\2\2\u048f\u0490\7X\2\2\u0490\u0492\7\32\2\2\u0491\u0493\5\u00a8"+
		"U\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u04ba\7Y\2\2\u0495\u0496\f\31\2\2\u0496\u0497\7J\2\2\u0497\u0498\7\n"+
		"\2\2\u0498\u0499\7e\2\2\u0499\u049b\7\32\2\2\u049a\u049c\5\u00a8U\2\u049b"+
		"\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u04ba\7Y"+
		"\2\2\u049e\u049f\f\30\2\2\u049f\u04a0\7J\2\2\u04a0\u04a1\7X\2\2\u04a1"+
		"\u04a2\7J\2\2\u04a2\u04a4\7e\2\2\u04a3\u04a5\5\u00c0a\2\u04a4\u04a3\3"+
		"\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04ba\3\2\2\2\u04a6\u04a7\f\27\2\2\u04a7"+
		"\u04a8\7J\2\2\u04a8\u04ba\5\u00b8]\2\u04a9\u04aa\f\26\2\2\u04aa\u04ab"+
		"\7O\2\2\u04ab\u04ac\5\u00aeX\2\u04ac\u04ad\7(\2\2\u04ad\u04ba\3\2\2\2"+
		"\u04ae\u04af\f\25\2\2\u04af\u04b1\7\32\2\2\u04b0\u04b2\5\u00a8U\2\u04b1"+
		"\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04ba\7Y"+
		"\2\2\u04b4\u04b5\f\24\2\2\u04b5\u04ba\t\f\2\2\u04b6\u04b7\f\13\2\2\u04b7"+
		"\u04b8\7<\2\2\u04b8\u04ba\5^\60\2\u04b9\u043d\3\2\2\2\u04b9\u0440\3\2"+
		"\2\2\u04b9\u0443\3\2\2\2\u04b9\u044e\3\2\2\2\u04b9\u0458\3\2\2\2\u04b9"+
		"\u045b\3\2\2\2\u04b9\u045e\3\2\2\2\u04b9\u0461\3\2\2\2\u04b9\u0464\3\2"+
		"\2\2\u04b9\u0467\3\2\2\2\u04b9\u046a\3\2\2\2\u04b9\u0470\3\2\2\2\u04b9"+
		"\u0487\3\2\2\2\u04b9\u048a\3\2\2\2\u04b9\u048d\3\2\2\2\u04b9\u0495\3\2"+
		"\2\2\u04b9\u049e\3\2\2\2\u04b9\u04a6\3\2\2\2\u04b9\u04a9\3\2\2\2\u04b9"+
		"\u04ae\3\2\2\2\u04b9\u04b4\3\2\2\2\u04b9\u04b6\3\2\2\2\u04ba\u04bd\3\2"+
		"\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u00af\3\2\2\2\u04bd"+
		"\u04bb\3\2\2\2\u04be\u04bf\7\32\2\2\u04bf\u04c0\5\u00aeX\2\u04c0\u04c1"+
		"\7Y\2\2\u04c1\u04ce\3\2\2\2\u04c2\u04ce\7I\2\2\u04c3\u04ce\7X\2\2\u04c4"+
		"\u04ce\5r:\2\u04c5\u04ce\7e\2\2\u04c6\u04c7\5^\60\2\u04c7\u04c8\7J\2\2"+
		"\u04c8\u04c9\79\2\2\u04c9\u04ce\3\2\2\2\u04ca\u04cb\7\16\2\2\u04cb\u04cc"+
		"\7J\2\2\u04cc\u04ce\79\2\2\u04cd\u04be\3\2\2\2\u04cd\u04c2\3\2\2\2\u04cd"+
		"\u04c3\3\2\2\2\u04cd\u04c4\3\2\2\2\u04cd\u04c5\3\2\2\2\u04cd\u04c6\3\2"+
		"\2\2\u04cd\u04ca\3\2\2\2\u04ce\u00b1\3\2\2\2\u04cf\u04d0\5\u00be`\2\u04d0"+
		"\u04d1\5\u00b4[\2\u04d1\u04d2\5\u00bc_\2\u04d2\u04d9\3\2\2\2\u04d3\u04d6"+
		"\5\u00b4[\2\u04d4\u04d7\5\u00ba^\2\u04d5\u04d7\5\u00bc_\2\u04d6\u04d4"+
		"\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04cf\3\2\2\2\u04d8"+
		"\u04d3\3\2\2\2\u04d9\u00b3\3\2\2\2\u04da\u04ee\5b\62\2\u04db\u04df\7e"+
		"\2\2\u04dc\u04e0\5\60\31\2\u04dd\u04de\7\'\2\2\u04de\u04e0\7T\2\2\u04df"+
		"\u04dc\3\2\2\2\u04df\u04dd\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04ea\3\2"+
		"\2\2\u04e1\u04e2\7J\2\2\u04e2\u04e6\7e\2\2\u04e3\u04e7\5\60\31\2\u04e4"+
		"\u04e5\7\'\2\2\u04e5\u04e7\7T\2\2\u04e6\u04e3\3\2\2\2\u04e6\u04e4\3\2"+
		"\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e1\3\2\2\2\u04e9"+
		"\u04ec\3\2\2\2\u04ea\u04e8\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ee\3\2"+
		"\2\2\u04ec\u04ea\3\2\2\2\u04ed\u04da\3\2\2\2\u04ed\u04db\3\2\2\2\u04ee"+
		"\u00b5\3\2\2\2\u04ef\u04f3\5\u00be`\2\u04f0\u04f1\7\'\2\2\u04f1\u04f3"+
		"\7T\2\2\u04f2\u04ef\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f5\7e\2\2\u04f5\u04f6\5\u00bc_\2\u04f6\u00b7\3"+
		"\2\2\2\u04f7\u04f8\5\u00be`\2\u04f8\u04f9\7e\2\2\u04f9\u04fa\5\u00c0a"+
		"\2\u04fa\u00b9\3\2\2\2\u04fb\u0518\7O\2\2\u04fc\u0501\7(\2\2\u04fd\u04fe"+
		"\7O\2\2\u04fe\u0500\7(\2\2\u04ff\u04fd\3\2\2\2\u0500\u0503\3\2\2\2\u0501"+
		"\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3\2\2\2\u0503\u0501\3\2"+
		"\2\2\u0504\u0519\5T+\2\u0505\u0506\5\u00aeX\2\u0506\u050d\7(\2\2\u0507"+
		"\u0508\7O\2\2\u0508\u0509\5\u00aeX\2\u0509\u050a\7(\2\2\u050a\u050c\3"+
		"\2\2\2\u050b\u0507\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050e\3\2\2\2\u050e\u0514\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0511\7O"+
		"\2\2\u0511\u0513\7(\2\2\u0512\u0510\3\2\2\2\u0513\u0516\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0519\3\2\2\2\u0516\u0514\3\2"+
		"\2\2\u0517\u0519\7(\2\2\u0518\u04fc\3\2\2\2\u0518\u0505\3\2\2\2\u0518"+
		"\u0517\3\2\2\2\u0519\u00bb\3\2\2\2\u051a\u051c\5\u00c0a\2\u051b\u051d"+
		"\5\36\20\2\u051c\u051b\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u00bd\3\2\2\2"+
		"\u051e\u051f\7\'\2\2\u051f\u0520\5.\30\2\u0520\u0521\7T\2\2\u0521\u00bf"+
		"\3\2\2\2\u0522\u0524\7\32\2\2\u0523\u0525\5\u00a8U\2\u0524\u0523\3\2\2"+
		"\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\7Y\2\2\u0527\u00c1"+
		"\3\2\2\2\u009e\u00c3\u00c8\u00ce\u00d6\u00df\u00e4\u00ea\u00ef\u00f4\u00f8"+
		"\u00fd\u0101\u0105\u010f\u0117\u011e\u0125\u0129\u012f\u0132\u013b\u013f"+
		"\u0142\u0146\u014b\u014f\u0157\u0160\u0165\u0167\u0170\u0175\u0178\u017f"+
		"\u0189\u0193\u0198\u019d\u01a0\u01a7\u01b0\u01b9\u01bb\u01c4\u01c7\u01cb"+
		"\u01d3\u01d8\u01dc\u01df\u01e5\u01e9\u01ee\u01f5\u01ff\u0206\u020b\u0212"+
		"\u021a\u0226\u022c\u0233\u023a\u0245\u024a\u0252\u0256\u0258\u0268\u0275"+
		"\u027d\u0280\u0284\u0289\u028d\u0297\u029c\u02a3\u02ae\u02b0\u02b5\u02be"+
		"\u02c4\u02cb\u02d4\u02df\u02e2\u02e9\u02f1\u02fb\u0303\u0306\u0309\u0314"+
		"\u031a\u0322\u0328\u032c\u0330\u0334\u0336\u033c\u0344\u034f\u0358\u0375"+
		"\u037e\u0383\u038d\u0397\u039c\u03a3\u03a7\u03ab\u03ad\u03b4\u03bc\u03c8"+
		"\u03cc\u03d1\u03dd\u03e3\u03eb\u03f0\u03fd\u0401\u0405\u0409\u040b\u040f"+
		"\u0414\u0427\u043b\u044b\u0455\u0484\u0492\u049b\u04a4\u04b1\u04b9\u04bb"+
		"\u04cd\u04d6\u04d8\u04df\u04e6\u04ea\u04ed\u04f2\u0501\u050d\u0514\u0518"+
		"\u051c\u0524";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}