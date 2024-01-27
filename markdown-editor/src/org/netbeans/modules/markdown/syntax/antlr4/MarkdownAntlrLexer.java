// Generated from MarkdownAntlrLexer.g4 by ANTLR 4.13.0

  package org.netbeans.modules.markdown.syntax.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MarkdownAntlrLexer extends LexerAdaptor {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, RAW_TEXT=2, HTML=3, WS=4, ATTR_COMMENT=5, EXCL=6, SQ_PAR_OPEN=7, 
		HEADER_HASH=8, LIST_ITEM_MARKER=9, D_ASTERIX=10, S_ASTERIX=11, BACKTICK_3=12, 
		BACKTICK_2=13, SETTEXT_H1_UNDERLINE=14, SETTEXT_H2_UNDERLINE=15, HORIZONTAL_RULE_HYPHEN=16, 
		HORIZONTAL_RULE=17, SQ_PAR_CLOSE=18, R_PAR_OPEN=19, R_PAR_CLOSE=20, IDENTIFIER=21, 
		LINE_EOF=22;
	public static final int
		LINE_TEXT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "LINE_TEXT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ListItemMarker", "DoubleAsterix", "SgAsterix", "Backtick_3", "Backtick_2", 
			"HtmlElement", "Identifier", "NewLine", "HEADER_HASH", "LIST_ITEM_MARKER", 
			"D_ASTERIX", "S_ASTERIX", "BACKTICK_3", "BACKTICK_2", "SETTEXT_H1_UNDERLINE", 
			"SETTEXT_H2_UNDERLINE", "HORIZONTAL_RULE_HYPHEN", "HORIZONTAL_RULE", 
			"EXCL", "S_SQ_PAR_OPEN", "HTML", "LETTER", "NL", "WS", "RAW_TEXT", "LINE_EXCL", 
			"SQ_PAR_OPEN", "SQ_PAR_CLOSE", "R_PAR_OPEN", "R_PAR_CLOSE", "LINE_D_ASTERIX", 
			"LINE_S_ASTERIX", "LINE_BACKTICK_3", "LINE_BACKTICK_2", "LINE_HTML", 
			"IDENTIFIER", "LINE_NL", "LINE_WS", "LINE_RAW_TEXT", "LINE_EOF"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'['", null, null, null, null, 
			null, null, null, null, null, null, "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "RAW_TEXT", "HTML", "WS", "ATTR_COMMENT", "EXCL", "SQ_PAR_OPEN", 
			"HEADER_HASH", "LIST_ITEM_MARKER", "D_ASTERIX", "S_ASTERIX", "BACKTICK_3", 
			"BACKTICK_2", "SETTEXT_H1_UNDERLINE", "SETTEXT_H2_UNDERLINE", "HORIZONTAL_RULE_HYPHEN", 
			"HORIZONTAL_RULE", "SQ_PAR_CLOSE", "R_PAR_OPEN", "R_PAR_CLOSE", "IDENTIFIER", 
			"LINE_EOF"
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


	public MarkdownAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarkdownAntlrLexer.g4"; }

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
		"\u0004\u0000\u0016\u0167\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002"+
		"\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002"+
		"\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002"+
		" \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002"+
		"%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001\u0000\u0005\u0000T\b\u0000"+
		"\n\u0000\f\u0000W\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0004\u0000"+
		"j\b\u0000\u000b\u0000\f\u0000k\u0001\u0000\u0001\u0000\u0003\u0000p\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u0084\b\u0005\n\u0005\f\u0005\u0087\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0091\b\u0005\n\u0005\f\u0005\u0094\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0099\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u009f\b\u0005\n\u0005\f\u0005"+
		"\u00a2\t\u0005\u0001\u0005\u0003\u0005\u00a5\b\u0005\u0003\u0005\u00a7"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00ab\b\u0006\n\u0006\f\u0006"+
		"\u00ae\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\b\u00b3\b\b\u000b"+
		"\b\f\b\u00b4\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0004\u000e\u00ce\b\u000e\u000b\u000e\f\u000e\u00cf\u0001\u000e\u0005"+
		"\u000e\u00d3\b\u000e\n\u000e\f\u000e\u00d6\t\u000e\u0001\u000f\u0004\u000f"+
		"\u00d9\b\u000f\u000b\u000f\f\u000f\u00da\u0001\u000f\u0005\u000f\u00de"+
		"\b\u000f\n\u000f\f\u000f\u00e1\t\u000f\u0001\u0010\u0005\u0010\u00e4\b"+
		"\u0010\n\u0010\f\u0010\u00e7\t\u0010\u0001\u0010\u0004\u0010\u00ea\b\u0010"+
		"\u000b\u0010\f\u0010\u00eb\u0001\u0010\u0005\u0010\u00ef\b\u0010\n\u0010"+
		"\f\u0010\u00f2\t\u0010\u0001\u0010\u0004\u0010\u00f5\b\u0010\u000b\u0010"+
		"\f\u0010\u00f6\u0001\u0010\u0005\u0010\u00fa\b\u0010\n\u0010\f\u0010\u00fd"+
		"\t\u0010\u0001\u0010\u0004\u0010\u0100\b\u0010\u000b\u0010\f\u0010\u0101"+
		"\u0001\u0010\u0005\u0010\u0105\b\u0010\n\u0010\f\u0010\u0108\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u010d\b\u0011\u000b\u0011\f"+
		"\u0011\u010e\u0001\u0011\u0005\u0011\u0112\b\u0011\n\u0011\f\u0011\u0115"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u012c\b\u0017\u000b"+
		"\u0017\f\u0017\u012d\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0004"+
		"%\u015a\b%\u000b%\f%\u015b\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\u0085\u0092\u00a0\u0000(\u0002\u0000"+
		"\u0004\u0000\u0006\u0000\b\u0000\n\u0000\f\u0000\u000e\u0000\u0010\u0000"+
		"\u0012\b\u0014\t\u0016\n\u0018\u000b\u001a\f\u001c\r\u001e\u000e \u000f"+
		"\"\u0010$\u0011&\u0006(\u0000*\u0003,\u0000.\u00010\u00042\u00024\u0000"+
		"6\u00078\u0012:\u0013<\u0014>\u0000@\u0000B\u0000D\u0000F\u0000H\u0015"+
		"J\u0000L\u0000N\u0000P\u0016\u0002\u0000\u0001\n\u0002\u0000\t\t  \u0001"+
		"\u000009\u0001\u0001>>\u0004\u0000AZ__az\u0080\u8000\ufffe\u0006\u0000"+
		"--09AZ__az\u0080\u8000\ufffe\u0002\u0000\n\n\r\r\u0001\u0000  \u0002\u0000"+
		"  --\u0001\u0000**\u0002\u0000AZaz\u017b\u0000\u0012\u0001\u0000\u0000"+
		"\u0000\u0000\u0014\u0001\u0000\u0000\u0000\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0000\u0018\u0001\u0000\u0000\u0000\u0000\u001a\u0001\u0000\u0000"+
		"\u0000\u0000\u001c\u0001\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0000 \u0001\u0000\u0000\u0000\u0000\"\u0001\u0000\u0000\u0000"+
		"\u0000$\u0001\u0000\u0000\u0000\u0000&\u0001\u0000\u0000\u0000\u0000("+
		"\u0001\u0000\u0000\u0000\u0000*\u0001\u0000\u0000\u0000\u0000,\u0001\u0000"+
		"\u0000\u0000\u0000.\u0001\u0000\u0000\u0000\u00000\u0001\u0000\u0000\u0000"+
		"\u00002\u0001\u0000\u0000\u0000\u00014\u0001\u0000\u0000\u0000\u00016"+
		"\u0001\u0000\u0000\u0000\u00018\u0001\u0000\u0000\u0000\u0001:\u0001\u0000"+
		"\u0000\u0000\u0001<\u0001\u0000\u0000\u0000\u0001>\u0001\u0000\u0000\u0000"+
		"\u0001@\u0001\u0000\u0000\u0000\u0001B\u0001\u0000\u0000\u0000\u0001D"+
		"\u0001\u0000\u0000\u0000\u0001F\u0001\u0000\u0000\u0000\u0001H\u0001\u0000"+
		"\u0000\u0000\u0001J\u0001\u0000\u0000\u0000\u0001L\u0001\u0000\u0000\u0000"+
		"\u0001N\u0001\u0000\u0000\u0000\u0001P\u0001\u0000\u0000\u0000\u0002o"+
		"\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006t\u0001\u0000"+
		"\u0000\u0000\bv\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000\f\u00a6"+
		"\u0001\u0000\u0000\u0000\u000e\u00a8\u0001\u0000\u0000\u0000\u0010\u00af"+
		"\u0001\u0000\u0000\u0000\u0012\u00b2\u0001\u0000\u0000\u0000\u0014\u00b8"+
		"\u0001\u0000\u0000\u0000\u0016\u00bc\u0001\u0000\u0000\u0000\u0018\u00c0"+
		"\u0001\u0000\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000\u001c\u00c8"+
		"\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000 \u00d8\u0001"+
		"\u0000\u0000\u0000\"\u00e5\u0001\u0000\u0000\u0000$\u010c\u0001\u0000"+
		"\u0000\u0000&\u0116\u0001\u0000\u0000\u0000(\u011a\u0001\u0000\u0000\u0000"+
		"*\u011f\u0001\u0000\u0000\u0000,\u0123\u0001\u0000\u0000\u0000.\u0128"+
		"\u0001\u0000\u0000\u00000\u012b\u0001\u0000\u0000\u00002\u012f\u0001\u0000"+
		"\u0000\u00004\u0131\u0001\u0000\u0000\u00006\u0135\u0001\u0000\u0000\u0000"+
		"8\u0137\u0001\u0000\u0000\u0000:\u0139\u0001\u0000\u0000\u0000<\u013b"+
		"\u0001\u0000\u0000\u0000>\u013d\u0001\u0000\u0000\u0000@\u0141\u0001\u0000"+
		"\u0000\u0000B\u0145\u0001\u0000\u0000\u0000D\u0149\u0001\u0000\u0000\u0000"+
		"F\u014d\u0001\u0000\u0000\u0000H\u0151\u0001\u0000\u0000\u0000J\u0153"+
		"\u0001\u0000\u0000\u0000L\u0159\u0001\u0000\u0000\u0000N\u015f\u0001\u0000"+
		"\u0000\u0000P\u0163\u0001\u0000\u0000\u0000RT\u0007\u0000\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XY\u0005-\u0000\u0000Yp\u0005 \u0000\u0000Z\\\u0007\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`a\u0005*\u0000\u0000ap\u0005 \u0000\u0000b"+
		"d\u0007\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hj\u0007\u0001\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005.\u0000\u0000"+
		"np\u0005 \u0000\u0000oU\u0001\u0000\u0000\u0000o]\u0001\u0000\u0000\u0000"+
		"oe\u0001\u0000\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qr\u0005*\u0000"+
		"\u0000rs\u0005*\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0005*\u0000"+
		"\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0005`\u0000\u0000wx\u0005`\u0000"+
		"\u0000xy\u0005`\u0000\u0000y\t\u0001\u0000\u0000\u0000z{\u0005`\u0000"+
		"\u0000{|\u0005`\u0000\u0000|\u000b\u0001\u0000\u0000\u0000}~\u0005<\u0000"+
		"\u0000~\u007f\u0005!\u0000\u0000\u007f\u0080\u0005-\u0000\u0000\u0080"+
		"\u0081\u0005-\u0000\u0000\u0081\u0085\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\t\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u008c\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005-\u0000\u0000\u0089\u008a\u0005-\u0000"+
		"\u0000\u008a\u008d\u0005>\u0000\u0000\u008b\u008d\u0005\u0000\u0000\u0001"+
		"\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u00a7\u0001\u0000\u0000\u0000\u008e\u0092\u0005<\u0000\u0000\u008f"+
		"\u0091\t\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005/\u0000\u0000\u0096\u0099\u0005"+
		">\u0000\u0000\u0097\u0099\u0007\u0002\u0000\u0000\u0098\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u00a7\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u009c\u0005/\u0000\u0000"+
		"\u009c\u00a0\u0001\u0000\u0000\u0000\u009d\u009f\t\u0000\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0007\u0002\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a6}\u0001\u0000\u0000\u0000\u00a6\u008e"+
		"\u0001\u0000\u0000\u0000\u00a6\u009a\u0001\u0000\u0000\u0000\u00a7\r\u0001"+
		"\u0000\u0000\u0000\u00a8\u00ac\u0007\u0003\u0000\u0000\u00a9\u00ab\u0007"+
		"\u0004\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u000f\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0007\u0005\u0000\u0000\u00b0\u0011\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0005#\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0006\b\u0000\u0000\u00b7\u0013\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0003\u0002\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0006\t\u0000\u0000\u00bb\u0015\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0003\u0004\u0001\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0006\n\u0000\u0000\u00bf\u0017\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0003\u0006\u0002\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0006\u000b\u0000\u0000\u00c3\u0019\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003\b\u0003\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0006\f\u0000\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003"+
		"\n\u0004\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\r"+
		"\u0000\u0000\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005=\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d4\u0001\u0000\u0000\u0000\u00d1\u00d3\u0007\u0006\u0000"+
		"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0005-\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00df\u0001\u0000\u0000\u0000"+
		"\u00dc\u00de\u0007\u0006\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0!\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005 \u0000\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea"+
		"\u0005-\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005"+
		" \u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0005-\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fb\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0005 \u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0005-\u0000\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102"+
		"\u0106\u0001\u0000\u0000\u0000\u0103\u0105\u0007\u0007\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"#\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005*\u0000\u0000\u010a\u010b\u0005*\u0000\u0000\u010b\u010d\u0005*"+
		"\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0113\u0001\u0000\u0000\u0000\u0110\u0112\u0007\b\u0000"+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114%\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005!\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0006\u0012\u0000\u0000\u0119\'\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005[\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0006"+
		"\u0013\u0001\u0000\u011d\u011e\u0006\u0013\u0000\u0000\u011e)\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0003\f\u0005\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0006\u0014\u0000\u0000\u0122+\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0007\t\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0006\u0015\u0002\u0000\u0126\u0127\u0006\u0015\u0000\u0000\u0127"+
		"-\u0001\u0000\u0000\u0000\u0128\u0129\u0003\u0010\u0007\u0000\u0129/\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u0007\u0006\u0000\u0000\u012b\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e1\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\t\u0000\u0000\u0000\u01303\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005!\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0006\u0019\u0003\u0000\u01345\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0005[\u0000\u0000\u01367\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"]\u0000\u0000\u01389\u0001\u0000\u0000\u0000\u0139\u013a\u0005(\u0000"+
		"\u0000\u013a;\u0001\u0000\u0000\u0000\u013b\u013c\u0005)\u0000\u0000\u013c"+
		"=\u0001\u0000\u0000\u0000\u013d\u013e\u0003\u0004\u0001\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u001e\u0004\u0000\u0140?\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0003\u0006\u0002\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0006\u001f\u0005\u0000\u0144A\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0003\b\u0003\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0006 \u0006\u0000\u0148C\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0003\n\u0004\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0006!\u0007\u0000\u014cE\u0001\u0000\u0000\u0000\u014d\u014e\u0003\f"+
		"\u0005\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0006\"\b"+
		"\u0000\u0150G\u0001\u0000\u0000\u0000\u0151\u0152\u0003\u000e\u0006\u0000"+
		"\u0152I\u0001\u0000\u0000\u0000\u0153\u0154\u0003\u0010\u0007\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0006$\t\u0000\u0156\u0157"+
		"\u0006$\n\u0000\u0157K\u0001\u0000\u0000\u0000\u0158\u015a\u0007\u0006"+
		"\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0006%\u000b"+
		"\u0000\u015eM\u0001\u0000\u0000\u0000\u015f\u0160\t\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0006&\f\u0000\u0162"+
		"O\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0000\u0000\u0001\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0006\'\n\u0000\u0166Q\u0001\u0000"+
		"\u0000\u0000\u001f\u0000\u0001U]eko\u0085\u008c\u0092\u0098\u00a0\u00a4"+
		"\u00a6\u00ac\u00b4\u00cf\u00d4\u00da\u00df\u00e5\u00eb\u00f0\u00f6\u00fb"+
		"\u0101\u0106\u010e\u0113\u012d\u015b\r\u0002\u0001\u0000\u0007\u0007\u0000"+
		"\u0003\u0000\u0000\u0007\u0006\u0000\u0007\n\u0000\u0007\u000b\u0000\u0007"+
		"\f\u0000\u0007\r\u0000\u0007\u0003\u0000\u0007\u0001\u0000\u0002\u0000"+
		"\u0000\u0007\u0004\u0000\u0007\u0002\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}