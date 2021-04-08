// Generated from /home/meschoyez/Docencia/UBP/TC/TC2021/Compiladores2021/src/main/java/Compiladores2021/id.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, WHILE=2, ENTRE=3, CON2Y3=4, CON5=5, ENTERO=6, ID=7, WS=8, OTRO=9;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "WHILE", "ENTRE", "CON2Y3", "CON5", "ENTERO", "ID", "WS", 
			"OTRO"
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
	public String getGrammarFileName() { return "id.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public idParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Token ID;
		public Token INT;
		public Token WHILE;
		public Token ENTERO;
		public Token ENTRE;
		public Token CON5;
		public Token CON2Y3;
		public Token OTRO;
		public TerminalNode ID() { return getToken(idParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode INT() { return getToken(idParser.INT, 0); }
		public TerminalNode WHILE() { return getToken(idParser.WHILE, 0); }
		public TerminalNode ENTERO() { return getToken(idParser.ENTERO, 0); }
		public TerminalNode ENTRE() { return getToken(idParser.ENTRE, 0); }
		public TerminalNode CON5() { return getToken(idParser.CON5, 0); }
		public TerminalNode CON2Y3() { return getToken(idParser.CON2Y3, 0); }
		public TerminalNode OTRO() { return getToken(idParser.OTRO, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof idListener ) ((idListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof idVisitor ) return ((idVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).ID = match(ID);
				 System.out.println("ID -> |" + ((SContext)_localctx).ID.getText() + "|"); 
				setState(4);
				s();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).INT = match(INT);
				 System.out.println("Int -> |" + ((SContext)_localctx).INT.getText() + "|"); 
				setState(7);
				s();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).WHILE = match(WHILE);
				 System.out.println("While -> |" + ((SContext)_localctx).WHILE.getText() + "|"); 
				setState(10);
				s();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				((SContext)_localctx).ENTERO = match(ENTERO);
				 System.out.println("Entero -> |" + ((SContext)_localctx).ENTERO.getText() + "|"); 
				setState(13);
				s();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				((SContext)_localctx).ENTRE = match(ENTRE);
				 System.out.println("Entre -> |" + ((SContext)_localctx).ENTRE.getText() + "|"); 
				setState(16);
				s();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				((SContext)_localctx).CON5 = match(CON5);
				 System.out.println("Con cinco -> |" + ((SContext)_localctx).CON5.getText() + "|"); 
				setState(19);
				s();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(20);
				((SContext)_localctx).CON2Y3 = match(CON2Y3);
				 System.out.println("Con dos y tres -> |" + ((SContext)_localctx).CON2Y3.getText() + "|"); 
				setState(22);
				s();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(23);
				((SContext)_localctx).OTRO = match(OTRO);
				 System.out.println("Otro -> |" + ((SContext)_localctx).OTRO.getText() + "|"); 
				setState(25);
				s();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13 \4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\2\2\2\3\2\2\2\2&\2\35\3\2\2\2\4"+
		"\5\7\t\2\2\5\6\b\2\1\2\6\36\5\2\2\2\7\b\7\3\2\2\b\t\b\2\1\2\t\36\5\2\2"+
		"\2\n\13\7\4\2\2\13\f\b\2\1\2\f\36\5\2\2\2\r\16\7\b\2\2\16\17\b\2\1\2\17"+
		"\36\5\2\2\2\20\21\7\5\2\2\21\22\b\2\1\2\22\36\5\2\2\2\23\24\7\7\2\2\24"+
		"\25\b\2\1\2\25\36\5\2\2\2\26\27\7\6\2\2\27\30\b\2\1\2\30\36\5\2\2\2\31"+
		"\32\7\13\2\2\32\33\b\2\1\2\33\36\5\2\2\2\34\36\3\2\2\2\35\4\3\2\2\2\35"+
		"\7\3\2\2\2\35\n\3\2\2\2\35\r\3\2\2\2\35\20\3\2\2\2\35\23\3\2\2\2\35\26"+
		"\3\2\2\2\35\31\3\2\2\2\35\34\3\2\2\2\36\3\3\2\2\2\3\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}