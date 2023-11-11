package org.netbeans.modules.markdown.syntax.antlr4;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.netbeans.junit.NbTestCase;

/**
 *
 * @author bhaidu
 */
public class MdAntlrLexerTestBase extends NbTestCase {

    public MdAntlrLexerTestBase(String testName) {
        super(testName);
    }

    public File getDataDir() {
        URL codebase = getClass().getProtectionDomain().getCodeSource().getLocation();
        File dataDir = null;
        try {
            dataDir = new File(new File(codebase.toURI()), "data");
        } catch (URISyntaxException x) {
            throw new Error(x);
        }
        return dataDir;
    }

    protected void performTest(String filename) throws Exception {
        performTest(filename, null);
    }

    protected String getTestResult(String filename, String caretLine) throws Exception {
        return getTestResult(filename);
    }

    protected void performTest(String filename, String caretLine) throws Exception {
        // parse the file
        String result = getTestResult(filename, caretLine);
        System.out.print(result);
    }

    protected String getTestResult(String filename) throws Exception {
        String content = MdUtils.getFileContent(new File(getDataDir(), "testfiles/" + filename));
        CommonTokenStream tokenStream = MdUtils.getTokenStream(content);
        System.out.print("\n---Lexer scan for <<" + filename + ">>\n\n");
        return createResult(tokenStream);
    }

    protected String createResult(CommonTokenStream tokenStream) throws Exception {
        StringBuilder result = new StringBuilder();

        for (Token token : tokenStream.getTokens()) {
            switch (token.getType()) {
                case MarkdownAntlrLexer.TEXT_FRAGMENT:
                    result.append("TEXT_FRAGMENT ");
                    break;
                case MarkdownAntlrLexer.BLOCK_CODE_START:
                    result.append("BLOCK_CODE_START ");
                    break;
                case MarkdownAntlrLexer.LANG_TYPE:
                    result.append("LANG_TYPE ");
                    break;
                case MarkdownAntlrLexer.BLOCK_CODE:
                    result.append("BLOCK_CODE ");
                    break;
                case MarkdownAntlrLexer.BLOCK_CODE_END:
                    result.append("BLOCK_CODE_END ");
                    break;
                case MarkdownAntlrLexer.HEADER:
                    result.append("HEADER ");
                    break;
                case MarkdownAntlrLexer.SETTEXT_H1_UNDERLINE:
                    result.append("HEADER_DASH1 ");
                    break;
                case MarkdownAntlrLexer.SETTEXT_H2_UNDERLINE:
                    result.append("HEADER_DASH2 ");
                    break;
                case MarkdownAntlrLexer.LIST_ITEM_MARKER:
                    result.append("LIST ITEM MARKER ");
                    break;   
                case MarkdownAntlrLexer.NL:
                    result.append("NEW LINE ");
                    break;
            }
            
            String text = replaceLinesAndTabs(token.getText());
            result.append(text);
            result.append(";");
            result.append("\n");
        }

        return result.toString();
    }
    
    public static String replaceLinesAndTabs(String input) {
        String escapedString = input;
        escapedString = escapedString.replaceAll("\n","\\\\n"); //NOI18N
        escapedString = escapedString.replaceAll("\r","\\\\r"); //NOI18N
        escapedString = escapedString.replaceAll("\t","\\\\t"); //NOI18N
        return escapedString;
    }
}
