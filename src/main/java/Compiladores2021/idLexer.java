// Generated from /home/meschoyez/Docencia/UBP/TC/TC2021/Compiladores2021/src/main/java/Compiladores2021/id.g4 by ANTLR 4.8

package Compiladores2021;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class idLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, WHILE=2, ENTRE=3, CON2Y3=4, CON5=5, ENTERO=6, ID=7, WS=8, OTRO=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "INT", "WHILE", "ENTRE", "CON2Y3", "CON5", "ENTERO", 
			"ID", "WS", "OTRO"
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


	public idLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "id.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13M\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\6\t\65\n\t\r\t\16"+
		"\t\66\3\n\3\n\5\n;\n\n\3\n\3\n\3\n\7\n@\n\n\f\n\16\nC\13\n\3\13\6\13F"+
		"\n\13\r\13\16\13G\3\13\3\13\3\f\3\f\2\2\r\3\2\5\2\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\23\t\25\n\27\13\3\2\b\4\2C\\c|\3\2\62;\3\2\64;\3\2\62\65\3\2\64"+
		"\65\5\2\13\f\17\17\"\"\2Q\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t!\3\2\2\2\13+\3\2\2\2\r-\3\2"+
		"\2\2\17\60\3\2\2\2\21\64\3\2\2\2\23:\3\2\2\2\25E\3\2\2\2\27K\3\2\2\2\31"+
		"\32\t\2\2\2\32\4\3\2\2\2\33\34\t\3\2\2\34\6\3\2\2\2\35\36\7k\2\2\36\37"+
		"\7p\2\2\37 \7v\2\2 \b\3\2\2\2!\"\7y\2\2\"#\7j\2\2#$\7k\2\2$%\7n\2\2%&"+
		"\7g\2\2&\n\3\2\2\2\'(\7\63\2\2(,\t\4\2\2)*\7\64\2\2*,\t\5\2\2+\'\3\2\2"+
		"\2+)\3\2\2\2,\f\3\2\2\2-.\5\5\3\2./\t\6\2\2/\16\3\2\2\2\60\61\5\5\3\2"+
		"\61\62\7\67\2\2\62\20\3\2\2\2\63\65\5\5\3\2\64\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\64\3\2\2\2\66\67\3\2\2\2\67\22\3\2\2\28;\5\3\2\29;\7a\2\2:8\3\2"+
		"\2\2:9\3\2\2\2;A\3\2\2\2<@\5\3\2\2=@\5\5\3\2>@\7a\2\2?<\3\2\2\2?=\3\2"+
		"\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\24\3\2\2\2CA\3\2\2\2DF\t"+
		"\7\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\13\2\2J\26"+
		"\3\2\2\2KL\13\2\2\2L\30\3\2\2\2\t\2+\66:?AG\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}