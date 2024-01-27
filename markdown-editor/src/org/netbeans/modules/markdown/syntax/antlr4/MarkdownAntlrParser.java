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
		HORIZONTAL_RULE=17, SQ_PAR_CLOSE=18, R_PAR_OPEN=19, R_PAR_CLOSE=20, IDENTIFIER=21, 
		LINE_EOF=22;
	public static final int
		RULE_file = 0, RULE_main_element = 1, RULE_paragraph = 2, RULE_element = 3, 
		RULE_list = 4, RULE_listItem = 5, RULE_header = 6, RULE_setTextHeader = 7, 
		RULE_breakLine = 8, RULE_textEffect = 9, RULE_bold = 10, RULE_italic = 11, 
		RULE_textElement = 12, RULE_simpleText = 13, RULE_html = 14, RULE_code = 15, 
		RULE_inlineText = 16, RULE_blockCode = 17, RULE_codeText = 18, RULE_nl = 19, 
		RULE_link = 20, RULE_label = 21, RULE_path = 22, RULE_labelText = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "main_element", "paragraph", "element", "list", "listItem", "header", 
			"setTextHeader", "breakLine", "textEffect", "bold", "italic", "textElement", 
			"simpleText", "html", "code", "inlineText", "blockCode", "codeText", 
			"nl", "link", "label", "path", "labelText"
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				main_element();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2244574L) != 0) );
			setState(53);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public TerminalNode NL() { return getToken(MarkdownAntlrParser.NL, 0); }
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				setTextHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				paragraph();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				breakLine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				match(NL);
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
	public static class ParagraphContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(MarkdownAntlrParser.NL, 0); }
		public TerminalNode EOF() { return getToken(MarkdownAntlrParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
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
		enterRule(_localctx, 4, RULE_paragraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				element();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2113244L) != 0) );
			setState(68);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TextEffectContext textEffect() {
			return getRuleContext(TextEffectContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TextElementContext textElement() {
			return getRuleContext(TextElementContext.class,0);
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
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				link();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				textEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				code();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				blockCode();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				html();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				textElement();
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
		enterRule(_localctx, 8, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					listItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode LIST_ITEM_MARKER() { return getToken(MarkdownAntlrParser.LIST_ITEM_MARKER, 0); }
		public TerminalNode NL() { return getToken(MarkdownAntlrParser.NL, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
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
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(LIST_ITEM_MARKER);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85);
					element();
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2113244L) != 0) );
				setState(90);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(LIST_ITEM_MARKER);
				setState(93);
				paragraph();
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_HASH() { return getToken(MarkdownAntlrParser.HEADER_HASH, 0); }
		public TerminalNode WS() { return getToken(MarkdownAntlrParser.WS, 0); }
		public SimpleTextContext simpleText() {
			return getRuleContext(SimpleTextContext.class,0);
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
			setState(96);
			match(HEADER_HASH);
			setState(97);
			match(WS);
			setState(98);
			simpleText();
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
			setState(100);
			textElement();
			setState(101);
			match(NL);
			setState(102);
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
			setState(104);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				bold();
				}
				break;
			case S_ASTERIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
			setState(110);
			match(D_ASTERIX);
			setState(111);
			textElement();
			setState(112);
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
			setState(114);
			match(S_ASTERIX);
			setState(115);
			textElement();
			setState(116);
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case D_ASTERIX:
			case S_ASTERIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				textEffect();
				}
				break;
			case RAW_TEXT:
			case WS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				simpleText();
				}
				break;
			case EXCL:
			case SQ_PAR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
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
			setState(124); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(123);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097172L) != 0)) ) {
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
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(128);
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
			setState(130);
			match(BACKTICK_2);
			setState(131);
			inlineText();
			setState(132);
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
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(136);
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
					setState(134);
					textElement();
					}
					break;
				case HTML:
					{
					setState(135);
					html();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2100444L) != 0) );
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
			setState(140);
			match(BACKTICK_3);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(141);
				((BlockCodeContext)_localctx).lang = match(IDENTIFIER);
				}
			}

			setState(144);
			match(NL);
			setState(145);
			codeText();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(146);
				match(NL);
				}
			}

			setState(149);
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
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(154);
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
						setState(151);
						textElement();
						}
						break;
					case HTML:
						{
						setState(152);
						html();
						}
						break;
					case NL:
						{
						setState(153);
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
				setState(156); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(158);
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCL) {
				{
				setState(160);
				match(EXCL);
				}
			}

			setState(163);
			label();
			setState(164);
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
			setState(166);
			match(SQ_PAR_OPEN);
			setState(167);
			labelText();
			setState(168);
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
			setState(170);
			match(R_PAR_OPEN);
			setState(171);
			labelText();
			setState(172);
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
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097172L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2097172L) != 0) );
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
		"\u0004\u0001\u0016\u00b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0004"+
		"\u00002\b\u0000\u000b\u0000\f\u00003\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		">\b\u0001\u0001\u0002\u0004\u0002A\b\u0002\u000b\u0002\f\u0002B\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0004"+
		"\u0004Q\b\u0004\u000b\u0004\f\u0004R\u0001\u0005\u0001\u0005\u0004\u0005"+
		"W\b\u0005\u000b\u0005\f\u0005X\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005_\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0003\tm\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\fz"+
		"\b\f\u0001\r\u0004\r}\b\r\u000b\r\f\r~\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u0089\b\u0010\u000b\u0010\f\u0010\u008a\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u008f\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0094"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u009b\b\u0012\u000b\u0012\f\u0012\u009c\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0003\u0014\u00a2\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00b0\b\u0017\u000b\u0017"+
		"\f\u0017\u00b1\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\u0003\u0001\u0001\u0001\u0001\u0001\u0000\u000e\u000f\u0003\u0000\u0002"+
		"\u0002\u0004\u0004\u0015\u0015\u00b8\u00001\u0001\u0000\u0000\u0000\u0002"+
		"=\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006M\u0001"+
		"\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000"+
		"\f`\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010h\u0001"+
		"\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014n\u0001\u0000\u0000"+
		"\u0000\u0016r\u0001\u0000\u0000\u0000\u0018y\u0001\u0000\u0000\u0000\u001a"+
		"|\u0001\u0000\u0000\u0000\u001c\u0080\u0001\u0000\u0000\u0000\u001e\u0082"+
		"\u0001\u0000\u0000\u0000 \u0088\u0001\u0000\u0000\u0000\"\u008c\u0001"+
		"\u0000\u0000\u0000$\u009a\u0001\u0000\u0000\u0000&\u009e\u0001\u0000\u0000"+
		"\u0000(\u00a1\u0001\u0000\u0000\u0000*\u00a6\u0001\u0000\u0000\u0000,"+
		"\u00aa\u0001\u0000\u0000\u0000.\u00af\u0001\u0000\u0000\u000002\u0003"+
		"\u0002\u0001\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u00007>\u0003"+
		"\f\u0006\u00008>\u0003\u000e\u0007\u00009>\u0003\b\u0004\u0000:>\u0003"+
		"\u0004\u0002\u0000;>\u0003\u0010\b\u0000<>\u0005\u0001\u0000\u0000=7\u0001"+
		"\u0000\u0000\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000"+
		"=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>\u0003\u0001\u0000\u0000\u0000?A\u0003\u0006\u0003\u0000@?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0007\u0000\u0000"+
		"\u0000E\u0005\u0001\u0000\u0000\u0000FN\u0003(\u0014\u0000GN\u0003\u0012"+
		"\t\u0000HN\u0003\u001e\u000f\u0000IN\u0003\"\u0011\u0000JN\u0003\b\u0004"+
		"\u0000KN\u0003\u001c\u000e\u0000LN\u0003\u0018\f\u0000MF\u0001\u0000\u0000"+
		"\u0000MG\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OQ\u0003\n\u0005\u0000"+
		"PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\t\u0001\u0000\u0000\u0000TV\u0005\t"+
		"\u0000\u0000UW\u0003\u0006\u0003\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0005\u0001\u0000\u0000[_\u0001\u0000\u0000"+
		"\u0000\\]\u0005\t\u0000\u0000]_\u0003\u0004\u0002\u0000^T\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_\u000b\u0001\u0000\u0000\u0000"+
		"`a\u0005\b\u0000\u0000ab\u0005\u0004\u0000\u0000bc\u0003\u001a\r\u0000"+
		"c\r\u0001\u0000\u0000\u0000de\u0003\u0018\f\u0000ef\u0005\u0001\u0000"+
		"\u0000fg\u0007\u0001\u0000\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0005"+
		"\u0011\u0000\u0000i\u0011\u0001\u0000\u0000\u0000jm\u0003\u0014\n\u0000"+
		"km\u0003\u0016\u000b\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000m\u0013\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000op\u0003\u0018"+
		"\f\u0000pq\u0005\n\u0000\u0000q\u0015\u0001\u0000\u0000\u0000rs\u0005"+
		"\u000b\u0000\u0000st\u0003\u0018\f\u0000tu\u0005\u000b\u0000\u0000u\u0017"+
		"\u0001\u0000\u0000\u0000vz\u0003\u0012\t\u0000wz\u0003\u001a\r\u0000x"+
		"z\u0003(\u0014\u0000yv\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z\u0019\u0001\u0000\u0000\u0000{}\u0007\u0002"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u001b\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u001d\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0084\u0003 \u0010"+
		"\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u001f\u0001\u0000\u0000\u0000"+
		"\u0086\u0089\u0003\u0018\f\u0000\u0087\u0089\u0003\u001c\u000e\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b!\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0005\f\u0000\u0000\u008d\u008f\u0005\u0015\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\u0001\u0000\u0000\u0091\u0093\u0003"+
		"$\u0012\u0000\u0092\u0094\u0005\u0001\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096#\u0001\u0000\u0000"+
		"\u0000\u0097\u009b\u0003\u0018\f\u0000\u0098\u009b\u0003\u001c\u000e\u0000"+
		"\u0099\u009b\u0003&\u0013\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d%\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0001\u0000\u0000\u009f\'\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005"+
		"\u0006\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003"+
		"*\u0015\u0000\u00a4\u00a5\u0003,\u0016\u0000\u00a5)\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u00a8\u0003.\u0017\u0000"+
		"\u00a8\u00a9\u0005\u0012\u0000\u0000\u00a9+\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0013\u0000\u0000\u00ab\u00ac\u0003.\u0017\u0000\u00ac\u00ad"+
		"\u0005\u0014\u0000\u0000\u00ad-\u0001\u0000\u0000\u0000\u00ae\u00b0\u0007"+
		"\u0002\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2/\u0001\u0000\u0000\u0000\u00123=BMRX^ly~\u0088"+
		"\u008a\u008e\u0093\u009a\u009c\u00a1\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}