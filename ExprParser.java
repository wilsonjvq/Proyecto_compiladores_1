// Generated from Expr.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_decls = 2, RULE_decl = 3, RULE_tipo = 4, 
		RULE_instrs = 5, RULE_instr = 6, RULE_loc = 7, RULE_bool = 8, RULE_comb = 9, 
		RULE_igualdad = 10, RULE_rel = 11, RULE_expr = 12, RULE_term = 13, RULE_unario = 14, 
		RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "decls", "decl", "tipo", "instrs", "instr", "loc", 
			"bool", "comb", "igualdad", "rel", "expr", "term", "unario", "factor"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LL_LEFT() { return getToken(ExprParser.LL_LEFT, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public InstrsContext instrs() {
			return getRuleContext(InstrsContext.class,0);
		}
		public TerminalNode LL_RIGHT() { return getToken(ExprParser.LL_RIGHT, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(LL_LEFT);
			setState(35);
			decls(0);
			setState(36);
			instrs(0);
			setState(37);
			match(LL_RIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclsContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		return decls(0);
	}

	private DeclsContext decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclsContext _localctx = new DeclsContext(_ctx, _parentState);
		DeclsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decls);
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41);
					decl();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode T_ID() { return getToken(ExprParser.T_ID, 0); }
		public TerminalNode T_ENDL() { return getToken(ExprParser.T_ENDL, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			tipo(0);
			setState(48);
			match(T_ID);
			setState(49);
			match(T_ENDL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode T_BASICO_A() { return getToken(ExprParser.T_BASICO_A, 0); }
		public TerminalNode T_BASICO_B() { return getToken(ExprParser.T_BASICO_B, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode C_LEFT() { return getToken(ExprParser.C_LEFT, 0); }
		public TerminalNode T_INT() { return getToken(ExprParser.T_INT, 0); }
		public TerminalNode C_RIGHT() { return getToken(ExprParser.C_RIGHT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		return tipo(0);
	}

	private TipoContext tipo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TipoContext _localctx = new TipoContext(_ctx, _parentState);
		TipoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_tipo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BASICO_A:
				{
				setState(52);
				match(T_BASICO_A);
				}
				break;
			case T_BASICO_B:
				{
				setState(53);
				match(T_BASICO_B);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TipoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tipo);
					setState(56);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(57);
					match(C_LEFT);
					setState(58);
					match(T_INT);
					setState(59);
					match(C_RIGHT);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrsContext extends ParserRuleContext {
		public InstrsContext instrs() {
			return getRuleContext(InstrsContext.class,0);
		}
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public InstrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInstrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInstrs(this);
		}
	}

	public final InstrsContext instrs() throws RecognitionException {
		return instrs(0);
	}

	private InstrsContext instrs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstrsContext _localctx = new InstrsContext(_ctx, _parentState);
		InstrsContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_instrs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstrsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instrs);
					setState(66);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(67);
					instr();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrContext extends ParserRuleContext {
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode T_ASIGN() { return getToken(ExprParser.T_ASIGN, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode T_ENDL() { return getToken(ExprParser.T_ENDL, 0); }
		public TerminalNode T_IF() { return getToken(ExprParser.T_IF, 0); }
		public TerminalNode P_LEFT() { return getToken(ExprParser.P_LEFT, 0); }
		public TerminalNode P_RIGHT() { return getToken(ExprParser.P_RIGHT, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(ExprParser.T_ELSE, 0); }
		public TerminalNode T_WHILE() { return getToken(ExprParser.T_WHILE, 0); }
		public TerminalNode T_DO() { return getToken(ExprParser.T_DO, 0); }
		public TerminalNode T_BREAK() { return getToken(ExprParser.T_BREAK, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instr);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				loc(0);
				setState(74);
				match(T_ASIGN);
				setState(75);
				bool(0);
				setState(76);
				match(T_ENDL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T_IF);
				setState(79);
				match(P_LEFT);
				setState(80);
				bool(0);
				setState(81);
				match(P_RIGHT);
				setState(82);
				instr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T_IF);
				setState(85);
				match(P_LEFT);
				setState(86);
				bool(0);
				setState(87);
				match(P_RIGHT);
				setState(88);
				instr();
				setState(89);
				match(T_ELSE);
				setState(90);
				instr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(T_WHILE);
				setState(93);
				match(P_LEFT);
				setState(94);
				bool(0);
				setState(95);
				match(P_RIGHT);
				setState(96);
				instr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(T_DO);
				setState(99);
				instr();
				setState(100);
				match(T_WHILE);
				setState(101);
				match(P_LEFT);
				setState(102);
				bool(0);
				setState(103);
				match(P_RIGHT);
				setState(104);
				match(T_ENDL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(T_BREAK);
				setState(107);
				match(T_ENDL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocContext extends ParserRuleContext {
		public TerminalNode T_ID() { return getToken(ExprParser.T_ID, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode C_LEFT() { return getToken(ExprParser.C_LEFT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode C_RIGHT() { return getToken(ExprParser.C_RIGHT, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoc(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		return loc(0);
	}

	private LocContext loc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LocContext _localctx = new LocContext(_ctx, _parentState);
		LocContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_loc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			match(T_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_loc);
					setState(114);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(115);
					match(C_LEFT);
					setState(116);
					bool(0);
					setState(117);
					match(C_RIGHT);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public CombContext comb() {
			return getRuleContext(CombContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode T_OR() { return getToken(ExprParser.T_OR, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			comb(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(T_OR);
					setState(129);
					comb(0);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CombContext extends ParserRuleContext {
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public CombContext comb() {
			return getRuleContext(CombContext.class,0);
		}
		public TerminalNode T_AND() { return getToken(ExprParser.T_AND, 0); }
		public CombContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterComb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitComb(this);
		}
	}

	public final CombContext comb() throws RecognitionException {
		return comb(0);
	}

	private CombContext comb(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CombContext _localctx = new CombContext(_ctx, _parentState);
		CombContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_comb, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			igualdad(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CombContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comb);
					setState(138);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(139);
					match(T_AND);
					setState(140);
					igualdad(0);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadContext extends ParserRuleContext {
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode T_IGUAL() { return getToken(ExprParser.T_IGUAL, 0); }
		public TerminalNode T_DIF() { return getToken(ExprParser.T_DIF, 0); }
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIgualdad(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		return igualdad(0);
	}

	private IgualdadContext igualdad(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IgualdadContext _localctx = new IgualdadContext(_ctx, _parentState);
		IgualdadContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_igualdad, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new IgualdadContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_igualdad);
						setState(149);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(150);
						match(T_IGUAL);
						setState(151);
						rel();
						}
						break;
					case 2:
						{
						_localctx = new IgualdadContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_igualdad);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						match(T_DIF);
						setState(154);
						rel();
						}
						break;
					}
					} 
				}
				setState(159);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_MENOR() { return getToken(ExprParser.T_MENOR, 0); }
		public TerminalNode T_MENORIGUAL() { return getToken(ExprParser.T_MENORIGUAL, 0); }
		public TerminalNode T_MAYORIGUAL() { return getToken(ExprParser.T_MAYORIGUAL, 0); }
		public TerminalNode T_MAYOR() { return getToken(ExprParser.T_MAYOR, 0); }
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRel(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rel);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				expr(0);
				setState(161);
				match(T_MENOR);
				setState(162);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				expr(0);
				setState(165);
				match(T_MENORIGUAL);
				setState(166);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				expr(0);
				setState(169);
				match(T_MAYORIGUAL);
				setState(170);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				expr(0);
				setState(173);
				match(T_MAYOR);
				setState(174);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_PLUS() { return getToken(ExprParser.T_PLUS, 0); }
		public TerminalNode T_MINUS() { return getToken(ExprParser.T_MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(T_PLUS);
						setState(184);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(T_MINUS);
						setState(187);
						term(0);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode T_MULTIPLY() { return getToken(ExprParser.T_MULTIPLY, 0); }
		public TerminalNode T_DIVIDE() { return getToken(ExprParser.T_DIVIDE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			unario();
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(T_MULTIPLY);
						setState(198);
						unario();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(200);
						match(T_DIVIDE);
						setState(201);
						unario();
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnarioContext extends ParserRuleContext {
		public TerminalNode T_NEG() { return getToken(ExprParser.T_NEG, 0); }
		public UnarioContext unario() {
			return getRuleContext(UnarioContext.class,0);
		}
		public TerminalNode T_MINUS() { return getToken(ExprParser.T_MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnario(this);
		}
	}

	public final UnarioContext unario() throws RecognitionException {
		UnarioContext _localctx = new UnarioContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unario);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T_NEG);
				setState(208);
				unario();
				}
				break;
			case T_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T_MINUS);
				setState(210);
				unario();
				}
				break;
			case T_FLOAT:
			case T_INT:
			case P_LEFT:
			case T_TRUE:
			case T_FALSE:
			case T_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				factor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode P_LEFT() { return getToken(ExprParser.P_LEFT, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode P_RIGHT() { return getToken(ExprParser.P_RIGHT, 0); }
		public LocContext loc() {
			return getRuleContext(LocContext.class,0);
		}
		public TerminalNode T_INT() { return getToken(ExprParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(ExprParser.T_FLOAT, 0); }
		public TerminalNode T_TRUE() { return getToken(ExprParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(ExprParser.T_FALSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(P_LEFT);
				setState(215);
				bool(0);
				setState(216);
				match(P_RIGHT);
				}
				break;
			case T_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				loc(0);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T_INT);
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(T_FLOAT);
				}
				break;
			case T_TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(T_TRUE);
				}
				break;
			case T_FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(T_FALSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return decls_sempred((DeclsContext)_localctx, predIndex);
		case 4:
			return tipo_sempred((TipoContext)_localctx, predIndex);
		case 5:
			return instrs_sempred((InstrsContext)_localctx, predIndex);
		case 7:
			return loc_sempred((LocContext)_localctx, predIndex);
		case 8:
			return bool_sempred((BoolContext)_localctx, predIndex);
		case 9:
			return comb_sempred((CombContext)_localctx, predIndex);
		case 10:
			return igualdad_sempred((IgualdadContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean decls_sempred(DeclsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tipo_sempred(TipoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean instrs_sempred(InstrsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean loc_sempred(LocContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comb_sempred(CombContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean igualdad_sempred(IgualdadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002+\b\u0002"+
		"\n\u0002\f\u0002.\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004=\b\u0004\n\u0004\f\u0004"+
		"@\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005E\b\u0005\n\u0005"+
		"\f\u0005H\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006n\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0083\b\b\n\b\f\b\u0086\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u008e\b\t\n\t\f\t\u0091\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u009c\b\n\n\n\f\n\u009f\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b2\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bd\b\f\n\f\f\f\u00c0"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00cb\b\r\n\r\f\r\u00ce\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00d5\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00e0\b\u000f\u0001\u000f\u0000\t\u0004\b\n\u000e"+
		"\u0010\u0012\u0014\u0018\u001a\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u00ef\u0000"+
		" \u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004\'\u0001"+
		"\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000"+
		"\u0000\nA\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000"+
		"\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000"+
		"\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000"+
		"\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000"+
		"\u0000\u0000 !\u0003\u0002\u0001\u0000!\u0001\u0001\u0000\u0000\u0000"+
		"\"#\u0005\t\u0000\u0000#$\u0003\u0004\u0002\u0000$%\u0003\n\u0005\u0000"+
		"%&\u0005\n\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\',\u0006\u0002\uffff"+
		"\uffff\u0000()\n\u0001\u0000\u0000)+\u0003\u0006\u0003\u0000*(\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/0\u0003\b\u0004\u000001\u0005!\u0000\u000012\u0005\u0010\u0000"+
		"\u00002\u0007\u0001\u0000\u0000\u000034\u0006\u0004\uffff\uffff\u0000"+
		"47\u0005\u001f\u0000\u000057\u0005 \u0000\u000063\u0001\u0000\u0000\u0000"+
		"65\u0001\u0000\u0000\u00007>\u0001\u0000\u0000\u000089\n\u0003\u0000\u0000"+
		"9:\u0005\u000b\u0000\u0000:;\u0005\u0002\u0000\u0000;=\u0005\f\u0000\u0000"+
		"<8\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AF\u0006\u0005\uffff\uffff\u0000BC\n\u0001\u0000\u0000CE\u0003"+
		"\f\u0006\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u000b\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005\u000f"+
		"\u0000\u0000KL\u0003\u0010\b\u0000LM\u0005\u0010\u0000\u0000Mn\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0011\u0000\u0000OP\u0005\u0007\u0000\u0000PQ\u0003"+
		"\u0010\b\u0000QR\u0005\b\u0000\u0000RS\u0003\f\u0006\u0000Sn\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0011\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u0003"+
		"\u0010\b\u0000WX\u0005\b\u0000\u0000XY\u0003\f\u0006\u0000YZ\u0005\u0012"+
		"\u0000\u0000Z[\u0003\f\u0006\u0000[n\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0013\u0000\u0000]^\u0005\u0007\u0000\u0000^_\u0003\u0010\b\u0000_`\u0005"+
		"\b\u0000\u0000`a\u0003\f\u0006\u0000an\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0014\u0000\u0000cd\u0003\f\u0006\u0000de\u0005\u0013\u0000\u0000ef\u0005"+
		"\u0007\u0000\u0000fg\u0003\u0010\b\u0000gh\u0005\b\u0000\u0000hi\u0005"+
		"\u0010\u0000\u0000in\u0001\u0000\u0000\u0000jk\u0005\u0015\u0000\u0000"+
		"kn\u0005\u0010\u0000\u0000ln\u0003\u0002\u0001\u0000mI\u0001\u0000\u0000"+
		"\u0000mN\u0001\u0000\u0000\u0000mT\u0001\u0000\u0000\u0000m\\\u0001\u0000"+
		"\u0000\u0000mb\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u0006\u0007\uffff\uffff"+
		"\u0000pq\u0005!\u0000\u0000qy\u0001\u0000\u0000\u0000rs\n\u0002\u0000"+
		"\u0000st\u0005\u000b\u0000\u0000tu\u0003\u0010\b\u0000uv\u0005\f\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u000f"+
		"\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0006\b\uffff\uffff"+
		"\u0000}~\u0003\u0012\t\u0000~\u0084\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\n\u0002\u0000\u0000\u0080\u0081\u0005\u0016\u0000\u0000\u0081\u0083\u0003"+
		"\u0012\t\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0006\t\uffff\uffff\u0000\u0088\u0089\u0003\u0014"+
		"\n\u0000\u0089\u008f\u0001\u0000\u0000\u0000\u008a\u008b\n\u0002\u0000"+
		"\u0000\u008b\u008c\u0005\u0017\u0000\u0000\u008c\u008e\u0003\u0014\n\u0000"+
		"\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0006\n\uffff\uffff\u0000\u0093\u0094\u0003\u0016\u000b\u0000"+
		"\u0094\u009d\u0001\u0000\u0000\u0000\u0095\u0096\n\u0003\u0000\u0000\u0096"+
		"\u0097\u0005\u0018\u0000\u0000\u0097\u009c\u0003\u0016\u000b\u0000\u0098"+
		"\u0099\n\u0002\u0000\u0000\u0099\u009a\u0005\u0019\u0000\u0000\u009a\u009c"+
		"\u0003\u0016\u000b\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0098"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0015"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0003\u0018\f\u0000\u00a1\u00a2\u0005\u001a\u0000\u0000\u00a2\u00a3\u0003"+
		"\u0018\f\u0000\u00a3\u00b2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u0018"+
		"\f\u0000\u00a5\u00a6\u0005\u001c\u0000\u0000\u00a6\u00a7\u0003\u0018\f"+
		"\u0000\u00a7\u00b2\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u0018\f\u0000"+
		"\u00a9\u00aa\u0005\u001d\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000\u00ab"+
		"\u00b2\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad\u00ae"+
		"\u0005\u001b\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0003\u0018\f\u0000\u00b1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00b1\u00a4\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u0017\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\f\uffff"+
		"\uffff\u0000\u00b4\u00b5\u0003\u001a\r\u0000\u00b5\u00be\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\n\u0003\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000"+
		"\u00b8\u00bd\u0003\u001a\r\u0000\u00b9\u00ba\n\u0002\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bd\u0003\u001a\r\u0000\u00bc\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u0019\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\r\uffff\uffff\u0000\u00c2\u00c3"+
		"\u0003\u001c\u000e\u0000\u00c3\u00cc\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\n\u0003\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00cb\u0003"+
		"\u001c\u000e\u0000\u00c7\u00c8\n\u0002\u0000\u0000\u00c8\u00c9\u0005\u0006"+
		"\u0000\u0000\u00c9\u00cb\u0003\u001c\u000e\u0000\u00ca\u00c4\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u001b\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u001e\u0000\u0000\u00d0\u00d5\u0003\u001c"+
		"\u000e\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000\u00d2\u00d5\u0003\u001c"+
		"\u000e\u0000\u00d3\u00d5\u0003\u001e\u000f\u0000\u00d4\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0007"+
		"\u0000\u0000\u00d7\u00d8\u0003\u0010\b\u0000\u00d8\u00d9\u0005\b\u0000"+
		"\u0000\u00d9\u00e0\u0001\u0000\u0000\u0000\u00da\u00e0\u0003\u000e\u0007"+
		"\u0000\u00db\u00e0\u0005\u0002\u0000\u0000\u00dc\u00e0\u0005\u0001\u0000"+
		"\u0000\u00dd\u00e0\u0005\r\u0000\u0000\u00de\u00e0\u0005\u000e\u0000\u0000"+
		"\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000"+
		"\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u001f\u0001\u0000\u0000\u0000\u0011,6>Fmy\u0084\u008f\u009b\u009d"+
		"\u00b1\u00bc\u00be\u00ca\u00cc\u00d4\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}