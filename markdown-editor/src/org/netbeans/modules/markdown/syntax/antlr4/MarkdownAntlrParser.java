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
		NL=1, BR=2, RAW_TEXT=3, HTML=4, WS=5, ATTR_COMMENT=6, EXCL=7, SQ_PAR_OPEN=8, 
		HEADER_HASH=9, LIST_ITEM_MARKER=10, D_ASTERIX=11, S_ASTERIX=12, BACKTICK_3=13, 
		BACKTICK_2=14, SETTEXT_H1_UNDERLINE=15, SETTEXT_H2_UNDERLINE=16, HORIZONTAL_RULE_HYPHEN=17, 
		HORIZONTAL_RULE=18, BLOCK_QUOTE_START=19, START_NL=20, TAB=21, SQ_PAR_CLOSE=22, 
		R_PAR_OPEN=23, R_PAR_CLOSE=24, IDENTIFIER=25, LINE_EOF=26;
	public static final int
		RULE_file = 0, RULE_main_element = 1, RULE_list = 2, RULE_paragraph = 3, 
		RULE_element = 4, RULE_listItem = 5, RULE_nestedListItem = 6, RULE_header = 7, 
		RULE_setTextHeader = 8, RULE_breakLine = 9, RULE_textEffect = 10, RULE_bold = 11, 
		RULE_italic = 12, RULE_textElement = 13, RULE_simpleText = 14, RULE_html = 15, 
		RULE_code = 16, RULE_inlineText = 17, RULE_blockCode = 18, RULE_blockQuote = 19, 
		RULE_codeText = 20, RULE_nl = 21, RULE_br = 22, RULE_link = 23, RULE_label = 24, 
		RULE_path = 25, RULE_labelText = 26, RULE_textLine = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "main_element", "list", "paragraph", "element", "listItem", "nestedListItem", 
			"header", "setTextHeader", "breakLine", "textEffect", "bold", "italic", 
			"textElement", "simpleText", "html", "code", "inlineText", "blockCode", 
			"blockQuote", "codeText", "nl", "br", "link", "label", "path", "labelText", 
			"textLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'['", null, null, null, 
			null, null, null, null, null, null, null, "'> '", null, null, "']'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "BR", "RAW_TEXT", "HTML", "WS", "ATTR_COMMENT", "EXCL", "SQ_PAR_OPEN", 
			"HEADER_HASH", "LIST_ITEM_MARKER", "D_ASTERIX", "S_ASTERIX", "BACKTICK_3", 
			"BACKTICK_2", "SETTEXT_H1_UNDERLINE", "SETTEXT_H2_UNDERLINE", "HORIZONTAL_RULE_HYPHEN", 
			"HORIZONTAL_RULE", "BLOCK_QUOTE_START", "START_NL", "TAB", "SQ_PAR_CLOSE", 
			"R_PAR_OPEN", "R_PAR_CLOSE", "IDENTIFIER", "LINE_EOF"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				main_element();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 36601784L) != 0) );
			setState(61);
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
		public BlockQuoteContext blockQuote() {
			return getRuleContext(BlockQuoteContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public TerminalNode START_NL() { return getToken(MarkdownAntlrParser.START_NL, 0); }
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				setTextHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				blockCode();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				blockQuote();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				paragraph();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				breakLine();
				setState(70);
				match(START_NL);
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
		public List<NestedListItemContext> nestedListItem() {
			return getRuleContexts(NestedListItemContext.class);
		}
		public NestedListItemContext nestedListItem(int i) {
			return getRuleContext(NestedListItemContext.class,i);
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
			setState(88); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LIST_ITEM_MARKER:
						{
						setState(74);
						listItem();
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(75);
							match(NL);
							}
							}
							setState(80);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case TAB:
						{
						setState(81);
						nestedListItem();
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(82);
							match(NL);
							}
							}
							setState(87);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
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
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(92);
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
			setState(97);
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
				setState(94);
				textElement();
				}
				break;
			case BACKTICK_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				code();
				}
				break;
			case HTML:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
			setState(99);
			match(LIST_ITEM_MARKER);
			setState(100);
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
	public static class NestedListItemContext extends ParserRuleContext {
		public TerminalNode LIST_ITEM_MARKER() { return getToken(MarkdownAntlrParser.LIST_ITEM_MARKER, 0); }
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(MarkdownAntlrParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(MarkdownAntlrParser.TAB, i);
		}
		public List<TerminalNode> WS() { return getTokens(MarkdownAntlrParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(MarkdownAntlrParser.WS, i);
		}
		public NestedListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterNestedListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitNestedListItem(this);
		}
	}

	public final NestedListItemContext nestedListItem() throws RecognitionException {
		NestedListItemContext _localctx = new NestedListItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nestedListItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				match(TAB);
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAB );
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(107);
				match(WS);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(LIST_ITEM_MARKER);
			setState(114);
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
		enterRule(_localctx, 14, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(HEADER_HASH);
			setState(117);
			match(WS);
			setState(118);
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
		enterRule(_localctx, 16, RULE_setTextHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			textElement();
			setState(121);
			match(NL);
			setState(122);
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
		public TerminalNode HORIZONTAL_RULE_HYPHEN() { return getToken(MarkdownAntlrParser.HORIZONTAL_RULE_HYPHEN, 0); }
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
		enterRule(_localctx, 18, RULE_breakLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==HORIZONTAL_RULE_HYPHEN || _la==HORIZONTAL_RULE) ) {
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
		enterRule(_localctx, 20, RULE_textEffect);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				bold();
				}
				break;
			case S_ASTERIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
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
		enterRule(_localctx, 22, RULE_bold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(D_ASTERIX);
			setState(131);
			textElement();
			setState(132);
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
		enterRule(_localctx, 24, RULE_italic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(S_ASTERIX);
			setState(135);
			textElement();
			setState(136);
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
		enterRule(_localctx, 26, RULE_textElement);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ASTERIX:
			case S_ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				textEffect();
				}
				break;
			case RAW_TEXT:
			case WS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				simpleText();
				}
				break;
			case EXCL:
			case SQ_PAR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
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
		public BrContext br() {
			return getRuleContext(BrContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_simpleText);
		int _la;
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
					{
					setState(143);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554472L) != 0)) ) {
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
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BR) {
				{
				setState(148);
				br();
				}
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
		enterRule(_localctx, 30, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		enterRule(_localctx, 32, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(BACKTICK_2);
			setState(154);
			inlineText();
			setState(155);
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
		enterRule(_localctx, 34, RULE_inlineText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(159);
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
					setState(157);
					textElement();
					}
					break;
				case HTML:
					{
					setState(158);
					html();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33561016L) != 0) );
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
		enterRule(_localctx, 36, RULE_blockCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(BACKTICK_3);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(164);
				((BlockCodeContext)_localctx).lang = match(IDENTIFIER);
				}
			}

			setState(167);
			match(NL);
			setState(168);
			codeText();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(169);
				match(NL);
				}
			}

			setState(172);
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
	public static class BlockQuoteContext extends ParserRuleContext {
		public TerminalNode BLOCK_QUOTE_START() { return getToken(MarkdownAntlrParser.BLOCK_QUOTE_START, 0); }
		public Main_elementContext main_element() {
			return getRuleContext(Main_elementContext.class,0);
		}
		public BlockQuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockQuote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterBlockQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitBlockQuote(this);
		}
	}

	public final BlockQuoteContext blockQuote() throws RecognitionException {
		BlockQuoteContext _localctx = new BlockQuoteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockQuote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(BLOCK_QUOTE_START);
			setState(175);
			main_element();
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
		enterRule(_localctx, 40, RULE_codeText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(180);
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
						setState(177);
						textElement();
						}
						break;
					case HTML:
						{
						setState(178);
						html();
						}
						break;
					case NL:
						{
						setState(179);
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
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 42, RULE_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
	public static class BrContext extends ParserRuleContext {
		public TerminalNode BR() { return getToken(MarkdownAntlrParser.BR, 0); }
		public BrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_br; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterBr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitBr(this);
		}
	}

	public final BrContext br() throws RecognitionException {
		BrContext _localctx = new BrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_br);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(BR);
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
		enterRule(_localctx, 46, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCL) {
				{
				setState(188);
				match(EXCL);
				}
			}

			setState(191);
			label();
			setState(192);
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
		enterRule(_localctx, 48, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SQ_PAR_OPEN);
			setState(195);
			labelText();
			setState(196);
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
		enterRule(_localctx, 50, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(R_PAR_OPEN);
			setState(199);
			labelText();
			setState(200);
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
		enterRule(_localctx, 52, RULE_labelText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554472L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33554472L) != 0) );
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
		enterRule(_localctx, 54, RULE_textLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				element();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33577400L) != 0) );
			setState(212);
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
		"\u0004\u0001\u001a\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0001\u0000\u0004\u0000:\b\u0000\u000b\u0000\f\u0000;\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002M\b\u0002\n\u0002\f\u0002P\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002"+
		"\u0004\u0002Y\b\u0002\u000b\u0002\f\u0002Z\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0004\u0006h\b\u0006\u000b\u0006\f\u0006"+
		"i\u0001\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003"+
		"\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u008e\b\r\u0001\u000e"+
		"\u0004\u000e\u0091\b\u000e\u000b\u000e\f\u000e\u0092\u0001\u000e\u0003"+
		"\u000e\u0096\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u00a0\b\u0011\u000b"+
		"\u0011\f\u0011\u00a1\u0001\u0012\u0001\u0012\u0003\u0012\u00a6\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ab\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0004\u0014\u00b5\b\u0014\u000b\u0014\f\u0014\u00b6\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u00be"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0004\u001a\u00cc\b\u001a\u000b\u001a\f\u001a\u00cd\u0001\u001b"+
		"\u0004\u001b\u00d1\b\u001b\u000b\u001b\f\u001b\u00d2\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0004"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u0003\u0000\u0003\u0003"+
		"\u0005\u0005\u0019\u0019\u0001\u0001\u0001\u0001\u00d8\u00009\u0001\u0000"+
		"\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000"+
		"\u0006\\\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000\nc\u0001\u0000"+
		"\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000"+
		"\u0010x\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014\u0080"+
		"\u0001\u0000\u0000\u0000\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u0086"+
		"\u0001\u0000\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000\u001c\u0090"+
		"\u0001\u0000\u0000\u0000\u001e\u0097\u0001\u0000\u0000\u0000 \u0099\u0001"+
		"\u0000\u0000\u0000\"\u009f\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000"+
		"\u0000\u0000&\u00ae\u0001\u0000\u0000\u0000(\u00b4\u0001\u0000\u0000\u0000"+
		"*\u00b8\u0001\u0000\u0000\u0000,\u00ba\u0001\u0000\u0000\u0000.\u00bd"+
		"\u0001\u0000\u0000\u00000\u00c2\u0001\u0000\u0000\u00002\u00c6\u0001\u0000"+
		"\u0000\u00004\u00cb\u0001\u0000\u0000\u00006\u00d0\u0001\u0000\u0000\u0000"+
		"8:\u0003\u0002\u0001\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0000\u0000\u0001>\u0001\u0001\u0000\u0000\u0000"+
		"?I\u0003\u000e\u0007\u0000@I\u0003\u0010\b\u0000AI\u0003$\u0012\u0000"+
		"BI\u0003\u0004\u0002\u0000CI\u0003&\u0013\u0000DI\u0003\u0006\u0003\u0000"+
		"EF\u0003\u0012\t\u0000FG\u0005\u0014\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"H?\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000"+
		"\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000"+
		"\u0000\u0000HE\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000\u0000"+
		"JN\u0003\n\u0005\u0000KM\u0005\u0001\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OY\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QU\u0003\f\u0006"+
		"\u0000RT\u0005\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XJ\u0001\u0000\u0000\u0000"+
		"XQ\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\]\u0003"+
		"6\u001b\u0000]\u0007\u0001\u0000\u0000\u0000^b\u0003\u001a\r\u0000_b\u0003"+
		" \u0010\u0000`b\u0003\u001e\u000f\u0000a^\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000"+
		"cd\u0005\n\u0000\u0000de\u00036\u001b\u0000e\u000b\u0001\u0000\u0000\u0000"+
		"fh\u0005\u0015\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jn\u0001\u0000"+
		"\u0000\u0000km\u0005\u0005\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\n\u0000\u0000"+
		"rs\u00036\u001b\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\t\u0000\u0000"+
		"uv\u0005\u0005\u0000\u0000vw\u00036\u001b\u0000w\u000f\u0001\u0000\u0000"+
		"\u0000xy\u0003\u001a\r\u0000yz\u0005\u0001\u0000\u0000z{\u0007\u0000\u0000"+
		"\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0007\u0001\u0000\u0000}\u0013"+
		"\u0001\u0000\u0000\u0000~\u0081\u0003\u0016\u000b\u0000\u007f\u0081\u0003"+
		"\u0018\f\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000b"+
		"\u0000\u0000\u0083\u0084\u0003\u001a\r\u0000\u0084\u0085\u0005\u000b\u0000"+
		"\u0000\u0085\u0017\u0001\u0000\u0000\u0000\u0086\u0087\u0005\f\u0000\u0000"+
		"\u0087\u0088\u0003\u001a\r\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089"+
		"\u0019\u0001\u0000\u0000\u0000\u008a\u008e\u0003\u0014\n\u0000\u008b\u008e"+
		"\u0003\u001c\u000e\u0000\u008c\u008e\u0003.\u0017\u0000\u008d\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u0091\u0007"+
		"\u0002\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0096\u0003"+
		",\u0016\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u001d\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0004"+
		"\u0000\u0000\u0098\u001f\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000e"+
		"\u0000\u0000\u009a\u009b\u0003\"\u0011\u0000\u009b\u009c\u0005\u000e\u0000"+
		"\u0000\u009c!\u0001\u0000\u0000\u0000\u009d\u00a0\u0003\u001a\r\u0000"+
		"\u009e\u00a0\u0003\u001e\u000f\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2#\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\r\u0000\u0000\u00a4"+
		"\u00a6\u0005\u0019\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0001\u0000\u0000\u00a8\u00aa\u0003(\u0014\u0000\u00a9\u00ab"+
		"\u0005\u0001\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\r\u0000\u0000\u00ad%\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u0013\u0000\u0000\u00af\u00b0\u0003\u0002\u0001\u0000\u00b0\'\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b5\u0003\u001a\r\u0000\u00b2\u00b5\u0003\u001e\u000f"+
		"\u0000\u00b3\u00b5\u0003*\u0015\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7)\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0001\u0000\u0000\u00b9+\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0002\u0000\u0000\u00bb-\u0001\u0000\u0000\u0000\u00bc\u00be\u0005"+
		"\u0007\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003"+
		"0\u0018\u0000\u00c0\u00c1\u00032\u0019\u0000\u00c1/\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u00034\u001a\u0000"+
		"\u00c4\u00c5\u0005\u0016\u0000\u0000\u00c51\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u0017\u0000\u0000\u00c7\u00c8\u00034\u001a\u0000\u00c8\u00c9"+
		"\u0005\u0018\u0000\u0000\u00c93\u0001\u0000\u0000\u0000\u00ca\u00cc\u0007"+
		"\u0002\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce5\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\b"+
		"\u0004\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0003"+
		"\u0000\u0000\u00d57\u0001\u0000\u0000\u0000\u0016;HNUXZain\u0080\u008d"+
		"\u0092\u0095\u009f\u00a1\u00a5\u00aa\u00b4\u00b6\u00bd\u00cd\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}