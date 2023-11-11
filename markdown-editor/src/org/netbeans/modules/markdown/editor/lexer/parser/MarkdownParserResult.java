package org.netbeans.modules.markdown.editor.lexer.parser;

import java.util.ArrayList;
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
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.modules.markdown.editor.parser.astnodes.*;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrLexer;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParser;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParserBaseListener;

/**
 *
 * @author bhaidu
 */
public class MarkdownParserResult<T extends Parser> extends ParserResult {

    public final List<DefaultError> errors = new ArrayList<>();
    public final Map<String, Reference> references = new TreeMap<>();
    public MarkdownFile astMarkdownfile = null;
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
            ArrayList<ListItem> mdListItems = new ArrayList<>();
            ListItem bufferListItem = null;
            MdLine mdLine = null;

            @Override
            public void enterFile(MarkdownAntlrParser.FileContext context){
                int x = 1;
            }
            
            @Override
            public void exitFile(MarkdownAntlrParser.FileContext context){
                int x = 1;
            }
            @Override
            public void exitHeader(MarkdownAntlrParser.HeaderContext context) {

                if (context.HEADER() == null || context.HEADER().getSymbol() == null) {
                    return;
                }

                Token token = context.HEADER().getSymbol();
                int pos = token.getText().indexOf("# ") + 1;
                int htype = Math.max(pos, 6);
                String content = token.getText().substring(pos);
                astMarkdownfile.addMdElement(new Header(token.getStartIndex(), token.getStopIndex() + 1, content, htype));
            }

            @Override
            public void exitSetTextHeader(MarkdownAntlrParser.SetTextHeaderContext context) {

                if (context.textFragmentConcat()!= null || context.textFragmentConcat().getText() == null){
                    return;
                }

                Token headerTextToken = context.textFragmentConcat().TEXT_FRAGMENT().get(0).getSymbol();
                int headerType = 2;

                if (context.SETTEXT_H1_UNDERLINE()!= null){
                    headerType = 1;
                }

                astMarkdownfile.addMdElement(new Header(headerTextToken.getStartIndex(),
                        headerTextToken.getStopIndex() + 1, context.textFragmentConcat().getText(),
                        headerType));
            }
            
//            @Override
//            public void enterLine(MarkdownAntlrParser.LineContext context) {
//                Token token = context.getStart();
//                mdLine = new MdLine(token.getStartIndex(), token.getStopIndex() + 1, new ArrayList<>());
//            }
//
//            @Override
//            public void exitLine(MarkdownAntlrParser.LineContext context) {
//                astMarkdownfile.addMdElement(mdLine);
//                mdLine = null;
//            }

