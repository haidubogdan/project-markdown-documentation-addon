package org.netbeans.modules.markdown.editor.preview;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Base64;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParser;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParserBaseListener;
import org.openide.util.Exceptions;

/**
 *
 * @author bhaidu
 */
public class MdToHtmlConverterListener extends MarkdownAntlrParserBaseListener {

    public enum ListType {
        UL, OL
    };

    public String convertedHtmlText = "";
    StringBuilder bufferText = new StringBuilder();
    StringBuilder htmlText = new StringBuilder();
    int previousTabIdentation = 0;
    ListType currentListType = null;
    boolean inListItem;
    boolean listEntered;

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
        Token token = context.HEADER_HASH().getSymbol();
        String headerHash = token.getText();
        int pos = headerHash.indexOf("# ") + 1;
        int htype = Math.min(pos, 6);
        htmlText.append("<h" + htype + ">");
        htmlText.append(bufferText);
        //reset
        bufferText.setLength(0);
        htmlText.append("</h" + htype + ">\n");
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
        htmlText.append("<pre><code  class='lang-");
        htmlText.append(lang);
        htmlText.append("'>\n");
        htmlText.append(content);
        htmlText.append("</code></pre>\n");
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
    public void enterBlockQuote(MarkdownAntlrParser.BlockQuoteContext context) {
        htmlText.append("<blockquote>\n");
    }

    @Override
    public void exitBlockQuote(MarkdownAntlrParser.BlockQuoteContext context) {
        htmlText.append("</blockquote>\n");
    }

    @Override
    public void exitBreakLine(MarkdownAntlrParser.BreakLineContext context) {
        htmlText.append("<hr>\n");
    }

    @Override
    public void exitBr(MarkdownAntlrParser.BrContext context) {
        bufferText.append("<br>\n");
    }

    @Override
    public void exitTextEffect(MarkdownAntlrParser.TextEffectContext context) {

    }

    @Override
    public void exitLink(MarkdownAntlrParser.LinkContext context) {
        boolean isImage = context.EXCL() != null;
        String label = "";
        if (context.label().labelText() != null && context.label().labelText().children != null) {
            for (ParseTree child : context.label().labelText().children) {
                label += child.getText();
            }
        }
        String url = "";
        if (context.path().labelText() != null && context.path().labelText().children != null) {
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
        listEntered = true;
    }

    @Override
    public void exitList(MarkdownAntlrParser.ListContext context) {
        listEntered = false;
        String ulType = currentListType == ListType.OL ? "ol" : "ul";
        htmlText.append("</" + ulType + ">\n");
    }

    @Override
    public void enterListItem(MarkdownAntlrParser.ListItemContext context) {
        inListItem = true;
        if (previousTabIdentation > 0) {
            String ulType = currentListType == ListType.OL ? "ol" : "ul";
            htmlText.append("</" + ulType + ">\n");
            previousTabIdentation = 0;
        }
    }

    @Override
    public void exitListItem(MarkdownAntlrParser.ListItemContext context) {
        inListItem = false;
        if (bufferText.length() == 0) {
            return;
        }

        setCurrentListTypeMarker(context.LIST_ITEM_MARKER().getText());
        if (listEntered) {
            listEntered = false;
            String ulType = currentListType == ListType.OL ? "ol" : "ul";
            htmlText.append("<" + ulType + ">\n");
        }
        htmlText.append("    <li>");
        htmlText.append(bufferText);
        bufferText.setLength(0);
        htmlText.append("</li>\n");
    }

    @Override
    public void exitNestedListItem(MarkdownAntlrParser.NestedListItemContext context) {
        inListItem = false;
        if (bufferText.length() == 0) {
            return;
        }
        setCurrentListTypeMarker(context.LIST_ITEM_MARKER().getText());
        int tabIndentation = context.TAB().size();
        if (tabIndentation != previousTabIdentation) {
            String ulType = currentListType == ListType.OL ? "ol" : "ul";
            htmlText.append("\n<" + ulType + ">\n\t");
            previousTabIdentation = tabIndentation;
        }
        htmlText.append("    <li>");
        htmlText.append(bufferText);
        bufferText.setLength(0);
        htmlText.append("</li>\n");
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

    private void setCurrentListTypeMarker(String listMarker) {
        //test .[number]
        char secondChar = listMarker.charAt(1);

        if (Character.isDigit(secondChar)) {
            currentListType = ListType.OL;
        } else {
            currentListType = ListType.UL;
        }
    }
}
