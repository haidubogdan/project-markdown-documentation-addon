package org.netbeans.modules.markdown.editor.parser;

import org.junit.Test;

/**
 *
 * @author bhaidu
 */
public class MdParserResultTest extends MdParserResultTestBase {

    public MdParserResultTest(String testName) {
        super(testName);
    }

    @Test
    public void test_bloc_code() throws Exception {
        performTest("lexer/block_code.md");
    }
    
    @Test
    public void test_header() throws Exception {
        performTest("lexer/header.md");
    }
    
    @Test
    public void test_list_items() throws Exception {
        performTest("lexer/list_items.md");
    }
}
