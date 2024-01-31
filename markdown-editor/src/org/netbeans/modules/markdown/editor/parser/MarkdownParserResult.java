package org.netbeans.modules.markdown.editor.parser;

import java.util.ArrayList;
import java.util.List;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.netbeans.modules.markdown.editor.parser.astnodes.*;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrLexer;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParser;

/**
 *
 * @author bhaidu
 * @param <T>
 */
public class MarkdownParserResult<T extends Parser> extends ParserResult {

    public final List<DefaultError> errors = new ArrayList<>();
    public MarkdownFile astMarkdownfile = null;
    public String convertedHtmlText = "";
    volatile boolean finished = false;

    public MarkdownParserResult(Snapshot snapshot) {
        super(snapshot);
    }

    protected MarkdownAntlrParser createParser(Snapshot snapshot) {
        CharStream cs = CharStreams.fromString(String.valueOf(snapshot.getText()));
        MarkdownAntlrLexer lexer = new MarkdownAntlrLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MarkdownAntlrParser ret = new MarkdownAntlrParser(tokens);
        ret.removeErrorListener(ConsoleErrorListener.INSTANCE);
        return ret;
    }

    public MarkdownParserResult get() {
        if (!finished) {
            MarkdownAntlrParser parser = createParser(getSnapshot());
            evaluateParser(parser);

            finished = true;
        }
        return this;
    }

    protected void evaluateParser(MarkdownAntlrParser parser) {
        parser.file();
    }

    @Override
    protected boolean processingFinished() {
        return finished;
    }

    @Override
    public List<? extends Error> getDiagnostics() {
        return errors;
    }

    @Override
    protected void invalidate() {
        //references.clear();
    }

}
