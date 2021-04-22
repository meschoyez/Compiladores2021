// Generated from /home/meschoyez/Docencia/UBP/TC/TC2021/Compiladores2021/src/main/java/Compiladores2021/programa.g4 by ANTLR 4.8

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
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, INT=3, WHILE=4, ENTERO=5, ID=6, LINEA=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVEA", "LLAVEC", "INT", "WHILE", "ENTERO", "ID", 
			"LINEA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'int'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "INT", "WHILE", "ENTERO", "ID", "LINEA", "WS"
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


	public programaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "programa.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nK\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\6\b+\n\b\r\b\16\b,\3\t\3\t\5\t\61\n\t\3\t\3\t\3\t\7\t\66\n"+
		"\t\f\t\16\t9\13\t\3\n\3\n\3\n\7\n>\n\n\f\n\16\nA\13\n\3\n\3\n\3\13\6\13"+
		"F\n\13\r\13\16\13G\3\13\3\13\2\2\f\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b"+
		"\23\t\25\n\3\2\6\4\2C\\c|\3\2\62;\t\2\"\"*+--==??}}\177\177\5\2\13\f\17"+
		"\17\"\"\2Q\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7"+
		"\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r#\3\2\2\2\17*\3\2\2\2\21\60\3"+
		"\2\2\2\23?\3\2\2\2\25E\3\2\2\2\27\30\t\2\2\2\30\4\3\2\2\2\31\32\t\3\2"+
		"\2\32\6\3\2\2\2\33\34\7}\2\2\34\b\3\2\2\2\35\36\7\177\2\2\36\n\3\2\2\2"+
		"\37 \7k\2\2 !\7p\2\2!\"\7v\2\2\"\f\3\2\2\2#$\7y\2\2$%\7j\2\2%&\7k\2\2"+
		"&\'\7n\2\2\'(\7g\2\2(\16\3\2\2\2)+\5\5\3\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-\20\3\2\2\2.\61\5\3\2\2/\61\7a\2\2\60.\3\2\2\2\60/\3\2\2"+
		"\2\61\67\3\2\2\2\62\66\5\3\2\2\63\66\5\5\3\2\64\66\7a\2\2\65\62\3\2\2"+
		"\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"\22\3\2\2\29\67\3\2\2\2:>\5\3\2\2;>\5\17\b\2<>\t\4\2\2=:\3\2\2\2=;\3\2"+
		"\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\f"+
		"\2\2C\24\3\2\2\2DF\t\5\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3"+
		"\2\2\2IJ\b\13\2\2J\26\3\2\2\2\n\2,\60\65\67=?G\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}