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
		LLAVEA=1, LLAVEC=2, PARA=3, PARC=4, MAS=5, MENOS=6, MULT=7, DIV=8, ASIGN=9, 
		PYC=10, INT=11, WHILE=12, ENTERO=13, ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVEA", "LLAVEC", "PARA", "PARC", "MAS", "MENOS", 
			"MULT", "DIV", "ASIGN", "PYC", "INT", "WHILE", "ENTERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"';'", "'int'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARA", "PARC", "MAS", "MENOS", "MULT", "DIV", 
			"ASIGN", "PYC", "INT", "WHILE", "ENTERO", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\6\20I\n\20\r\20\16\20J\3\21\3\21\5\21O\n\21\3\21\3\21\3"+
		"\21\7\21T\n\21\f\21\16\21W\13\21\3\22\6\22Z\n\22\r\22\16\22[\3\22\3\22"+
		"\2\2\23\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2b\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3"+
		"\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23"+
		"\65\3\2\2\2\25\67\3\2\2\2\279\3\2\2\2\31;\3\2\2\2\33=\3\2\2\2\35A\3\2"+
		"\2\2\37H\3\2\2\2!N\3\2\2\2#Y\3\2\2\2%&\t\2\2\2&\4\3\2\2\2\'(\t\3\2\2("+
		"\6\3\2\2\2)*\7}\2\2*\b\3\2\2\2+,\7\177\2\2,\n\3\2\2\2-.\7*\2\2.\f\3\2"+
		"\2\2/\60\7+\2\2\60\16\3\2\2\2\61\62\7-\2\2\62\20\3\2\2\2\63\64\7/\2\2"+
		"\64\22\3\2\2\2\65\66\7,\2\2\66\24\3\2\2\2\678\7\61\2\28\26\3\2\2\29:\7"+
		"?\2\2:\30\3\2\2\2;<\7=\2\2<\32\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\34"+
		"\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7k\2\2DE\7n\2\2EF\7g\2\2F\36\3\2\2\2GI\5"+
		"\5\3\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K \3\2\2\2LO\5\3\2\2MO\7"+
		"a\2\2NL\3\2\2\2NM\3\2\2\2OU\3\2\2\2PT\5\3\2\2QT\5\5\3\2RT\7a\2\2SP\3\2"+
		"\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\"\3\2\2\2WU\3"+
		"\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]"+
		"^\b\22\2\2^$\3\2\2\2\b\2JNSU[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}