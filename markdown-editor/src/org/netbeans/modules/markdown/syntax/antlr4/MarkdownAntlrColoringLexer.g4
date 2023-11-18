lexer grammar MarkdownAntlrColoringLexer;

@header{
  package org.netbeans.modules.markdown.syntax.antlr4;
}

options { superClass = LexerAdaptor; }
 
tokens { TOKEN_REF , RULE_REF , LEXER_CHAR_SET }
  
LI_PRE_WS : {this.IsNewLineOrStart()}? LiPrefix;  

fragment LiPrefix
    : ([ \t]* '- ')
    | ([ \t]* '* ')
    | ([ \t]* [0-9]+ '. ')
    ;

BLOCK_CODE : TriBacktick .*? (TriBacktick | EOF);

TriBacktick : '```';

HTML
   : HtmlElement
   ;    
    
fragment HtmlElement
    : '<!--' .*? ( '-->' | EOF )
    | '<' .*? ('/>' | '>' | EOF )
    | '</' .*? ('>' | EOF )
    ;

NL :[\n\r];

HEADER : (('#')+[ ]) ~[\n\r]*;

H1_DASHES: {this.IsNewLineOrStart()}? ('=')+ ~[\n\r];

//similar with breakline
H2_DASHES: {this.IsNewLineOrStart()}? ('-')+ ~[\n\r];

BREAK_LINE : BreakLine;

fragment BreakLine : ('---')+[-]*;

BOLD_START: DoubleAsterix -> pushMode(INSIDE_BOLD);

fragment DoubleAsterix : '**' ;

ITALIC: SgAsterix .*? (SgAsterix | EOF);

ITALIC_2: '_' .*? ('_' | EOF) ->type(ITALIC);

STRIKETHROUGH: '~~' .*? ('~~' | EOF);

fragment SgAsterix : '*' ;

CODE : Backtick (Backtick | ~[\r\n])* Backtick;

fragment Backtick : '`' ;

HYPER_LINK_LABEL : '!'? '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF)
    ;
HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF)
    ;

RAW_TEXT : RawText ;

fragment RawText :
    ('a'..'z'|'A'..'Z' | ' ' | '\t')+
    | . ;

mode INSIDE_BOLD;
  
BOLD_HYPER_LINK_LABEL : '!'? '[' ~('\r' | '\n' | '[' | '(' | ')')* (']' | EOF) -> type(HYPER_LINK_LABEL)
    ;
BOLD_HYPER_LINK  : '(' ~('\r' | '\n' | '(' | '[' | ']')* (')' | EOF) -> type(HYPER_LINK)
    ;
BOLD_END : DoubleAsterix->popMode;

BOLD_NL : NL ->type(NL), popMode;
BOLD : ~[\r\n*[(]+;

SINGLE_PAR : ('(' | '[') ->type(BOLD);