package org.netbeans.modules.markdown.editor.preview;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.StyledDocument;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.netbeans.core.spi.multiview.CloseOperationState;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.MultiViewElementCallback;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrLexer;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParser;
import org.openide.awt.HtmlBrowser;
import org.openide.awt.UndoRedo;
import org.openide.cookies.EditorCookie;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;
import org.openide.util.RequestProcessor.Task;
import org.openide.windows.TopComponent;

/**
 *
 * @author lkishalmi
 */
@MultiViewElement.Registration(
        displayName = "#LBL_MarkdownHtmlViewer",
        iconBase = "org/netbeans/modules/markdown/editor/resources/markdown.png",
        mimeType = "text/x-markdown",
        persistenceType = TopComponent.PERSISTENCE_NEVER,
        preferredID = "MarkdownViewer",
        position = 2000
)
@Messages("LBL_MarkdownHtmlViewer=Html Preview")
public class MarkdownViewerHtml implements MultiViewElement {

    private static final Logger LOG = Logger.getLogger(MarkdownViewerHtml.class.getName());
    private static final RequestProcessor RP = new RequestProcessor(MarkdownViewerHtml.class);
    private static final int UPDATE_DELAY = 500;

    private final DataObject dataObject;
    private transient JToolBar toolbar;

    private transient JComponent component;
    private transient JEditorPane viewer;
    private transient MultiViewElementCallback callback;

    final DocumentListener dl = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updater.schedule(UPDATE_DELAY);
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updater.schedule(UPDATE_DELAY);
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updater.schedule(UPDATE_DELAY);
        }
    };

    private final Task updater = RP.create(MarkdownViewerHtml.this::updateView);
    private StyledDocument source;

    public MarkdownViewerHtml(Lookup lookup) {
        dataObject = lookup.lookup(DataObject.class);
    }

    @Override
    public JComponent getVisualRepresentation() {
        if (component == null) {
            viewer = new JEditorPane();
            viewer.setContentType("text/xhtml");
            viewer.setEditable(false);
            viewer.addHyperlinkListener(this::linkHandler);
            
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(new JScrollPane(viewer), BorderLayout.CENTER);

            component = panel;
        }
        return component;
    }

    @Override
    public JComponent getToolbarRepresentation() {
        if (toolbar == null) {
            toolbar = new JToolBar();
        }
        return toolbar;
    }

    @Override
    public Action[] getActions() {
        return callback.createDefaultActions();
    }

    @Override
    public Lookup getLookup() {
        return dataObject.getLookup();
    }

    @Override
    public void componentOpened() {
        FileObject fo = dataObject.getPrimaryFile();
        callback.updateTitle(fo.getNameExt());
    }

    @Override
    public void componentClosed() {
    }

    @Override
    public void componentShowing() {
        EditorCookie ec = getLookup().lookup(EditorCookie.class);
        if (ec != null) {
            RP.post(() -> {
                try {
                    source = ec.openDocument();
                    source.addDocumentListener(dl);
                    updateView();
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            });
        }
    }

    @Override
    public void componentHidden() {
        if (source != null) {
            source.removeDocumentListener(dl);
        }
    }

    @Override
    public void componentActivated() {
    }

    @Override
    public void componentDeactivated() {
    }

    @Override
    public UndoRedo getUndoRedo() {
        return UndoRedo.NONE;
    }

    @Override
    public void setMultiViewCallback(MultiViewElementCallback callback) {
        this.callback = callback;
    }

    @Override
    public CloseOperationState canCloseElement() {
        return CloseOperationState.STATE_OK;
    }


    @Messages("TXT_MarkdownViewerHtmlElement_Error=<html>Something happened during markdown parsing.")
    public void updateView() {
        if ((source != null) && (viewer != null)) {
            try {
                Rectangle vis = viewer.getVisibleRect();

                CharStream cs = CharStreams.fromString(String.valueOf(dataObject.getPrimaryFile().asText()));
                MarkdownAntlrLexer lexer = new MarkdownAntlrLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MarkdownAntlrParser ret = new MarkdownAntlrParser(tokens);
                MdToHtmlConverterListener listener = new MdToHtmlConverterListener();
                ret.addParseListener(listener);
                ret.file();
                String html = listener.convertedHtmlText;
               
                Reader htmlReader = new StringReader(html);
                HTMLEditorKit kit = new HTMLEditorKit();

                // Would be better to create some diff and update the changed elemets
                viewer.getDocument().remove(0, viewer.getDocument().getLength());
                kit.read(htmlReader, viewer.getDocument(), 0);
                
                viewer.scrollRectToVisible(vis);

            } catch (IOException ex) {
                viewer.setText(Bundle.TXT_MarkdownViewerElement_Error());
                LOG.log(Level.WARNING, "Could not parse markdown!", ex); //NOI18N
            } catch (BadLocationException ex) {
                viewer.setText(Bundle.TXT_MarkdownViewerElement_Error());
            }
        }
    }

    private void linkHandler(HyperlinkEvent evt) {
        if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            String dsc = evt.getDescription();
            if ((evt.getURL() == null) && (dsc != null)) {
                String parts[] = dsc.split("#");
                if (parts.length == 1) {
                    //Probably a link to relative file
                    FileObject parent = dataObject.getPrimaryFile().getParent();
                    FileObject fo = parent.getFileObject(parts[0]);
                    if (fo != null) {
                        DataObject dat;
                        try {
                            dat = DataObject.find(fo);
                            OpenCookie open = dat.getLookup().lookup(OpenCookie.class);
                            open.open();
                        } catch (DataObjectNotFoundException ex) {
                            // Got unlucky do nothing
                        }
                    }
                } else {
                    if (parts[0].isEmpty() && !parts[1].isEmpty()) {
                        viewer.scrollToReference(parts[1]);
                    }
                }
            } else if (evt.getURL() != null) {
                HtmlBrowser.URLDisplayer.getDefault().showURL(evt.getURL());
            }
        }
    }
}
