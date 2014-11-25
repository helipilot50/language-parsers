// Generated from objc/ObjC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTORELEASEPOOL=1, CATCH=2, CLASS=3, DYNAMIC=4, ENCODE=5, END=6, FINALLY=7, 
		IMPLEMENTATION=8, INTERFACE=9, PACKAGE=10, PROTOCOL=11, OPTIONAL=12, PRIVATE=13, 
		PROPERTY=14, PROTECTED=15, PUBLIC=16, SELECTOR=17, SYNCHRONIZED=18, SYNTHESIZE=19, 
		THROW=20, TRY=21, SUPER=22, SELF=23, ABSTRACT=24, AUTO=25, BOOLEAN=26, 
		BREAK=27, BYCOPY=28, BYREF=29, CASE=30, CHAR=31, CONST=32, CONTINUE=33, 
		DEFAULT=34, DO=35, DOUBLE=36, ELSE=37, ENUM=38, EXTERN=39, FLOAT=40, FOR=41, 
		ID=42, IF=43, IN=44, INOUT=45, GOTO=46, INT=47, LONG=48, ONEWAY=49, OUT=50, 
		REGISTER=51, RETURN=52, SHORT=53, SIGNED=54, SIZEOF=55, STATIC=56, STRUCT=57, 
		SWITCH=58, TYPEDEF=59, UNION=60, UNSIGNED=61, VOID=62, VOLATILE=63, WHILE=64, 
		NS_OPTIONS=65, NS_ENUM=66, WWEAK=67, WUNSAFE_UNRETAINED=68, LPAREN=69, 
		RPAREN=70, LBRACE=71, RBRACE=72, LBRACK=73, RBRACK=74, SEMI=75, COMMA=76, 
		DOT=77, STRUCTACCESS=78, AT=79, ASSIGN=80, GT=81, LT=82, BANG=83, TILDE=84, 
		QUESTION=85, COLON=86, EQUAL=87, LE=88, GE=89, NOTEQUAL=90, AND=91, OR=92, 
		INC=93, DEC=94, ADD=95, SUB=96, MUL=97, DIV=98, BITAND=99, BITOR=100, 
		CARET=101, MOD=102, SHIFT_R=103, SHIFT_L=104, ADD_ASSIGN=105, SUB_ASSIGN=106, 
		MUL_ASSIGN=107, DIV_ASSIGN=108, AND_ASSIGN=109, OR_ASSIGN=110, XOR_ASSIGN=111, 
		MOD_ASSIGN=112, LSHIFT_ASSIGN=113, RSHIFT_ASSIGN=114, ELIPSIS=115, ASSIGNPA=116, 
		GETTER=117, NONATOMIC=118, SETTER=119, STRONG=120, RETAIN=121, READONLY=122, 
		READWRITE=123, WEAK=124, IDENTIFIER=125, CHARACTER_LITERAL=126, STRING_LITERAL=127, 
		HEX_LITERAL=128, DECIMAL_LITERAL=129, OCTAL_LITERAL=130, FLOATING_POINT_LITERAL=131, 
		IMPORT=132, INCLUDE=133, PRAGMA=134, WS=135, COMMENT=136, LINE_COMMENT=137, 
		HDEFINE=138, HIF=139, HELSE=140, HUNDEF=141, HIFNDEF=142, HENDIF=143;
	public static final String[] tokenNames = {
		"<INVALID>", "'@autoreleasepool'", "'@catch'", "'@class'", "'@dynamic'", 
		"'@encode'", "'@end'", "'@finally'", "'@implementation'", "'@interface'", 
		"'@package'", "'@protocol'", "'@optional'", "'@private'", "'@property'", 
		"'@protected'", "'@public'", "'@selector'", "'@synchronized'", "'@synthesize'", 
		"'@throw'", "'@try'", "'super'", "'self'", "'abstract'", "'auto'", "'boolean'", 
		"'break'", "'bycopy'", "'byref'", "'case'", "'char'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", "'float'", 
		"'for'", "'id'", "'if'", "'in'", "'inout'", "'goto'", "'int'", "'long'", 
		"'oneway'", "'out'", "'register'", "'return'", "'short'", "'signed'", 
		"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
		"'unsigned'", "'void'", "'volatile'", "'while'", "'NS_OPTIONS'", "'NS_ENUM'", 
		"'__weak'", "'__unsafe_unretained'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'->'", "'@'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'>>'", 
		"'<<'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'...'", "'assign'", "'getter'", "'nonatomic'", "'setter'", 
		"'strong'", "'retain'", "'readonly'", "'readwrite'", "'weak'", "IDENTIFIER", 
		"CHARACTER_LITERAL", "STRING_LITERAL", "HEX_LITERAL", "DECIMAL_LITERAL", 
		"OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "IMPORT", "INCLUDE", "PRAGMA", 
		"WS", "COMMENT", "LINE_COMMENT", "HDEFINE", "HIF", "HELSE", "HUNDEF", 
		"HIFNDEF", "HENDIF"
	};
	public static final int
		RULE_translation_unit = 0, RULE_external_declaration = 1, RULE_preprocessor_declaration = 2, 
		RULE_class_interface = 3, RULE_category_interface = 4, RULE_class_implementation = 5, 
		RULE_category_implementation = 6, RULE_protocol_declaration = 7, RULE_protocol_declaration_list = 8, 
		RULE_class_declaration_list = 9, RULE_class_list = 10, RULE_protocol_reference_list = 11, 
		RULE_protocol_list = 12, RULE_property_declaration = 13, RULE_property_attributes_declaration = 14, 
		RULE_property_attributes_list = 15, RULE_property_attribute = 16, RULE_class_name = 17, 
		RULE_superclass_name = 18, RULE_category_name = 19, RULE_protocol_name = 20, 
		RULE_instance_variables = 21, RULE_visibility_specification = 22, RULE_interface_declaration_list = 23, 
		RULE_class_method_declaration = 24, RULE_instance_method_declaration = 25, 
		RULE_method_declaration = 26, RULE_implementation_definition_list = 27, 
		RULE_class_method_definition = 28, RULE_instance_method_definition = 29, 
		RULE_method_definition = 30, RULE_method_selector = 31, RULE_keyword_declarator = 32, 
		RULE_selector = 33, RULE_method_type = 34, RULE_property_implementation = 35, 
		RULE_property_synthesize_list = 36, RULE_property_synthesize_item = 37, 
		RULE_block_type = 38, RULE_type_specifier = 39, RULE_type_qualifier = 40, 
		RULE_protocol_qualifier = 41, RULE_primary_expression = 42, RULE_dictionary_pair = 43, 
		RULE_dictionary_expression = 44, RULE_array_expression = 45, RULE_box_expression = 46, 
		RULE_block_parameters = 47, RULE_block_expression = 48, RULE_message_expression = 49, 
		RULE_receiver = 50, RULE_message_selector = 51, RULE_keyword_argument = 52, 
		RULE_selector_expression = 53, RULE_selector_name = 54, RULE_protocol_expression = 55, 
		RULE_encode_expression = 56, RULE_type_variable_declarator = 57, RULE_try_statement = 58, 
		RULE_catch_statement = 59, RULE_finally_statement = 60, RULE_throw_statement = 61, 
		RULE_try_block = 62, RULE_synchronized_statement = 63, RULE_autorelease_statement = 64, 
		RULE_function_definition = 65, RULE_declaration = 66, RULE_declaration_specifiers = 67, 
		RULE_arc_behaviour_specifier = 68, RULE_storage_class_specifier = 69, 
		RULE_init_declarator_list = 70, RULE_init_declarator = 71, RULE_struct_or_union_specifier = 72, 
		RULE_struct_declaration = 73, RULE_specifier_qualifier_list = 74, RULE_struct_declarator_list = 75, 
		RULE_struct_declarator = 76, RULE_enum_specifier = 77, RULE_enumerator_list = 78, 
		RULE_enumerator = 79, RULE_pointer = 80, RULE_declarator = 81, RULE_direct_declarator = 82, 
		RULE_declarator_suffix = 83, RULE_parameter_list = 84, RULE_parameter_declaration = 85, 
		RULE_initializer = 86, RULE_type_name = 87, RULE_abstract_declarator = 88, 
		RULE_abstract_declarator_suffix = 89, RULE_parameter_declaration_list = 90, 
		RULE_statement_list = 91, RULE_statement = 92, RULE_labeled_statement = 93, 
		RULE_compound_statement = 94, RULE_selection_statement = 95, RULE_for_in_statement = 96, 
		RULE_for_statement = 97, RULE_while_statement = 98, RULE_do_statement = 99, 
		RULE_iteration_statement = 100, RULE_jump_statement = 101, RULE_expression = 102, 
		RULE_assignment_expression = 103, RULE_assignment_operator = 104, RULE_conditional_expression = 105, 
		RULE_constant_expression = 106, RULE_logical_or_expression = 107, RULE_logical_and_expression = 108, 
		RULE_inclusive_or_expression = 109, RULE_exclusive_or_expression = 110, 
		RULE_and_expression = 111, RULE_equality_expression = 112, RULE_relational_expression = 113, 
		RULE_shift_expression = 114, RULE_additive_expression = 115, RULE_multiplicative_expression = 116, 
		RULE_cast_expression = 117, RULE_unary_expression = 118, RULE_unary_operator = 119, 
		RULE_postfix_expression = 120, RULE_argument_expression_list = 121, RULE_identifier = 122, 
		RULE_constant = 123;
	public static final String[] ruleNames = {
		"translation_unit", "external_declaration", "preprocessor_declaration", 
		"class_interface", "category_interface", "class_implementation", "category_implementation", 
		"protocol_declaration", "protocol_declaration_list", "class_declaration_list", 
		"class_list", "protocol_reference_list", "protocol_list", "property_declaration", 
		"property_attributes_declaration", "property_attributes_list", "property_attribute", 
		"class_name", "superclass_name", "category_name", "protocol_name", "instance_variables", 
		"visibility_specification", "interface_declaration_list", "class_method_declaration", 
		"instance_method_declaration", "method_declaration", "implementation_definition_list", 
		"class_method_definition", "instance_method_definition", "method_definition", 
		"method_selector", "keyword_declarator", "selector", "method_type", "property_implementation", 
		"property_synthesize_list", "property_synthesize_item", "block_type", 
		"type_specifier", "type_qualifier", "protocol_qualifier", "primary_expression", 
		"dictionary_pair", "dictionary_expression", "array_expression", "box_expression", 
		"block_parameters", "block_expression", "message_expression", "receiver", 
		"message_selector", "keyword_argument", "selector_expression", "selector_name", 
		"protocol_expression", "encode_expression", "type_variable_declarator", 
		"try_statement", "catch_statement", "finally_statement", "throw_statement", 
		"try_block", "synchronized_statement", "autorelease_statement", "function_definition", 
		"declaration", "declaration_specifiers", "arc_behaviour_specifier", "storage_class_specifier", 
		"init_declarator_list", "init_declarator", "struct_or_union_specifier", 
		"struct_declaration", "specifier_qualifier_list", "struct_declarator_list", 
		"struct_declarator", "enum_specifier", "enumerator_list", "enumerator", 
		"pointer", "declarator", "direct_declarator", "declarator_suffix", "parameter_list", 
		"parameter_declaration", "initializer", "type_name", "abstract_declarator", 
		"abstract_declarator_suffix", "parameter_declaration_list", "statement_list", 
		"statement", "labeled_statement", "compound_statement", "selection_statement", 
		"for_in_statement", "for_statement", "while_statement", "do_statement", 
		"iteration_statement", "jump_statement", "expression", "assignment_expression", 
		"assignment_operator", "conditional_expression", "constant_expression", 
		"logical_or_expression", "logical_and_expression", "inclusive_or_expression", 
		"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "unary_expression", "unary_operator", "postfix_expression", 
		"argument_expression_list", "identifier", "constant"
	};

	@Override
	public String getGrammarFileName() { return "ObjC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Translation_unitContext extends ParserRuleContext {
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public TerminalNode EOF() { return getToken(ObjCParser.EOF, 0); }
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248); external_declaration();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << PROTOCOL) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (LPAREN - 65)) | (1L << (MUL - 65)) | (1L << (IDENTIFIER - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (IMPORT - 132)) | (1L << (INCLUDE - 132)) | (1L << (COMMENT - 132)) | (1L << (LINE_COMMENT - 132)))) != 0) );
			setState(253); match(EOF);
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

	public static class External_declarationContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ObjCParser.COMMENT, 0); }
		public Class_implementationContext class_implementation() {
			return getRuleContext(Class_implementationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Protocol_declaration_listContext protocol_declaration_list() {
			return getRuleContext(Protocol_declaration_listContext.class,0);
		}
		public Class_interfaceContext class_interface() {
			return getRuleContext(Class_interfaceContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(ObjCParser.LINE_COMMENT, 0); }
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Class_declaration_listContext class_declaration_list() {
			return getRuleContext(Class_declaration_listContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Category_interfaceContext category_interface() {
			return getRuleContext(Category_interfaceContext.class,0);
		}
		public Preprocessor_declarationContext preprocessor_declaration() {
			return getRuleContext(Preprocessor_declarationContext.class,0);
		}
		public Category_implementationContext category_implementation() {
			return getRuleContext(Category_implementationContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExternal_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); match(COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(LINE_COMMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257); preprocessor_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258); function_definition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259); declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260); class_interface();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261); class_implementation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(262); category_interface();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(263); category_implementation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(264); protocol_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(265); protocol_declaration_list();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(266); class_declaration_list();
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

	public static class Preprocessor_declarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ObjCParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(ObjCParser.INCLUDE, 0); }
		public Preprocessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPreprocessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPreprocessor_declaration(this);
		}
	}

	public final Preprocessor_declarationContext preprocessor_declaration() throws RecognitionException {
		Preprocessor_declarationContext _localctx = new Preprocessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==IMPORT || _la==INCLUDE) ) {
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

	public static class Class_interfaceContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Class_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_interface(this);
		}
	}

	public final Class_interfaceContext class_interface() throws RecognitionException {
		Class_interfaceContext _localctx = new Class_interfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(INTERFACE);
			setState(272); class_name();
			setState(275);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(273); match(COLON);
				setState(274); superclass_name();
				}
			}

			setState(278);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(277); protocol_reference_list();
				}
			}

			setState(281);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(280); instance_variables();
				}
			}

			setState(284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(283); interface_declaration_list();
				}
			}

			setState(286); match(END);
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

	public static class Category_interfaceContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Category_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_interface(this);
		}
	}

	public final Category_interfaceContext category_interface() throws RecognitionException {
		Category_interfaceContext _localctx = new Category_interfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_category_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); match(INTERFACE);
			setState(289); class_name();
			setState(290); match(LPAREN);
			setState(292);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(291); category_name();
				}
			}

			setState(294); match(RPAREN);
			setState(296);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(295); protocol_reference_list();
				}
			}

			setState(299);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(298); instance_variables();
				}
			}

			setState(302);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(301); interface_declaration_list();
				}
			}

			setState(304); match(END);
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

	public static class Class_implementationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Class_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_implementation(this);
		}
	}

	public final Class_implementationContext class_implementation() throws RecognitionException {
		Class_implementationContext _localctx = new Class_implementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(IMPLEMENTATION);
			{
			setState(307); class_name();
			setState(310);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(308); match(COLON);
				setState(309); superclass_name();
				}
			}

			setState(313);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(312); instance_variables();
				}
			}

			setState(316);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (LPAREN - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(315); implementation_definition_list();
				}
			}

			}
			setState(318); match(END);
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

	public static class Category_implementationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Category_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_implementation(this);
		}
	}

	public final Category_implementationContext category_implementation() throws RecognitionException {
		Category_implementationContext _localctx = new Category_implementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_category_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(IMPLEMENTATION);
			{
			setState(321); class_name();
			setState(322); match(LPAREN);
			setState(323); category_name();
			setState(324); match(RPAREN);
			setState(326);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (LPAREN - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(325); implementation_definition_list();
				}
			}

			}
			setState(328); match(END);
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

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Interface_declaration_listContext interface_declaration_list(int i) {
			return getRuleContext(Interface_declaration_listContext.class,i);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public List<Interface_declaration_listContext> interface_declaration_list() {
			return getRuleContexts(Interface_declaration_listContext.class);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(PROTOCOL);
			{
			setState(331); protocol_name();
			setState(333);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(332); protocol_reference_list();
				}
			}

			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(335); interface_declaration_list();
				}
				break;
			}
			setState(339);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(338); match(OPTIONAL);
				}
			}

			setState(342);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(341); interface_declaration_list();
				}
			}

			}
			setState(344); match(END);
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

	public static class Protocol_declaration_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration_list(this);
		}
	}

	public final Protocol_declaration_listContext protocol_declaration_list() throws RecognitionException {
		Protocol_declaration_listContext _localctx = new Protocol_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocol_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(346); match(PROTOCOL);
			setState(347); protocol_list();
			setState(348); match(SEMI);
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

	public static class Class_declaration_listContext extends ParserRuleContext {
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public Class_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_declaration_list(this);
		}
	}

	public final Class_declaration_listContext class_declaration_list() throws RecognitionException {
		Class_declaration_listContext _localctx = new Class_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_class_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(350); match(CLASS);
			setState(351); class_list();
			setState(352); match(SEMI);
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

	public static class Class_listContext extends ParserRuleContext {
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_list(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); class_name();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(355); match(COMMA);
				setState(356); class_name();
				}
				}
				setState(361);
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

	public static class Protocol_reference_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_reference_list(this);
		}
	}

	public final Protocol_reference_listContext protocol_reference_list() throws RecognitionException {
		Protocol_reference_listContext _localctx = new Protocol_reference_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocol_reference_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(362); match(LT);
			setState(363); protocol_list();
			setState(364); match(GT);
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

	public static class Protocol_listContext extends ParserRuleContext {
		public List<Protocol_nameContext> protocol_name() {
			return getRuleContexts(Protocol_nameContext.class);
		}
		public Protocol_nameContext protocol_name(int i) {
			return getRuleContext(Protocol_nameContext.class,i);
		}
		public Protocol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_list(this);
		}
	}

	public final Protocol_listContext protocol_list() throws RecognitionException {
		Protocol_listContext _localctx = new Protocol_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); protocol_name();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(367); match(COMMA);
				setState(368); protocol_name();
				}
				}
				setState(373);
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

	public static class Property_declarationContext extends ParserRuleContext {
		public Property_attributes_declarationContext property_attributes_declaration() {
			return getRuleContext(Property_attributes_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_declaration(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(PROPERTY);
			setState(376);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(375); property_attributes_declaration();
				}
			}

			setState(378); struct_declaration();
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

	public static class Property_attributes_declarationContext extends ParserRuleContext {
		public Property_attributes_listContext property_attributes_list() {
			return getRuleContext(Property_attributes_listContext.class,0);
		}
		public Property_attributes_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_declaration(this);
		}
	}

	public final Property_attributes_declarationContext property_attributes_declaration() throws RecognitionException {
		Property_attributes_declarationContext _localctx = new Property_attributes_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_property_attributes_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(LPAREN);
			setState(381); property_attributes_list();
			setState(382); match(RPAREN);
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

	public static class Property_attributes_listContext extends ParserRuleContext {
		public List<Property_attributeContext> property_attribute() {
			return getRuleContexts(Property_attributeContext.class);
		}
		public Property_attributeContext property_attribute(int i) {
			return getRuleContext(Property_attributeContext.class,i);
		}
		public Property_attributes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_list(this);
		}
	}

	public final Property_attributes_listContext property_attributes_list() throws RecognitionException {
		Property_attributes_listContext _localctx = new Property_attributes_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property_attributes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); property_attribute();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385); match(COMMA);
				setState(386); property_attribute();
				}
				}
				setState(391);
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

	public static class Property_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Property_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attribute(this);
		}
	}

	public final Property_attributeContext property_attribute() throws RecognitionException {
		Property_attributeContext _localctx = new Property_attributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_attribute);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case NONATOMIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); match(NONATOMIC);
				}
				break;
			case ASSIGNPA:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); match(ASSIGNPA);
				}
				break;
			case WEAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(394); match(WEAK);
				}
				break;
			case STRONG:
				enterOuterAlt(_localctx, 4);
				{
				setState(395); match(STRONG);
				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(396); match(RETAIN);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(397); match(READONLY);
				}
				break;
			case READWRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(398); match(READWRITE);
				}
				break;
			case RPAREN:
			case COMMA:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case GETTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(400); match(GETTER);
				setState(401); match(ASSIGN);
				setState(402); match(IDENTIFIER);
				}
				break;
			case SETTER:
				enterOuterAlt(_localctx, 10);
				{
				setState(403); match(SETTER);
				setState(404); match(ASSIGN);
				setState(405); match(IDENTIFIER);
				setState(406); match(COLON);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(407); match(IDENTIFIER);
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

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); match(IDENTIFIER);
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

	public static class Superclass_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSuperclass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSuperclass_name(this);
		}
	}

	public final Superclass_nameContext superclass_name() throws RecognitionException {
		Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_superclass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); match(IDENTIFIER);
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

	public static class Category_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Category_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_name(this);
		}
	}

	public final Category_nameContext category_name() throws RecognitionException {
		Category_nameContext _localctx = new Category_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_category_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(IDENTIFIER);
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

	public static class Protocol_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_name(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(IDENTIFIER);
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

	public static class Instance_variablesContext extends ParserRuleContext {
		public Visibility_specificationContext visibility_specification() {
			return getRuleContext(Visibility_specificationContext.class,0);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Instance_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_variables(this);
		}
	}

	public final Instance_variablesContext instance_variables() throws RecognitionException {
		Instance_variablesContext _localctx = new Instance_variablesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_instance_variables);
		int _la;
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); match(LBRACE);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					{
					setState(419); struct_declaration();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425); match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426); match(LBRACE);
				setState(427); visibility_specification();
				setState(429); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(428); struct_declaration();
					}
					}
					setState(431); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
				setState(433); match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435); match(LBRACE);
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(436); struct_declaration();
					}
					}
					setState(439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
				setState(441); instance_variables();
				setState(442); match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444); match(LBRACE);
				setState(445); visibility_specification();
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(446); struct_declaration();
					}
					}
					setState(449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
				setState(451); instance_variables();
				setState(452); match(RBRACE);
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

	public static class Visibility_specificationContext extends ParserRuleContext {
		public Visibility_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterVisibility_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitVisibility_specification(this);
		}
	}

	public final Visibility_specificationContext visibility_specification() throws RecognitionException {
		Visibility_specificationContext _localctx = new Visibility_specificationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_visibility_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
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

	public static class Interface_declaration_listContext extends ParserRuleContext {
		public Instance_method_declarationContext instance_method_declaration(int i) {
			return getRuleContext(Instance_method_declarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Class_method_declarationContext class_method_declaration(int i) {
			return getRuleContext(Class_method_declarationContext.class,i);
		}
		public Property_declarationContext property_declaration(int i) {
			return getRuleContext(Property_declarationContext.class,i);
		}
		public List<Instance_method_declarationContext> instance_method_declaration() {
			return getRuleContexts(Instance_method_declarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Property_declarationContext> property_declaration() {
			return getRuleContexts(Property_declarationContext.class);
		}
		public List<Class_method_declarationContext> class_method_declaration() {
			return getRuleContexts(Class_method_declarationContext.class);
		}
		public Interface_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInterface_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInterface_declaration_list(this);
		}
	}

	public final Interface_declaration_listContext interface_declaration_list() throws RecognitionException {
		Interface_declaration_listContext _localctx = new Interface_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interface_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(462);
					switch (_input.LA(1)) {
					case AUTO:
					case BYCOPY:
					case BYREF:
					case CHAR:
					case CONST:
					case DOUBLE:
					case ENUM:
					case EXTERN:
					case FLOAT:
					case ID:
					case IN:
					case INOUT:
					case INT:
					case LONG:
					case ONEWAY:
					case OUT:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case STATIC:
					case STRUCT:
					case TYPEDEF:
					case UNION:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case NS_OPTIONS:
					case NS_ENUM:
					case WWEAK:
					case WUNSAFE_UNRETAINED:
					case IDENTIFIER:
						{
						setState(458); declaration();
						}
						break;
					case ADD:
						{
						setState(459); class_method_declaration();
						}
						break;
					case SUB:
						{
						setState(460); instance_method_declaration();
						}
						break;
					case PROPERTY:
						{
						setState(461); property_declaration();
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
				setState(464); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Class_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_declaration(this);
		}
	}

	public final Class_method_declarationContext class_method_declaration() throws RecognitionException {
		Class_method_declarationContext _localctx = new Class_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_class_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466); match(ADD);
			setState(467); method_declaration();
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

	public static class Instance_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Instance_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_declaration(this);
		}
	}

	public final Instance_method_declarationContext instance_method_declaration() throws RecognitionException {
		Instance_method_declarationContext _localctx = new Instance_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instance_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(469); match(SUB);
			setState(470); method_declaration();
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

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(472); method_type();
				}
			}

			setState(475); method_selector();
			setState(476); match(SEMI);
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

	public static class Implementation_definition_listContext extends ParserRuleContext {
		public List<Class_method_definitionContext> class_method_definition() {
			return getRuleContexts(Class_method_definitionContext.class);
		}
		public Instance_method_definitionContext instance_method_definition(int i) {
			return getRuleContext(Instance_method_definitionContext.class,i);
		}
		public Class_method_definitionContext class_method_definition(int i) {
			return getRuleContext(Class_method_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Property_implementationContext property_implementation(int i) {
			return getRuleContext(Property_implementationContext.class,i);
		}
		public List<Property_implementationContext> property_implementation() {
			return getRuleContexts(Property_implementationContext.class);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Instance_method_definitionContext> instance_method_definition() {
			return getRuleContexts(Instance_method_definitionContext.class);
		}
		public Implementation_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterImplementation_definition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitImplementation_definition_list(this);
		}
	}

	public final Implementation_definition_listContext implementation_definition_list() throws RecognitionException {
		Implementation_definition_listContext _localctx = new Implementation_definition_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_implementation_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(483);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(478); function_definition();
					}
					break;
				case 2:
					{
					setState(479); declaration();
					}
					break;
				case 3:
					{
					setState(480); class_method_definition();
					}
					break;
				case 4:
					{
					setState(481); instance_method_definition();
					}
					break;
				case 5:
					{
					setState(482); property_implementation();
					}
					break;
				}
				}
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (LPAREN - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
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

	public static class Class_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Class_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_definition(this);
		}
	}

	public final Class_method_definitionContext class_method_definition() throws RecognitionException {
		Class_method_definitionContext _localctx = new Class_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_class_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487); match(ADD);
			setState(488); method_definition();
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

	public static class Instance_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Instance_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_definition(this);
		}
	}

	public final Instance_method_definitionContext instance_method_definition() throws RecognitionException {
		Instance_method_definitionContext _localctx = new Instance_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_instance_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(490); match(SUB);
			setState(491); method_definition();
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

	public static class Method_definitionContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_definition(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(493); method_type();
				}
			}

			setState(496); method_selector();
			setState(498);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (MUL - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(497); init_declarator_list();
				}
			}

			setState(501);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(500); match(SEMI);
				}
			}

			setState(503); compound_statement();
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

	public static class Method_selectorContext extends ParserRuleContext {
		public List<Keyword_declaratorContext> keyword_declarator() {
			return getRuleContexts(Keyword_declaratorContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_declaratorContext keyword_declarator(int i) {
			return getRuleContext(Keyword_declaratorContext.class,i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_selector(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_method_selector);
		try {
			int _alt;
			setState(514);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505); selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(507); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(506); keyword_declarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(509); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(512);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(511); parameter_list();
					}
					break;
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

	public static class Keyword_declaratorContext extends ParserRuleContext {
		public List<Method_typeContext> method_type() {
			return getRuleContexts(Method_typeContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Method_typeContext method_type(int i) {
			return getRuleContext(Method_typeContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Keyword_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_declarator(this);
		}
	}

	public final Keyword_declaratorContext keyword_declarator() throws RecognitionException {
		Keyword_declaratorContext _localctx = new Keyword_declaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keyword_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(516); selector();
				}
			}

			setState(519); match(COLON);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(520); method_type();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526); match(IDENTIFIER);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(IDENTIFIER);
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

	public static class Method_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_type(this);
		}
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); match(LPAREN);
			setState(531); type_name();
			setState(532); match(RPAREN);
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

	public static class Property_implementationContext extends ParserRuleContext {
		public Property_synthesize_listContext property_synthesize_list() {
			return getRuleContext(Property_synthesize_listContext.class,0);
		}
		public Property_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_implementation(this);
		}
	}

	public final Property_implementationContext property_implementation() throws RecognitionException {
		Property_implementationContext _localctx = new Property_implementationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_property_implementation);
		try {
			setState(542);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(534); match(SYNTHESIZE);
				setState(535); property_synthesize_list();
				setState(536); match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(538); match(DYNAMIC);
				setState(539); property_synthesize_list();
				setState(540); match(SEMI);
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

	public static class Property_synthesize_listContext extends ParserRuleContext {
		public List<Property_synthesize_itemContext> property_synthesize_item() {
			return getRuleContexts(Property_synthesize_itemContext.class);
		}
		public Property_synthesize_itemContext property_synthesize_item(int i) {
			return getRuleContext(Property_synthesize_itemContext.class,i);
		}
		public Property_synthesize_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_list(this);
		}
	}

	public final Property_synthesize_listContext property_synthesize_list() throws RecognitionException {
		Property_synthesize_listContext _localctx = new Property_synthesize_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_property_synthesize_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); property_synthesize_item();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(545); match(COMMA);
				setState(546); property_synthesize_item();
				}
				}
				setState(551);
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

	public static class Property_synthesize_itemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjCParser.IDENTIFIER); }
		public Property_synthesize_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_item(this);
		}
	}

	public final Property_synthesize_itemContext property_synthesize_item() throws RecognitionException {
		Property_synthesize_itemContext _localctx = new Property_synthesize_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_property_synthesize_item);
		try {
			setState(556);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552); match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); match(IDENTIFIER);
				setState(554); match(ASSIGN);
				setState(555); match(IDENTIFIER);
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

	public static class Block_typeContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_type(this);
		}
	}

	public final Block_typeContext block_type() throws RecognitionException {
		Block_typeContext _localctx = new Block_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); type_specifier();
			setState(559); match(LPAREN);
			setState(560); match(CARET);
			setState(562);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(561); type_specifier();
				}
			}

			setState(564); match(RPAREN);
			setState(566);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(565); block_parameters();
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_specifier);
		int _la;
		try {
			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568); match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569); match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570); match(SHORT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(571); match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(572); match(LONG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(573); match(FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(574); match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(575); match(SIGNED);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(576); match(UNSIGNED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(577); match(ID);
				setState(579);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(578); protocol_reference_list();
					}
				}

				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(581); class_name();
				setState(583);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(582); protocol_reference_list();
					}
				}

				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(585); struct_or_union_specifier();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(586); enum_specifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(587); match(IDENTIFIER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(588); match(IDENTIFIER);
				setState(589); pointer();
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

	public static class Type_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext protocol_qualifier() {
			return getRuleContext(Protocol_qualifierContext.class,0);
		}
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_qualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type_qualifier);
		try {
			setState(595);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(592); match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(593); match(VOLATILE);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(594); protocol_qualifier();
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

	public static class Protocol_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_qualifier(this);
		}
	}

	public final Protocol_qualifierContext protocol_qualifier() throws RecognitionException {
		Protocol_qualifierContext _localctx = new Protocol_qualifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_protocol_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0)) ) {
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public Dictionary_expressionContext dictionary_expression() {
			return getRuleContext(Dictionary_expressionContext.class,0);
		}
		public Box_expressionContext box_expression() {
			return getRuleContext(Box_expressionContext.class,0);
		}
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Encode_expressionContext encode_expression() {
			return getRuleContext(Encode_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ObjCParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_expressionContext array_expression() {
			return getRuleContext(Array_expressionContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Protocol_expressionContext protocol_expression() {
			return getRuleContext(Protocol_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primary_expression);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599); match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600); constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601); match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(602); match(LPAREN);
				setState(603); expression();
				setState(604); match(RPAREN);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(606); match(SELF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(607); match(SUPER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(608); message_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(609); selector_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(610); protocol_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(611); encode_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(612); dictionary_expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(613); array_expression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(614); box_expression();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(615); block_expression();
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

	public static class Dictionary_pairContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public Dictionary_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDictionary_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDictionary_pair(this);
		}
	}

	public final Dictionary_pairContext dictionary_pair() throws RecognitionException {
		Dictionary_pairContext _localctx = new Dictionary_pairContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dictionary_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); postfix_expression();
			setState(619); match(COLON);
			setState(620); postfix_expression();
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

	public static class Dictionary_expressionContext extends ParserRuleContext {
		public List<Dictionary_pairContext> dictionary_pair() {
			return getRuleContexts(Dictionary_pairContext.class);
		}
		public Dictionary_pairContext dictionary_pair(int i) {
			return getRuleContext(Dictionary_pairContext.class,i);
		}
		public Dictionary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDictionary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDictionary_expression(this);
		}
	}

	public final Dictionary_expressionContext dictionary_expression() throws RecognitionException {
		Dictionary_expressionContext _localctx = new Dictionary_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dictionary_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(AT);
			setState(623); match(LBRACE);
			setState(625);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
				{
				setState(624); dictionary_pair();
				}
			}

			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(627); match(COMMA);
					setState(628); dictionary_pair();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(635);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(634); match(COMMA);
				}
			}

			setState(637); match(RBRACE);
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

	public static class Array_expressionContext extends ParserRuleContext {
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public Array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArray_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArray_expression(this);
		}
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_array_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639); match(AT);
			setState(640); match(LBRACK);
			setState(642);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
				{
				setState(641); postfix_expression();
				}
			}

			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(644); match(COMMA);
					setState(645); postfix_expression();
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(652);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(651); match(COMMA);
				}
			}

			setState(654); match(RBRACK);
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

	public static class Box_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Box_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBox_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBox_expression(this);
		}
	}

	public final Box_expressionContext box_expression() throws RecognitionException {
		Box_expressionContext _localctx = new Box_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_box_expression);
		try {
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656); match(AT);
				setState(657); match(LPAREN);
				setState(658); postfix_expression();
				setState(659); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); match(AT);
				setState(662); constant();
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

	public static class Block_parametersContext extends ParserRuleContext {
		public Type_variable_declaratorContext type_variable_declarator(int i) {
			return getRuleContext(Type_variable_declaratorContext.class,i);
		}
		public List<Type_variable_declaratorContext> type_variable_declarator() {
			return getRuleContexts(Type_variable_declaratorContext.class);
		}
		public Block_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_parameters(this);
		}
	}

	public final Block_parametersContext block_parameters() throws RecognitionException {
		Block_parametersContext _localctx = new Block_parametersContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(LPAREN);
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(666); type_variable_declarator();
				}
				break;
			case 2:
				{
				setState(667); match(VOID);
				}
				break;
			}
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(670); match(COMMA);
				setState(671); type_variable_declarator();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677); match(RPAREN);
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

	public static class Block_expressionContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public Block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterBlock_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitBlock_expression(this);
		}
	}

	public final Block_expressionContext block_expression() throws RecognitionException {
		Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_block_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); match(CARET);
			setState(681);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
				{
				setState(680); type_specifier();
				}
			}

			setState(684);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(683); block_parameters();
				}
			}

			setState(686); compound_statement();
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

	public static class Message_expressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public Message_selectorContext message_selector() {
			return getRuleContext(Message_selectorContext.class,0);
		}
		public Message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_expression(this);
		}
	}

	public final Message_expressionContext message_expression() throws RecognitionException {
		Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_message_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); match(LBRACK);
			setState(689); receiver();
			setState(690); message_selector();
			setState(691); match(RBRACK);
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

	public static class ReceiverContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_receiver);
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693); expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694); class_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695); match(SUPER);
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

	public static class Message_selectorContext extends ParserRuleContext {
		public List<Keyword_argumentContext> keyword_argument() {
			return getRuleContexts(Keyword_argumentContext.class);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public Keyword_argumentContext keyword_argument(int i) {
			return getRuleContext(Keyword_argumentContext.class,i);
		}
		public Message_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_selector(this);
		}
	}

	public final Message_selectorContext message_selector() throws RecognitionException {
		Message_selectorContext _localctx = new Message_selectorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_message_selector);
		int _la;
		try {
			setState(704);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698); selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(699); keyword_argument();
					}
					}
					setState(702); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
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

	public static class Keyword_argumentContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Keyword_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_argument(this);
		}
	}

	public final Keyword_argumentContext keyword_argument() throws RecognitionException {
		Keyword_argumentContext _localctx = new Keyword_argumentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_keyword_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(706); selector();
				}
			}

			setState(709); match(COLON);
			setState(710); expression();
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

	public static class Selector_expressionContext extends ParserRuleContext {
		public Selector_nameContext selector_name() {
			return getRuleContext(Selector_nameContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_expression(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); match(SELECTOR);
			setState(713); match(LPAREN);
			setState(714); selector_name();
			setState(715); match(RPAREN);
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

	public static class Selector_nameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public Selector_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_name(this);
		}
	}

	public final Selector_nameContext selector_name() throws RecognitionException {
		Selector_nameContext _localctx = new Selector_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_selector_name);
		int _la;
		try {
			setState(726);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717); selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(719);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(718); selector();
						}
					}

					setState(721); match(COLON);
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COLON || _la==IDENTIFIER );
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

	public static class Protocol_expressionContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_expression(this);
		}
	}

	public final Protocol_expressionContext protocol_expression() throws RecognitionException {
		Protocol_expressionContext _localctx = new Protocol_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_protocol_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728); match(PROTOCOL);
			setState(729); match(LPAREN);
			setState(730); protocol_name();
			setState(731); match(RPAREN);
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

	public static class Encode_expressionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Encode_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEncode_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEncode_expression(this);
		}
	}

	public final Encode_expressionContext encode_expression() throws RecognitionException {
		Encode_expressionContext _localctx = new Encode_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_encode_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); match(ENCODE);
			setState(734); match(LPAREN);
			setState(735); type_name();
			setState(736); match(RPAREN);
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

	public static class Type_variable_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Type_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_variable_declarator(this);
		}
	}

	public final Type_variable_declaratorContext type_variable_declarator() throws RecognitionException {
		Type_variable_declaratorContext _localctx = new Type_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_type_variable_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738); declaration_specifiers();
			setState(739); declarator();
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

	public static class Try_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741); match(TRY);
			setState(742); compound_statement();
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

	public static class Catch_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCatch_statement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(CATCH);
			setState(745); match(LPAREN);
			setState(746); type_variable_declarator();
			setState(747); match(RPAREN);
			setState(748); compound_statement();
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

	public static class Finally_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFinally_statement(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); match(FINALLY);
			setState(751); compound_statement();
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

	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitThrow_statement(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); match(THROW);
			setState(754); match(LPAREN);
			setState(755); match(IDENTIFIER);
			setState(756); match(RPAREN);
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

	public static class Try_blockContext extends ParserRuleContext {
		public Catch_statementContext catch_statement(int i) {
			return getRuleContext(Catch_statementContext.class,i);
		}
		public List<Catch_statementContext> catch_statement() {
			return getRuleContexts(Catch_statementContext.class);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_block(this);
		}
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758); try_statement();
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(759); catch_statement();
				}
				}
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(765); finally_statement();
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

	public static class Synchronized_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Synchronized_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronized_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSynchronized_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSynchronized_statement(this);
		}
	}

	public final Synchronized_statementContext synchronized_statement() throws RecognitionException {
		Synchronized_statementContext _localctx = new Synchronized_statementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_synchronized_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768); match(SYNCHRONIZED);
			setState(769); match(LPAREN);
			setState(770); primary_expression();
			setState(771); match(RPAREN);
			setState(772); compound_statement();
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

	public static class Autorelease_statementContext extends ParserRuleContext {
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Autorelease_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autorelease_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAutorelease_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAutorelease_statement(this);
		}
	}

	public final Autorelease_statementContext autorelease_statement() throws RecognitionException {
		Autorelease_statementContext _localctx = new Autorelease_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_autorelease_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774); match(AUTORELEASEPOOL);
			setState(775); compound_statement();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(777); declaration_specifiers();
				}
				break;
			}
			setState(780); declarator();
			setState(781); compound_statement();
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

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783); declaration_specifiers();
			setState(785);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (MUL - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
				{
				setState(784); init_declarator_list();
				}
			}

			setState(787); match(SEMI);
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

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration_specifiers(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(793);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(789); arc_behaviour_specifier();
						}
						break;
					case AUTO:
					case EXTERN:
					case REGISTER:
					case STATIC:
					case TYPEDEF:
						{
						setState(790); storage_class_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INT:
					case LONG:
					case SHORT:
					case SIGNED:
					case STRUCT:
					case UNION:
					case UNSIGNED:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(791); type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case VOLATILE:
						{
						setState(792); type_qualifier();
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
				setState(795); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class Arc_behaviour_specifierContext extends ParserRuleContext {
		public Arc_behaviour_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arc_behaviour_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArc_behaviour_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArc_behaviour_specifier(this);
		}
	}

	public final Arc_behaviour_specifierContext arc_behaviour_specifier() throws RecognitionException {
		Arc_behaviour_specifierContext _localctx = new Arc_behaviour_specifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_arc_behaviour_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !(_la==WWEAK || _la==WUNSAFE_UNRETAINED) ) {
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

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStorage_class_specifier(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) ) {
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801); init_declarator();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(802); match(COMMA);
				setState(803); init_declarator();
				}
				}
				setState(808);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); declarator();
			setState(812);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(810); match(ASSIGN);
				setState(811); initializer();
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

	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_or_union_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_or_union_specifier(this);
		}
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_struct_or_union_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(827);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(815); match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(817);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(816); match(IDENTIFIER);
					}
				}

				setState(819); match(LBRACE);
				setState(821); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(820); struct_declaration();
					}
					}
					setState(823); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << SHORT) | (1L << SIGNED) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0) );
				setState(825); match(RBRACE);
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); specifier_qualifier_list();
			setState(830); struct_declarator_list();
			setState(831); match(SEMI);
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

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public List<Type_specifierContext> type_specifier() {
			return getRuleContexts(Type_specifierContext.class);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public List<Arc_behaviour_specifierContext> arc_behaviour_specifier() {
			return getRuleContexts(Arc_behaviour_specifierContext.class);
		}
		public Arc_behaviour_specifierContext arc_behaviour_specifier(int i) {
			return getRuleContext(Arc_behaviour_specifierContext.class,i);
		}
		public Type_specifierContext type_specifier(int i) {
			return getRuleContext(Type_specifierContext.class,i);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSpecifier_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSpecifier_qualifier_list(this);
		}
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_specifier_qualifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(836); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(836);
					switch (_input.LA(1)) {
					case WWEAK:
					case WUNSAFE_UNRETAINED:
						{
						setState(833); arc_behaviour_specifier();
						}
						break;
					case CHAR:
					case DOUBLE:
					case ENUM:
					case FLOAT:
					case ID:
					case INT:
					case LONG:
					case SHORT:
					case SIGNED:
					case STRUCT:
					case UNION:
					case UNSIGNED:
					case VOID:
					case NS_OPTIONS:
					case NS_ENUM:
					case IDENTIFIER:
						{
						setState(834); type_specifier();
						}
						break;
					case BYCOPY:
					case BYREF:
					case CONST:
					case IN:
					case INOUT:
					case ONEWAY:
					case OUT:
					case VOLATILE:
						{
						setState(835); type_qualifier();
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
				setState(838); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840); struct_declarator();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(841); match(COMMA);
				setState(842); struct_declarator();
				}
				}
				setState(847);
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

	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_struct_declarator);
		int _la;
		try {
			setState(854);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848); declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (MUL - 69)) | (1L << (IDENTIFIER - 69)))) != 0)) {
					{
					setState(849); declarator();
					}
				}

				setState(852); match(COLON);
				setState(853); constant();
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

	public static class Enum_specifierContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnum_specifier(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_enum_specifier);
		int _la;
		try {
			setState(894);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(856); match(ENUM);
				setState(859);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(857); match(COLON);
					setState(858); type_name();
					}
				}

				setState(872);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(861); identifier();
					setState(866);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(862); match(LBRACE);
						setState(863); enumerator_list();
						setState(864); match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(868); match(LBRACE);
					setState(869); enumerator_list();
					setState(870); match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_OPTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(874); match(NS_OPTIONS);
				setState(875); match(LPAREN);
				setState(876); type_name();
				setState(877); match(COMMA);
				setState(878); identifier();
				setState(879); match(RPAREN);
				setState(880); match(LBRACE);
				setState(881); enumerator_list();
				setState(882); match(RBRACE);
				}
				break;
			case NS_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(884); match(NS_ENUM);
				setState(885); match(LPAREN);
				setState(886); type_name();
				setState(887); match(COMMA);
				setState(888); identifier();
				setState(889); match(RPAREN);
				setState(890); match(LBRACE);
				setState(891); enumerator_list();
				setState(892); match(RBRACE);
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

	public static class Enumerator_listContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator_list(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_enumerator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896); enumerator();
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(897); match(COMMA);
					setState(898); enumerator();
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(905);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(904); match(COMMA);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907); identifier();
			setState(910);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(908); match(ASSIGN);
				setState(909); constant_expression();
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

	public static class PointerContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_pointer);
		int _la;
		try {
			setState(921);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912); match(MUL);
				setState(914);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(913); declaration_specifiers();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(916); match(MUL);
				setState(918);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(917); declaration_specifiers();
					}
				}

				setState(920); pointer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(923); pointer();
				}
			}

			setState(926); direct_declarator();
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

	public static class Direct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Block_parametersContext block_parameters() {
			return getRuleContext(Block_parametersContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<Declarator_suffixContext> declarator_suffix() {
			return getRuleContexts(Declarator_suffixContext.class);
		}
		public Declarator_suffixContext declarator_suffix(int i) {
			return getRuleContext(Declarator_suffixContext.class,i);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDirect_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDirect_declarator(this);
		}
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_direct_declarator);
		int _la;
		try {
			int _alt;
			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(928); identifier();
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(929); declarator_suffix();
						}
						} 
					}
					setState(934);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935); match(LPAREN);
				setState(936); declarator();
				setState(937); match(RPAREN);
				setState(941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(938); declarator_suffix();
						}
						} 
					}
					setState(943);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(944); match(LPAREN);
				setState(945); match(CARET);
				setState(947);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(946); identifier();
					}
				}

				setState(949); match(RPAREN);
				setState(950); block_parameters();
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

	public static class Declarator_suffixContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator_suffix(this);
		}
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_declarator_suffix);
		int _la;
		try {
			setState(963);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(953); match(LBRACK);
				setState(955);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
					{
					setState(954); constant_expression();
					}
				}

				setState(957); match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(958); match(LPAREN);
				setState(960);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(959); parameter_list();
					}
				}

				setState(962); match(RPAREN);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965); parameter_declaration_list();
			setState(968);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(966); match(COMMA);
				setState(967); match(ELIPSIS);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); declaration_specifiers();
			setState(975);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(972);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(971); declarator();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(974); abstract_declarator();
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

	public static class InitializerContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_initializer);
		int _la;
		try {
			int _alt;
			setState(992);
			switch (_input.LA(1)) {
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case SIZEOF:
			case LPAREN:
			case LBRACK:
			case AT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case SUB:
			case MUL:
			case BITAND:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(977); assignment_expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(978); match(LBRACE);
				setState(979); initializer();
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(980); match(COMMA);
						setState(981); initializer();
						}
						} 
					}
					setState(986);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(988);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(987); match(COMMA);
					}
				}

				setState(990); match(RBRACE);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Block_typeContext block_type() {
			return getRuleContext(Block_typeContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_type_name);
		try {
			setState(998);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994); specifier_qualifier_list();
				setState(995); abstract_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997); block_type();
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

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_abstract_declarator);
		int _la;
		try {
			int _alt;
			setState(1021);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000); pointer();
				setState(1001); abstract_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003); match(LPAREN);
				setState(1004); abstract_declarator();
				setState(1005); match(RPAREN);
				setState(1007); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1006); abstract_declarator_suffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1009); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1016); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1011); match(LBRACK);
					setState(1013);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
						{
						setState(1012); constant_expression();
						}
					}

					setState(1015); match(RBRACK);
					}
					}
					setState(1018); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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

	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator_suffix(this);
		}
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_abstract_declarator_suffix);
		int _la;
		try {
			setState(1033);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023); match(LBRACK);
				setState(1025);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
					{
					setState(1024); constant_expression();
					}
				}

				setState(1027); match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028); match(LPAREN);
				setState(1030);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NS_OPTIONS - 65)) | (1L << (NS_ENUM - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNSAFE_UNRETAINED - 65)) | (1L << (IDENTIFIER - 65)))) != 0)) {
					{
					setState(1029); parameter_declaration_list();
					}
				}

				setState(1032); match(RPAREN);
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

	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration_list(this);
		}
	}

	public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_parameter_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035); parameter_declaration();
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1036); match(COMMA);
					setState(1037); parameter_declaration();
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1043); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1046); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Autorelease_statementContext autorelease_statement() {
			return getRuleContext(Autorelease_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Try_blockContext try_block() {
			return getRuleContext(Try_blockContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Synchronized_statementContext synchronized_statement() {
			return getRuleContext(Synchronized_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_statement);
		try {
			setState(1060);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048); labeled_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049); expression();
				setState(1050); match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1052); compound_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1053); selection_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1054); iteration_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1055); jump_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1056); synchronized_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1057); autorelease_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1058); try_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1059); match(SEMI);
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLabeled_statement(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_labeled_statement);
		try {
			setState(1074);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062); identifier();
				setState(1063); match(COLON);
				setState(1064); statement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066); match(CASE);
				setState(1067); constant_expression();
				setState(1068); match(COLON);
				setState(1069); statement();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071); match(DEFAULT);
				setState(1072); match(COLON);
				setState(1073); statement();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public Statement_listContext statement_list(int i) {
			return getRuleContext(Statement_listContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Statement_listContext> statement_list() {
			return getRuleContexts(Statement_listContext.class);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076); match(LBRACE);
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << TRY) | (1L << SUPER) | (1L << SELF) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CASE) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DEFAULT) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID) | (1L << VOLATILE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (HEX_LITERAL - 128)) | (1L << (DECIMAL_LITERAL - 128)) | (1L << (OCTAL_LITERAL - 128)) | (1L << (FLOATING_POINT_LITERAL - 128)))) != 0)) {
				{
				setState(1079);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1077); declaration();
					}
					break;
				case 2:
					{
					setState(1078); statement_list();
					}
					break;
				}
				}
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1084); match(RBRACE);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelection_statement(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_selection_statement);
		try {
			setState(1101);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086); match(IF);
				setState(1087); match(LPAREN);
				setState(1088); expression();
				setState(1089); match(RPAREN);
				setState(1090); statement();
				setState(1093);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1091); match(ELSE);
					setState(1092); statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1095); match(SWITCH);
				setState(1096); match(LPAREN);
				setState(1097); expression();
				setState(1098); match(RPAREN);
				setState(1099); statement();
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

	public static class For_in_statementContext extends ParserRuleContext {
		public Type_variable_declaratorContext type_variable_declarator() {
			return getRuleContext(Type_variable_declaratorContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_in_statement(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_for_in_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103); match(FOR);
			setState(1104); match(LPAREN);
			setState(1105); type_variable_declarator();
			setState(1106); match(IN);
			setState(1108);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
				{
				setState(1107); expression();
				}
			}

			setState(1110); match(RPAREN);
			setState(1111); statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); match(FOR);
			setState(1114); match(LPAREN);
			setState(1119);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				{
				setState(1115); declaration_specifiers();
				setState(1116); init_declarator_list();
				}
				}
				break;
			case 2:
				{
				setState(1118); expression();
				}
				break;
			}
			setState(1121); match(SEMI);
			setState(1123);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
				{
				setState(1122); expression();
				}
			}

			setState(1125); match(SEMI);
			setState(1127);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
				{
				setState(1126); expression();
				}
			}

			setState(1129); match(RPAREN);
			setState(1130); statement();
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

	public static class While_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132); match(WHILE);
			setState(1133); match(LPAREN);
			setState(1134); expression();
			setState(1135); match(RPAREN);
			setState(1136); statement();
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

	public static class Do_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDo_statement(this);
		}
	}

	public final Do_statementContext do_statement() throws RecognitionException {
		Do_statementContext _localctx = new Do_statementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_do_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); match(DO);
			setState(1139); statement();
			setState(1140); match(WHILE);
			setState(1141); match(LPAREN);
			setState(1142); expression();
			setState(1143); match(RPAREN);
			setState(1144); match(SEMI);
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_statementContext do_statement() {
			return getRuleContext(Do_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIteration_statement(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_iteration_statement);
		try {
			setState(1150);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146); while_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147); do_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148); for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149); for_in_statement();
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

	public static class Jump_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_jump_statement);
		int _la;
		try {
			setState(1165);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152); match(GOTO);
				setState(1153); identifier();
				setState(1154); match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156); match(CONTINUE);
				setState(1157); match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1158); match(BREAK);
				setState(1159); match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1160); match(RETURN);
				setState(1162);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
					{
					setState(1161); expression();
					}
				}

				setState(1164); match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); assignment_expression();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1168); match(COMMA);
				setState(1169); assignment_expression();
				}
				}
				setState(1174);
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_assignment_expression);
		try {
			setState(1180);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175); conditional_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1176); unary_expression();
				setState(1177); assignment_operator();
				setState(1178); assignment_expression();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (ASSIGN - 80)) | (1L << (ADD_ASSIGN - 80)) | (1L << (SUB_ASSIGN - 80)) | (1L << (MUL_ASSIGN - 80)) | (1L << (DIV_ASSIGN - 80)) | (1L << (AND_ASSIGN - 80)) | (1L << (OR_ASSIGN - 80)) | (1L << (XOR_ASSIGN - 80)) | (1L << (MOD_ASSIGN - 80)) | (1L << (LSHIFT_ASSIGN - 80)) | (1L << (RSHIFT_ASSIGN - 80)))) != 0)) ) {
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<Conditional_expressionContext> conditional_expression() {
			return getRuleContexts(Conditional_expressionContext.class);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression(int i) {
			return getRuleContext(Conditional_expressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184); logical_or_expression();
			setState(1190);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1185); match(QUESTION);
				setState(1186); conditional_expression();
				setState(1187); match(COLON);
				setState(1188); conditional_expression();
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192); conditional_expression();
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

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); logical_and_expression();
			setState(1199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1195); match(OR);
				setState(1196); logical_and_expression();
				}
				}
				setState(1201);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202); inclusive_or_expression();
			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1203); match(AND);
				setState(1204); inclusive_or_expression();
				}
				}
				setState(1209);
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); exclusive_or_expression();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1211); match(BITOR);
				setState(1212); exclusive_or_expression();
				}
				}
				setState(1217);
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218); and_expression();
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1219); match(CARET);
				setState(1220); and_expression();
				}
				}
				setState(1225);
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

	public static class And_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226); equality_expression();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1227); match(BITAND);
				setState(1228); equality_expression();
				}
				}
				setState(1233);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234); relational_expression();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1235);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1236); relational_expression();
				}
				}
				setState(1241);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); shift_expression();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (GT - 81)) | (1L << (LT - 81)) | (1L << (LE - 81)) | (1L << (GE - 81)))) != 0)) {
				{
				{
				setState(1243);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (GT - 81)) | (1L << (LT - 81)) | (1L << (LE - 81)) | (1L << (GE - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1244); shift_expression();
				}
				}
				setState(1249);
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250); additive_expression();
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHIFT_R || _la==SHIFT_L) {
				{
				{
				setState(1251);
				_la = _input.LA(1);
				if ( !(_la==SHIFT_R || _la==SHIFT_L) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1252); additive_expression();
				}
				}
				setState(1257);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258); multiplicative_expression();
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1259);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1260); multiplicative_expression();
				}
				}
				setState(1265);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266); cast_expression();
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (MUL - 97)) | (1L << (DIV - 97)) | (1L << (MOD - 97)))) != 0)) {
				{
				{
				setState(1267);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (MUL - 97)) | (1L << (DIV - 97)) | (1L << (MOD - 97)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1268); cast_expression();
				}
				}
				setState(1273);
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_cast_expression);
		try {
			setState(1280);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274); match(LPAREN);
				setState(1275); type_name();
				setState(1276); match(RPAREN);
				setState(1277); cast_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279); unary_expression();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_unary_expression);
		try {
			setState(1298);
			switch (_input.LA(1)) {
			case ENCODE:
			case PROTOCOL:
			case SELECTOR:
			case SUPER:
			case SELF:
			case LPAREN:
			case LBRACK:
			case AT:
			case CARET:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282); postfix_expression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283); match(INC);
				setState(1284); unary_expression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285); match(DEC);
				setState(1286); unary_expression();
				}
				break;
			case BANG:
			case TILDE:
			case SUB:
			case MUL:
			case BITAND:
				enterOuterAlt(_localctx, 4);
				{
				setState(1287); unary_operator();
				setState(1288); cast_expression();
				}
				break;
			case SIZEOF:
				enterOuterAlt(_localctx, 5);
				{
				setState(1290); match(SIZEOF);
				setState(1296);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1291); match(LPAREN);
					setState(1292); type_name();
					setState(1293); match(RPAREN);
					}
					break;
				case 2:
					{
					setState(1295); unary_expression();
					}
					break;
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (BANG - 83)) | (1L << (TILDE - 83)) | (1L << (SUB - 83)) | (1L << (MUL - 83)) | (1L << (BITAND - 83)))) != 0)) ) {
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302); primary_expression();
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (DOT - 69)) | (1L << (STRUCTACCESS - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)))) != 0)) {
				{
				setState(1318);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1303); match(LBRACK);
					setState(1304); expression();
					setState(1305); match(RBRACK);
					}
					break;
				case LPAREN:
					{
					setState(1307); match(LPAREN);
					setState(1309);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SUPER) | (1L << SELF) | (1L << SIZEOF))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LPAREN - 69)) | (1L << (LBRACK - 69)) | (1L << (AT - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (BITAND - 69)) | (1L << (CARET - 69)) | (1L << (IDENTIFIER - 69)) | (1L << (CHARACTER_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (HEX_LITERAL - 69)) | (1L << (DECIMAL_LITERAL - 69)) | (1L << (OCTAL_LITERAL - 69)) | (1L << (FLOATING_POINT_LITERAL - 69)))) != 0)) {
						{
						setState(1308); argument_expression_list();
						}
					}

					setState(1311); match(RPAREN);
					}
					break;
				case DOT:
					{
					setState(1312); match(DOT);
					setState(1313); identifier();
					}
					break;
				case STRUCTACCESS:
					{
					setState(1314); match(STRUCTACCESS);
					setState(1315); identifier();
					}
					break;
				case INC:
					{
					setState(1316); match(INC);
					}
					break;
				case DEC:
					{
					setState(1317); match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1322);
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

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArgument_expression_list(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323); assignment_expression();
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1324); match(COMMA);
				setState(1325); assignment_expression();
				}
				}
				setState(1330);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331); match(IDENTIFIER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjCParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ObjCParser.HEX_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjCParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (CHARACTER_LITERAL - 126)) | (1L << (HEX_LITERAL - 126)) | (1L << (DECIMAL_LITERAL - 126)) | (1L << (OCTAL_LITERAL - 126)) | (1L << (FLOATING_POINT_LITERAL - 126)))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0091\u053a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\3\2\6\2\u00fc\n\2\r\2\16\2\u00fd"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u010e\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0116\n\5\3\5\5\5\u0119\n\5\3\5\5\5\u011c"+
		"\n\5\3\5\5\5\u011f\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0127\n\6\3\6\3\6\5"+
		"\6\u012b\n\6\3\6\5\6\u012e\n\6\3\6\5\6\u0131\n\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\5\7\u0139\n\7\3\7\5\7\u013c\n\7\3\7\5\7\u013f\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0149\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u0150\n\t\3\t\5\t"+
		"\u0153\n\t\3\t\5\t\u0156\n\t\3\t\5\t\u0159\n\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0168\n\f\f\f\16\f\u016b\13\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0174\n\16\f\16\16\16\u0177\13\16\3\17"+
		"\3\17\5\17\u017b\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u0186\n\21\f\21\16\21\u0189\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u019b\n\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u01a7\n\27\f\27\16\27\u01aa"+
		"\13\27\3\27\3\27\3\27\3\27\6\27\u01b0\n\27\r\27\16\27\u01b1\3\27\3\27"+
		"\3\27\3\27\6\27\u01b8\n\27\r\27\16\27\u01b9\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\6\27\u01c2\n\27\r\27\16\27\u01c3\3\27\3\27\3\27\5\27\u01c9\n\27\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\6\31\u01d1\n\31\r\31\16\31\u01d2\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\5\34\u01dc\n\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\6\35\u01e6\n\35\r\35\16\35\u01e7\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \5 \u01f1\n \3 \3 \5 \u01f5\n \3 \5 \u01f8\n \3 \3 \3!\3!\6!\u01fe"+
		"\n!\r!\16!\u01ff\3!\5!\u0203\n!\5!\u0205\n!\3\"\5\"\u0208\n\"\3\"\3\""+
		"\7\"\u020c\n\"\f\"\16\"\u020f\13\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0221\n%\3&\3&\3&\7&\u0226\n&\f&\16&\u0229\13&\3\'"+
		"\3\'\3\'\3\'\5\'\u022f\n\'\3(\3(\3(\3(\5(\u0235\n(\3(\3(\5(\u0239\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0246\n)\3)\3)\5)\u024a\n)\3)\3)\3"+
		")\3)\3)\5)\u0251\n)\3*\3*\3*\5*\u0256\n*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u026b\n,\3-\3-\3-\3-\3.\3.\3.\5.\u0274"+
		"\n.\3.\3.\7.\u0278\n.\f.\16.\u027b\13.\3.\5.\u027e\n.\3.\3.\3/\3/\3/\5"+
		"/\u0285\n/\3/\3/\7/\u0289\n/\f/\16/\u028c\13/\3/\5/\u028f\n/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u029a\n\60\3\61\3\61\3\61\5\61\u029f"+
		"\n\61\3\61\3\61\7\61\u02a3\n\61\f\61\16\61\u02a6\13\61\3\61\3\61\3\62"+
		"\3\62\5\62\u02ac\n\62\3\62\5\62\u02af\n\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\5\64\u02bb\n\64\3\65\3\65\6\65\u02bf\n\65\r\65"+
		"\16\65\u02c0\5\65\u02c3\n\65\3\66\5\66\u02c6\n\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\58\u02d2\n8\38\68\u02d5\n8\r8\168\u02d6\58"+
		"\u02d9\n8\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\7@\u02fb\n@\f@\16@\u02fe\13@\3@\5"+
		"@\u0301\n@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3C\5C\u030d\nC\3C\3C\3C\3D\3D\5"+
		"D\u0314\nD\3D\3D\3E\3E\3E\3E\6E\u031c\nE\rE\16E\u031d\3F\3F\3G\3G\3H\3"+
		"H\3H\7H\u0327\nH\fH\16H\u032a\13H\3I\3I\3I\5I\u032f\nI\3J\3J\3J\5J\u0334"+
		"\nJ\3J\3J\6J\u0338\nJ\rJ\16J\u0339\3J\3J\5J\u033e\nJ\3K\3K\3K\3K\3L\3"+
		"L\3L\6L\u0347\nL\rL\16L\u0348\3M\3M\3M\7M\u034e\nM\fM\16M\u0351\13M\3"+
		"N\3N\5N\u0355\nN\3N\3N\5N\u0359\nN\3O\3O\3O\5O\u035e\nO\3O\3O\3O\3O\3"+
		"O\5O\u0365\nO\3O\3O\3O\3O\5O\u036b\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0381\nO\3P\3P\3P\7P\u0386\nP\fP\16P\u0389"+
		"\13P\3P\5P\u038c\nP\3Q\3Q\3Q\5Q\u0391\nQ\3R\3R\5R\u0395\nR\3R\3R\5R\u0399"+
		"\nR\3R\5R\u039c\nR\3S\5S\u039f\nS\3S\3S\3T\3T\7T\u03a5\nT\fT\16T\u03a8"+
		"\13T\3T\3T\3T\3T\7T\u03ae\nT\fT\16T\u03b1\13T\3T\3T\3T\5T\u03b6\nT\3T"+
		"\3T\5T\u03ba\nT\3U\3U\5U\u03be\nU\3U\3U\3U\5U\u03c3\nU\3U\5U\u03c6\nU"+
		"\3V\3V\3V\5V\u03cb\nV\3W\3W\5W\u03cf\nW\3W\5W\u03d2\nW\3X\3X\3X\3X\3X"+
		"\7X\u03d9\nX\fX\16X\u03dc\13X\3X\5X\u03df\nX\3X\3X\5X\u03e3\nX\3Y\3Y\3"+
		"Y\3Y\5Y\u03e9\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\6Z\u03f2\nZ\rZ\16Z\u03f3\3Z\3Z\5"+
		"Z\u03f8\nZ\3Z\6Z\u03fb\nZ\rZ\16Z\u03fc\3Z\5Z\u0400\nZ\3[\3[\5[\u0404\n"+
		"[\3[\3[\3[\5[\u0409\n[\3[\5[\u040c\n[\3\\\3\\\3\\\7\\\u0411\n\\\f\\\16"+
		"\\\u0414\13\\\3]\6]\u0417\n]\r]\16]\u0418\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\3^\3^\5^\u0427\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0435\n_\3"+
		"`\3`\3`\7`\u043a\n`\f`\16`\u043d\13`\3`\3`\3a\3a\3a\3a\3a\3a\3a\5a\u0448"+
		"\na\3a\3a\3a\3a\3a\3a\5a\u0450\na\3b\3b\3b\3b\3b\5b\u0457\nb\3b\3b\3b"+
		"\3c\3c\3c\3c\3c\3c\5c\u0462\nc\3c\3c\5c\u0466\nc\3c\3c\5c\u046a\nc\3c"+
		"\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\5f\u0481"+
		"\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u048d\ng\3g\5g\u0490\ng\3h\3h\3h"+
		"\7h\u0495\nh\fh\16h\u0498\13h\3i\3i\3i\3i\3i\5i\u049f\ni\3j\3j\3k\3k\3"+
		"k\3k\3k\3k\5k\u04a9\nk\3l\3l\3m\3m\3m\7m\u04b0\nm\fm\16m\u04b3\13m\3n"+
		"\3n\3n\7n\u04b8\nn\fn\16n\u04bb\13n\3o\3o\3o\7o\u04c0\no\fo\16o\u04c3"+
		"\13o\3p\3p\3p\7p\u04c8\np\fp\16p\u04cb\13p\3q\3q\3q\7q\u04d0\nq\fq\16"+
		"q\u04d3\13q\3r\3r\3r\7r\u04d8\nr\fr\16r\u04db\13r\3s\3s\3s\7s\u04e0\n"+
		"s\fs\16s\u04e3\13s\3t\3t\3t\7t\u04e8\nt\ft\16t\u04eb\13t\3u\3u\3u\7u\u04f0"+
		"\nu\fu\16u\u04f3\13u\3v\3v\3v\7v\u04f8\nv\fv\16v\u04fb\13v\3w\3w\3w\3"+
		"w\3w\3w\5w\u0503\nw\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\5x\u0513"+
		"\nx\5x\u0515\nx\3y\3y\3z\3z\3z\3z\3z\3z\3z\5z\u0520\nz\3z\3z\3z\3z\3z"+
		"\3z\3z\7z\u0529\nz\fz\16z\u052c\13z\3{\3{\3{\7{\u0531\n{\f{\16{\u0534"+
		"\13{\3|\3|\3}\3}\3}\2\2~\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\2\20\3\2"+
		"\u0086\u0087\5\2\f\f\17\17\21\22\5\2\36\37./\63\64\3\2EF\7\2\33\33))\65"+
		"\65::==\4\2;;>>\4\2RRkt\4\2YY\\\\\4\2STZ[\3\2ij\3\2ab\4\2cdhh\5\2UVbc"+
		"ee\4\2\u0080\u0080\u0082\u0085\u05a7\2\u00fb\3\2\2\2\4\u010d\3\2\2\2\6"+
		"\u010f\3\2\2\2\b\u0111\3\2\2\2\n\u0122\3\2\2\2\f\u0134\3\2\2\2\16\u0142"+
		"\3\2\2\2\20\u014c\3\2\2\2\22\u015c\3\2\2\2\24\u0160\3\2\2\2\26\u0164\3"+
		"\2\2\2\30\u016c\3\2\2\2\32\u0170\3\2\2\2\34\u0178\3\2\2\2\36\u017e\3\2"+
		"\2\2 \u0182\3\2\2\2\"\u019a\3\2\2\2$\u019c\3\2\2\2&\u019e\3\2\2\2(\u01a0"+
		"\3\2\2\2*\u01a2\3\2\2\2,\u01c8\3\2\2\2.\u01ca\3\2\2\2\60\u01d0\3\2\2\2"+
		"\62\u01d4\3\2\2\2\64\u01d7\3\2\2\2\66\u01db\3\2\2\28\u01e5\3\2\2\2:\u01e9"+
		"\3\2\2\2<\u01ec\3\2\2\2>\u01f0\3\2\2\2@\u0204\3\2\2\2B\u0207\3\2\2\2D"+
		"\u0212\3\2\2\2F\u0214\3\2\2\2H\u0220\3\2\2\2J\u0222\3\2\2\2L\u022e\3\2"+
		"\2\2N\u0230\3\2\2\2P\u0250\3\2\2\2R\u0255\3\2\2\2T\u0257\3\2\2\2V\u026a"+
		"\3\2\2\2X\u026c\3\2\2\2Z\u0270\3\2\2\2\\\u0281\3\2\2\2^\u0299\3\2\2\2"+
		"`\u029b\3\2\2\2b\u02a9\3\2\2\2d\u02b2\3\2\2\2f\u02ba\3\2\2\2h\u02c2\3"+
		"\2\2\2j\u02c5\3\2\2\2l\u02ca\3\2\2\2n\u02d8\3\2\2\2p\u02da\3\2\2\2r\u02df"+
		"\3\2\2\2t\u02e4\3\2\2\2v\u02e7\3\2\2\2x\u02ea\3\2\2\2z\u02f0\3\2\2\2|"+
		"\u02f3\3\2\2\2~\u02f8\3\2\2\2\u0080\u0302\3\2\2\2\u0082\u0308\3\2\2\2"+
		"\u0084\u030c\3\2\2\2\u0086\u0311\3\2\2\2\u0088\u031b\3\2\2\2\u008a\u031f"+
		"\3\2\2\2\u008c\u0321\3\2\2\2\u008e\u0323\3\2\2\2\u0090\u032b\3\2\2\2\u0092"+
		"\u0330\3\2\2\2\u0094\u033f\3\2\2\2\u0096\u0346\3\2\2\2\u0098\u034a\3\2"+
		"\2\2\u009a\u0358\3\2\2\2\u009c\u0380\3\2\2\2\u009e\u0382\3\2\2\2\u00a0"+
		"\u038d\3\2\2\2\u00a2\u039b\3\2\2\2\u00a4\u039e\3\2\2\2\u00a6\u03b9\3\2"+
		"\2\2\u00a8\u03c5\3\2\2\2\u00aa\u03c7\3\2\2\2\u00ac\u03cc\3\2\2\2\u00ae"+
		"\u03e2\3\2\2\2\u00b0\u03e8\3\2\2\2\u00b2\u03ff\3\2\2\2\u00b4\u040b\3\2"+
		"\2\2\u00b6\u040d\3\2\2\2\u00b8\u0416\3\2\2\2\u00ba\u0426\3\2\2\2\u00bc"+
		"\u0434\3\2\2\2\u00be\u0436\3\2\2\2\u00c0\u044f\3\2\2\2\u00c2\u0451\3\2"+
		"\2\2\u00c4\u045b\3\2\2\2\u00c6\u046e\3\2\2\2\u00c8\u0474\3\2\2\2\u00ca"+
		"\u0480\3\2\2\2\u00cc\u048f\3\2\2\2\u00ce\u0491\3\2\2\2\u00d0\u049e\3\2"+
		"\2\2\u00d2\u04a0\3\2\2\2\u00d4\u04a2\3\2\2\2\u00d6\u04aa\3\2\2\2\u00d8"+
		"\u04ac\3\2\2\2\u00da\u04b4\3\2\2\2\u00dc\u04bc\3\2\2\2\u00de\u04c4\3\2"+
		"\2\2\u00e0\u04cc\3\2\2\2\u00e2\u04d4\3\2\2\2\u00e4\u04dc\3\2\2\2\u00e6"+
		"\u04e4\3\2\2\2\u00e8\u04ec\3\2\2\2\u00ea\u04f4\3\2\2\2\u00ec\u0502\3\2"+
		"\2\2\u00ee\u0514\3\2\2\2\u00f0\u0516\3\2\2\2\u00f2\u0518\3\2\2\2\u00f4"+
		"\u052d\3\2\2\2\u00f6\u0535\3\2\2\2\u00f8\u0537\3\2\2\2\u00fa\u00fc\5\4"+
		"\3\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\2\2\3\u0100\3\3\2\2\2"+
		"\u0101\u010e\7\u008a\2\2\u0102\u010e\7\u008b\2\2\u0103\u010e\5\6\4\2\u0104"+
		"\u010e\5\u0084C\2\u0105\u010e\5\u0086D\2\u0106\u010e\5\b\5\2\u0107\u010e"+
		"\5\f\7\2\u0108\u010e\5\n\6\2\u0109\u010e\5\16\b\2\u010a\u010e\5\20\t\2"+
		"\u010b\u010e\5\22\n\2\u010c\u010e\5\24\13\2\u010d\u0101\3\2\2\2\u010d"+
		"\u0102\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0105\3\2"+
		"\2\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e\5\3\2\2\2\u010f\u0110\t\2\2\2\u0110\7\3\2\2\2\u0111\u0112\7"+
		"\13\2\2\u0112\u0115\5$\23\2\u0113\u0114\7X\2\2\u0114\u0116\5&\24\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\5\30"+
		"\r\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u011c\5,\27\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u011f\5\60\31\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\7\b\2\2\u0121\t\3\2\2\2\u0122\u0123\7\13\2"+
		"\2\u0123\u0124\5$\23\2\u0124\u0126\7G\2\2\u0125\u0127\5(\25\2\u0126\u0125"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7H\2\2\u0129"+
		"\u012b\5\30\r\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3"+
		"\2\2\2\u012c\u012e\5,\27\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u0131\5\60\31\2\u0130\u012f\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\b\2\2\u0133\13\3\2\2\2\u0134"+
		"\u0135\7\n\2\2\u0135\u0138\5$\23\2\u0136\u0137\7X\2\2\u0137\u0139\5&\24"+
		"\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c"+
		"\5,\27\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013f\58\35\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\7\b\2\2\u0141\r\3\2\2\2\u0142\u0143\7\n\2\2\u0143\u0144"+
		"\5$\23\2\u0144\u0145\7G\2\2\u0145\u0146\5(\25\2\u0146\u0148\7H\2\2\u0147"+
		"\u0149\58\35\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\7\b\2\2\u014b\17\3\2\2\2\u014c\u014d\7\r\2\2\u014d\u014f"+
		"\5*\26\2\u014e\u0150\5\30\r\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0152\3\2\2\2\u0151\u0153\5\60\31\2\u0152\u0151\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\7\16\2\2\u0155\u0154\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5\60\31\2\u0158\u0157"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\b\2\2\u015b"+
		"\21\3\2\2\2\u015c\u015d\7\r\2\2\u015d\u015e\5\32\16\2\u015e\u015f\7M\2"+
		"\2\u015f\23\3\2\2\2\u0160\u0161\7\5\2\2\u0161\u0162\5\26\f\2\u0162\u0163"+
		"\7M\2\2\u0163\25\3\2\2\2\u0164\u0169\5$\23\2\u0165\u0166\7N\2\2\u0166"+
		"\u0168\5$\23\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\27\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d"+
		"\7T\2\2\u016d\u016e\5\32\16\2\u016e\u016f\7S\2\2\u016f\31\3\2\2\2\u0170"+
		"\u0175\5*\26\2\u0171\u0172\7N\2\2\u0172\u0174\5*\26\2\u0173\u0171\3\2"+
		"\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\33\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\7\20\2\2\u0179\u017b\5\36"+
		"\20\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\5\u0094K\2\u017d\35\3\2\2\2\u017e\u017f\7G\2\2\u017f\u0180\5 \21"+
		"\2\u0180\u0181\7H\2\2\u0181\37\3\2\2\2\u0182\u0187\5\"\22\2\u0183\u0184"+
		"\7N\2\2\u0184\u0186\5\"\22\2\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188!\3\2\2\2\u0189\u0187\3\2\2\2"+
		"\u018a\u019b\7x\2\2\u018b\u019b\7v\2\2\u018c\u019b\7~\2\2\u018d\u019b"+
		"\7z\2\2\u018e\u019b\7{\2\2\u018f\u019b\7|\2\2\u0190\u019b\7}\2\2\u0191"+
		"\u019b\3\2\2\2\u0192\u0193\7w\2\2\u0193\u0194\7R\2\2\u0194\u019b\7\177"+
		"\2\2\u0195\u0196\7y\2\2\u0196\u0197\7R\2\2\u0197\u0198\7\177\2\2\u0198"+
		"\u019b\7X\2\2\u0199\u019b\7\177\2\2\u019a\u018a\3\2\2\2\u019a\u018b\3"+
		"\2\2\2\u019a\u018c\3\2\2\2\u019a\u018d\3\2\2\2\u019a\u018e\3\2\2\2\u019a"+
		"\u018f\3\2\2\2\u019a\u0190\3\2\2\2\u019a\u0191\3\2\2\2\u019a\u0192\3\2"+
		"\2\2\u019a\u0195\3\2\2\2\u019a\u0199\3\2\2\2\u019b#\3\2\2\2\u019c\u019d"+
		"\7\177\2\2\u019d%\3\2\2\2\u019e\u019f\7\177\2\2\u019f\'\3\2\2\2\u01a0"+
		"\u01a1\7\177\2\2\u01a1)\3\2\2\2\u01a2\u01a3\7\177\2\2\u01a3+\3\2\2\2\u01a4"+
		"\u01a8\7I\2\2\u01a5\u01a7\5\u0094K\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3"+
		"\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01c9\7J\2\2\u01ac\u01ad\7I\2\2\u01ad\u01af\5.\30"+
		"\2\u01ae\u01b0\5\u0094K\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7J"+
		"\2\2\u01b4\u01c9\3\2\2\2\u01b5\u01b7\7I\2\2\u01b6\u01b8\5\u0094K\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5,\27\2\u01bc\u01bd\7J\2\2\u01bd"+
		"\u01c9\3\2\2\2\u01be\u01bf\7I\2\2\u01bf\u01c1\5.\30\2\u01c0\u01c2\5\u0094"+
		"K\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\5,\27\2\u01c6\u01c7\7J"+
		"\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01a4\3\2\2\2\u01c8\u01ac\3\2\2\2\u01c8"+
		"\u01b5\3\2\2\2\u01c8\u01be\3\2\2\2\u01c9-\3\2\2\2\u01ca\u01cb\t\3\2\2"+
		"\u01cb/\3\2\2\2\u01cc\u01d1\5\u0086D\2\u01cd\u01d1\5\62\32\2\u01ce\u01d1"+
		"\5\64\33\2\u01cf\u01d1\5\34\17\2\u01d0\u01cc\3\2\2\2\u01d0\u01cd\3\2\2"+
		"\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\61\3\2\2\2\u01d4\u01d5\7a\2\2\u01d5"+
		"\u01d6\5\66\34\2\u01d6\63\3\2\2\2\u01d7\u01d8\7b\2\2\u01d8\u01d9\5\66"+
		"\34\2\u01d9\65\3\2\2\2\u01da\u01dc\5F$\2\u01db\u01da\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\5@!\2\u01de\u01df\7M\2\2\u01df"+
		"\67\3\2\2\2\u01e0\u01e6\5\u0084C\2\u01e1\u01e6\5\u0086D\2\u01e2\u01e6"+
		"\5:\36\2\u01e3\u01e6\5<\37\2\u01e4\u01e6\5H%\2\u01e5\u01e0\3\2\2\2\u01e5"+
		"\u01e1\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"9\3\2\2\2\u01e9\u01ea\7a\2\2\u01ea\u01eb\5> \2\u01eb;\3\2\2\2\u01ec\u01ed"+
		"\7b\2\2\u01ed\u01ee\5> \2\u01ee=\3\2\2\2\u01ef\u01f1\5F$\2\u01f0\u01ef"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\5@!\2\u01f3"+
		"\u01f5\5\u008eH\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7"+
		"\3\2\2\2\u01f6\u01f8\7M\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\5\u00be`\2\u01fa?\3\2\2\2\u01fb\u0205\5D#\2"+
		"\u01fc\u01fe\5B\"\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u0203\5\u00aaV"+
		"\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u01fb"+
		"\3\2\2\2\u0204\u01fd\3\2\2\2\u0205A\3\2\2\2\u0206\u0208\5D#\2\u0207\u0206"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020d\7X\2\2\u020a"+
		"\u020c\5F$\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2"+
		"\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211"+
		"\7\177\2\2\u0211C\3\2\2\2\u0212\u0213\7\177\2\2\u0213E\3\2\2\2\u0214\u0215"+
		"\7G\2\2\u0215\u0216\5\u00b0Y\2\u0216\u0217\7H\2\2\u0217G\3\2\2\2\u0218"+
		"\u0219\7\25\2\2\u0219\u021a\5J&\2\u021a\u021b\7M\2\2\u021b\u0221\3\2\2"+
		"\2\u021c\u021d\7\6\2\2\u021d\u021e\5J&\2\u021e\u021f\7M\2\2\u021f\u0221"+
		"\3\2\2\2\u0220\u0218\3\2\2\2\u0220\u021c\3\2\2\2\u0221I\3\2\2\2\u0222"+
		"\u0227\5L\'\2\u0223\u0224\7N\2\2\u0224\u0226\5L\'\2\u0225\u0223\3\2\2"+
		"\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228K"+
		"\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022f\7\177\2\2\u022b\u022c\7\177\2"+
		"\2\u022c\u022d\7R\2\2\u022d\u022f\7\177\2\2\u022e\u022a\3\2\2\2\u022e"+
		"\u022b\3\2\2\2\u022fM\3\2\2\2\u0230\u0231\5P)\2\u0231\u0232\7G\2\2\u0232"+
		"\u0234\7g\2\2\u0233\u0235\5P)\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u0238\7H\2\2\u0237\u0239\5`\61\2\u0238\u0237"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239O\3\2\2\2\u023a\u0251\7@\2\2\u023b\u0251"+
		"\7!\2\2\u023c\u0251\7\67\2\2\u023d\u0251\7\61\2\2\u023e\u0251\7\62\2\2"+
		"\u023f\u0251\7*\2\2\u0240\u0251\7&\2\2\u0241\u0251\78\2\2\u0242\u0251"+
		"\7?\2\2\u0243\u0245\7,\2\2\u0244\u0246\5\30\r\2\u0245\u0244\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0251\3\2\2\2\u0247\u0249\5$\23\2\u0248\u024a\5\30"+
		"\r\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0251\3\2\2\2\u024b"+
		"\u0251\5\u0092J\2\u024c\u0251\5\u009cO\2\u024d\u0251\7\177\2\2\u024e\u024f"+
		"\7\177\2\2\u024f\u0251\5\u00a2R\2\u0250\u023a\3\2\2\2\u0250\u023b\3\2"+
		"\2\2\u0250\u023c\3\2\2\2\u0250\u023d\3\2\2\2\u0250\u023e\3\2\2\2\u0250"+
		"\u023f\3\2\2\2\u0250\u0240\3\2\2\2\u0250\u0241\3\2\2\2\u0250\u0242\3\2"+
		"\2\2\u0250\u0243\3\2\2\2\u0250\u0247\3\2\2\2\u0250\u024b\3\2\2\2\u0250"+
		"\u024c\3\2\2\2\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0251Q\3\2\2\2"+
		"\u0252\u0256\7\"\2\2\u0253\u0256\7A\2\2\u0254\u0256\5T+\2\u0255\u0252"+
		"\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256S\3\2\2\2\u0257"+
		"\u0258\t\4\2\2\u0258U\3\2\2\2\u0259\u026b\7\177\2\2\u025a\u026b\5\u00f8"+
		"}\2\u025b\u026b\7\u0081\2\2\u025c\u025d\7G\2\2\u025d\u025e\5\u00ceh\2"+
		"\u025e\u025f\7H\2\2\u025f\u026b\3\2\2\2\u0260\u026b\7\31\2\2\u0261\u026b"+
		"\7\30\2\2\u0262\u026b\5d\63\2\u0263\u026b\5l\67\2\u0264\u026b\5p9\2\u0265"+
		"\u026b\5r:\2\u0266\u026b\5Z.\2\u0267\u026b\5\\/\2\u0268\u026b\5^\60\2"+
		"\u0269\u026b\5b\62\2\u026a\u0259\3\2\2\2\u026a\u025a\3\2\2\2\u026a\u025b"+
		"\3\2\2\2\u026a\u025c\3\2\2\2\u026a\u0260\3\2\2\2\u026a\u0261\3\2\2\2\u026a"+
		"\u0262\3\2\2\2\u026a\u0263\3\2\2\2\u026a\u0264\3\2\2\2\u026a\u0265\3\2"+
		"\2\2\u026a\u0266\3\2\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u0269\3\2\2\2\u026bW\3\2\2\2\u026c\u026d\5\u00f2z\2\u026d\u026e\7X\2"+
		"\2\u026e\u026f\5\u00f2z\2\u026fY\3\2\2\2\u0270\u0271\7Q\2\2\u0271\u0273"+
		"\7I\2\2\u0272\u0274\5X-\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0279\3\2\2\2\u0275\u0276\7N\2\2\u0276\u0278\5X-\2\u0277\u0275\3\2\2"+
		"\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027d"+
		"\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027e\7N\2\2\u027d\u027c\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\7J\2\2\u0280[\3\2\2\2\u0281"+
		"\u0282\7Q\2\2\u0282\u0284\7K\2\2\u0283\u0285\5\u00f2z\2\u0284\u0283\3"+
		"\2\2\2\u0284\u0285\3\2\2\2\u0285\u028a\3\2\2\2\u0286\u0287\7N\2\2\u0287"+
		"\u0289\5\u00f2z\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028d"+
		"\u028f\7N\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u0291\7L\2\2\u0291]\3\2\2\2\u0292\u0293\7Q\2\2\u0293\u0294"+
		"\7G\2\2\u0294\u0295\5\u00f2z\2\u0295\u0296\7H\2\2\u0296\u029a\3\2\2\2"+
		"\u0297\u0298\7Q\2\2\u0298\u029a\5\u00f8}\2\u0299\u0292\3\2\2\2\u0299\u0297"+
		"\3\2\2\2\u029a_\3\2\2\2\u029b\u029e\7G\2\2\u029c\u029f\5t;\2\u029d\u029f"+
		"\7@\2\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a4\3\2\2\2\u02a0\u02a1\7N\2\2\u02a1\u02a3\5t;\2\u02a2\u02a0\3\2\2"+
		"\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7"+
		"\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\7H\2\2\u02a8a\3\2\2\2\u02a9\u02ab"+
		"\7g\2\2\u02aa\u02ac\5P)\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ae\3\2\2\2\u02ad\u02af\5`\61\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\5\u00be`\2\u02b1c\3\2\2\2\u02b2\u02b3"+
		"\7K\2\2\u02b3\u02b4\5f\64\2\u02b4\u02b5\5h\65\2\u02b5\u02b6\7L\2\2\u02b6"+
		"e\3\2\2\2\u02b7\u02bb\5\u00ceh\2\u02b8\u02bb\5$\23\2\u02b9\u02bb\7\30"+
		"\2\2\u02ba\u02b7\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb"+
		"g\3\2\2\2\u02bc\u02c3\5D#\2\u02bd\u02bf\5j\66\2\u02be\u02bd\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2"+
		"\2\2\u02c2\u02bc\3\2\2\2\u02c2\u02be\3\2\2\2\u02c3i\3\2\2\2\u02c4\u02c6"+
		"\5D#\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02c8\7X\2\2\u02c8\u02c9\5\u00ceh\2\u02c9k\3\2\2\2\u02ca\u02cb\7\23\2"+
		"\2\u02cb\u02cc\7G\2\2\u02cc\u02cd\5n8\2\u02cd\u02ce\7H\2\2\u02cem\3\2"+
		"\2\2\u02cf\u02d9\5D#\2\u02d0\u02d2\5D#\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\7X\2\2\u02d4\u02d1\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2"+
		"\2\2\u02d8\u02cf\3\2\2\2\u02d8\u02d4\3\2\2\2\u02d9o\3\2\2\2\u02da\u02db"+
		"\7\r\2\2\u02db\u02dc\7G\2\2\u02dc\u02dd\5*\26\2\u02dd\u02de\7H\2\2\u02de"+
		"q\3\2\2\2\u02df\u02e0\7\7\2\2\u02e0\u02e1\7G\2\2\u02e1\u02e2\5\u00b0Y"+
		"\2\u02e2\u02e3\7H\2\2\u02e3s\3\2\2\2\u02e4\u02e5\5\u0088E\2\u02e5\u02e6"+
		"\5\u00a4S\2\u02e6u\3\2\2\2\u02e7\u02e8\7\27\2\2\u02e8\u02e9\5\u00be`\2"+
		"\u02e9w\3\2\2\2\u02ea\u02eb\7\4\2\2\u02eb\u02ec\7G\2\2\u02ec\u02ed\5t"+
		";\2\u02ed\u02ee\7H\2\2\u02ee\u02ef\5\u00be`\2\u02efy\3\2\2\2\u02f0\u02f1"+
		"\7\t\2\2\u02f1\u02f2\5\u00be`\2\u02f2{\3\2\2\2\u02f3\u02f4\7\26\2\2\u02f4"+
		"\u02f5\7G\2\2\u02f5\u02f6\7\177\2\2\u02f6\u02f7\7H\2\2\u02f7}\3\2\2\2"+
		"\u02f8\u02fc\5v<\2\u02f9\u02fb\5x=\2\u02fa\u02f9\3\2\2\2\u02fb\u02fe\3"+
		"\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02ff\u0301\5z>\2\u0300\u02ff\3\2\2\2\u0300\u0301\3\2\2"+
		"\2\u0301\177\3\2\2\2\u0302\u0303\7\24\2\2\u0303\u0304\7G\2\2\u0304\u0305"+
		"\5V,\2\u0305\u0306\7H\2\2\u0306\u0307\5\u00be`\2\u0307\u0081\3\2\2\2\u0308"+
		"\u0309\7\3\2\2\u0309\u030a\5\u00be`\2\u030a\u0083\3\2\2\2\u030b\u030d"+
		"\5\u0088E\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2"+
		"\2\u030e\u030f\5\u00a4S\2\u030f\u0310\5\u00be`\2\u0310\u0085\3\2\2\2\u0311"+
		"\u0313\5\u0088E\2\u0312\u0314\5\u008eH\2\u0313\u0312\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7M\2\2\u0316\u0087\3\2\2\2\u0317"+
		"\u031c\5\u008aF\2\u0318\u031c\5\u008cG\2\u0319\u031c\5P)\2\u031a\u031c"+
		"\5R*\2\u031b\u0317\3\2\2\2\u031b\u0318\3\2\2\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2"+
		"\2\2\u031e\u0089\3\2\2\2\u031f\u0320\t\5\2\2\u0320\u008b\3\2\2\2\u0321"+
		"\u0322\t\6\2\2\u0322\u008d\3\2\2\2\u0323\u0328\5\u0090I\2\u0324\u0325"+
		"\7N\2\2\u0325\u0327\5\u0090I\2\u0326\u0324\3\2\2\2\u0327\u032a\3\2\2\2"+
		"\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u008f\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032b\u032e\5\u00a4S\2\u032c\u032d\7R\2\2\u032d\u032f\5\u00ae"+
		"X\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0091\3\2\2\2\u0330"+
		"\u033d\t\7\2\2\u0331\u033e\7\177\2\2\u0332\u0334\7\177\2\2\u0333\u0332"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\7I\2\2\u0336"+
		"\u0338\5\u0094K\2\u0337\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0337"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\7J\2\2\u033c"+
		"\u033e\3\2\2\2\u033d\u0331\3\2\2\2\u033d\u0333\3\2\2\2\u033e\u0093\3\2"+
		"\2\2\u033f\u0340\5\u0096L\2\u0340\u0341\5\u0098M\2\u0341\u0342\7M\2\2"+
		"\u0342\u0095\3\2\2\2\u0343\u0347\5\u008aF\2\u0344\u0347\5P)\2\u0345\u0347"+
		"\5R*\2\u0346\u0343\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u0097\3\2"+
		"\2\2\u034a\u034f\5\u009aN\2\u034b\u034c\7N\2\2\u034c\u034e\5\u009aN\2"+
		"\u034d\u034b\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u0099\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0359\5\u00a4S"+
		"\2\u0353\u0355\5\u00a4S\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0357\7X\2\2\u0357\u0359\5\u00f8}\2\u0358\u0352\3"+
		"\2\2\2\u0358\u0354\3\2\2\2\u0359\u009b\3\2\2\2\u035a\u035d\7(\2\2\u035b"+
		"\u035c\7X\2\2\u035c\u035e\5\u00b0Y\2\u035d\u035b\3\2\2\2\u035d\u035e\3"+
		"\2\2\2\u035e\u036a\3\2\2\2\u035f\u0364\5\u00f6|\2\u0360\u0361\7I\2\2\u0361"+
		"\u0362\5\u009eP\2\u0362\u0363\7J\2\2\u0363\u0365\3\2\2\2\u0364\u0360\3"+
		"\2\2\2\u0364\u0365\3\2\2\2\u0365\u036b\3\2\2\2\u0366\u0367\7I\2\2\u0367"+
		"\u0368\5\u009eP\2\u0368\u0369\7J\2\2\u0369\u036b\3\2\2\2\u036a\u035f\3"+
		"\2\2\2\u036a\u0366\3\2\2\2\u036b\u0381\3\2\2\2\u036c\u036d\7C\2\2\u036d"+
		"\u036e\7G\2\2\u036e\u036f\5\u00b0Y\2\u036f\u0370\7N\2\2\u0370\u0371\5"+
		"\u00f6|\2\u0371\u0372\7H\2\2\u0372\u0373\7I\2\2\u0373\u0374\5\u009eP\2"+
		"\u0374\u0375\7J\2\2\u0375\u0381\3\2\2\2\u0376\u0377\7D\2\2\u0377\u0378"+
		"\7G\2\2\u0378\u0379\5\u00b0Y\2\u0379\u037a\7N\2\2\u037a\u037b\5\u00f6"+
		"|\2\u037b\u037c\7H\2\2\u037c\u037d\7I\2\2\u037d\u037e\5\u009eP\2\u037e"+
		"\u037f\7J\2\2\u037f\u0381\3\2\2\2\u0380\u035a\3\2\2\2\u0380\u036c\3\2"+
		"\2\2\u0380\u0376\3\2\2\2\u0381\u009d\3\2\2\2\u0382\u0387\5\u00a0Q\2\u0383"+
		"\u0384\7N\2\2\u0384\u0386\5\u00a0Q\2\u0385\u0383\3\2\2\2\u0386\u0389\3"+
		"\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038b\3\2\2\2\u0389"+
		"\u0387\3\2\2\2\u038a\u038c\7N\2\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2"+
		"\2\2\u038c\u009f\3\2\2\2\u038d\u0390\5\u00f6|\2\u038e\u038f\7R\2\2\u038f"+
		"\u0391\5\u00d6l\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u00a1"+
		"\3\2\2\2\u0392\u0394\7c\2\2\u0393\u0395\5\u0088E\2\u0394\u0393\3\2\2\2"+
		"\u0394\u0395\3\2\2\2\u0395\u039c\3\2\2\2\u0396\u0398\7c\2\2\u0397\u0399"+
		"\5\u0088E\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2"+
		"\2\u039a\u039c\5\u00a2R\2\u039b\u0392\3\2\2\2\u039b\u0396\3\2\2\2\u039c"+
		"\u00a3\3\2\2\2\u039d\u039f\5\u00a2R\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\5\u00a6T\2\u03a1\u00a5\3\2\2"+
		"\2\u03a2\u03a6\5\u00f6|\2\u03a3\u03a5\5\u00a8U\2\u03a4\u03a3\3\2\2\2\u03a5"+
		"\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ba\3\2"+
		"\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03aa\7G\2\2\u03aa\u03ab\5\u00a4S\2\u03ab"+
		"\u03af\7H\2\2\u03ac\u03ae\5\u00a8U\2\u03ad\u03ac\3\2\2\2\u03ae\u03b1\3"+
		"\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03ba\3\2\2\2\u03b1"+
		"\u03af\3\2\2\2\u03b2\u03b3\7G\2\2\u03b3\u03b5\7g\2\2\u03b4\u03b6\5\u00f6"+
		"|\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03b8\7H\2\2\u03b8\u03ba\5`\61\2\u03b9\u03a2\3\2\2\2\u03b9\u03a9\3\2"+
		"\2\2\u03b9\u03b2\3\2\2\2\u03ba\u00a7\3\2\2\2\u03bb\u03bd\7K\2\2\u03bc"+
		"\u03be\5\u00d6l\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf"+
		"\3\2\2\2\u03bf\u03c6\7L\2\2\u03c0\u03c2\7G\2\2\u03c1\u03c3\5\u00aaV\2"+
		"\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6"+
		"\7H\2\2\u03c5\u03bb\3\2\2\2\u03c5\u03c0\3\2\2\2\u03c6\u00a9\3\2\2\2\u03c7"+
		"\u03ca\5\u00b6\\\2\u03c8\u03c9\7N\2\2\u03c9\u03cb\7u\2\2\u03ca\u03c8\3"+
		"\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u00ab\3\2\2\2\u03cc\u03d1\5\u0088E\2"+
		"\u03cd\u03cf\5\u00a4S\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d2\3\2\2\2\u03d0\u03d2\5\u00b2Z\2\u03d1\u03ce\3\2\2\2\u03d1\u03d0"+
		"\3\2\2\2\u03d2\u00ad\3\2\2\2\u03d3\u03e3\5\u00d0i\2\u03d4\u03d5\7I\2\2"+
		"\u03d5\u03da\5\u00aeX\2\u03d6\u03d7\7N\2\2\u03d7\u03d9\5\u00aeX\2\u03d8"+
		"\u03d6\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2"+
		"\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03df\7N\2\2\u03de"+
		"\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\7J"+
		"\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03d3\3\2\2\2\u03e2\u03d4\3\2\2\2\u03e3"+
		"\u00af\3\2\2\2\u03e4\u03e5\5\u0096L\2\u03e5\u03e6\5\u00b2Z\2\u03e6\u03e9"+
		"\3\2\2\2\u03e7\u03e9\5N(\2\u03e8\u03e4\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9"+
		"\u00b1\3\2\2\2\u03ea\u03eb\5\u00a2R\2\u03eb\u03ec\5\u00b2Z\2\u03ec\u0400"+
		"\3\2\2\2\u03ed\u03ee\7G\2\2\u03ee\u03ef\5\u00b2Z\2\u03ef\u03f1\7H\2\2"+
		"\u03f0\u03f2\5\u00b4[\2\u03f1\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u0400\3\2\2\2\u03f5\u03f7\7K"+
		"\2\2\u03f6\u03f8\5\u00d6l\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03f9\3\2\2\2\u03f9\u03fb\7L\2\2\u03fa\u03f5\3\2\2\2\u03fb\u03fc\3\2"+
		"\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe"+
		"\u0400\3\2\2\2\u03ff\u03ea\3\2\2\2\u03ff\u03ed\3\2\2\2\u03ff\u03fa\3\2"+
		"\2\2\u03ff\u03fe\3\2\2\2\u0400\u00b3\3\2\2\2\u0401\u0403\7K\2\2\u0402"+
		"\u0404\5\u00d6l\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405"+
		"\3\2\2\2\u0405\u040c\7L\2\2\u0406\u0408\7G\2\2\u0407\u0409\5\u00b6\\\2"+
		"\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040c"+
		"\7H\2\2\u040b\u0401\3\2\2\2\u040b\u0406\3\2\2\2\u040c\u00b5\3\2\2\2\u040d"+
		"\u0412\5\u00acW\2\u040e\u040f\7N\2\2\u040f\u0411\5\u00acW\2\u0410\u040e"+
		"\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413"+
		"\u00b7\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0417\5\u00ba^\2\u0416\u0415"+
		"\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u00b9\3\2\2\2\u041a\u0427\5\u00bc_\2\u041b\u041c\5\u00ceh\2\u041c\u041d"+
		"\7M\2\2\u041d\u0427\3\2\2\2\u041e\u0427\5\u00be`\2\u041f\u0427\5\u00c0"+
		"a\2\u0420\u0427\5\u00caf\2\u0421\u0427\5\u00ccg\2\u0422\u0427\5\u0080"+
		"A\2\u0423\u0427\5\u0082B\2\u0424\u0427\5~@\2\u0425\u0427\7M\2\2\u0426"+
		"\u041a\3\2\2\2\u0426\u041b\3\2\2\2\u0426\u041e\3\2\2\2\u0426\u041f\3\2"+
		"\2\2\u0426\u0420\3\2\2\2\u0426\u0421\3\2\2\2\u0426\u0422\3\2\2\2\u0426"+
		"\u0423\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0425\3\2\2\2\u0427\u00bb\3\2"+
		"\2\2\u0428\u0429\5\u00f6|\2\u0429\u042a\7X\2\2\u042a\u042b\5\u00ba^\2"+
		"\u042b\u0435\3\2\2\2\u042c\u042d\7 \2\2\u042d\u042e\5\u00d6l\2\u042e\u042f"+
		"\7X\2\2\u042f\u0430\5\u00ba^\2\u0430\u0435\3\2\2\2\u0431\u0432\7$\2\2"+
		"\u0432\u0433\7X\2\2\u0433\u0435\5\u00ba^\2\u0434\u0428\3\2\2\2\u0434\u042c"+
		"\3\2\2\2\u0434\u0431\3\2\2\2\u0435\u00bd\3\2\2\2\u0436\u043b\7I\2\2\u0437"+
		"\u043a\5\u0086D\2\u0438\u043a\5\u00b8]\2\u0439\u0437\3\2\2\2\u0439\u0438"+
		"\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043e\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u043f\7J\2\2\u043f\u00bf\3\2"+
		"\2\2\u0440\u0441\7-\2\2\u0441\u0442\7G\2\2\u0442\u0443\5\u00ceh\2\u0443"+
		"\u0444\7H\2\2\u0444\u0447\5\u00ba^\2\u0445\u0446\7\'\2\2\u0446\u0448\5"+
		"\u00ba^\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0450\3\2\2\2"+
		"\u0449\u044a\7<\2\2\u044a\u044b\7G\2\2\u044b\u044c\5\u00ceh\2\u044c\u044d"+
		"\7H\2\2\u044d\u044e\5\u00ba^\2\u044e\u0450\3\2\2\2\u044f\u0440\3\2\2\2"+
		"\u044f\u0449\3\2\2\2\u0450\u00c1\3\2\2\2\u0451\u0452\7+\2\2\u0452\u0453"+
		"\7G\2\2\u0453\u0454\5t;\2\u0454\u0456\7.\2\2\u0455\u0457\5\u00ceh\2\u0456"+
		"\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459\7H"+
		"\2\2\u0459\u045a\5\u00ba^\2\u045a\u00c3\3\2\2\2\u045b\u045c\7+\2\2\u045c"+
		"\u0461\7G\2\2\u045d\u045e\5\u0088E\2\u045e\u045f\5\u008eH\2\u045f\u0462"+
		"\3\2\2\2\u0460\u0462\5\u00ceh\2\u0461\u045d\3\2\2\2\u0461\u0460\3\2\2"+
		"\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465\7M\2\2\u0464\u0466"+
		"\5\u00ceh\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2"+
		"\2\u0467\u0469\7M\2\2\u0468\u046a\5\u00ceh\2\u0469\u0468\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c\7H\2\2\u046c\u046d\5\u00ba"+
		"^\2\u046d\u00c5\3\2\2\2\u046e\u046f\7B\2\2\u046f\u0470\7G\2\2\u0470\u0471"+
		"\5\u00ceh\2\u0471\u0472\7H\2\2\u0472\u0473\5\u00ba^\2\u0473\u00c7\3\2"+
		"\2\2\u0474\u0475\7%\2\2\u0475\u0476\5\u00ba^\2\u0476\u0477\7B\2\2\u0477"+
		"\u0478\7G\2\2\u0478\u0479\5\u00ceh\2\u0479\u047a\7H\2\2\u047a\u047b\7"+
		"M\2\2\u047b\u00c9\3\2\2\2\u047c\u0481\5\u00c6d\2\u047d\u0481\5\u00c8e"+
		"\2\u047e\u0481\5\u00c4c\2\u047f\u0481\5\u00c2b\2\u0480\u047c\3\2\2\2\u0480"+
		"\u047d\3\2\2\2\u0480\u047e\3\2\2\2\u0480\u047f\3\2\2\2\u0481\u00cb\3\2"+
		"\2\2\u0482\u0483\7\60\2\2\u0483\u0484\5\u00f6|\2\u0484\u0485\7M\2\2\u0485"+
		"\u0490\3\2\2\2\u0486\u0487\7#\2\2\u0487\u0490\7M\2\2\u0488\u0489\7\35"+
		"\2\2\u0489\u0490\7M\2\2\u048a\u048c\7\66\2\2\u048b\u048d\5\u00ceh\2\u048c"+
		"\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\7M"+
		"\2\2\u048f\u0482\3\2\2\2\u048f\u0486\3\2\2\2\u048f\u0488\3\2\2\2\u048f"+
		"\u048a\3\2\2\2\u0490\u00cd\3\2\2\2\u0491\u0496\5\u00d0i\2\u0492\u0493"+
		"\7N\2\2\u0493\u0495\5\u00d0i\2\u0494\u0492\3\2\2\2\u0495\u0498\3\2\2\2"+
		"\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u00cf\3\2\2\2\u0498\u0496"+
		"\3\2\2\2\u0499\u049f\5\u00d4k\2\u049a\u049b\5\u00eex\2\u049b\u049c\5\u00d2"+
		"j\2\u049c\u049d\5\u00d0i\2\u049d\u049f\3\2\2\2\u049e\u0499\3\2\2\2\u049e"+
		"\u049a\3\2\2\2\u049f\u00d1\3\2\2\2\u04a0\u04a1\t\b\2\2\u04a1\u00d3\3\2"+
		"\2\2\u04a2\u04a8\5\u00d8m\2\u04a3\u04a4\7W\2\2\u04a4\u04a5\5\u00d4k\2"+
		"\u04a5\u04a6\7X\2\2\u04a6\u04a7\5\u00d4k\2\u04a7\u04a9\3\2\2\2\u04a8\u04a3"+
		"\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00d5\3\2\2\2\u04aa\u04ab\5\u00d4k"+
		"\2\u04ab\u00d7\3\2\2\2\u04ac\u04b1\5\u00dan\2\u04ad\u04ae\7^\2\2\u04ae"+
		"\u04b0\5\u00dan\2\u04af\u04ad\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u00d9\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4"+
		"\u04b9\5\u00dco\2\u04b5\u04b6\7]\2\2\u04b6\u04b8\5\u00dco\2\u04b7\u04b5"+
		"\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u00db\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04c1\5\u00dep\2\u04bd\u04be"+
		"\7f\2\2\u04be\u04c0\5\u00dep\2\u04bf\u04bd\3\2\2\2\u04c0\u04c3\3\2\2\2"+
		"\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u00dd\3\2\2\2\u04c3\u04c1"+
		"\3\2\2\2\u04c4\u04c9\5\u00e0q\2\u04c5\u04c6\7g\2\2\u04c6\u04c8\5\u00e0"+
		"q\2\u04c7\u04c5\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u00df\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04d1\5\u00e2"+
		"r\2\u04cd\u04ce\7e\2\2\u04ce\u04d0\5\u00e2r\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u00e1\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d9\5\u00e4s\2\u04d5\u04d6\t\t\2\2\u04d6"+
		"\u04d8\5\u00e4s\2\u04d7\u04d5\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u00e3\3\2\2\2\u04db\u04d9\3\2\2\2\u04dc"+
		"\u04e1\5\u00e6t\2\u04dd\u04de\t\n\2\2\u04de\u04e0\5\u00e6t\2\u04df\u04dd"+
		"\3\2\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u00e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e9\5\u00e8u\2\u04e5\u04e6"+
		"\t\13\2\2\u04e6\u04e8\5\u00e8u\2\u04e7\u04e5\3\2\2\2\u04e8\u04eb\3\2\2"+
		"\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u00e7\3\2\2\2\u04eb\u04e9"+
		"\3\2\2\2\u04ec\u04f1\5\u00eav\2\u04ed\u04ee\t\f\2\2\u04ee\u04f0\5\u00ea"+
		"v\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\3\2\2\2\u04f1\u04ef\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u00e9\3\2\2\2\u04f3\u04f1\3\2\2\2\u04f4\u04f9\5\u00ec"+
		"w\2\u04f5\u04f6\t\r\2\2\u04f6\u04f8\5\u00ecw\2\u04f7\u04f5\3\2\2\2\u04f8"+
		"\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u00eb\3\2"+
		"\2\2\u04fb\u04f9\3\2\2\2\u04fc\u04fd\7G\2\2\u04fd\u04fe\5\u00b0Y\2\u04fe"+
		"\u04ff\7H\2\2\u04ff\u0500\5\u00ecw\2\u0500\u0503\3\2\2\2\u0501\u0503\5"+
		"\u00eex\2\u0502\u04fc\3\2\2\2\u0502\u0501\3\2\2\2\u0503\u00ed\3\2\2\2"+
		"\u0504\u0515\5\u00f2z\2\u0505\u0506\7_\2\2\u0506\u0515\5\u00eex\2\u0507"+
		"\u0508\7`\2\2\u0508\u0515\5\u00eex\2\u0509\u050a\5\u00f0y\2\u050a\u050b"+
		"\5\u00ecw\2\u050b\u0515\3\2\2\2\u050c\u0512\79\2\2\u050d\u050e\7G\2\2"+
		"\u050e\u050f\5\u00b0Y\2\u050f\u0510\7H\2\2\u0510\u0513\3\2\2\2\u0511\u0513"+
		"\5\u00eex\2\u0512\u050d\3\2\2\2\u0512\u0511\3\2\2\2\u0513\u0515\3\2\2"+
		"\2\u0514\u0504\3\2\2\2\u0514\u0505\3\2\2\2\u0514\u0507\3\2\2\2\u0514\u0509"+
		"\3\2\2\2\u0514\u050c\3\2\2\2\u0515\u00ef\3\2\2\2\u0516\u0517\t\16\2\2"+
		"\u0517\u00f1\3\2\2\2\u0518\u052a\5V,\2\u0519\u051a\7K\2\2\u051a\u051b"+
		"\5\u00ceh\2\u051b\u051c\7L\2\2\u051c\u0529\3\2\2\2\u051d\u051f\7G\2\2"+
		"\u051e\u0520\5\u00f4{\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0521\3\2\2\2\u0521\u0529\7H\2\2\u0522\u0523\7O\2\2\u0523\u0529\5\u00f6"+
		"|\2\u0524\u0525\7P\2\2\u0525\u0529\5\u00f6|\2\u0526\u0529\7_\2\2\u0527"+
		"\u0529\7`\2\2\u0528\u0519\3\2\2\2\u0528\u051d\3\2\2\2\u0528\u0522\3\2"+
		"\2\2\u0528\u0524\3\2\2\2\u0528\u0526\3\2\2\2\u0528\u0527\3\2\2\2\u0529"+
		"\u052c\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u00f3\3\2"+
		"\2\2\u052c\u052a\3\2\2\2\u052d\u0532\5\u00d0i\2\u052e\u052f\7N\2\2\u052f"+
		"\u0531\5\u00d0i\2\u0530\u052e\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u00f5\3\2\2\2\u0534\u0532\3\2\2\2\u0535"+
		"\u0536\7\177\2\2\u0536\u00f7\3\2\2\2\u0537\u0538\t\17\2\2\u0538\u00f9"+
		"\3\2\2\2\u009a\u00fd\u010d\u0115\u0118\u011b\u011e\u0126\u012a\u012d\u0130"+
		"\u0138\u013b\u013e\u0148\u014f\u0152\u0155\u0158\u0169\u0175\u017a\u0187"+
		"\u019a\u01a8\u01b1\u01b9\u01c3\u01c8\u01d0\u01d2\u01db\u01e5\u01e7\u01f0"+
		"\u01f4\u01f7\u01ff\u0202\u0204\u0207\u020d\u0220\u0227\u022e\u0234\u0238"+
		"\u0245\u0249\u0250\u0255\u026a\u0273\u0279\u027d\u0284\u028a\u028e\u0299"+
		"\u029e\u02a4\u02ab\u02ae\u02ba\u02c0\u02c2\u02c5\u02d1\u02d6\u02d8\u02fc"+
		"\u0300\u030c\u0313\u031b\u031d\u0328\u032e\u0333\u0339\u033d\u0346\u0348"+
		"\u034f\u0354\u0358\u035d\u0364\u036a\u0380\u0387\u038b\u0390\u0394\u0398"+
		"\u039b\u039e\u03a6\u03af\u03b5\u03b9\u03bd\u03c2\u03c5\u03ca\u03ce\u03d1"+
		"\u03da\u03de\u03e2\u03e8\u03f3\u03f7\u03fc\u03ff\u0403\u0408\u040b\u0412"+
		"\u0418\u0426\u0434\u0439\u043b\u0447\u044f\u0456\u0461\u0465\u0469\u0480"+
		"\u048c\u048f\u0496\u049e\u04a8\u04b1\u04b9\u04c1\u04c9\u04d1\u04d9\u04e1"+
		"\u04e9\u04f1\u04f9\u0502\u0512\u0514\u051f\u0528\u052a\u0532";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}