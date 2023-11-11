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
main_element: header | setTextHeader | paragraph | NL;

paragraph: element+ (NL | EOF);

element: breakLine
| boldLink    
| textEffect
| link
| code
| blockCode
| list
| html
| textFragmentConcat
;

list: listItem+;
listItem : LIST_ITEM_MARKER element+ NL | LIST_ITEM_MARKER paragraph;

header: HEADER;
setTextHeader: textFragmentConcat NL (SETTEXT_H1_UNDERLINE | SETTEXT_H2_UNDERLINE);
breakLine : HORIZONTAL_RULE;
boldLink : BOLD_START HYPER_LINK_LABEL HYPER_LINK BOLD_END;
textEffect : BOLD_START BOLD+ BOLD_END
    | ITALIC | STRIKETHROUGH;
html: HTML;
textFragment : TEXT_FRAGMENT;
textFragmentConcat : TEXT_FRAGMENT+;
code : CODE;
blockCode : BLOCK_CODE_START LANG_TYPE? BLOCK_CODE+ BLOCK_CODE_END;
link: HYPER_LINK_LABEL HYPER_LINK;