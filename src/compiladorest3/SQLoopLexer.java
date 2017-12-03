// Generated from SQLoop.g4 by ANTLR 4.7
package compiladorest3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLoopLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, PalavrasChave=29, IDENT=30, INTEIRO=31, 
		CADEIA=32, IGNORADOS=33, COMENTARIO=34, ERROR=35, COMENTARIO_ERRO=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "PalavrasChave", "LETRA_MINUSCULA", "LETRA_MAIUSCULA", 
		"NUMERO", "CHAR", "IDENT", "INTEIRO", "CADEIA", "IGNORADOS", "COMENTARIO", 
		"ERROR", "COMENTARIO_ERRO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@DDL'", "'@endDDL'", "'Table'", "'{'", "'}'", "'->'", "';'", "'aincrement'", 
		"'('", "')'", "'integer'", "'unsigned'", "'()'", "'string'", "'date'", 
		"'genTimestamps'", "'Relationships'", "'belongsTo'", "'@DML'", "'@endDML'", 
		"'='", "'['", "']'", "'''", "'-'", "','", "'where'", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "PalavrasChave", "IDENT", "INTEIRO", "CADEIA", 
		"IGNORADOS", "COMENTARIO", "ERROR", "COMENTARIO_ERRO"
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


	public SQLoopLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLoop.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 36:
			IGNORADOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			COMENTARIO_ERRO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IGNORADOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        skip();
			    
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado\n"); 
		}
	}
	private void COMENTARIO_ERRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado\n"); 
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0189\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u014a\n\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3#\5#\u0157\n#\3#\3#\3#\3#\7#\u015d\n#\f#\16#\u0160"+
		"\13#\3$\6$\u0163\n$\r$\16$\u0164\3%\3%\7%\u0169\n%\f%\16%\u016c\13%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\7\'\u0175\n\'\f\'\16\'\u0178\13\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\7)\u0182\n)\f)\16)\u0185\13)\3)\3)\3)\2\2*\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?\2A\2C\2"+
		"E G!I\"K#M$O%Q&\3\2\t\n\2\"#&\')\61<B]_aa~~\u0080\u0080\4\2BBaa\5\2&&"+
		"BBaa\4\2\f\f$$\5\2\13\f\17\17\"\"\3\2%%\5\2\f\f\17\17%%\2\u0199\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\3S\3\2\2\2\5X\3\2\2\2\7`\3\2\2\2\tf\3\2\2\2\13h\3\2\2\2\rj\3"+
		"\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23z\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31"+
		"\u0086\3\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2\2\37\u0099\3\2\2\2!\u009e"+
		"\3\2\2\2#\u00ac\3\2\2\2%\u00ba\3\2\2\2\'\u00c4\3\2\2\2)\u00c9\3\2\2\2"+
		"+\u00d1\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9"+
		"\3\2\2\2\65\u00db\3\2\2\2\67\u00dd\3\2\2\29\u00e3\3\2\2\2;\u0149\3\2\2"+
		"\2=\u014b\3\2\2\2?\u014d\3\2\2\2A\u014f\3\2\2\2C\u0151\3\2\2\2E\u0156"+
		"\3\2\2\2G\u0162\3\2\2\2I\u0166\3\2\2\2K\u016f\3\2\2\2M\u0172\3\2\2\2O"+
		"\u017c\3\2\2\2Q\u017f\3\2\2\2ST\7B\2\2TU\7F\2\2UV\7F\2\2VW\7N\2\2W\4\3"+
		"\2\2\2XY\7B\2\2YZ\7g\2\2Z[\7p\2\2[\\\7f\2\2\\]\7F\2\2]^\7F\2\2^_\7N\2"+
		"\2_\6\3\2\2\2`a\7V\2\2ab\7c\2\2bc\7d\2\2cd\7n\2\2de\7g\2\2e\b\3\2\2\2"+
		"fg\7}\2\2g\n\3\2\2\2hi\7\177\2\2i\f\3\2\2\2jk\7/\2\2kl\7@\2\2l\16\3\2"+
		"\2\2mn\7=\2\2n\20\3\2\2\2op\7c\2\2pq\7k\2\2qr\7p\2\2rs\7e\2\2st\7t\2\2"+
		"tu\7g\2\2uv\7o\2\2vw\7g\2\2wx\7p\2\2xy\7v\2\2y\22\3\2\2\2z{\7*\2\2{\24"+
		"\3\2\2\2|}\7+\2\2}\26\3\2\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081"+
		"\7v\2\2\u0081\u0082\7g\2\2\u0082\u0083\7i\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7t\2\2\u0085\30\3\2\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7k\2\2\u008a\u008b\7i\2\2\u008b\u008c\7p\2\2"+
		"\u008c\u008d\7g\2\2\u008d\u008e\7f\2\2\u008e\32\3\2\2\2\u008f\u0090\7"+
		"*\2\2\u0090\u0091\7+\2\2\u0091\34\3\2\2\2\u0092\u0093\7u\2\2\u0093\u0094"+
		"\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097"+
		"\u0098\7i\2\2\u0098\36\3\2\2\2\u0099\u009a\7f\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d \3\2\2\2\u009e\u009f\7i\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7o\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7r\2\2\u00aa"+
		"\u00ab\7u\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7T\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2"+
		"\u00b2\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7j\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"$\3\2\2\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7q\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7u\2\2"+
		"\u00c1\u00c2\7V\2\2\u00c2\u00c3\7q\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7B\2"+
		"\2\u00c5\u00c6\7F\2\2\u00c6\u00c7\7O\2\2\u00c7\u00c8\7N\2\2\u00c8(\3\2"+
		"\2\2\u00c9\u00ca\7B\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd"+
		"\7f\2\2\u00cd\u00ce\7F\2\2\u00ce\u00cf\7O\2\2\u00cf\u00d0\7N\2\2\u00d0"+
		"*\3\2\2\2\u00d1\u00d2\7?\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7]\2\2\u00d4."+
		"\3\2\2\2\u00d5\u00d6\7_\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7)\2\2\u00d8"+
		"\62\3\2\2\2\u00d9\u00da\7/\2\2\u00da\64\3\2\2\2\u00db\u00dc\7.\2\2\u00dc"+
		"\66\3\2\2\2\u00dd\u00de\7y\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e28\3\2\2\2\u00e3\u00e4\7&\2\2\u00e4"+
		":\3\2\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7d\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u014a\7g\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7n\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		"\u00f4\7j\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7r\2\2\u00f6\u014a\7u\2\2"+
		"\u00f7\u00f8\7c\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb"+
		"\7e\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7o\2\2\u00fe"+
		"\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u014a\7v\2\2\u0101\u0102\7k\2\2"+
		"\u0102\u0103\7p\2\2\u0103\u0104\7v\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7i\2\2\u0106\u0107\7g\2\2\u0107\u014a\7t\2\2\u0108\u0109\7u\2\2\u0109"+
		"\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2"+
		"\u010d\u014a\7i\2\2\u010e\u010f\7w\2\2\u010f\u0110\7p\2\2\u0110\u0111"+
		"\7u\2\2\u0111\u0112\7k\2\2\u0112\u0113\7i\2\2\u0113\u0114\7p\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u014a\7f\2\2\u0116\u0117\7i\2\2\u0117\u0118\7g\2\2"+
		"\u0118\u0119\7p\2\2\u0119\u011a\7V\2\2\u011a\u011b\7k\2\2\u011b\u011c"+
		"\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7u\2\2\u011e\u011f\7v\2\2\u011f"+
		"\u0120\7c\2\2\u0120\u0121\7o\2\2\u0121\u0122\7r\2\2\u0122\u014a\7u\2\2"+
		"\u0123\u0124\7d\2\2\u0124\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\u0127"+
		"\7q\2\2\u0127\u0128\7p\2\2\u0128\u0129\7i\2\2\u0129\u012a\7u\2\2\u012a"+
		"\u012b\7V\2\2\u012b\u014a\7q\2\2\u012c\u012d\7i\2\2\u012d\u012e\7g\2\2"+
		"\u012e\u012f\7v\2\2\u012f\u0130\7V\2\2\u0130\u0131\7k\2\2\u0131\u0132"+
		"\7o\2\2\u0132\u0133\7g\2\2\u0133\u0134\7u\2\2\u0134\u0135\7v\2\2\u0135"+
		"\u0136\7c\2\2\u0136\u0137\7o\2\2\u0137\u0138\7r\2\2\u0138\u014a\7u\2\2"+
		"\u0139\u013a\7y\2\2\u013a\u013b\7j\2\2\u013b\u013c\7g\2\2\u013c\u013d"+
		"\7t\2\2\u013d\u014a\7g\2\2\u013e\u013f\7j\2\2\u013f\u0140\7c\2\2\u0140"+
		"\u0141\7u\2\2\u0141\u0142\7O\2\2\u0142\u0143\7c\2\2\u0143\u0144\7p\2\2"+
		"\u0144\u014a\7{\2\2\u0145\u0146\7f\2\2\u0146\u0147\7c\2\2\u0147\u0148"+
		"\7v\2\2\u0148\u014a\7g\2\2\u0149\u00e5\3\2\2\2\u0149\u00ea\3\2\2\2\u0149"+
		"\u00f7\3\2\2\2\u0149\u0101\3\2\2\2\u0149\u0108\3\2\2\2\u0149\u010e\3\2"+
		"\2\2\u0149\u0116\3\2\2\2\u0149\u0123\3\2\2\2\u0149\u012c\3\2\2\2\u0149"+
		"\u0139\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0145\3\2\2\2\u014a<\3\2\2\2"+
		"\u014b\u014c\4c|\2\u014c>\3\2\2\2\u014d\u014e\4C\\\2\u014e@\3\2\2\2\u014f"+
		"\u0150\4\62;\2\u0150B\3\2\2\2\u0151\u0152\t\2\2\2\u0152D\3\2\2\2\u0153"+
		"\u0157\t\3\2\2\u0154\u0157\5=\37\2\u0155\u0157\5? \2\u0156\u0153\3\2\2"+
		"\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u015e\3\2\2\2\u0158\u015d"+
		"\5? \2\u0159\u015d\5=\37\2\u015a\u015d\5G$\2\u015b\u015d\t\4\2\2\u015c"+
		"\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"F\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\5A!\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165H\3\2\2\2"+
		"\u0166\u016a\7$\2\2\u0167\u0169\n\5\2\2\u0168\u0167\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\7$\2\2\u016eJ\3\2\2\2\u016f\u0170\t\6\2\2\u0170"+
		"\u0171\b&\2\2\u0171L\3\2\2\2\u0172\u0176\7%\2\2\u0173\u0175\n\7\2\2\u0174"+
		"\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7%\2\2\u017a"+
		"\u017b\b\'\3\2\u017bN\3\2\2\2\u017c\u017d\13\2\2\2\u017d\u017e\b(\4\2"+
		"\u017eP\3\2\2\2\u017f\u0183\7%\2\2\u0180\u0182\n\b\2\2\u0181\u0180\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\f\2\2\u0187\u0188\b)"+
		"\5\2\u0188R\3\2\2\2\13\2\u0149\u0156\u015c\u015e\u0164\u016a\u0176\u0183"+
		"\6\3&\2\3\'\3\3(\4\3)\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}