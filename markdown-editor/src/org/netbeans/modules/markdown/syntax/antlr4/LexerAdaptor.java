/*
Licensed to the Apache Software Foundation (ASF)
 */
package org.netbeans.modules.markdown.syntax.antlr4;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.misc.Interval;

/**
 *
 * @author bogdan
 */
public abstract class LexerAdaptor extends Lexer {

    private int _currentRuleType = Token.INVALID_TYPE;

    public LexerAdaptor(CharStream input) {
        super(input);
    }

    public int getCurrentRuleType() {
        return _currentRuleType;
    }

    public void setCurrentRuleType(int ruleType) {
        this._currentRuleType = ruleType;
    }
    
    @Override
    public Token emit() {
        return super.emit();
    }
    
    @Override
    public void reset() {
        setCurrentRuleType(Token.INVALID_TYPE);
        super.reset();
    }

    /**
     * eager check to see if the character position in a line is at the start
     * 
     * @return 
     */
    public boolean IsNewLineOrStart(){
        return this._tokenStartCharPositionInLine <= 2;
    }

    /**
     * used to check if we have a language identifier in a codeblock statement
     * @example ```lang\n
     * 
     * @return 
     */
    public boolean isFirstCodeBlockElement(){
        return this._tokenStartCharPositionInLine == 3;
    }
    
    public boolean peekNextChar(char peekChar){
        return (char) this._input.LA(1) == peekChar;
    }

    public boolean peekNextChars(char peekChar, int number){
        for (int i = 1;i< number ; i++){
            if((char) this._input.LA(i) != peekChar){
                return false;
            }
        }
        return true;
    }
}
