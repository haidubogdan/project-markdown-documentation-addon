lexer grammar MarkdownAntlrLexer;

@header{
  package org.netbeans.modules.markdown.syntax.antlr4;
}

options { superClass = LexerAdaptor; }
 
tokens { TOKEN_REF , RULE_REF , LEXER_CHAR_SET }
  


NL :[\n\r];

HEADER : (('#')+[ ]) ~[\n\r]*;

BOLD_START: DoubleAsterix -> pushMode(INSIDE_BOLD);

fragment DoubleAsterix : '**' ;

ITALIC: SgAsterix .*? (SgAsterix | EOF);

fragment SgAsterix : '*' ;

fragment SINGLE_LINE_RAW_TEXT : {this.IsNewLineOrStart()}? ~[\n\r];

ITALIC_2: '_' .*? ('_' | EOF) ->type(ITALIC);

STRIKETHROUGH: '~~' .*? ('~~' | EOF);


CODE : Backtick {this._input.LA(2)!='`' && this._input.LA(3)!='`'}? (Backtick | ~[\r\n])* Backtick;

CODE2 : '``' {this._input.LA(3)!='`'}? .*? ('``' | EOF)->type(CODE);

fragment Backtick : '`' ;

BLOCK_CODE_START : TriBacktick->pushMode(INSIDE_BLOCK_CODE);

fragment TriBacktick : '```';

//images will be included in this token
HYPER_LINK_LABEL : '!'? '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF)
    ;
HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF)
    ;

//Setext-style headers are “underlined” using equal signs (for first-level headers) and dashes (for second-level headers) 
SETTEXT_H1_UNDERLINE: {this.IsNewLineOrStart()}? ('=')+ [ ]* {this.peekNextChar('\n')}?;

SETTEXT_H2_UNDERLINE: {this.IsNewLineOrStart()}? ('-')+ [ ]* {this.peekNextChar('\n')}?;

HORIZONTAL_RULE_HYPHEN : {this.IsNewLineOrStart()}? HyphenHr {this.peekNextChar('\n')}?;
HORIZONTAL_RULE : {this.IsNewLineOrStart()}? AxterixHr {this.peekNextChar('\n')}?;

fragment HyphenHr : (' ')* ('-')+ (' ')* ('-')+ (' ')* ('-')+ [ -]*;
fragment AxterixHr : ('***')+[*]*;

LIST_ITEM_MARKER : {this.IsNewLineOrStart()}? ListItemMarker;  

fragment ListItemMarker
    : ([ \t]* '- ')
    | ([ \t]* '* ')
    | ([ \t]* [0-9]+ '. ')
    ;

HTML
   : HtmlElement
   ;    
    
fragment HtmlElement
    : '<!--' .*? ( '-->' | EOF )
    | '<' .*? ('/>' | '>' | EOF )
    | '</' .*? ('>' | EOF )
    ;

TEXT_FRAGMENT : TextFragment ;

fragment TextFragment :
    ('a'..'z'|'A'..'Z')+
    | . ;


//modes

mode INSIDE_BOLD;

BOLD_HYPER_LINK_LABEL : '!'? '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF) -> type(HYPER_LINK_LABEL)
    ;
BOLD_HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF) -> type(HYPER_LINK)
    ;
BOLD_END : DoubleAsterix->popMode;

BOLD_NL : NL ->type(NL), popMode;
BOLD : ~[\r\n*[(]+;

SINGLE_PAR : ('(' | '[') ->type(BOLD);

mode INSIDE_BLOCK_CODE;

LANG_TYPE : {this.isFirstCodeBlockElement()}? ~[\r\n]+;
BLOCK_CODE : ~('`' | '\r' | '\n')+;
BLOCK_CODE_END : TriBacktick->popMode;
BLOCK_CODE_ESCAPE : [\r\n`] ->type(BLOCK_CODE);
