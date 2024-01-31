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
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(MarkdownAntlrParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(MarkdownAntlrParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#italic}.
	 * @param ctx the parse tree
	 */
	void enterItalic(MarkdownAntlrParser.ItalicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#italic}.
	 * @param ctx the parse tree
	 */
	void exitItalic(MarkdownAntlrParser.ItalicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#textElement}.
	 * @param ctx the parse tree
	 */
	void enterTextElement(MarkdownAntlrParser.TextElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#textElement}.
	 * @param ctx the parse tree
	 */
	void exitTextElement(MarkdownAntlrParser.TextElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void enterSimpleText(MarkdownAntlrParser.SimpleTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#simpleText}.
	 * @param ctx the parse tree
	 */
	void exitSimpleText(MarkdownAntlrParser.SimpleTextContext ctx);
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
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#inlineText}.
	 * @param ctx the parse tree
	 */
	void enterInlineText(MarkdownAntlrParser.InlineTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#inlineText}.
	 * @param ctx the parse tree
	 */
	void exitInlineText(MarkdownAntlrParser.InlineTextContext ctx);
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
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#codeText}.
	 * @param ctx the parse tree
	 */
	void enterCodeText(MarkdownAntlrParser.CodeTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#codeText}.
	 * @param ctx the parse tree
	 */
	void exitCodeText(MarkdownAntlrParser.CodeTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(MarkdownAntlrParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(MarkdownAntlrParser.NlContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MarkdownAntlrParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MarkdownAntlrParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(MarkdownAntlrParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(MarkdownAntlrParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#labelText}.
	 * @param ctx the parse tree
	 */
	void enterLabelText(MarkdownAntlrParser.LabelTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#labelText}.
	 * @param ctx the parse tree
	 */
	void exitLabelText(MarkdownAntlrParser.LabelTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarkdownAntlrParser#textLine}.
	 * @param ctx the parse tree
	 */
	void enterTextLine(MarkdownAntlrParser.TextLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarkdownAntlrParser#textLine}.
	 * @param ctx the parse tree
	 */
	void exitTextLine(MarkdownAntlrParser.TextLineContext ctx);
}