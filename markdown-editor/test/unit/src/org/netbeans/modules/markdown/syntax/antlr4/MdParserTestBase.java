package org.netbeans.modules.markdown.syntax.antlr4;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.netbeans.junit.NbTestCase;

/**
 *
 * @author bhaidu
 */
public class MdParserTestBase extends NbTestCase {

    public MdParserTestBase(String testName) {
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
        System.out.print("\n---Psrser scan for <<" + filename + ">>\n\n");
        MarkdownAntlrParser parser = new MarkdownAntlrParser(tokenStream);
        ParseTreeListener listener = new MarkdownAntlrParserBaseListener(){
            
        };
        parser.addParseListener(listener);
        parser.file();
        System.out.println(parser.getBuildParseTree());
        
        return createResult(tokenStream);
    }

    protected String createResult(CommonTokenStream tokenStream) throws Exception {
        StringBuilder result = new StringBuilder();

        for (Token token : tokenStream.getTokens()) {
            switch (token.getType()) {
//                case BLADE_ESCAPED_CONTENT:
//                    result.append("BLADE_ESCAPED_CONTENT ");
//                    break;
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
        escapedString = escapedString.replaceAll("\n", "\\\\n"); //NOI18N
        escapedString = escapedString.replaceAll("\r", "\\\\r"); //NOI18N
        escapedString = escapedString.replaceAll("\t", "\\\\t"); //NOI18N
        return escapedString;
    }
}
