// Generated from smalltalk/Smalltalk.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmalltalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PIPE=1, PERIOD=2, CARROT=3, COLON=4, SEMI_COLON=5, ASSIGNMENT=6, MINUS=7, 
		HASH=8, DOLLAR=9, EXP=10, HEX=11, LITARR_START=12, CLOSE_PAREN=13, OPEN_PAREN=14, 
		DYNDICT_START=15, DYNARR_END=16, DYNARR_START=17, BLOCK_START=18, BLOCK_END=19, 
		LT=20, GT=21, RESERVED_WORD=22, DIGIT=23, HEXDIGIT=24, BINARY_SELECTOR=25, 
		IDENTIFIER=26, KEYWORD=27, BLOCK_PARAM=28, CHARACTER_CONSTANT=29, SEPARATOR=30, 
		STRING=31, COMMENT=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '"
	};
	public static final String[] ruleNames = {
		"PIPE", "PERIOD", "CARROT", "COLON", "SEMI_COLON", "ASSIGNMENT", "MINUS", 
		"HASH", "DOLLAR", "EXP", "HEX", "LITARR_START", "CLOSE_PAREN", "OPEN_PAREN", 
		"DYNDICT_START", "DYNARR_END", "DYNARR_START", "BLOCK_START", "BLOCK_END", 
		"LT", "GT", "RESERVED_WORD", "DIGIT", "HEXDIGIT", "BINARY_SELECTOR", "IDENTIFIER", 
		"KEYWORD", "BLOCK_PARAM", "CHARACTER_CONSTANT", "SEPARATOR", "STRING", 
		"COMMENT"
	};


	public SmalltalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Smalltalk.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00b8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0088\n\27\3\30\3\30\3\31"+
		"\3\31\3\32\6\32\u008f\n\32\r\32\16\32\u0090\3\33\3\33\7\33\u0095\n\33"+
		"\f\33\16\33\u0098\13\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5"+
		"\36\u00a3\n\36\3\37\3\37\3 \3 \7 \u00a9\n \f \16 \u00ac\13 \3 \3 \3!\3"+
		"!\7!\u00b2\n!\f!\16!\u00b5\13!\3!\3!\4\u00aa\u00b3\2\"\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\b\3\2"+
		"\62;\5\2\62;CHch\t\2\'(,/\61\61>B^^~~\u0080\u0080\4\2C\\c|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3"+
		"C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17P"+
		"\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31\\\3\2\2\2"+
		"\33_\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#h\3\2\2\2%j\3\2\2\2\'l"+
		"\3\2\2\2)n\3\2\2\2+p\3\2\2\2-\u0087\3\2\2\2/\u0089\3\2\2\2\61\u008b\3"+
		"\2\2\2\63\u008e\3\2\2\2\65\u0092\3\2\2\2\67\u0099\3\2\2\29\u009c\3\2\2"+
		"\2;\u009f\3\2\2\2=\u00a4\3\2\2\2?\u00a6\3\2\2\2A\u00af\3\2\2\2CD\7~\2"+
		"\2D\4\3\2\2\2EF\7\60\2\2F\6\3\2\2\2GH\7`\2\2H\b\3\2\2\2IJ\7<\2\2J\n\3"+
		"\2\2\2KL\7=\2\2L\f\3\2\2\2MN\7<\2\2NO\7?\2\2O\16\3\2\2\2PQ\7/\2\2Q\20"+
		"\3\2\2\2RS\7%\2\2S\22\3\2\2\2TU\7&\2\2U\24\3\2\2\2VW\7g\2\2W\26\3\2\2"+
		"\2XY\7\63\2\2YZ\78\2\2Z[\7t\2\2[\30\3\2\2\2\\]\7%\2\2]^\7*\2\2^\32\3\2"+
		"\2\2_`\7+\2\2`\34\3\2\2\2ab\7*\2\2b\36\3\2\2\2cd\7%\2\2de\7}\2\2e \3\2"+
		"\2\2fg\7\177\2\2g\"\3\2\2\2hi\7}\2\2i$\3\2\2\2jk\7]\2\2k&\3\2\2\2lm\7"+
		"_\2\2m(\3\2\2\2no\7>\2\2o*\3\2\2\2pq\7@\2\2q,\3\2\2\2rs\7p\2\2st\7k\2"+
		"\2t\u0088\7n\2\2uv\7v\2\2vw\7t\2\2wx\7w\2\2x\u0088\7g\2\2yz\7h\2\2z{\7"+
		"c\2\2{|\7n\2\2|}\7u\2\2}\u0088\7g\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0088\7h\2\2\u0082\u0083\7u\2\2\u0083\u0084\7w\2\2"+
		"\u0084\u0085\7r\2\2\u0085\u0086\7g\2\2\u0086\u0088\7t\2\2\u0087r\3\2\2"+
		"\2\u0087u\3\2\2\2\u0087y\3\2\2\2\u0087~\3\2\2\2\u0087\u0082\3\2\2\2\u0088"+
		".\3\2\2\2\u0089\u008a\t\2\2\2\u008a\60\3\2\2\2\u008b\u008c\t\3\2\2\u008c"+
		"\62\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\64\3\2\2\2\u0092\u0096"+
		"\t\5\2\2\u0093\u0095\t\6\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\66\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009a\5\65\33\2\u009a\u009b\5\t\5\2\u009b8\3\2\2\2\u009c\u009d"+
		"\5\t\5\2\u009d\u009e\5\65\33\2\u009e:\3\2\2\2\u009f\u00a2\5\23\n\2\u00a0"+
		"\u00a3\5\61\31\2\u00a1\u00a3\5\23\n\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3<\3\2\2\2\u00a4\u00a5\t\7\2\2\u00a5>\3\2\2\2\u00a6\u00aa"+
		"\7)\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7)\2\2\u00ae@\3\2\2\2\u00af\u00b3\7$\2\2\u00b0\u00b2"+
		"\13\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\7$\2\2\u00b7B\3\2\2\2\t\2\u0087\u0090\u0096\u00a2\u00aa\u00b3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}