// Generated from /Users/sgr/develop/ideaProject/ides/dsl/src/main/resources/IdesDsl.g4 by ANTLR 4.7.2

    package ides.dsl.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IdesDslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, AS=4, INTO=5, LOAD=6, SAVE=7, OPTIONS=8, WHERE=9, 
		OVERWRITE=10, APPEND=11, ERRORIfExists=12, IGNORE=13, PARTITIONBY=14, 
		DOT=15, EOQ=16, MUMERIC=17, IDENTIFIER=18, QUOTED_TEXT=19, STRING_TEXT=20, 
		BLOCK_STRING_TEXT=21, LINE_COMMENT=22, BLOCK_COMMENT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "AS", "INTO", "LOAD", "SAVE", "OPTIONS", "WHERE", 
			"OVERWRITE", "APPEND", "ERRORIfExists", "IGNORE", "PARTITIONBY", "DOT", 
			"EOQ", "MUMERIC", "IDENTIFIER", "QUOTED_TEXT", "STRING_TEXT", "BLOCK_STRING_TEXT", 
			"DIGIT", "LETTER", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'and'", "'='", "'as'", "'into'", "'load'", "'save'", "'options'", 
			"'where'", "'overwrite'", "'append'", "'errorIfExists'", "'ignore'", 
			null, "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "AS", "INTO", "LOAD", "SAVE", "OPTIONS", "WHERE", 
			"OVERWRITE", "APPEND", "ERRORIfExists", "IGNORE", "PARTITIONBY", "DOT", 
			"EOQ", "MUMERIC", "IDENTIFIER", "QUOTED_TEXT", "STRING_TEXT", "BLOCK_STRING_TEXT", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public IdesDslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IdesDsl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009c\n\17\3\20\3\20"+
		"\3\21\3\21\3\22\5\22\u00a3\n\22\3\22\7\22\u00a6\n\22\f\22\16\22\u00a9"+
		"\13\22\3\22\5\22\u00ac\n\22\3\22\6\22\u00af\n\22\r\22\16\22\u00b0\3\23"+
		"\3\23\3\23\3\23\7\23\u00b7\n\23\f\23\16\23\u00ba\13\23\3\23\3\23\3\23"+
		"\3\23\6\23\u00c0\n\23\r\23\16\23\u00c1\5\23\u00c4\n\23\3\24\3\24\3\24"+
		"\3\24\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u00d5\n\25\f\25\16\25\u00d8\13\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00df\n\25\f\25\16\25\u00e2\13\25\3\25\5\25\u00e5\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u00f9\n\26\f\26\16\26\u00fc\13\26\3\26"+
		"\3\26\3\26\5\26\u0101\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31"+
		"\u010b\n\31\f\31\16\31\u010e\13\31\3\31\3\31\3\31\5\31\u0113\n\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u011b\n\32\f\32\16\32\u011e\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\6\33\u0126\n\33\r\33\16\33\u0127\3\33\3\33\b"+
		"\u00cb\u00d6\u00e0\u00ed\u00fa\u011c\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\2/\2\61\30\63\31\65\32\3\2\n\4\2--//\4\2^^bb\4\2))^^\4\2$$^^\3\2"+
		"\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0143\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\3\67\3\2\2\2\59\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13B\3\2\2\2\rG\3\2\2"+
		"\2\17L\3\2\2\2\21Q\3\2\2\2\23Y\3\2\2\2\25_\3\2\2\2\27i\3\2\2\2\31p\3\2"+
		"\2\2\33~\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a2"+
		"\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00e4\3\2\2\2+\u0100\3\2\2\2"+
		"-\u0102\3\2\2\2/\u0104\3\2\2\2\61\u0106\3\2\2\2\63\u0116\3\2\2\2\65\u0125"+
		"\3\2\2\2\678\7.\2\28\4\3\2\2\29:\7c\2\2:;\7p\2\2;<\7f\2\2<\6\3\2\2\2="+
		">\7?\2\2>\b\3\2\2\2?@\7c\2\2@A\7u\2\2A\n\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7"+
		"v\2\2EF\7q\2\2F\f\3\2\2\2GH\7n\2\2HI\7q\2\2IJ\7c\2\2JK\7f\2\2K\16\3\2"+
		"\2\2LM\7u\2\2MN\7c\2\2NO\7x\2\2OP\7g\2\2P\20\3\2\2\2QR\7q\2\2RS\7r\2\2"+
		"ST\7v\2\2TU\7k\2\2UV\7q\2\2VW\7p\2\2WX\7u\2\2X\22\3\2\2\2YZ\7y\2\2Z[\7"+
		"j\2\2[\\\7g\2\2\\]\7t\2\2]^\7g\2\2^\24\3\2\2\2_`\7q\2\2`a\7x\2\2ab\7g"+
		"\2\2bc\7t\2\2cd\7y\2\2de\7t\2\2ef\7k\2\2fg\7v\2\2gh\7g\2\2h\26\3\2\2\2"+
		"ij\7c\2\2jk\7r\2\2kl\7r\2\2lm\7g\2\2mn\7p\2\2no\7f\2\2o\30\3\2\2\2pq\7"+
		"g\2\2qr\7t\2\2rs\7t\2\2st\7q\2\2tu\7t\2\2uv\7K\2\2vw\7h\2\2wx\7G\2\2x"+
		"y\7z\2\2yz\7k\2\2z{\7u\2\2{|\7v\2\2|}\7u\2\2}\32\3\2\2\2~\177\7k\2\2\177"+
		"\u0080\7i\2\2\u0080\u0081\7p\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2"+
		"\u0083\u0084\7g\2\2\u0084\34\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7"+
		"c\2\2\u0087\u0088\7t\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7D\2\2\u008f\u009c\7{\2\2\u0090\u0091\7r\2\2\u0091\u0092\7c\2\2"+
		"\u0092\u0093\7t\2\2\u0093\u0094\7v\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7k\2\2\u0097\u0098\7q\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7d\2\2\u009a\u009c\7{\2\2\u009b\u0085\3\2\2\2\u009b\u0090\3\2\2"+
		"\2\u009c\36\3\2\2\2\u009d\u009e\7\60\2\2\u009e \3\2\2\2\u009f\u00a0\7"+
		"=\2\2\u00a0\"\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a6\5-\27\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\5-\27\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"$\3\2\2\2\u00b2\u00b8\5/\30\2\u00b3\u00b7\5-\27\2\u00b4\u00b7\5/\30\2"+
		"\u00b5\u00b7\7a\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00c4\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\7a\2\2\u00bc\u00c0\5-\27"+
		"\2\u00bd\u00c0\5/\30\2\u00be\u00c0\7a\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00b2\3\2\2\2\u00c3\u00bb\3\2"+
		"\2\2\u00c4&\3\2\2\2\u00c5\u00cb\7b\2\2\u00c6\u00ca\n\3\2\2\u00c7\u00c8"+
		"\7^\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7b\2\2\u00cf(\3\2\2\2\u00d0\u00d6"+
		"\7)\2\2\u00d1\u00d5\n\4\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d5\13\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00e5\7)\2\2\u00da\u00e0\7$\2\2\u00db\u00df\n\5\2\2\u00dc\u00dd\7^\2"+
		"\2\u00dd\u00df\13\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7$\2\2\u00e4\u00d0\3\2\2\2\u00e4"+
		"\u00da\3\2\2\2\u00e5*\3\2\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e8\7)\2\2\u00e8"+
		"\u00e9\7)\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7)\2\2\u00f1\u00f2\7)\2"+
		"\2\u00f2\u0101\7)\2\2\u00f3\u00f4\7$\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f6"+
		"\7$\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7$\2\2\u00fe\u00ff\7$\2\2\u00ff\u0101"+
		"\7$\2\2\u0100\u00e6\3\2\2\2\u0100\u00f3\3\2\2\2\u0101,\3\2\2\2\u0102\u0103"+
		"\t\6\2\2\u0103.\3\2\2\2\u0104\u0105\t\7\2\2\u0105\60\3\2\2\2\u0106\u0107"+
		"\7/\2\2\u0107\u0108\7/\2\2\u0108\u010c\3\2\2\2\u0109\u010b\n\b\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u0112\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0113\7\f\2\2\u0110"+
		"\u0111\7\17\2\2\u0111\u0113\7\f\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b\31\2\2\u0115"+
		"\62\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7,\2\2\u0118\u011c\3\2\2"+
		"\2\u0119\u011b\13\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0120\7,\2\2\u0120\u0121\7\61\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\b\32\2\2\u0123\64\3\2\2\2\u0124\u0126\t\t\2\2\u0125\u0124\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\b\33\2\2\u012a\66\3\2\2\2\33\2\u009b\u00a2\u00a7"+
		"\u00ab\u00b0\u00b6\u00b8\u00bf\u00c1\u00c3\u00c9\u00cb\u00d4\u00d6\u00de"+
		"\u00e0\u00e4\u00ed\u00fa\u0100\u010c\u0112\u011c\u0127\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}