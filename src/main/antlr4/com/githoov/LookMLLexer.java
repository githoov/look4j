// Generated from LookML.g4 by ANTLR 4.6

    package net.snowflake.look4j;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LookMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VIEW=1, SQL_TABLE_NAME=2, FIELD=3, SQL=4, LABEL=5, VIEW_LABEL=6, TYPE=7, 
		LINK=8, URL=9, DESCRIPTION=10, DRILL_FIELDS=11, DERIVED_TABLE=12, SQL_TRIGGER_VALUE=13, 
		SORTKEYS=14, STRING=15, QUOTED_STRING=16, TABLE_REF=17, WS=18, COMMENT=19, 
		DELIM=20, SEP=21, LBRACE=22, RBRACE=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VIEW", "SQL_TABLE_NAME", "FIELD", "SQL", "LABEL", "VIEW_LABEL", "TYPE", 
		"LINK", "URL", "DESCRIPTION", "DRILL_FIELDS", "DERIVED_TABLE", "SQL_TRIGGER_VALUE", 
		"SORTKEYS", "STRING", "QUOTED_STRING", "TABLE_REF", "WS", "COMMENT", "DELIM", 
		"SEP", "LBRACE", "RBRACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'view'", "'sql_table_name'", null, "'sql'", "'label'", "'view_label'", 
		"'type'", "'link'", "'url'", "'description'", "'drill_fields'", "'derived_table'", 
		"'sql_trigger_value'", "'sortkeys'", null, null, null, null, null, "';;'", 
		"':'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VIEW", "SQL_TABLE_NAME", "FIELD", "SQL", "LABEL", "VIEW_LABEL", 
		"TYPE", "LINK", "URL", "DESCRIPTION", "DRILL_FIELDS", "DERIVED_TABLE", 
		"SQL_TRIGGER_VALUE", "SORTKEYS", "STRING", "QUOTED_STRING", "TABLE_REF", 
		"WS", "COMMENT", "DELIM", "SEP", "LBRACE", "RBRACE"
	};
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


	public LookMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LookML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0107\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u00d3\n\20"+
		"\r\20\16\20\u00d4\3\21\3\21\7\21\u00d9\n\21\f\21\16\21\u00dc\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00eb"+
		"\n\22\r\22\16\22\u00ec\3\23\6\23\u00f0\n\23\r\23\16\23\u00f1\3\23\3\23"+
		"\3\24\3\24\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\u00da\2\31\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\3\2\6\n\2$$),.\61>@C]__aac|\4\2\f\f\17\17\t\2$$\60\60"+
		"<<C\\^^aac|\5\2\13\f\17\17\"\"\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\7j\3\2"+
		"\2\2\tl\3\2\2\2\13p\3\2\2\2\rv\3\2\2\2\17\u0081\3\2\2\2\21\u0086\3\2\2"+
		"\2\23\u008b\3\2\2\2\25\u008f\3\2\2\2\27\u009b\3\2\2\2\31\u00a8\3\2\2\2"+
		"\33\u00b6\3\2\2\2\35\u00c8\3\2\2\2\37\u00d2\3\2\2\2!\u00d6\3\2\2\2#\u00df"+
		"\3\2\2\2%\u00ef\3\2\2\2\'\u00f5\3\2\2\2)\u00fe\3\2\2\2+\u0101\3\2\2\2"+
		"-\u0103\3\2\2\2/\u0105\3\2\2\2\61\62\7x\2\2\62\63\7k\2\2\63\64\7g\2\2"+
		"\64\65\7y\2\2\65\4\3\2\2\2\66\67\7u\2\2\678\7s\2\289\7n\2\29:\7a\2\2:"+
		";\7v\2\2;<\7c\2\2<=\7d\2\2=>\7n\2\2>?\7g\2\2?@\7a\2\2@A\7p\2\2AB\7c\2"+
		"\2BC\7o\2\2CD\7g\2\2D\6\3\2\2\2EF\7f\2\2FG\7k\2\2GH\7o\2\2HI\7g\2\2IJ"+
		"\7p\2\2JK\7u\2\2KL\7k\2\2LM\7q\2\2Mk\7p\2\2NO\7f\2\2OP\7k\2\2PQ\7o\2\2"+
		"QR\7g\2\2RS\7p\2\2ST\7u\2\2TU\7k\2\2UV\7q\2\2VW\7p\2\2WX\7a\2\2XY\7i\2"+
		"\2YZ\7t\2\2Z[\7q\2\2[\\\7w\2\2\\k\7r\2\2]^\7o\2\2^_\7g\2\2_`\7c\2\2`a"+
		"\7u\2\2ab\7w\2\2bc\7t\2\2ck\7g\2\2de\7h\2\2ef\7k\2\2fg\7n\2\2gh\7v\2\2"+
		"hi\7g\2\2ik\7t\2\2jE\3\2\2\2jN\3\2\2\2j]\3\2\2\2jd\3\2\2\2k\b\3\2\2\2"+
		"lm\7u\2\2mn\7s\2\2no\7n\2\2o\n\3\2\2\2pq\7n\2\2qr\7c\2\2rs\7d\2\2st\7"+
		"g\2\2tu\7n\2\2u\f\3\2\2\2vw\7x\2\2wx\7k\2\2xy\7g\2\2yz\7y\2\2z{\7a\2\2"+
		"{|\7n\2\2|}\7c\2\2}~\7d\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\16\3\2"+
		"\2\2\u0081\u0082\7v\2\2\u0082\u0083\7{\2\2\u0083\u0084\7r\2\2\u0084\u0085"+
		"\7g\2\2\u0085\20\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7p\2\2\u0089\u008a\7m\2\2\u008a\22\3\2\2\2\u008b\u008c\7w\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7n\2\2\u008e\24\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7u\2\2\u0092\u0093\7e\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7r\2\2\u0096\u0097\7v\2\2\u0097\u0098\7k\2\2"+
		"\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\26\3\2\2\2\u009b\u009c\7"+
		"f\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7n\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7u\2\2"+
		"\u00a7\30\3\2\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7"+
		"t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7x\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7f\2\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7d\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5\32\3\2\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7s\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7a\2\2"+
		"\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7i\2\2\u00be\u00bf\7i\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\u00c2\7a\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7n\2\2"+
		"\u00c5\u00c6\7w\2\2\u00c6\u00c7\7g\2\2\u00c7\34\3\2\2\2\u00c8\u00c9\7"+
		"u\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7m\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7{\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\36\3\2\2\2\u00d1\u00d3\t\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5 \3\2\2\2\u00d6\u00da"+
		"\7$\2\2\u00d7\u00d9\n\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7$\2\2\u00de\"\3\2\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1"+
		"\7}\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e3\7C\2\2\u00e3\u00e4\7D\2\2\u00e4"+
		"\u00e5\7N\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7\177\2\2\u00e7\u00e8\7\60"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed$\3\2\2\2"+
		"\u00ee\u00f0\t\5\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\23\2\2"+
		"\u00f4&\3\2\2\2\u00f5\u00f9\7%\2\2\u00f6\u00f8\n\3\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\b\24\3\2\u00fd(\3\2\2\2"+
		"\u00fe\u00ff\7=\2\2\u00ff\u0100\7=\2\2\u0100*\3\2\2\2\u0101\u0102\7<\2"+
		"\2\u0102,\3\2\2\2\u0103\u0104\7}\2\2\u0104.\3\2\2\2\u0105\u0106\7\177"+
		"\2\2\u0106\60\3\2\2\2\t\2j\u00d4\u00da\u00ec\u00f1\u00f9\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}