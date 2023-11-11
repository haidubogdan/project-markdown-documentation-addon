// Generated from MarkdownAntlrParser.g4 by ANTLR 4.13.0

  package org.netbeans.modules.markdown.syntax.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarkdownAntlrParser}.
 */
public interface MarkdownAntlrParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MarkdownAntlrParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MarkdownAntlrParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#main_element}.
	 * @param ctx the parse tree
	 */
	void enterMain_element(MarkdownAntlrParser.Main_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#main_element}.
	 * @param ctx the parse tree
	 */
	void exitMain_element(MarkdownAntlrParser.Main_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(MarkdownAntlrParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(MarkdownAntlrParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MarkdownAntlrParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MarkdownAntlrParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MarkdownAntlrParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MarkdownAntlrParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(MarkdownAntlrParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(MarkdownAntlrParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(MarkdownAntlrParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(MarkdownAntlrParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#setTextHeader}.
	 * @param ctx the parse tree
	 */
	void enterSetTextHeader(MarkdownAntlrParser.SetTextHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#setTextHeader}.
	 * @param ctx the parse tree
	 */
	void exitSetTextHeader(MarkdownAntlrParser.SetTextHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#breakLine}.
	 * @param ctx the parse tree
	 */
	void enterBreakLine(MarkdownAntlrParser.BreakLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#breakLine}.
	 * @param ctx the parse tree
	 */
	void exitBreakLine(MarkdownAntlrParser.BreakLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#boldLink}.
	 * @param ctx the parse tree
	 */
	void enterBoldLink(MarkdownAntlrParser.BoldLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#boldLink}.
	 * @param ctx the parse tree
	 */
	void exitBoldLink(MarkdownAntlrParser.BoldLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#textEffect}.
	 * @param ctx the parse tree
	 */
	void enterTextEffect(MarkdownAntlrParser.TextEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#textEffect}.
	 * @param ctx the parse tree
	 */
	void exitTextEffect(MarkdownAntlrParser.TextEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(MarkdownAntlrParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(MarkdownAntlrParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#textFragment}.
	 * @param ctx the parse tree
	 */
	void enterTextFragment(MarkdownAntlrParser.TextFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#textFragment}.
	 * @param ctx the parse tree
	 */
	void exitTextFragment(MarkdownAntlrParser.TextFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#textFragmentConcat}.
	 * @param ctx the parse tree
	 */
	void enterTextFragmentConcat(MarkdownAntlrParser.TextFragmentConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#textFragmentConcat}.
	 * @param ctx the parse tree
	 */
	void exitTextFragmentConcat(MarkdownAntlrParser.TextFragmentConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MarkdownAntlrParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MarkdownAntlrParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(MarkdownAntlrParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(MarkdownAntlrParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(MarkdownAntlrParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(MarkdownAntlrParser.LinkContext ctx);
}