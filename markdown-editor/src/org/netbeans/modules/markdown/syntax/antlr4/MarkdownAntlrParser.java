// Generated from MarkdownAntlrParser.g4 by ANTLR 4.13.0

  package org.netbeans.modules.markdown.syntax.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MarkdownAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, RAW_TEXT=2, HTML=3, WS=4, ATTR_COMMENT=5, EXCL=6, SQ_PAR_OPEN=7, 
		HEADER_HASH=8, LIST_ITEM_MARKER=9, D_ASTERIX=10, S_ASTERIX=11, BACKTICK_3=12, 
		BACKTICK_2=13, SETTEXT_H1_UNDERLINE=14, SETTEXT_H2_UNDERLINE=15, HORIZONTAL_RULE_HYPHEN=16, 
		HORIZONTAL_RULE=17, BLOCK_QUOTE_START=18, SQ_PAR_CLOSE=19, R_PAR_OPEN=20, 
		R_PAR_CLOSE=21, IDENTIFIER=22, LINE_EOF=23;
	public static final int
		RULE_file = 0, RULE_main_element = 1, RULE_list = 2, RULE_paragraph = 3, 
		RULE_element = 4, RULE_listItem = 5, RULE_header = 6, RULE_setTextHeader = 7, 
		RULE_breakLine = 8, RULE_textEffect = 9, RULE_bold = 10, RULE_italic = 11, 
		RULE_textElement = 12, RULE_simpleText = 13, RULE_html = 14, RULE_code = 15, 
		RULE_inlineText = 16, RULE_blockCode = 17, RULE_codeText = 18, RULE_nl = 19, 
		RULE_link = 20, RULE_label = 21, RULE_path = 22, RULE_labelText = 23, 
		RULE_textLine = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "main_element", "list", "paragraph", "element", "listItem", "header", 
			"setTextHeader", "breakLine", "textEffect", "bold", "italic", "textElement", 
			"simpleText", "html", "code", "inlineText", "blockCode", "codeText", 
			"nl", "link", "label", "path", "labelText", "textLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'['", null, null, null, null, 
			null, null, null, null, null, null, "'>'", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "RAW_TEXT", "HTML", "WS", "ATTR_COMMENT", "EXCL", "SQ_PAR_OPEN", 
			"HEADER_HASH", "LIST_ITEM_MARKER", "D_ASTERIX", "S_ASTERIX", "BACKTICK_3", 
			"BACKTICK_2", "SETTEXT_H1_UNDERLINE", "SETTEXT_H2_UNDERLINE", "HORIZONTAL_RULE_HYPHEN", 
			"HORIZONTAL_RULE", "BLOCK_QUOTE_START", "SQ_PAR_CLOSE", "R_PAR_OPEN", 
			"R_PAR_CLOSE", "IDENTIFIER", "LINE_EOF"
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
	public String getGrammarFileName() { return "MarkdownAntlrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarkdownAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MarkdownAntlrParser.EOF, 0); }
		public List<Main_elementContext> main_element() {
			return getRuleContexts(Main_elementContext.class);
		}
		public Main_elementContext main_element(int i) {
			return getRuleContext(Main_elementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				main_element();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4341724L) != 0) );
			setState(55);
			match(EOF);
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
	public static class Main_elementContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public SetTextHeaderContext setTextHeader() {
			return getRuleContext(SetTextHeaderContext.class,0);
		}
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public Main_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterMain_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitMain_element(this);
		}
	}

	public final Main_elementContext main_element() throws RecognitionException {
		Main_elementContext _localctx = new Main_elementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_element);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				setTextHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				blockCode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				paragraph();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				breakLine();
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
	public static class ListContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(MarkdownAntlrParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MarkdownAntlrParser.NL, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					listItem();
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(66);
						match(NL);
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ParagraphContext extends ParserRuleContext {
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paragraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			textLine();
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
	public static class ElementContext extends ParserRuleContext {
		public TextElementContext textElement() {
			return getRuleContext(TextElementContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_TEXT:
			case WS:
			case EXCL:
			case SQ_PAR_OPEN:
			case D_ASTERIX:
			case S_ASTERIX:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				textElement();
				}
				break;
			case BACKTICK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				code();
				}
				break;
			case HTML:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				html();
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
	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode LIST_ITEM_MARKER() { return getToken(MarkdownAntlrParser.LIST_ITEM_MARKER, 0); }
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LIST_ITEM_MARKER);
			setState(84);
			textLine();
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_HASH() { return getToken(MarkdownAntlrParser.HEADER_HASH, 0); }
		public TerminalNode WS() { return getToken(MarkdownAntlrParser.WS, 0); }
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(HEADER_HASH);
			setState(87);
			match(WS);
			setState(88);
			textLine();
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
	public static class SetTextHeaderContext extends ParserRuleContext {
		public TextElementContext textElement() {
			return getRuleContext(TextElementContext.class,0);
		}
		public TerminalNode NL() { return getToken(MarkdownAntlrParser.NL, 0); }
		public TerminalNode SETTEXT_H1_UNDERLINE() { return getToken(MarkdownAntlrParser.SETTEXT_H1_UNDERLINE, 0); }
		public TerminalNode SETTEXT_H2_UNDERLINE() { return getToken(MarkdownAntlrParser.SETTEXT_H2_UNDERLINE, 0); }
		public SetTextHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTextHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterSetTextHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitSetTextHeader(this);
		}
	}

	public final SetTextHeaderContext setTextHeader() throws RecognitionException {
		SetTextHeaderContext _localctx = new SetTextHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setTextHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			textElement();
			setState(91);
			match(NL);
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==SETTEXT_H1_UNDERLINE || _la==SETTEXT_H2_UNDERLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class BreakLineContext extends ParserRuleContext {
		public TerminalNode HORIZONTAL_RULE() { return getToken(MarkdownAntlrParser.HORIZONTAL_RULE, 0); }
		public BreakLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterBreakLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitBreakLine(this);
		}
	}

	public final BreakLineContext breakLine() throws RecognitionException {
		BreakLineContext _localctx = new BreakLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_breakLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(HORIZONTAL_RULE);
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
	public static class TextEffectContext extends ParserRuleContext {
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public ItalicContext italic() {
			return getRuleContext(ItalicContext.class,0);
		}
		public TextEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterTextEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitTextEffect(this);
		}
	}

	public final TextEffectContext textEffect() throws RecognitionException {
		TextEffectContext _localctx = new TextEffectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_textEffect);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				bold();
				}
				break;
			case S_ASTERIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				italic();
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
	public static class BoldContext extends ParserRuleContext {
		public List<TerminalNode> D_ASTERIX() { return getTokens(MarkdownAntlrParser.D_ASTERIX); }
		public TerminalNode D_ASTERIX(int i) {
			return getToken(MarkdownAntlrParser.D_ASTERIX, i);
		}
		public TextElementContext textElement() {
			return getRuleContext(TextElementContext.class,0);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitBold(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(D_ASTERIX);
			setState(101);
			textElement();
			setState(102);
			match(D_ASTERIX);
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
	public static class ItalicContext extends ParserRuleContext {
		public List<TerminalNode> S_ASTERIX() { return getTokens(MarkdownAntlrParser.S_ASTERIX); }
		public TerminalNode S_ASTERIX(int i) {
			return getToken(MarkdownAntlrParser.S_ASTERIX, i);
		}
		public TextElementContext textElement() {
			return getRuleContext(TextElementContext.class,0);
		}
		public ItalicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterItalic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitItalic(this);
		}
	}

	public final ItalicContext italic() throws RecognitionException {
		ItalicContext _localctx = new ItalicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_italic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(S_ASTERIX);
			setState(105);
			textElement();
			setState(106);
			match(S_ASTERIX);
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
	public static class TextElementContext extends ParserRuleContext {
		public TextEffectContext textEffect() {
			return getRuleContext(TextEffectContext.class,0);
		}
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TextElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterTextElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitTextElement(this);
		}
	}

	public final TextElementContext textElement() throws RecognitionException {
		TextElementContext _localctx = new TextElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textElement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ASTERIX:
			case S_ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				textEffect();
				}
				break;
			case RAW_TEXT:
			case WS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				simpleText();
				}
				break;
			case EXCL:
			case SQ_PAR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				link();
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
	public static class SimpleTextContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MarkdownAntlrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MarkdownAntlrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RAW_TEXT() { return getTokens(MarkdownAntlrParser.RAW_TEXT); }
		public TerminalNode RAW_TEXT(int i) {
			return getToken(MarkdownAntlrParser.RAW_TEXT, i);
		}
		public List<TerminalNode> WS() { return getTokens(MarkdownAntlrParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MarkdownAntlrParser.WS, i);
		}
		public SimpleTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterSimpleText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitSimpleText(this);
		}
	}

	public final SimpleTextContext simpleText() throws RecognitionException {
		SimpleTextContext _localctx = new SimpleTextContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(113);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194324L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode HTML() { return getToken(MarkdownAntlrParser.HTML, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitHtml(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(HTML);
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
	public static class CodeContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK_2() { return getTokens(MarkdownAntlrParser.BACKTICK_2); }
		public TerminalNode BACKTICK_2(int i) {
			return getToken(MarkdownAntlrParser.BACKTICK_2, i);
		}
		public InlineTextContext inlineText() {
			return getRuleContext(InlineTextContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(BACKTICK_2);
			setState(121);
			inlineText();
			setState(122);
			match(BACKTICK_2);
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
	public static class InlineTextContext extends ParserRuleContext {
		public List<TextElementContext> textElement() {
			return getRuleContexts(TextElementContext.class);
		}
		public TextElementContext textElement(int i) {
			return getRuleContext(TextElementContext.class,i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public InlineTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterInlineText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitInlineText(this);
		}
	}

	public final InlineTextContext inlineText() throws RecognitionException {
		InlineTextContext _localctx = new InlineTextContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inlineText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RAW_TEXT:
				case WS:
				case EXCL:
				case SQ_PAR_OPEN:
				case D_ASTERIX:
				case S_ASTERIX:
				case IDENTIFIER:
					{
					setState(124);
					textElement();
					}
					break;
				case HTML:
					{
					setState(125);
					html();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4197596L) != 0) );
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
	public static class BlockCodeContext extends ParserRuleContext {
		public Token lang;
		public List<TerminalNode> BACKTICK_3() { return getTokens(MarkdownAntlrParser.BACKTICK_3); }
		public TerminalNode BACKTICK_3(int i) {
			return getToken(MarkdownAntlrParser.BACKTICK_3, i);
		}
		public List<TerminalNode> NL() { return getTokens(MarkdownAntlrParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(MarkdownAntlrParser.NL, i);
		}
		public CodeTextContext codeText() {
			return getRuleContext(CodeTextContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MarkdownAntlrParser.IDENTIFIER, 0); }
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitBlockCode(this);
		}
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(BACKTICK_3);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(131);
				((BlockCodeContext)_localctx).lang = match(IDENTIFIER);
				}
			}

			setState(134);
			match(NL);
			setState(135);
			codeText();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(136);
				match(NL);
				}
			}

			setState(139);
			match(BACKTICK_3);
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
	public static class CodeTextContext extends ParserRuleContext {
		public List<TextElementContext> textElement() {
			return getRuleContexts(TextElementContext.class);
		}
		public TextElementContext textElement(int i) {
			return getRuleContext(TextElementContext.class,i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public CodeTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterCodeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitCodeText(this);
		}
	}

	public final CodeTextContext codeText() throws RecognitionException {
		CodeTextContext _localctx = new CodeTextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_codeText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(144);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case RAW_TEXT:
					case WS:
					case EXCL:
					case SQ_PAR_OPEN:
					case D_ASTERIX:
					case S_ASTERIX:
					case IDENTIFIER:
						{
						setState(141);
						textElement();
						}
						break;
					case HTML:
						{
						setState(142);
						html();
						}
						break;
					case NL:
						{
						setState(143);
						nl();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class NlContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(MarkdownAntlrParser.NL, 0); }
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterNl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitNl(this);
		}
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(NL);
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
	public static class LinkContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode EXCL() { return getToken(MarkdownAntlrParser.EXCL, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCL) {
				{
				setState(150);
				match(EXCL);
				}
			}

			setState(153);
			label();
			setState(154);
			path();
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode SQ_PAR_OPEN() { return getToken(MarkdownAntlrParser.SQ_PAR_OPEN, 0); }
		public LabelTextContext labelText() {
			return getRuleContext(LabelTextContext.class,0);
		}
		public TerminalNode SQ_PAR_CLOSE() { return getToken(MarkdownAntlrParser.SQ_PAR_CLOSE, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SQ_PAR_OPEN);
			setState(157);
			labelText();
			setState(158);
			match(SQ_PAR_CLOSE);
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
	public static class PathContext extends ParserRuleContext {
		public TerminalNode R_PAR_OPEN() { return getToken(MarkdownAntlrParser.R_PAR_OPEN, 0); }
		public LabelTextContext labelText() {
			return getRuleContext(LabelTextContext.class,0);
		}
		public TerminalNode R_PAR_CLOSE() { return getToken(MarkdownAntlrParser.R_PAR_CLOSE, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(R_PAR_OPEN);
			setState(161);
			labelText();
			setState(162);
			match(R_PAR_CLOSE);
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
	public static class LabelTextContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MarkdownAntlrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MarkdownAntlrParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RAW_TEXT() { return getTokens(MarkdownAntlrParser.RAW_TEXT); }
		public TerminalNode RAW_TEXT(int i) {
			return getToken(MarkdownAntlrParser.RAW_TEXT, i);
		}
		public List<TerminalNode> WS() { return getTokens(MarkdownAntlrParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MarkdownAntlrParser.WS, i);
		}
		public LabelTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterLabelText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitLabelText(this);
		}
	}

	public final LabelTextContext labelText() throws RecognitionException {
		LabelTextContext _localctx = new LabelTextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_labelText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194324L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4194324L) != 0) );
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
	public static class TextLineContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(MarkdownAntlrParser.NL, 0); }
		public TerminalNode EOF() { return getToken(MarkdownAntlrParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TextLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterTextLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitTextLine(this);
		}
	}

	public final TextLineContext textLine() throws RecognitionException {
		TextLineContext _localctx = new TextLineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_textLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				element();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4205788L) != 0) );
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001\u0017\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"D\b\u0002\n\u0002\f\u0002G\t\u0002\u0004\u0002I\b\u0002\u000b\u0002\f"+
		"\u0002J\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tc\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\fp\b\f\u0001\r\u0004\rs\b\r\u000b\r\f\rt\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u007f\b\u0010\u000b\u0010\f\u0010\u0080\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0085\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u008a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0004\u0012\u0091\b\u0012\u000b\u0012\f\u0012\u0092"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u0098\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017"+
		"\u00a6\b\u0017\u000b\u0017\f\u0017\u00a7\u0001\u0018\u0004\u0018\u00ab"+
		"\b\u0018\u000b\u0018\f\u0018\u00ac\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0003\u0001\u0000\u000e"+
		"\u000f\u0003\u0000\u0002\u0002\u0004\u0004\u0016\u0016\u0001\u0001\u0001"+
		"\u0001\u00af\u00003\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000"+
		"\u0004H\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bQ\u0001"+
		"\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000"+
		"\u000eZ\u0001\u0000\u0000\u0000\u0010^\u0001\u0000\u0000\u0000\u0012b"+
		"\u0001\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016h\u0001\u0000"+
		"\u0000\u0000\u0018o\u0001\u0000\u0000\u0000\u001ar\u0001\u0000\u0000\u0000"+
		"\u001cv\u0001\u0000\u0000\u0000\u001ex\u0001\u0000\u0000\u0000 ~\u0001"+
		"\u0000\u0000\u0000\"\u0082\u0001\u0000\u0000\u0000$\u0090\u0001\u0000"+
		"\u0000\u0000&\u0094\u0001\u0000\u0000\u0000(\u0097\u0001\u0000\u0000\u0000"+
		"*\u009c\u0001\u0000\u0000\u0000,\u00a0\u0001\u0000\u0000\u0000.\u00a5"+
		"\u0001\u0000\u0000\u00000\u00aa\u0001\u0000\u0000\u000024\u0003\u0002"+
		"\u0001\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0005\u0000\u0000\u00018\u0001\u0001\u0000\u0000\u00009@\u0003\f\u0006"+
		"\u0000:@\u0003\u000e\u0007\u0000;@\u0003\"\u0011\u0000<@\u0003\u0004\u0002"+
		"\u0000=@\u0003\u0006\u0003\u0000>@\u0003\u0010\b\u0000?9\u0001\u0000\u0000"+
		"\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0003"+
		"\u0001\u0000\u0000\u0000AE\u0003\n\u0005\u0000BD\u0005\u0001\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HA\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LM\u00030\u0018\u0000M\u0007\u0001\u0000\u0000\u0000NR\u0003\u0018"+
		"\f\u0000OR\u0003\u001e\u000f\u0000PR\u0003\u001c\u000e\u0000QN\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\t\u0001"+
		"\u0000\u0000\u0000ST\u0005\t\u0000\u0000TU\u00030\u0018\u0000U\u000b\u0001"+
		"\u0000\u0000\u0000VW\u0005\b\u0000\u0000WX\u0005\u0004\u0000\u0000XY\u0003"+
		"0\u0018\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0003\u0018\f\u0000[\\\u0005"+
		"\u0001\u0000\u0000\\]\u0007\u0000\u0000\u0000]\u000f\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0011\u0000\u0000_\u0011\u0001\u0000\u0000\u0000`c\u0003"+
		"\u0014\n\u0000ac\u0003\u0016\u000b\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0013\u0001\u0000\u0000\u0000de\u0005\n\u0000\u0000"+
		"ef\u0003\u0018\f\u0000fg\u0005\n\u0000\u0000g\u0015\u0001\u0000\u0000"+
		"\u0000hi\u0005\u000b\u0000\u0000ij\u0003\u0018\f\u0000jk\u0005\u000b\u0000"+
		"\u0000k\u0017\u0001\u0000\u0000\u0000lp\u0003\u0012\t\u0000mp\u0003\u001a"+
		"\r\u0000np\u0003(\u0014\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000p\u0019\u0001\u0000\u0000\u0000"+
		"qs\u0007\u0001\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u001b\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0003\u0000\u0000w\u001d\u0001\u0000\u0000"+
		"\u0000xy\u0005\r\u0000\u0000yz\u0003 \u0010\u0000z{\u0005\r\u0000\u0000"+
		"{\u001f\u0001\u0000\u0000\u0000|\u007f\u0003\u0018\f\u0000}\u007f\u0003"+
		"\u001c\u000e\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081!\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\f\u0000\u0000\u0083\u0085\u0005\u0016\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0089\u0003"+
		"$\u0012\u0000\u0088\u008a\u0005\u0001\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\f\u0000\u0000\u008c#\u0001\u0000\u0000"+
		"\u0000\u008d\u0091\u0003\u0018\f\u0000\u008e\u0091\u0003\u001c\u000e\u0000"+
		"\u008f\u0091\u0003&\u0013\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093%\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u0001\u0000\u0000\u0095\'\u0001\u0000\u0000\u0000\u0096\u0098\u0005"+
		"\u0006\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0003"+
		"*\u0015\u0000\u009a\u009b\u0003,\u0016\u0000\u009b)\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u009e\u0003.\u0017\u0000"+
		"\u009e\u009f\u0005\u0013\u0000\u0000\u009f+\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0014\u0000\u0000\u00a1\u00a2\u0003.\u0017\u0000\u00a2\u00a3"+
		"\u0005\u0015\u0000\u0000\u00a3-\u0001\u0000\u0000\u0000\u00a4\u00a6\u0007"+
		"\u0001\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8/\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\b"+
		"\u0004\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0007\u0002"+
		"\u0000\u0000\u00af1\u0001\u0000\u0000\u0000\u00115?EJQbot~\u0080\u0084"+
		"\u0089\u0090\u0092\u0097\u00a7\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}