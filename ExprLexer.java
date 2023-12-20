// Generated from Expr.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_FLOAT=1, T_INT=2, T_PLUS=3, T_MINUS=4, T_MULTIPLY=5, T_DIVIDE=6, P_LEFT=7, 
		P_RIGHT=8, LL_LEFT=9, LL_RIGHT=10, C_LEFT=11, C_RIGHT=12, T_TRUE=13, T_FALSE=14, 
		T_ASIGN=15, T_ENDL=16, T_IF=17, T_ELSE=18, T_WHILE=19, T_DO=20, T_BREAK=21, 
		T_OR=22, T_AND=23, T_IGUAL=24, T_DIF=25, T_MENOR=26, T_MAYOR=27, T_MENORIGUAL=28, 
		T_MAYORIGUAL=29, T_NEG=30, T_BASICO_A=31, T_BASICO_B=32, T_ID=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_FLOAT", "T_INT", "T_PLUS", "T_MINUS", "T_MULTIPLY", "T_DIVIDE", "P_LEFT", 
			"P_RIGHT", "LL_LEFT", "LL_RIGHT", "C_LEFT", "C_RIGHT", "T_TRUE", "T_FALSE", 
			"T_ASIGN", "T_ENDL", "T_IF", "T_ELSE", "T_WHILE", "T_DO", "T_BREAK", 
			"T_OR", "T_AND", "T_IGUAL", "T_DIF", "T_MENOR", "T_MAYOR", "T_MENORIGUAL", 
			"T_MAYORIGUAL", "T_NEG", "T_BASICO_A", "T_BASICO_B", "T_ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'true'", "'false'", "'='", "';'", "'if'", "'else'", "'while'", 
			"'do'", "'break'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", 
			"'>='", "'!'", "'int'", "'float'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_FLOAT", "T_INT", "T_PLUS", "T_MINUS", "T_MULTIPLY", "T_DIVIDE", 
			"P_LEFT", "P_RIGHT", "LL_LEFT", "LL_RIGHT", "C_LEFT", "C_RIGHT", "T_TRUE", 
			"T_FALSE", "T_ASIGN", "T_ENDL", "T_IF", "T_ELSE", "T_WHILE", "T_DO", 
			"T_BREAK", "T_OR", "T_AND", "T_IGUAL", "T_DIF", "T_MENOR", "T_MAYOR", 
			"T_MENORIGUAL", "T_MAYORIGUAL", "T_NEG", "T_BASICO_A", "T_BASICO_B", 
			"T_ID", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\"\u00bf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0004\u0000G\b\u0000\u000b\u0000\f\u0000H\u0001\u0000\u0001"+
		"\u0000\u0004\u0000M\b\u0000\u000b\u0000\f\u0000N\u0001\u0001\u0004\u0001"+
		"R\b\u0001\u000b\u0001\f\u0001S\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u00b4\b \n \f \u00b7\t \u0001!\u0004!\u00ba\b!\u000b!\f!\u00bb"+
		"\u0001!\u0001!\u0000\u0000\"\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz"+
		"\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00c3\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0001F\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000"+
		"\u0000\u0005U\u0001\u0000\u0000\u0000\u0007W\u0001\u0000\u0000\u0000\t"+
		"Y\u0001\u0000\u0000\u0000\u000b[\u0001\u0000\u0000\u0000\r]\u0001\u0000"+
		"\u0000\u0000\u000f_\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000"+
		"\u0013c\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017g"+
		"\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bn\u0001\u0000"+
		"\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000"+
		"!x\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%\u0080\u0001\u0000"+
		"\u0000\u0000\'\u0086\u0001\u0000\u0000\u0000)\u0089\u0001\u0000\u0000"+
		"\u0000+\u008f\u0001\u0000\u0000\u0000-\u0092\u0001\u0000\u0000\u0000/"+
		"\u0095\u0001\u0000\u0000\u00001\u0098\u0001\u0000\u0000\u00003\u009b\u0001"+
		"\u0000\u0000\u00005\u009d\u0001\u0000\u0000\u00007\u009f\u0001\u0000\u0000"+
		"\u00009\u00a2\u0001\u0000\u0000\u0000;\u00a5\u0001\u0000\u0000\u0000="+
		"\u00a7\u0001\u0000\u0000\u0000?\u00ab\u0001\u0000\u0000\u0000A\u00b1\u0001"+
		"\u0000\u0000\u0000C\u00b9\u0001\u0000\u0000\u0000EG\u0007\u0000\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\t\u0000"+
		"\u0000\u0000KM\u0007\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"O\u0002\u0001\u0000\u0000\u0000PR\u0007\u0000\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005+\u0000\u0000"+
		"V\u0006\u0001\u0000\u0000\u0000WX\u0005-\u0000\u0000X\b\u0001\u0000\u0000"+
		"\u0000YZ\u0005*\u0000\u0000Z\n\u0001\u0000\u0000\u0000[\\\u0005/\u0000"+
		"\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005(\u0000\u0000^\u000e\u0001\u0000"+
		"\u0000\u0000_`\u0005)\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005"+
		"{\u0000\u0000b\u0012\u0001\u0000\u0000\u0000cd\u0005}\u0000\u0000d\u0014"+
		"\u0001\u0000\u0000\u0000ef\u0005[\u0000\u0000f\u0016\u0001\u0000\u0000"+
		"\u0000gh\u0005]\u0000\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005t\u0000"+
		"\u0000jk\u0005r\u0000\u0000kl\u0005u\u0000\u0000lm\u0005e\u0000\u0000"+
		"m\u001a\u0001\u0000\u0000\u0000no\u0005f\u0000\u0000op\u0005a\u0000\u0000"+
		"pq\u0005l\u0000\u0000qr\u0005s\u0000\u0000rs\u0005e\u0000\u0000s\u001c"+
		"\u0001\u0000\u0000\u0000tu\u0005=\u0000\u0000u\u001e\u0001\u0000\u0000"+
		"\u0000vw\u0005;\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005i\u0000\u0000"+
		"yz\u0005f\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005e\u0000\u0000"+
		"|}\u0005l\u0000\u0000}~\u0005s\u0000\u0000~\u007f\u0005e\u0000\u0000\u007f"+
		"$\u0001\u0000\u0000\u0000\u0080\u0081\u0005w\u0000\u0000\u0081\u0082\u0005"+
		"h\u0000\u0000\u0082\u0083\u0005i\u0000\u0000\u0083\u0084\u0005l\u0000"+
		"\u0000\u0084\u0085\u0005e\u0000\u0000\u0085&\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005d\u0000\u0000\u0087\u0088\u0005o\u0000\u0000\u0088(\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005b\u0000\u0000\u008a\u008b\u0005r\u0000"+
		"\u0000\u008b\u008c\u0005e\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d"+
		"\u008e\u0005k\u0000\u0000\u008e*\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"|\u0000\u0000\u0090\u0091\u0005|\u0000\u0000\u0091,\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005&\u0000\u0000\u0093\u0094\u0005&\u0000\u0000\u0094"+
		".\u0001\u0000\u0000\u0000\u0095\u0096\u0005=\u0000\u0000\u0096\u0097\u0005"+
		"=\u0000\u0000\u00970\u0001\u0000\u0000\u0000\u0098\u0099\u0005!\u0000"+
		"\u0000\u0099\u009a\u0005=\u0000\u0000\u009a2\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005<\u0000\u0000\u009c4\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		">\u0000\u0000\u009e6\u0001\u0000\u0000\u0000\u009f\u00a0\u0005<\u0000"+
		"\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a18\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005>\u0000\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4:\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005!\u0000\u0000\u00a6<\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005i\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9"+
		"\u00aa\u0005t\u0000\u0000\u00aa>\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"f\u0000\u0000\u00ac\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005o\u0000"+
		"\u0000\u00ae\u00af\u0005a\u0000\u0000\u00af\u00b0\u0005t\u0000\u0000\u00b0"+
		"@\u0001\u0000\u0000\u0000\u00b1\u00b5\u0007\u0001\u0000\u0000\u00b2\u00b4"+
		"\u0007\u0002\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6B\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0007\u0003\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0006!\u0000\u0000\u00beD\u0001\u0000\u0000"+
		"\u0000\u0006\u0000HNS\u00b5\u00bb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}