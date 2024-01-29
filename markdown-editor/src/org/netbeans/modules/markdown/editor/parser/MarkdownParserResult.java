package org.netbeans.modules.markdown.editor.parser;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.modules.markdown.editor.parser.astnodes.*;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrLexer;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParser;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParserBaseListener;
import org.openide.util.Exceptions;

/**
 *
 * @author bhaidu
 */
public class MarkdownParserResult<T extends Parser> extends ParserResult {

    public final List<DefaultError> errors = new ArrayList<>();
    public final Map<String, Reference> references = new TreeMap<>();
    public MarkdownFile astMarkdownfile = null;
    public String convertedHtmlText = "";
    public static final Reference EOF = new Reference(ReferenceType.TOKEN, "EOF", OffsetRange.NONE); //NOI18N
    volatile boolean finished = false;

    public MarkdownParserResult(Snapshot snapshot) {
        super(snapshot);
        references.put(EOF.name, EOF);

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

            int x = 1;
//            parser.addErrorListener(createErrorListener());
//            parser.addParseListener(createFoldListener());
            parser.addParseListener(createElementsListener());
//            parser.addParseListener(createImportListener());
//            parser.addParseListener(createStructureListener());
//            parser.addParseListener(createOccurancesListener());
            evaluateParser(parser);

            finished = true;
        }
        return this;
    }

    protected void evaluateParser(MarkdownAntlrParser parser) {
        parser.file();
    }

    public MarkdownFile getAstnMarkdownFile() {
        return astMarkdownfile;
    }

    protected ParseTreeListener createElementsListener() {
        astMarkdownfile = new MarkdownFile(0, getSnapshot().getText().length());

        return new MarkdownAntlrParserBaseListener() {
            StringBuilder bufferText = new StringBuilder();
            StringBuilder htmlText = new StringBuilder();
            boolean inListItem;

            @Override
            public void enterFile(MarkdownAntlrParser.FileContext context) {
                int x = 1;
            }

            @Override
            public void exitFile(MarkdownAntlrParser.FileContext context) {
                int x = 1;
                convertedHtmlText = htmlText.toString();
            }

            @Override
            public void exitHeader(MarkdownAntlrParser.HeaderContext context) {
                htmlText.append("<h1>");
                htmlText.append(bufferText);
                //reset
                bufferText.setLength(0);
                htmlText.append("</h1>\n");
            }

            @Override
            public void enterBold(MarkdownAntlrParser.BoldContext context) {
                bufferText.append("<b>");
            }

            @Override
            public void exitBold(MarkdownAntlrParser.BoldContext context) {
                bufferText.append("</b>");
            }

            @Override
            public void enterItalic(MarkdownAntlrParser.ItalicContext context) {
                bufferText.append("<em>");
            }

            @Override
            public void exitItalic(MarkdownAntlrParser.ItalicContext context) {
                bufferText.append("</em>");
            }

            @Override
            public void exitSimpleText(MarkdownAntlrParser.SimpleTextContext context) {
                for (ParseTree child : context.children) {
                    if (child == null) {
                        continue;
                    }
                    bufferText.append(child.getText());
                }
            }

            @Override
            public void exitSetTextHeader(MarkdownAntlrParser.SetTextHeaderContext context) {
                htmlText.append("<h");
                String htmlType;
                if (context.SETTEXT_H1_UNDERLINE() != null) {
                    htmlType = "1";
                } else {
                    htmlType = "2";
                }
                htmlText.append(htmlType);
                htmlText.append(">");
                htmlText.append(bufferText);
                //reset
                bufferText.setLength(0);
                htmlText.append("</h");
                htmlText.append(htmlType);
                htmlText.append(">\n");
            }

            @Override
            public void exitHtml(MarkdownAntlrParser.HtmlContext context) {
                bufferText.append(context.HTML().getText());
            }

            @Override
            public void exitCode(MarkdownAntlrParser.CodeContext context) {
                if (context.inlineText() == null) {
                    return;
                }
                String content = bufferText.toString();
                bufferText.setLength(0);
                bufferText.append("<code>");
                bufferText.append(content);
                bufferText.append("</code>");
            }

            @Override
            public void exitNl(MarkdownAntlrParser.NlContext context) {
                bufferText.append("\n");
            }

            @Override
            public void exitBlockCode(MarkdownAntlrParser.BlockCodeContext context) {
                String content = bufferText.toString();
                bufferText.setLength(0);
                String lang = "md";
                if (context.lang != null) {
                    lang = context.lang.getText();
                }
                bufferText.append("<pre><code  class='lang-");
                bufferText.append(lang);
                bufferText.append("'>\n");
                bufferText.append(content);
                bufferText.append("</code></pre>\n");
            }

            @Override
            public void exitParagraph(MarkdownAntlrParser.ParagraphContext context) {
                if (bufferText.length() > 0) {
                    htmlText.append("<p>");
                    htmlText.append(bufferText);
                    if (!inListItem) {
                        bufferText.setLength(0);
                    }
                    htmlText.append("</p>\n");
                }
            }

            @Override
            public void exitBreakLine(MarkdownAntlrParser.BreakLineContext context) {
                htmlText.append("<hr>\n");
            }

            @Override
            public void exitTextEffect(MarkdownAntlrParser.TextEffectContext context) {

            }

            @Override
            public void exitLink(MarkdownAntlrParser.LinkContext context) {
                boolean isImage = context.EXCL() != null;
                String label = "";
                if (context.label().labelText() != null) {
                    for (ParseTree child : context.label().labelText().children) {
                        label += child.getText();
                    }
                }
                String url = "";
                if (context.path().labelText() != null) {
                    for (ParseTree child : context.path().labelText().children) {
                        url += child.getText();
                    }
                }
                if (isImage) {
                    bufferText.append("<img src='");
                    if (url.startsWith("http")) {
                        String encodedImage = getByteArrayFromImageURL(url);
                        if (encodedImage != null) {
                            url = encodedImage;
                        }
                    }
                    bufferText.append(url);
                    bufferText.append("' />");
                } else {
                    bufferText.append("<a href='");
                    bufferText.append(url);
                    bufferText.append("'>");
                    bufferText.append(label);
                    bufferText.append("</a>");
                }
            }

            @Override
            public void enterList(MarkdownAntlrParser.ListContext context) {
                htmlText.append("<ul>\n");
            }

            @Override
            public void exitList(MarkdownAntlrParser.ListContext context) {
                htmlText.append("</ul>\n");
            }

            @Override
            public void enterListItem(MarkdownAntlrParser.ListItemContext context) {
                inListItem = true;
            }

            @Override
            public void exitListItem(MarkdownAntlrParser.ListItemContext context) {
                inListItem = false;
                if (bufferText.length() == 0) {
                    return;
                }
                htmlText.append("    <li>");
                htmlText.append(bufferText);
                bufferText.setLength(0);
                htmlText.append("</li>\n");
            }
        };
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

    public enum ReferenceType {
        FRAGMENT, TOKEN, RULE, CHANNEL, MODE
    }

    public static class Reference {

        public final ReferenceType type;
        public final String name;
        public final OffsetRange defOffset;

        public Reference(ReferenceType type, String name, OffsetRange defOffset) {
            this.type = type;
            this.name = name;
            this.defOffset = defOffset;
        }
    }

    private String getByteArrayFromImageURL(String imageUrl) {

        try {
            URL url = new URL(imageUrl);
//             "data:image/svg;base64," +
            return Base64.getEncoder().encodeToString(readAllBytes(url.openConnection().getInputStream()));
        } catch (IOException e) {
            Exceptions.printStackTrace(e);
        }
        return null;
    }

    public static byte[] readAllBytes(InputStream inputStream) throws IOException {
        final int bufLen = 4 * 0x400; // 4KB
        byte[] buf = new byte[bufLen];
        int readLen;
        IOException exception = null;

        try {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                while ((readLen = inputStream.read(buf, 0, bufLen)) != -1) {
                    outputStream.write(buf, 0, readLen);
                }

                return outputStream.toByteArray();
            }
        } catch (IOException e) {
            exception = e;
            throw e;
        } finally {
            if (exception == null) {
                inputStream.close();
            } else try {
                inputStream.close();
            } catch (IOException e) {
                exception.addSuppressed(e);
            }
        }
    }
}
