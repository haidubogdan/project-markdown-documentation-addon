package org.netbeans.modules.markdown.editor.parser;

import java.io.IOException;
import java.util.Collections;
import javax.swing.text.Document;
import org.netbeans.modules.parsing.api.ParserManager;
import org.netbeans.modules.parsing.api.ResultIterator;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.api.UserTask;
import org.netbeans.modules.parsing.spi.Parser;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.util.Exceptions;

/**
 *
 * @author bhaidu
 */
public class ParsingUtils {

    private FileObject currentFile;

    public void parseText(String text) {
        FakeFileObject file = new FakeFileObject(text);
        if (currentFile != null) {
            file.setParent(currentFile.getParent());
        }
        parseFileObject(file);
    }

    public void parseFileObject(FileObject file) {
        Document doc = openDocument(file);

        try {
            Source source = Source.create(doc);
            Document sourceDoc = source.getDocument(false);

            if (source == null || sourceDoc == null) {
                return;
            }

            source.createSnapshot();
            ParserManager.parse(Collections.singletonList(source), new UserTask() {

                @Override
                public void run(ResultIterator resultIterator) throws Exception {
                    Parser.Result parserResult = resultIterator.getParserResult();
                }
            });

        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public Document openDocument(FileObject f) {
        try {
            DataObject dataObject = DataObject.find(f);
            EditorCookie ec = dataObject.getLookup().lookup(EditorCookie.class);
            return ec.openDocument();
        } catch (IOException ex) {
            throw new IllegalStateException(ex);
        }
    }
}
