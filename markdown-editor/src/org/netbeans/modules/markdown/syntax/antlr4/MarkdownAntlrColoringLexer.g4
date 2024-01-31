lexer grammar MarkdownAntlrColoringLexer;

@header{
  package org.netbeans.modules.markdown.syntax.antlr4;
}

options { superClass = LexerAdaptor; }

tokens { 
    NL,
    HEADER,   
    BOLD,
    ITALIC,
    STRIKETHROUGH,
    RAW_TEXT,
    CODE,
    BLOCK_CODE,
    HTML,
    WS,
    ATTR_COMMENT,
    EXCL,
    SQ_PAR_OPEN,
    BACKTICK_1
}
    
fragment ListItemMarker
: ([ \t]* '- ')
| ([ \t]* '* ')
| ([ \t]* [0-9]+ '. ')
;

fragment DoubleAsterix : '**' ;
fragment SgAsterix : '*' ;
fragment StrikeTilda : '~~';

fragment Backtick_3 : '```';
fragment Backtick_2 : '``';
fragment Backtick_1 : '`';

fragment HtmlElement
    : '<!--' .*? ( '-->' | EOF )
    | '<' .*? ('/>' | '>' | EOF )
    | '</' .*? ('>' | EOF )
    ;

fragment Identifier 
    : [a-zA-Z\u0080-\ufffe][a-zA-Z0-9_\u0080-\ufffe-]*;

fragment Label
    : '[' [/a-zA-Z0-9-_\u0080-\ufffe, ]+ ']'
    ;

fragment Url
    : '(' ('http:' | 'https:')? [/a-zA-Z0-9-_\u0080-\ufffe.#]+ ')'
    ;
fragment NewLine : [\r\n];

HEADER_HASH : (('#')+[ ])+->more,mode(INSIDE_HEADER);
LIST_ITEM_MARKER : ListItemMarker->mode(LINE_TEXT);

HORIZONTAL_RULE : ('***')+[*]*;
D_ASTERIX : DoubleAsterix->more,pushMode(INSIDE_BOLD);
S_ASTERIX : SgAsterix->mode(LINE_TEXT);
ITALIC_U : '_' ->more, pushMode(INSIDE_ITALIC_U);
STRIKE_TILDA : StrikeTilda ->more, pushMode(INSIDE_STRIKETHROUGH);

BACKTICK_3 : Backtick_3->more, pushMode(INSIDE_BLOCK_CODE);
BACKTICK_2 : Backtick_2->more, pushMode(INSIDE_CODE_BACKTICK_2);
BACKTICK_1 : Backtick_1->more, pushMode(INSIDE_CODE_BACKTICK_1);

H1_DASHES : ('=')+ [ ]*;
H2_DASHES : ('-')+ [ ]*;
BREAK_LINE : ('---')+[-]*;

HORIZONTAL_RULE_HYPHEN : (' ')* ('-')+ (' ')* ('-')+ (' ')* ('-')+ [ -]*;


EXCL : '!' ->mode(LINE_TEXT);
S_SQ_PAR_OPEN : '[' ->type(SQ_PAR_OPEN),mode(LINE_TEXT);

HTML : HtmlElement->mode(LINE_TEXT);
LETTER : [a-zA-Z]->more, mode(LINE_TEXT);

BLOCK_QUOTE_START : '>'->mode(LINE_TEXT);

NL : NewLine;
WS : [ ]+;

RAW_TEXT : . ;

mode LINE_TEXT;

LINE_EXCL : '!' ->type(EXCL);

HYPER_LINK_LABEL : Label {this._input.LA(1) == '('}?;
HYPER_LINK : Url;

SQ_PAR_OPEN : '[';
SQ_PAR_CLOSE : ']';
R_PAR_OPEN : '(';
R_PAR_CLOSE : ')';

LINE_D_ASTERIX : DoubleAsterix->more,pushMode(INSIDE_BOLD);
LINE_S_ASTERIX : SgAsterix->more,pushMode(INSIDE_ITALIC);
LINE_ITALIC_U : '_'->more,pushMode(INSIDE_ITALIC_U);
LINE_BACKTICK_3 : Backtick_3->more, pushMode(INSIDE_BLOCK_CODE);
LINE_BACKTICK_2 : Backtick_2->more, pushMode(INSIDE_CODE_BACKTICK_2);
LINE_BACKTICK_1 : Backtick_1->more, pushMode(INSIDE_CODE_BACKTICK_1);
LINE_HTML : HtmlElement->type(HTML);
IDENTIFIER : Identifier->type(RAW_TEXT);
LINE_NL : NewLine->type(NL),mode(DEFAULT_MODE);
LINE_WS : [ ]+->type(RAW_TEXT);
LINE_RAW_TEXT : . ->type(RAW_TEXT);
LINE_EOF : EOF ->mode(DEFAULT_MODE);

//**
mode INSIDE_BOLD;

D_BOLD_ASTERIX : DoubleAsterix->type(BOLD),mode(LINE_TEXT);
BOLD_NL : NewLine ->type(NL), popMode;

BOLD_EOF : EOF->type(HTML), popMode;
BOLD_RAW_TEXT : . ->more;

//*
mode INSIDE_ITALIC;

ITALIC_ASTERIX : SgAsterix->type(ITALIC),mode(LINE_TEXT);
ITALIC_NL : NewLine ->type(NL), popMode;

ITALIC_EOF : EOF->type(HTML), popMode;
ITALIC_RAW_TEXT : . ->more;

//_
mode INSIDE_ITALIC_U;

ITALIC_UNDERLINE : '_'->type(ITALIC),mode(LINE_TEXT);
ITALIC_U_NL : NewLine ->type(NL), popMode;

ITALIC_U_EOF : EOF->type(HTML), popMode;
ITALIC_U_RAW_TEXT : . ->more;

//~~
mode INSIDE_STRIKETHROUGH;

STRIKE_TILDA_EXIT : StrikeTilda->type(STRIKETHROUGH),mode(LINE_TEXT);
STRIKE_NL : NewLine ->type(NL), popMode;

STRIKE_EOF : EOF->type(HTML), popMode;
STRIKE_RAW_TEXT : . ->more;

//`
mode INSIDE_CODE_BACKTICK_1;

BACKTICK_1_EXIT : Backtick_1->type(CODE),mode(LINE_TEXT);
BACKTICK_1_NL : NewLine ->type(NL), popMode;

BACKTICK_1_EOF : EOF->type(HTML), popMode;
BACKTICK_1_RAW_TEXT : . ->more;

//``
mode INSIDE_CODE_BACKTICK_2;

BACKTICK_2_EXIT : Backtick_2->type(CODE),mode(LINE_TEXT);
BACKTICK_2_NL : NewLine ->type(NL), popMode;

BACKTICK_2_EOF : EOF->type(HTML), popMode;
BACKTICK_2_RAW_TEXT : . ->more;

//```
mode INSIDE_BLOCK_CODE;

BLOCK_CODE_EXIT : Backtick_3->type(BLOCK_CODE),popMode;

BLOCK_CODE_EOF : EOF->type(HTML), popMode;
BLOCK_CODE_RAW_TEXT : . ->more;

mode INSIDE_HEADER;

HEADER_EXIT : (NL | EOF) ->mode(DEFAULT_MODE);
HEADER_TEXT : ~[\n\r] ->type(HEADER);
EXIT_HEADER_TEXT : . ->type(RAW_TEXT), mode(DEFAULT_MODE);