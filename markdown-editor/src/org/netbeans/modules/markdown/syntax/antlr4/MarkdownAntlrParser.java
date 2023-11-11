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
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, NL=4, HEADER=5, BOLD_START=6, 
		ITALIC=7, STRIKETHROUGH=8, CODE=9, BLOCK_CODE_START=10, HYPER_LINK_LABEL=11, 
		HYPER_LINK=12, SETTEXT_H1_UNDERLINE=13, SETTEXT_H2_UNDERLINE=14, HORIZONTAL_RULE_HYPHEN=15, 
		HORIZONTAL_RULE=16, LIST_ITEM_MARKER=17, HTML=18, TEXT_FRAGMENT=19, BOLD_END=20, 
		BOLD=21, LANG_TYPE=22, BLOCK_CODE=23, BLOCK_CODE_END=24;
	public static final int
		RULE_file = 0, RULE_main_element = 1, RULE_paragraph = 2, RULE_element = 3, 
		RULE_list = 4, RULE_listItem = 5, RULE_header = 6, RULE_setTextHeader = 7, 
		RULE_breakLine = 8, RULE_boldLink = 9, RULE_textEffect = 10, RULE_html = 11, 
		RULE_textFragment = 12, RULE_textFragmentConcat = 13, RULE_code = 14, 
		RULE_blockCode = 15, RULE_link = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "main_element", "paragraph", "element", "list", "listItem", "header", 
			"setTextHeader", "breakLine", "boldLink", "textEffect", "html", "textFragment", 
			"textFragmentConcat", "code", "blockCode", "link"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				main_element();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 987120L) != 0) );
			setState(39);
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
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				setTextHeader();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				paragraph();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
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
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				element();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 987072L) != 0) );
			setState(52);
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
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public BoldLinkContext boldLink() {
			return getRuleContext(BoldLinkContext.class,0);
		}
		public TextEffectContext textEffect() {
			return getRuleContext(TextEffectContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
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
		public TextFragmentConcatContext textFragmentConcat() {
			return getRuleContext(TextFragmentConcatContext.class,0);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				breakLine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				boldLink();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				textEffect();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				link();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				code();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				blockCode();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				list();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				html();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				textFragmentConcat();
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
			setState(66); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					listItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(68); 
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(LIST_ITEM_MARKER);
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71);
					element();
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 987072L) != 0) );
				setState(76);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(LIST_ITEM_MARKER);
				setState(79);
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
		public TerminalNode HEADER() { return getToken(MarkdownAntlrParser.HEADER, 0); }
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
			setState(82);
			match(HEADER);
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
		public TextFragmentConcatContext textFragmentConcat() {
			return getRuleContext(TextFragmentConcatContext.class,0);
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
			setState(84);
			textFragmentConcat();
			setState(85);
			match(NL);
			setState(86);
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
			setState(88);
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
	public static class BoldLinkContext extends ParserRuleContext {
		public TerminalNode BOLD_START() { return getToken(MarkdownAntlrParser.BOLD_START, 0); }
		public TerminalNode HYPER_LINK_LABEL() { return getToken(MarkdownAntlrParser.HYPER_LINK_LABEL, 0); }
		public TerminalNode HYPER_LINK() { return getToken(MarkdownAntlrParser.HYPER_LINK, 0); }
		public TerminalNode BOLD_END() { return getToken(MarkdownAntlrParser.BOLD_END, 0); }
		public BoldLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterBoldLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitBoldLink(this);
		}
	}

	public final BoldLinkContext boldLink() throws RecognitionException {
		BoldLinkContext _localctx = new BoldLinkContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boldLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(BOLD_START);
			setState(91);
			match(HYPER_LINK_LABEL);
			setState(92);
			match(HYPER_LINK);
			setState(93);
			match(BOLD_END);
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
		public TerminalNode BOLD_START() { return getToken(MarkdownAntlrParser.BOLD_START, 0); }
		public TerminalNode BOLD_END() { return getToken(MarkdownAntlrParser.BOLD_END, 0); }
		public List<TerminalNode> BOLD() { return getTokens(MarkdownAntlrParser.BOLD); }
		public TerminalNode BOLD(int i) {
			return getToken(MarkdownAntlrParser.BOLD, i);
		}
		public TerminalNode ITALIC() { return getToken(MarkdownAntlrParser.ITALIC, 0); }
		public TerminalNode STRIKETHROUGH() { return getToken(MarkdownAntlrParser.STRIKETHROUGH, 0); }
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
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOLD_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(BOLD_START);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(BOLD);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOLD );
				setState(101);
				match(BOLD_END);
				}
				break;
			case ITALIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(ITALIC);
				}
				break;
			case STRIKETHROUGH:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(STRIKETHROUGH);
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
		enterRule(_localctx, 22, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
	public static class TextFragmentContext extends ParserRuleContext {
		public TerminalNode TEXT_FRAGMENT() { return getToken(MarkdownAntlrParser.TEXT_FRAGMENT, 0); }
		public TextFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterTextFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitTextFragment(this);
		}
	}

	public final TextFragmentContext textFragment() throws RecognitionException {
		TextFragmentContext _localctx = new TextFragmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textFragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(TEXT_FRAGMENT);
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
	public static class TextFragmentConcatContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_FRAGMENT() { return getTokens(MarkdownAntlrParser.TEXT_FRAGMENT); }
		public TerminalNode TEXT_FRAGMENT(int i) {
			return getToken(MarkdownAntlrParser.TEXT_FRAGMENT, i);
		}
		public TextFragmentConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFragmentConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).enterTextFragmentConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarkdownAntlrParserListener ) ((MarkdownAntlrParserListener)listener).exitTextFragmentConcat(this);
		}
	}

	public final TextFragmentConcatContext textFragmentConcat() throws RecognitionException {
		TextFragmentConcatContext _localctx = new TextFragmentConcatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_textFragmentConcat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					match(TEXT_FRAGMENT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
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
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(MarkdownAntlrParser.CODE, 0); }
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
		enterRule(_localctx, 28, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CODE);
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
		public TerminalNode BLOCK_CODE_START() { return getToken(MarkdownAntlrParser.BLOCK_CODE_START, 0); }
		public TerminalNode BLOCK_CODE_END() { return getToken(MarkdownAntlrParser.BLOCK_CODE_END, 0); }
		public TerminalNode LANG_TYPE() { return getToken(MarkdownAntlrParser.LANG_TYPE, 0); }
		public List<TerminalNode> BLOCK_CODE() { return getTokens(MarkdownAntlrParser.BLOCK_CODE); }
		public TerminalNode BLOCK_CODE(int i) {
			return getToken(MarkdownAntlrParser.BLOCK_CODE, i);
		}
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
		enterRule(_localctx, 30, RULE_blockCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(BLOCK_CODE_START);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANG_TYPE) {
				{
				setState(118);
				match(LANG_TYPE);
				}
			}

			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(BLOCK_CODE);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BLOCK_CODE );
			setState(126);
			match(BLOCK_CODE_END);
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
		public TerminalNode HYPER_LINK_LABEL() { return getToken(MarkdownAntlrParser.HYPER_LINK_LABEL, 0); }
		public TerminalNode HYPER_LINK() { return getToken(MarkdownAntlrParser.HYPER_LINK, 0); }
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
		enterRule(_localctx, 32, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(HYPER_LINK_LABEL);
			setState(129);
			match(HYPER_LINK);
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
		"\u0004\u0001\u0018\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0004\u00021\b\u0002"+
		"\u000b\u0002\f\u00022\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0004\u0004C\b\u0004\u000b"+
		"\u0004\f\u0004D\u0001\u0005\u0001\u0005\u0004\u0005I\b\u0005\u000b\u0005"+
		"\f\u0005J\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"Q\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0004\nb\b\n\u000b\n\f\nc\u0001\n\u0001\n\u0001\n\u0003\ni"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rp\b\r\u000b"+
		"\r\f\rq\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000fx\b"+
		"\u000f\u0001\u000f\u0004\u000f{\b\u000f\u000b\u000f\f\u000f|\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0002\u0001\u0001\u0004\u0004\u0001\u0000\r"+
		"\u000e\u0088\u0000#\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000"+
		"\u00040\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bB\u0001"+
		"\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000"+
		"\u000eT\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012Z"+
		"\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016j\u0001\u0000"+
		"\u0000\u0000\u0018l\u0001\u0000\u0000\u0000\u001ao\u0001\u0000\u0000\u0000"+
		"\u001cs\u0001\u0000\u0000\u0000\u001eu\u0001\u0000\u0000\u0000 \u0080"+
		"\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001"+
		"\u0001\u0000\u0000\u0000).\u0003\f\u0006\u0000*.\u0003\u000e\u0007\u0000"+
		"+.\u0003\u0004\u0002\u0000,.\u0005\u0004\u0000\u0000-)\u0001\u0000\u0000"+
		"\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/1\u0003\u0006\u0003\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0007\u0000"+
		"\u0000\u00005\u0005\u0001\u0000\u0000\u00006@\u0003\u0010\b\u00007@\u0003"+
		"\u0012\t\u00008@\u0003\u0014\n\u00009@\u0003 \u0010\u0000:@\u0003\u001c"+
		"\u000e\u0000;@\u0003\u001e\u000f\u0000<@\u0003\b\u0004\u0000=@\u0003\u0016"+
		"\u000b\u0000>@\u0003\u001a\r\u0000?6\u0001\u0000\u0000\u0000?7\u0001\u0000"+
		"\u0000\u0000?8\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?:\u0001"+
		"\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000AC\u0003\n\u0005\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\t\u0001"+
		"\u0000\u0000\u0000FH\u0005\u0011\u0000\u0000GI\u0003\u0006\u0003\u0000"+
		"HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0004"+
		"\u0000\u0000MQ\u0001\u0000\u0000\u0000NO\u0005\u0011\u0000\u0000OQ\u0003"+
		"\u0004\u0002\u0000PF\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"Q\u000b\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000S\r\u0001\u0000"+
		"\u0000\u0000TU\u0003\u001a\r\u0000UV\u0005\u0004\u0000\u0000VW\u0007\u0001"+
		"\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\u0010\u0000\u0000"+
		"Y\u0011\u0001\u0000\u0000\u0000Z[\u0005\u0006\u0000\u0000[\\\u0005\u000b"+
		"\u0000\u0000\\]\u0005\f\u0000\u0000]^\u0005\u0014\u0000\u0000^\u0013\u0001"+
		"\u0000\u0000\u0000_a\u0005\u0006\u0000\u0000`b\u0005\u0015\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ei\u0005\u0014"+
		"\u0000\u0000fi\u0005\u0007\u0000\u0000gi\u0005\b\u0000\u0000h_\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u0015"+
		"\u0001\u0000\u0000\u0000jk\u0005\u0012\u0000\u0000k\u0017\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0013\u0000\u0000m\u0019\u0001\u0000\u0000\u0000"+
		"np\u0005\u0013\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u001b\u0001"+
		"\u0000\u0000\u0000st\u0005\t\u0000\u0000t\u001d\u0001\u0000\u0000\u0000"+
		"uw\u0005\n\u0000\u0000vx\u0005\u0016\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000y{\u0005\u0017\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0018\u0000\u0000\u007f\u001f\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u000b\u0000\u0000\u0081\u0082\u0005\f\u0000\u0000\u0082!\u0001"+
		"\u0000\u0000\u0000\f%-2?DJPchqw|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}