            @Override
            public void exitHtml(MarkdownAntlrParser.HtmlContext context) {
                if (context.HTML() == null || context.HTML().getSymbol() == null) {
                    return;
                }

                Token token = context.HTML().getSymbol();
                Scalar element = new Scalar(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
                addNodeToAST(element);
            }

//            @Override
//            public void exitRawText(MarkdownAntlrParser.RawTextContext context) {
//                if (context.RAW_TEXT() == null || context.RAW_TEXT().getSymbol() == null) {
//                    return;
//                }
//
//                Token token = context.RAW_TEXT().getSymbol();
//                Scalar element = new Scalar(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
//                addNodeToAST(element);
//            }

            @Override
            public void exitCode(MarkdownAntlrParser.CodeContext context) {
                if (context.CODE() == null || context.CODE().getSymbol() == null) {
                    return;
                }

                Token token = context.CODE().getSymbol();
                Code element = new Code(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
                addNodeToAST(element);
            }

            @Override
            public void exitBlockCode(MarkdownAntlrParser.BlockCodeContext context) {
                if (context.BLOCK_CODE() == null) {
                    return;
                }

                String text = "";
                for (TerminalNode token : context.BLOCK_CODE()) {
                    text += token.getText();
                }
                Token startToken = context.BLOCK_CODE_START().getSymbol();
                Token endToken = context.BLOCK_CODE_END().getSymbol();
                String lang = null;
                if (context.LANG_TYPE() != null) {
                    lang = context.LANG_TYPE().getText();
                }
                BlockCode element = new BlockCode(startToken.getStartIndex(), endToken.getStopIndex() + 1, text, lang);
                addNodeToAST(element);
            }

//            @Override
//            public void exitBreakLine(MarkdownAntlrParser.BreakLineContext context) {
//                if (context.BREAK_LINE() == null || context.BREAK_LINE().getSymbol() == null) {
//                    return;
//                }
//
//                Token token = context.BREAK_LINE().getSymbol();
//                BreakLine element = new BreakLine(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
//                addNodeToAST(element);
//            }

            @Override
            public void exitTextEffect(MarkdownAntlrParser.TextEffectContext context) {
                if (context.BOLD() != null && context.BOLD_START() != null) {
                    String text = "";
                    for (TerminalNode token : context.BOLD()) {
                        text += token.getText();
                    }

                    addNodeToAST(new TextEffect(context.BOLD_START().getSymbol().getStartIndex(),
                            context.BOLD_END().getSymbol().getStopIndex(), TextEffect.Type.BOLD, text));
                } else if (context.ITALIC() != null) {
                    Token token = context.ITALIC().getSymbol();
                    if (token.getText().length() < 2) {
                        return;
                    }
                    String text = token.getText().substring(1, token.getText().length() - 1);
                    addNodeToAST(new TextEffect(token.getStartIndex(),
                            token.getStopIndex(), TextEffect.Type.ITALIC, text));
                } else if (context.STRIKETHROUGH()!= null) {
                    Token token = context.STRIKETHROUGH().getSymbol();
                    if (token.getText().length() < 4) {
                        return;
                    }
                    String text = token.getText().substring(2, token.getText().length() - 2);
                    addNodeToAST(new TextEffect(token.getStartIndex(),
                            token.getStopIndex(), TextEffect.Type.STRIKETHROUGH, text));
                }
            }

            @Override
            public void exitLink(MarkdownAntlrParser.LinkContext context) {
                if (context.HYPER_LINK_LABEL() == null || context.HYPER_LINK_LABEL().getSymbol() == null) {
                    return;
                }

                Token label = context.HYPER_LINK_LABEL().getSymbol();
                Token link = context.HYPER_LINK().getSymbol();
                boolean isImage = label.getText().startsWith("!");
                int labelTrimStart = 1;
                if (isImage){
                    labelTrimStart = 2;
                }
                String labelText = label.getText().substring(labelTrimStart, label.getText().length() - 1);
                int start = link.getStartIndex();
                String linkText = link.getText().substring(1, link.getText().length() - 1);
                int end = label.getStopIndex() + 1;
                HyperLink linkElement = new HyperLink(start, end, linkText, labelText, isImage);
                addNodeToAST(linkElement);
            }

            @Override
            public void exitBoldLink(MarkdownAntlrParser.BoldLinkContext context) {
                if (context.HYPER_LINK_LABEL() == null || context.HYPER_LINK_LABEL().getSymbol() == null) {
                    return;
                }

                Token label = context.HYPER_LINK_LABEL().getSymbol();
                Token link = context.HYPER_LINK().getSymbol();
                boolean isImage = label.getText().startsWith("!");
                int labelTrimStart = 1;
                if (isImage){
                    labelTrimStart = 2;
                }
                String labelText = label.getText().substring(labelTrimStart, label.getText().length() - 1);
                int start = link.getStartIndex();
                String linkText = link.getText().substring(1, link.getText().length() - 1);
                int end = label.getStopIndex() + 1;
                HyperLink linkElement = new HyperLink(start, end, linkText, labelText, TextEffect.Type.BOLD, isImage);
                addNodeToAST(linkElement);
            }

            @Override
            public void enterList(MarkdownAntlrParser.ListContext context) {
                this.mdListItems = new ArrayList<>();
            }

            @Override
            public void exitList(MarkdownAntlrParser.ListContext context) {
                Token token = context.getStart();
                MdList MdList = new MdList(token.getStartIndex(), token.getStopIndex() + 1, this.mdListItems);
                addNodeToAST(MdList);
            }

            @Override
            public void enterListItem(MarkdownAntlrParser.ListItemContext context) {
                Token token = context.getStart();
                bufferListItem = new ListItem(token.getStartIndex(), token.getStopIndex() + 1, new ArrayList<>());
            }

            @Override
            public void exitListItem(MarkdownAntlrParser.ListItemContext context) {
                this.mdListItems.add(bufferListItem);
                bufferListItem = null;
            }

            public void addReference(ReferenceType type, Token token) {
                OffsetRange range = new OffsetRange(token.getStartIndex(), token.getStopIndex() + 1);
                String name = token.getText();
                Reference ref = new Reference(type, name, range);
                references.put(ref.name, ref);
            }

            private void addNodeToAST(MdElement element) {
                if (bufferListItem != null) {
                    bufferListItem.addContentItem(element);
                } else if (mdLine != null) {
                    mdLine.addContentItem(element);
                } else {
                    astMarkdownfile.addMdElement(element);
                }
            }
        };
    }

    private void checkReferences() {

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
}
