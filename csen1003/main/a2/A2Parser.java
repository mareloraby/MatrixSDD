// Generated from V:/10th/1002 ACL/Task8Intellij/grammars\A2.g4 by ANTLR 4.12.0
package csen1003.main.a2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class A2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DIGITS=2;
	public static final int
		RULE_s = 0, RULE_ss = 1, RULE_r = 2, RULE_n = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "ss", "r", "n"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DIGITS"
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
	public String getGrammarFileName() { return "A2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		/**
		 * Compares two integer numbers
		 *
		 * @param x the first number to compare
		 * @param y the second number to compare
		 * @return 1 if x is equal to y, and 0 otherwise
		 */

		public static int equals(int x, int y) {
		    return x == y ? 1 : 0;
		}


	public A2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public int check;
		public SsContext ss;
		public SsContext ss() {
			return getRuleContext(SsContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2Visitor ) return ((A2Visitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				((SContext)_localctx).ss = ss();
				((SContext)_localctx).check =  ((SContext)_localctx).ss.checkLen * equals(((SContext)_localctx).ss.firstRowSum, ((SContext)_localctx).ss.firstColSum) * equals(((SContext)_localctx).ss.countRows * ((SContext)_localctx).ss.length, ((SContext)_localctx).ss.sumLengths) ; 
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((SContext)_localctx).check =  1;
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
	public static class SsContext extends ParserRuleContext {
		public int checkLen;
		public int length;
		public int firstRowSum;
		public int firstColSum;
		public int countRows;
		public int sumLengths;
		public RContext r;
		public SsContext ss1;
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TerminalNode EOF() { return getToken(A2Parser.EOF, 0); }
		public SsContext ss() {
			return getRuleContext(SsContext.class,0);
		}
		public SsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).enterSs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).exitSs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2Visitor ) return ((A2Visitor<? extends T>)visitor).visitSs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SsContext ss() throws RecognitionException {
		SsContext _localctx = new SsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ss);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((SsContext)_localctx).r = r();
				setState(15);
				match(T__0);
				setState(16);
				((SsContext)_localctx).ss1 = ss();
				setState(17);
				match(EOF);
				((SsContext)_localctx).length =  ((SsContext)_localctx).r.length; ((SsContext)_localctx).checkLen =  equals(((SsContext)_localctx).r.length, ((SsContext)_localctx).ss1.length);
				 ((SsContext)_localctx).firstRowSum =  ((SsContext)_localctx).r.rowSum; ((SsContext)_localctx).firstColSum =  ((SsContext)_localctx).r.firstDigit + ((SsContext)_localctx).ss1.firstColSum; ((SsContext)_localctx).countRows =  1 + ((SsContext)_localctx).ss1.countRows; ((SsContext)_localctx).sumLengths =  ((SsContext)_localctx).r.length + ((SsContext)_localctx).ss1.sumLengths;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				((SsContext)_localctx).r = r();
				setState(21);
				match(EOF);
				((SsContext)_localctx).length =  ((SsContext)_localctx).r.length; ((SsContext)_localctx).checkLen =  1; ((SsContext)_localctx).firstRowSum =  ((SsContext)_localctx).r.rowSum; ((SsContext)_localctx).firstColSum =  ((SsContext)_localctx).r.firstDigit; ((SsContext)_localctx).countRows =  1; ((SsContext)_localctx).sumLengths =  ((SsContext)_localctx).r.length;
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
	public static class RContext extends ParserRuleContext {
		public int length;
		public int rowSum;
		public int firstDigit;
		public NContext n;
		public RContext r1;
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2Visitor ) return ((A2Visitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_r);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((RContext)_localctx).n = n();
				setState(27);
				((RContext)_localctx).r1 = r();
				((RContext)_localctx).length =  1 + ((RContext)_localctx).r1.length; ((RContext)_localctx).rowSum =  ((RContext)_localctx).n.val + ((RContext)_localctx).r1.rowSum; ((RContext)_localctx).firstDigit =  ((RContext)_localctx).n.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((RContext)_localctx).n = n();
				((RContext)_localctx).length =  1; ((RContext)_localctx).rowSum =  ((RContext)_localctx).n.val; ((RContext)_localctx).firstDigit =  ((RContext)_localctx).n.val;
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
	public static class NContext extends ParserRuleContext {
		public int val;
		public Token DIGITS;
		public TerminalNode DIGITS() { return getToken(A2Parser.DIGITS, 0); }
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).enterN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A2Listener ) ((A2Listener)listener).exitN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof A2Visitor ) return ((A2Visitor<? extends T>)visitor).visitN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			((NContext)_localctx).DIGITS = match(DIGITS);
			((NContext)_localctx).val =  Integer.parseInt((((NContext)_localctx).DIGITS!=null?((NContext)_localctx).DIGITS.getText():null));
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
		"\u0004\u0001\u0002\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004"+
		"\u0000\u0002\u0004\u0006\u0000\u0000%\u0000\f\u0001\u0000\u0000\u0000"+
		"\u0002\u0018\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006"+
		"#\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0006\u0000"+
		"\uffff\uffff\u0000\n\r\u0001\u0000\u0000\u0000\u000b\r\u0006\u0000\uffff"+
		"\uffff\u0000\f\b\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000"+
		"\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f"+
		"\u0010\u0005\u0001\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011"+
		"\u0012\u0005\u0000\u0000\u0001\u0012\u0013\u0006\u0001\uffff\uffff\u0000"+
		"\u0013\u0019\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000"+
		"\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0017\u0006\u0001\uffff\uffff"+
		"\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u000e\u0001\u0000\u0000"+
		"\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b\u001c\u0003\u0004\u0002"+
		"\u0000\u001c\u001d\u0006\u0002\uffff\uffff\u0000\u001d\"\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0006\u0002\uffff\uffff"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001a\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#$\u0005\u0002"+
		"\u0000\u0000$%\u0006\u0003\uffff\uffff\u0000%\u0007\u0001\u0000\u0000"+
		"\u0000\u0003\f\u0018!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}