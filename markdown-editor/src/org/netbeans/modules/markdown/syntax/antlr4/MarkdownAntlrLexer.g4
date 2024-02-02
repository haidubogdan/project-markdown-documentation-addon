lexer grammar MarkdownAntlrLexer;

@header{
  package org.netbeans.modules.markdown.syntax.antlr4;
}

options { superClass = LexerAdaptor; }
 
tokens { 
 NL,
 BR,
 RAW_TEXT,
 HTML,
 WS,
 ATTR_COMMENT,
 EXCL,
 SQ_PAR_OPEN   
}
  
fragment ListItemMarker
    : ('- ')
    | ('* ')
    | ('+ ')
    | ([0-9]+ '. ')
    ;

fragment DoubleAsterix : '**' ;
fragment SgAsterix : '*' ;

fragment Backtick_3 : '```';
fragment Backtick_2 : '``';

fragment StrikeTilda : '~~';

fragment HtmlElement
    : '<!--' .*? ( '-->' | EOF )
    | '<' .*? ('/>' | '>' | EOF )
    | '</' .*? ('>' | EOF )
    ;

fragment Identifier 
    : [a-zA-Z_\u0080-\ufffe][a-zA-Z0-9_\u0080-\ufffe-]*;

fragment NewLine : [\r\n];

HEADER_HASH : (('#')+ ' ')->mode(LINE_TEXT);

LIST_ITEM_MARKER : ListItemMarker->mode(LINE_TEXT);

D_ASTERIX : DoubleAsterix->mode(LINE_TEXT);
S_ASTERIX : SgAsterix->mode(LINE_TEXT);

BACKTICK_3 : Backtick_3->mode(LINE_TEXT);
BACKTICK_2 : Backtick_2->mode(LINE_TEXT);

SETTEXT_H1_UNDERLINE : ('=')+ [ ]*;
SETTEXT_H2_UNDERLINE : ('-')+ [ ]*;

HORIZONTAL_RULE_HYPHEN : (' ')* ('-')+ (' ')* ('-')+ (' ')* ('-')+ [ -]*;
HORIZONTAL_RULE : ('***')+[*]* | ('___')+[_]*;

EXCL : '!' ->mode(LINE_TEXT);
S_SQ_PAR_OPEN : '[' ->type(SQ_PAR_OPEN),mode(LINE_TEXT);

HTML : HtmlElement->mode(LINE_TEXT);
LETTER : [a-zA-Z]->more, mode(LINE_TEXT);

//skipping any mode
BLOCK_QUOTE_START : '> ';

START_NL : NewLine;
TAB : ('    ');
WS : [ ];

RAW_TEXT : . ;

mode LINE_TEXT;

LINE_EXCL : '!' ->type(EXCL);
SQ_PAR_OPEN : '[';
SQ_PAR_CLOSE : ']';
R_PAR_OPEN : '(';
R_PAR_CLOSE : ')';

LINE_D_ASTERIX : DoubleAsterix->type(D_ASTERIX);
LINE_S_ASTERIX : SgAsterix->type(S_ASTERIX);
LINE_BACKTICK_3 : Backtick_3->type(BACKTICK_3);
LINE_BACKTICK_2 : Backtick_2->type(BACKTICK_2);
LINE_HTML : HtmlElement->type(HTML);
IDENTIFIER : Identifier;
LINE_BR : ('  ' NewLine)->type(BR);
LINE_NL : NewLine->type(NL),mode(DEFAULT_MODE);
LINE_WS : [ ]+->type(WS);
LINE_RAW_TEXT : . ->type(RAW_TEXT);
LINE_EOF : EOF ->mode(DEFAULT_MODE);