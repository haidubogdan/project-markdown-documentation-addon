parser grammar MarkdownAntlrParser;

/*
* any LI identifier until the end of line next LI identifier and double new line
* should ignore tabs?
* inside a LI we can have paragraphs
* 
*/

@header{
  package org.netbeans.modules.markdown.syntax.antlr4;
}

options { tokenVocab = MarkdownAntlrLexer; }

file: main_element+ EOF ;
main_element: 
    header 
    | setTextHeader 
    | blockCode 
    | list 
    | blockQuote 
    | paragraph 
    | breakLine
    START_NL;

//nested items not treated
list: (listItem NL* | nestedListItem NL*)+;
paragraph: textLine;

element:
 textElement
| code
| html
;


listItem : LIST_ITEM_MARKER textLine;
nestedListItem : TAB+ WS* LIST_ITEM_MARKER textLine;

header: HEADER_HASH WS textLine;
setTextHeader: textElement NL (SETTEXT_H1_UNDERLINE | SETTEXT_H2_UNDERLINE);
breakLine : HORIZONTAL_RULE | HORIZONTAL_RULE_HYPHEN;
textEffect : bold | italic;
bold : D_ASTERIX textElement D_ASTERIX;
italic : S_ASTERIX textElement S_ASTERIX;
textElement : textEffect | simpleText | link;
simpleText : (IDENTIFIER | RAW_TEXT | WS)+ br?;
html: HTML;
//simplified version for the moment
code : BACKTICK_2 inlineText BACKTICK_2;
inlineText : (textElement | html)+;
//could use a mode
blockCode : BACKTICK_3 lang=IDENTIFIER? NL codeText NL? BACKTICK_3;
blockQuote : BLOCK_QUOTE_START main_element;
codeText : (textElement | html | nl)+;
nl : NL;
br : BR;
link: EXCL? label path;
label: SQ_PAR_OPEN labelText SQ_PAR_CLOSE;
path: R_PAR_OPEN labelText R_PAR_CLOSE;
labelText : (IDENTIFIER | RAW_TEXT | WS)+;
textLine : element+ (NL | EOF);