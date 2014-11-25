// Generated from json/JSON.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		STRING=10, NUMBER=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS"
	};


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13E"+
		"\n\13\f\13\16\13H\13\13\3\13\3\13\3\f\3\f\3\f\5\fO\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\5\17Z\n\17\3\17\3\17\3\17\6\17_\n\17\r\17\16\17"+
		"`\3\17\5\17d\n\17\3\17\5\17g\n\17\3\17\3\17\3\17\3\17\5\17m\n\17\3\17"+
		"\5\17p\n\17\3\20\3\20\3\20\7\20u\n\20\f\20\16\20x\13\20\5\20z\n\20\3\21"+
		"\3\21\5\21~\n\21\3\21\3\21\3\22\6\22\u0083\n\22\r\22\16\22\u0084\3\22"+
		"\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33"+
		"\2\35\r\37\2!\2#\16\3\2\n\4\2$$^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch"+
		"\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\u0090\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\3"+
		"%\3\2\2\2\5*\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2"+
		"\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25A\3\2\2\2\27K\3\2\2\2\31P\3"+
		"\2\2\2\33V\3\2\2\2\35o\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#\u0082\3\2\2\2%&"+
		"\7p\2\2&\'\7w\2\2\'(\7n\2\2()\7n\2\2)\4\3\2\2\2*+\7v\2\2+,\7t\2\2,-\7"+
		"w\2\2-.\7g\2\2.\6\3\2\2\2/\60\7<\2\2\60\b\3\2\2\2\61\62\7]\2\2\62\n\3"+
		"\2\2\2\63\64\7}\2\2\64\f\3\2\2\2\65\66\7.\2\2\66\16\3\2\2\2\678\7_\2\2"+
		"8\20\3\2\2\29:\7\177\2\2:\22\3\2\2\2;<\7h\2\2<=\7c\2\2=>\7n\2\2>?\7u\2"+
		"\2?@\7g\2\2@\24\3\2\2\2AF\7$\2\2BE\5\27\f\2CE\n\2\2\2DB\3\2\2\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7$\2\2J\26\3"+
		"\2\2\2KN\7^\2\2LO\t\3\2\2MO\5\31\r\2NL\3\2\2\2NM\3\2\2\2O\30\3\2\2\2P"+
		"Q\7w\2\2QR\5\33\16\2RS\5\33\16\2ST\5\33\16\2TU\5\33\16\2U\32\3\2\2\2V"+
		"W\t\4\2\2W\34\3\2\2\2XZ\7/\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\37\20"+
		"\2\\^\7\60\2\2]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2"+
		"\2\2bd\5!\21\2cb\3\2\2\2cd\3\2\2\2dp\3\2\2\2eg\7/\2\2fe\3\2\2\2fg\3\2"+
		"\2\2gh\3\2\2\2hi\5\37\20\2ij\5!\21\2jp\3\2\2\2km\7/\2\2lk\3\2\2\2lm\3"+
		"\2\2\2mn\3\2\2\2np\5\37\20\2oY\3\2\2\2of\3\2\2\2ol\3\2\2\2p\36\3\2\2\2"+
		"qz\7\62\2\2rv\t\6\2\2su\t\5\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2yr\3\2\2\2z \3\2\2\2{}\t\7\2\2|~\t\b\2"+
		"\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\5\37\20\2\u0080\"\3\2\2"+
		"\2\u0081\u0083\t\t\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\22\2\2"+
		"\u0087$\3\2\2\2\20\2DFNY`cflovy}\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}