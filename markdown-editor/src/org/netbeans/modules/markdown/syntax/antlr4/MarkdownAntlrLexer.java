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
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, NL=4, HEADER=5, BOLD_START=6, 
		ITALIC=7, STRIKETHROUGH=8, CODE=9, BLOCK_CODE_START=10, HYPER_LINK_LABEL=11, 
		HYPER_LINK=12, SETTEXT_H1_UNDERLINE=13, SETTEXT_H2_UNDERLINE=14, HORIZONTAL_RULE_HYPHEN=15, 
		HORIZONTAL_RULE=16, LIST_ITEM_MARKER=17, HTML=18, TEXT_FRAGMENT=19, BOLD_END=20, 
		BOLD=21, LANG_TYPE=22, BLOCK_CODE=23, BLOCK_CODE_END=24;
	public static final int
		INSIDE_BOLD=1, INSIDE_BLOCK_CODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE_BOLD", "INSIDE_BLOCK_CODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "HEADER", "BOLD_START", "DoubleAsterix", "ITALIC", "SgAsterix", 
			"SINGLE_LINE_RAW_TEXT", "ITALIC_2", "STRIKETHROUGH", "CODE", "CODE2", 
			"Backtick", "BLOCK_CODE_START", "TriBacktick", "HYPER_LINK_LABEL", "HYPER_LINK", 
			"SETTEXT_H1_UNDERLINE", "SETTEXT_H2_UNDERLINE", "HORIZONTAL_RULE_HYPHEN", 
			"HORIZONTAL_RULE", "HyphenHr", "AxterixHr", "LIST_ITEM_MARKER", "ListItemMarker", 
			"HTML", "HtmlElement", "TEXT_FRAGMENT", "TextFragment", "BOLD_HYPER_LINK_LABEL", 
			"BOLD_HYPER_LINK", "BOLD_END", "BOLD_NL", "BOLD", "SINGLE_PAR", "LANG_TYPE", 
			"BLOCK_CODE", "BLOCK_CODE_END", "BLOCK_CODE_ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "NL", "HEADER", "BOLD_START", 
			"ITALIC", "STRIKETHROUGH", "CODE", "BLOCK_CODE_START", "HYPER_LINK_LABEL", 
			"HYPER_LINK", "SETTEXT_H1_UNDERLINE", "SETTEXT_H2_UNDERLINE", "HORIZONTAL_RULE_HYPHEN", 
			"HORIZONTAL_RULE", "LIST_ITEM_MARKER", "HTML", "TEXT_FRAGMENT", "BOLD_END", 
			"BOLD", "LANG_TYPE", "BLOCK_CODE", "BLOCK_CODE_END"
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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return SINGLE_LINE_RAW_TEXT_sempred((RuleContext)_localctx, predIndex);
		case 9:
			return CODE_sempred((RuleContext)_localctx, predIndex);
		case 10:
			return CODE2_sempred((RuleContext)_localctx, predIndex);
		case 16:
			return SETTEXT_H1_UNDERLINE_sempred((RuleContext)_localctx, predIndex);
		case 17:
			return SETTEXT_H2_UNDERLINE_sempred((RuleContext)_localctx, predIndex);
		case 18:
			return HORIZONTAL_RULE_HYPHEN_sempred((RuleContext)_localctx, predIndex);
		case 19:
			return HORIZONTAL_RULE_sempred((RuleContext)_localctx, predIndex);
		case 22:
			return LIST_ITEM_MARKER_sempred((RuleContext)_localctx, predIndex);
		case 34:
			return LANG_TYPE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SINGLE_LINE_RAW_TEXT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return this.IsNewLineOrStart();
		}
		return true;
	}
	private boolean CODE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return this._input.LA(2)!='`' && this._input.LA(3)!='`';
		}
		return true;
	}
	private boolean CODE2_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return this._input.LA(3)!='`';
		}
		return true;
	}
	private boolean SETTEXT_H1_UNDERLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return this.IsNewLineOrStart();
		case 4:
			return this.peekNextChar('\n');
		}
		return true;
	}
	private boolean SETTEXT_H2_UNDERLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return this.IsNewLineOrStart();
		case 6:
			return this.peekNextChar('\n');
		}
		return true;
	}
	private boolean HORIZONTAL_RULE_HYPHEN_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return this.IsNewLineOrStart();
		case 8:
			return this.peekNextChar('\n');
		}
		return true;
	}
	private boolean HORIZONTAL_RULE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return this.IsNewLineOrStart();
		case 10:
			return this.peekNextChar('\n');
		}
		return true;
	}
	private boolean LIST_ITEM_MARKER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return this.IsNewLineOrStart();
		}
		return true;
	}
	private boolean LANG_TYPE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return this.isFirstCodeBlockElement();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u01bd\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007"+
		"\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007"+
		"\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b"+
		"\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002"+
		"\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002"+
		"\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002"+
		"\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002"+
		"\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002"+
		"\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#"+
		"\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0004\u0001S\b\u0001\u000b\u0001\f\u0001T\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004o\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007x\b"+
		"\u0007\n\u0007\f\u0007{\t\u0007\u0001\u0007\u0003\u0007~\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0086\b\b\n"+
		"\b\f\b\u0089\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u008e\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0094\b\t\n\t\f\t\u0097\t\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a0\b\n\n\n\f\n\u00a3"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a8\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0003\u000e\u00b7\b\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00bb\b\u000e\n\u000e\f\u000e\u00be\t\u000e\u0001\u000e\u0003\u000e"+
		"\u00c1\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00c5\b\u000f\n\u000f"+
		"\f\u000f\u00c8\t\u000f\u0001\u000f\u0003\u000f\u00cb\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00cf\b\u0010\u000b\u0010\f\u0010\u00d0\u0001"+
		"\u0010\u0005\u0010\u00d4\b\u0010\n\u0010\f\u0010\u00d7\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u00dd\b\u0011\u000b\u0011"+
		"\f\u0011\u00de\u0001\u0011\u0005\u0011\u00e2\b\u0011\n\u0011\f\u0011\u00e5"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0005"+
		"\u0014\u00f2\b\u0014\n\u0014\f\u0014\u00f5\t\u0014\u0001\u0014\u0004\u0014"+
		"\u00f8\b\u0014\u000b\u0014\f\u0014\u00f9\u0001\u0014\u0005\u0014\u00fd"+
		"\b\u0014\n\u0014\f\u0014\u0100\t\u0014\u0001\u0014\u0004\u0014\u0103\b"+
		"\u0014\u000b\u0014\f\u0014\u0104\u0001\u0014\u0005\u0014\u0108\b\u0014"+
		"\n\u0014\f\u0014\u010b\t\u0014\u0001\u0014\u0004\u0014\u010e\b\u0014\u000b"+
		"\u0014\f\u0014\u010f\u0001\u0014\u0005\u0014\u0113\b\u0014\n\u0014\f\u0014"+
		"\u0116\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u011b\b"+
		"\u0015\u000b\u0015\f\u0015\u011c\u0001\u0015\u0005\u0015\u0120\b\u0015"+
		"\n\u0015\f\u0015\u0123\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0005\u0017\u0129\b\u0017\n\u0017\f\u0017\u012c\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0131\b\u0017\n\u0017\f\u0017\u0134"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0139\b\u0017"+
		"\n\u0017\f\u0017\u013c\t\u0017\u0001\u0017\u0004\u0017\u013f\b\u0017\u000b"+
		"\u0017\f\u0017\u0140\u0001\u0017\u0001\u0017\u0003\u0017\u0145\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u014f\b\u0019\n\u0019\f\u0019\u0152"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0158"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u015c\b\u0019\n\u0019\f\u0019"+
		"\u015f\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0164\b"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u016a"+
		"\b\u0019\n\u0019\f\u0019\u016d\t\u0019\u0001\u0019\u0003\u0019\u0170\b"+
		"\u0019\u0003\u0019\u0172\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0004"+
		"\u001b\u0177\b\u001b\u000b\u001b\f\u001b\u0178\u0001\u001b\u0003\u001b"+
		"\u017c\b\u001b\u0001\u001c\u0003\u001c\u017f\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0183\b\u001c\n\u001c\f\u001c\u0186\t\u001c\u0001\u001c"+
		"\u0003\u001c\u0189\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u018f\b\u001d\n\u001d\f\u001d\u0192\t\u001d\u0001\u001d\u0003"+
		"\u001d\u0195\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0004 \u01a3\b \u000b \f \u01a4\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0004\"\u01ad\b\"\u000b\"\f\"\u01ae\u0001#\u0004#\u01b2"+
		"\b#\u000b#\f#\u01b3\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0007iy\u0087\u00a1\u0150\u015d\u016b\u0000&\u0003\u0004\u0005\u0005"+
		"\u0007\u0006\t\u0000\u000b\u0007\r\u0000\u000f\u0000\u0011\u0000\u0013"+
		"\b\u0015\t\u0017\u0000\u0019\u0000\u001b\n\u001d\u0000\u001f\u000b!\f"+
		"#\r%\u000e\'\u000f)\u0010+\u0000-\u0000/\u00111\u00003\u00125\u00007\u0013"+
		"9\u0000;\u0000=\u0000?\u0014A\u0000C\u0015E\u0000G\u0016I\u0017K\u0018"+
		"M\u0000\u0003\u0000\u0001\u0002\u0010\u0002\u0000\n\n\r\r\u0001\u0000"+
		"  \u0001\u0001__\u0004\u0000\n\n\r\r()[[\u0001\u0001]]\u0005\u0000\n\n"+
		"\r\r(([[]]\u0001\u0001))\u0002\u0000  --\u0001\u0000**\u0002\u0000\t\t"+
		"  \u0001\u000009\u0001\u0001>>\u0002\u0000AZaz\u0005\u0000\n\n\r\r((*"+
		"*[[\u0002\u0000(([[\u0003\u0000\n\n\r\r``\u01e0\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000/\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000"+
		"\u0000\u0001;\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0001"+
		"?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0001C\u0001"+
		"\u0000\u0000\u0000\u0001E\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000"+
		"\u0000\u0002I\u0001\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0002"+
		"M\u0001\u0000\u0000\u0000\u0003O\u0001\u0000\u0000\u0000\u0005R\u0001"+
		"\u0000\u0000\u0000\u0007^\u0001\u0000\u0000\u0000\tb\u0001\u0000\u0000"+
		"\u0000\u000be\u0001\u0000\u0000\u0000\rp\u0001\u0000\u0000\u0000\u000f"+
		"r\u0001\u0000\u0000\u0000\u0011u\u0001\u0000\u0000\u0000\u0013\u0081\u0001"+
		"\u0000\u0000\u0000\u0015\u008f\u0001\u0000\u0000\u0000\u0017\u009a\u0001"+
		"\u0000\u0000\u0000\u0019\u00ab\u0001\u0000\u0000\u0000\u001b\u00ad\u0001"+
		"\u0000\u0000\u0000\u001d\u00b1\u0001\u0000\u0000\u0000\u001f\u00b6\u0001"+
		"\u0000\u0000\u0000!\u00c2\u0001\u0000\u0000\u0000#\u00cc\u0001\u0000\u0000"+
		"\u0000%\u00da\u0001\u0000\u0000\u0000\'\u00e8\u0001\u0000\u0000\u0000"+
		")\u00ec\u0001\u0000\u0000\u0000+\u00f3\u0001\u0000\u0000\u0000-\u011a"+
		"\u0001\u0000\u0000\u0000/\u0124\u0001\u0000\u0000\u00001\u0144\u0001\u0000"+
		"\u0000\u00003\u0146\u0001\u0000\u0000\u00005\u0171\u0001\u0000\u0000\u0000"+
		"7\u0173\u0001\u0000\u0000\u00009\u017b\u0001\u0000\u0000\u0000;\u017e"+
		"\u0001\u0000\u0000\u0000=\u018c\u0001\u0000\u0000\u0000?\u0198\u0001\u0000"+
		"\u0000\u0000A\u019c\u0001\u0000\u0000\u0000C\u01a2\u0001\u0000\u0000\u0000"+
		"E\u01a6\u0001\u0000\u0000\u0000G\u01aa\u0001\u0000\u0000\u0000I\u01b1"+
		"\u0001\u0000\u0000\u0000K\u01b5\u0001\u0000\u0000\u0000M\u01b9\u0001\u0000"+
		"\u0000\u0000OP\u0007\u0000\u0000\u0000P\u0004\u0001\u0000\u0000\u0000"+
		"QS\u0005#\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0007\u0001\u0000\u0000W[\u0001\u0000\u0000\u0000XZ\b\u0000\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0006\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^_\u0003\t\u0003\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0006\u0002\u0000\u0000a\b\u0001\u0000\u0000\u0000bc\u0005*\u0000\u0000"+
		"cd\u0005*\u0000\u0000d\n\u0001\u0000\u0000\u0000ei\u0003\r\u0005\u0000"+
		"fh\t\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jn\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lo\u0003\r\u0005\u0000mo\u0005\u0000\u0000"+
		"\u0001nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\f\u0001\u0000"+
		"\u0000\u0000pq\u0005*\u0000\u0000q\u000e\u0001\u0000\u0000\u0000rs\u0004"+
		"\u0006\u0000\u0000st\b\u0000\u0000\u0000t\u0010\u0001\u0000\u0000\u0000"+
		"uy\u0005_\u0000\u0000vx\t\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0007\u0002"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0006\u0007\u0001\u0000\u0080\u0012\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005~\u0000\u0000\u0082\u0083\u0005~\u0000\u0000\u0083\u0087"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\t\u0000\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008d\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"~\u0000\u0000\u008b\u008e\u0005~\u0000\u0000\u008c\u008e\u0005\u0000\u0000"+
		"\u0001\u008d\u008a\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0014\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0019\u000b"+
		"\u0000\u0090\u0095\u0004\t\u0001\u0000\u0091\u0094\u0003\u0019\u000b\u0000"+
		"\u0092\u0094\b\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003\u0019\u000b\u0000\u0099\u0016\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005`\u0000\u0000\u009b\u009c\u0005`\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u00a1\u0004\n\u0002\u0000\u009e\u00a0\t\u0000"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a7\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005`\u0000\u0000\u00a5\u00a8\u0005`\u0000\u0000"+
		"\u00a6\u00a8\u0005\u0000\u0000\u0001\u00a7\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0006\n\u0002\u0000\u00aa\u0018\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005`\u0000\u0000\u00ac\u001a\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0003\u001d\r\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0006"+
		"\f\u0003\u0000\u00b0\u001c\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005`"+
		"\u0000\u0000\u00b2\u00b3\u0005`\u0000\u0000\u00b3\u00b4\u0005`\u0000\u0000"+
		"\u00b4\u001e\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005!\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bc\u0005[\u0000\u0000\u00b9\u00bb"+
		"\b\u0003\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0007\u0004\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1 \u0001\u0000\u0000\u0000\u00c2\u00c6\u0005(\u0000"+
		"\u0000\u00c3\u00c5\b\u0005\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0007\u0006\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\"\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0004\u0010\u0003\u0000\u00cd\u00cf\u0005=\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0007\u0001\u0000\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0004\u0010\u0004\u0000\u00d9$\u0001\u0000\u0000\u0000\u00da\u00dc\u0004"+
		"\u0011\u0005\u0000\u00db\u00dd\u0005-\u0000\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0007\u0001\u0000\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0004\u0011"+
		"\u0006\u0000\u00e7&\u0001\u0000\u0000\u0000\u00e8\u00e9\u0004\u0012\u0007"+
		"\u0000\u00e9\u00ea\u0003+\u0014\u0000\u00ea\u00eb\u0004\u0012\b\u0000"+
		"\u00eb(\u0001\u0000\u0000\u0000\u00ec\u00ed\u0004\u0013\t\u0000\u00ed"+
		"\u00ee\u0003-\u0015\u0000\u00ee\u00ef\u0004\u0013\n\u0000\u00ef*\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f2\u0005 \u0000\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005-\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fe\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005 \u0000\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0103\u0005-\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0109\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u0005 \u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u0005-\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0114\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u0007\u0007\u0000\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115,\u0001\u0000"+
		"\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005*\u0000"+
		"\u0000\u0118\u0119\u0005*\u0000\u0000\u0119\u011b\u0005*\u0000\u0000\u011a"+
		"\u0117\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u0121\u0001\u0000\u0000\u0000\u011e\u0120\u0007\b\u0000\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122.\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0004"+
		"\u0016\u000b\u0000\u0125\u0126\u00031\u0017\u0000\u01260\u0001\u0000\u0000"+
		"\u0000\u0127\u0129\u0007\t\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005-\u0000\u0000\u012e"+
		"\u0145\u0005 \u0000\u0000\u012f\u0131\u0007\t\u0000\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005*\u0000\u0000\u0136\u0145\u0005 \u0000\u0000\u0137\u0139\u0007\t"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0007\n\u0000\u0000\u013e\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005.\u0000\u0000\u0143\u0145\u0005 \u0000\u0000\u0144"+
		"\u012a\u0001\u0000\u0000\u0000\u0144\u0132\u0001\u0000\u0000\u0000\u0144"+
		"\u013a\u0001\u0000\u0000\u0000\u01452\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u00035\u0019\u0000\u01474\u0001\u0000\u0000\u0000\u0148\u0149\u0005<"+
		"\u0000\u0000\u0149\u014a\u0005!\u0000\u0000\u014a\u014b\u0005-\u0000\u0000"+
		"\u014b\u014c\u0005-\u0000\u0000\u014c\u0150\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\t\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u0157\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0005-\u0000\u0000\u0154\u0155\u0005"+
		"-\u0000\u0000\u0155\u0158\u0005>\u0000\u0000\u0156\u0158\u0005\u0000\u0000"+
		"\u0001\u0157\u0153\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0172\u0001\u0000\u0000\u0000\u0159\u015d\u0005<\u0000\u0000"+
		"\u015a\u015c\t\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u0163\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005/\u0000\u0000\u0161\u0164"+
		"\u0005>\u0000\u0000\u0162\u0164\u0007\u000b\u0000\u0000\u0163\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0172\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005<\u0000\u0000\u0166\u0167\u0005/\u0000"+
		"\u0000\u0167\u016b\u0001\u0000\u0000\u0000\u0168\u016a\t\u0000\u0000\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016e\u0170\u0007\u000b\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u0148\u0001\u0000\u0000\u0000"+
		"\u0171\u0159\u0001\u0000\u0000\u0000\u0171\u0165\u0001\u0000\u0000\u0000"+
		"\u01726\u0001\u0000\u0000\u0000\u0173\u0174\u00039\u001b\u0000\u01748"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0007\f\u0000\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017c\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\t\u0000\u0000\u0000\u017b\u0176\u0001\u0000"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c:\u0001\u0000\u0000"+
		"\u0000\u017d\u017f\u0005!\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0184\u0005[\u0000\u0000\u0181\u0183\b\u0003\u0000\u0000\u0182"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187"+
		"\u0189\u0007\u0004\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0006\u001c\u0004\u0000\u018b"+
		"<\u0001\u0000\u0000\u0000\u018c\u0190\u0005(\u0000\u0000\u018d\u018f\b"+
		"\u0005\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0190\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0007\u0006\u0000\u0000\u0194\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0006"+
		"\u001d\u0005\u0000\u0197>\u0001\u0000\u0000\u0000\u0198\u0199\u0003\t"+
		"\u0003\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0006\u001e"+
		"\u0006\u0000\u019b@\u0001\u0000\u0000\u0000\u019c\u019d\u0003\u0003\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0006\u001f\u0007"+
		"\u0000\u019f\u01a0\u0006\u001f\u0006\u0000\u01a0B\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a3\b\r\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a5D\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0007\u000e\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0006!\b\u0000\u01a9F\u0001\u0000\u0000\u0000\u01aa\u01ac\u0004\"\f\u0000"+
		"\u01ab\u01ad\b\u0000\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01afH\u0001\u0000\u0000\u0000\u01b0\u01b2"+
		"\b\u000f\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b4J\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003\u001d"+
		"\r\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0006$\u0006"+
		"\u0000\u01b8L\u0001\u0000\u0000\u0000\u01b9\u01ba\u0007\u000f\u0000\u0000"+
		"\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0006%\t\u0000\u01bc"+
		"N\u0001\u0000\u0000\u00007\u0000\u0001\u0002T[iny}\u0087\u008d\u0093\u0095"+
		"\u00a1\u00a7\u00b6\u00bc\u00c0\u00c6\u00ca\u00d0\u00d5\u00de\u00e3\u00f3"+
		"\u00f9\u00fe\u0104\u0109\u010f\u0114\u011c\u0121\u012a\u0132\u013a\u0140"+
		"\u0144\u0150\u0157\u015d\u0163\u016b\u016f\u0171\u0178\u017b\u017e\u0184"+
		"\u0188\u0190\u0194\u01a4\u01ae\u01b3\n\u0005\u0001\u0000\u0007\u0007\u0000"+
		"\u0007\t\u0000\u0005\u0002\u0000\u0007\u000b\u0000\u0007\f\u0000\u0004"+
		"\u0000\u0000\u0007\u0004\u0000\u0007\u0015\u0000\u0007\u0017\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}