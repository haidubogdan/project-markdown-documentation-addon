package org.netbeans.modules.markdown.editor.parser;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import javax.swing.text.Document;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.editor.BaseDocument;
import org.netbeans.junit.NbTestCase;
import org.netbeans.modules.csl.spi.GsfUtilities;
import org.netbeans.modules.markdown.editor.parser.MarkdownParserResult;
import org.netbeans.modules.markdown.syntax.antlr4.MdUtils;
import org.netbeans.modules.parsing.api.ParserManager;
import org.netbeans.modules.parsing.api.ResultIterator;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.api.UserTask;
import org.netbeans.modules.parsing.impl.indexing.CacheFolder;
import org.netbeans.spi.editor.document.DocumentFactory;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileSystem;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.MultiFileSystem;
import org.openide.filesystems.Repository;
import org.openide.filesystems.XMLFileSystem;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author bhaidu
 */
public class MdParserResultTestBase extends NbTestCase {

    public MdParserResultTestBase(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        System.setProperty("netbeans.user", getWorkDirPath());
        // XXX are the following four lines actually necessary?
        final FileObject wd = FileUtil.toFileObject(getWorkDir());
        assert wd != null;
        FileObject cache = FileUtil.createFolder(wd, "var/cache");
        assert cache != null;
        CacheFolder.setCacheFolder(cache);

        List<URL> layers = new LinkedList<URL>();
        String[] additionalLayers = new String[]{"META-INF/generated-layer.xml"};
        Object[] additionalLookupContent = createExtraMockLookupContent();
        if (additionalLookupContent == null) {
            additionalLookupContent = new Object[0];
        }

        for (int cntr = 0; cntr < additionalLayers.length; cntr++) {
            boolean found = false;

            for (Enumeration<URL> en = Thread.currentThread().getContextClassLoader().getResources(additionalLayers[cntr]); en.hasMoreElements();) {
                found = true;
                layers.add(en.nextElement());
            }

            assertTrue(additionalLayers[cntr], found);
        }

        XMLFileSystem xmlFS = new XMLFileSystem();
        xmlFS.setXmlUrls(layers.toArray(new URL[0]));

        FileSystem system = new MultiFileSystem(new FileSystem[]{FileUtil.createMemoryFileSystem(), xmlFS});

        Repository repository = new Repository(system);

        ///
        Class[] services = getServices();
        List<Class> classes = new ArrayList<Class>(4);
        if (services != null) {
            classes.addAll(Arrays.asList(services));
        }
        services = getMockServices();
        if (services != null) {
            classes.addAll(Arrays.asList(services));
        }
        // MockServices.setServices(classes.toArray(new Class[classes.size()]));
//        MockLookup.setLookup(
//                Lookups.metaInfServices(getClass().getClassLoader()),
//                createTestServices());
        MockMimeLookup.setInstances(
                MimePath.EMPTY,
                new DocumentFactory() {
            @Override
            public Document createDocument(String mimeType) {
                return new BaseDocument(false, mimeType);
            }

            @Override
            public Document getDocument(FileObject file) {
                try {
                    final DataObject dobj = DataObject.find(file);
                    final EditorCookie ec = dobj.getLookup().lookup(EditorCookie.class);
                    return ec == null
                            ? null
                            : ec.openDocument();
                } catch (DataObjectNotFoundException e) {
                    return null;
                } catch (IOException ioe) {
                    Exceptions.printStackTrace(ioe);
                    return null;
                }
            }

            @Override
            public FileObject getFileObject(Document document) {
                Object sdp = document.getProperty(Document.StreamDescriptionProperty);
                if (sdp instanceof FileObject) {
                    return (FileObject) sdp;
                }
                if (sdp instanceof DataObject) {
                    return ((DataObject) sdp).getPrimaryFile();
                }
                return null;
            }
        });
    }

    protected Object[] createExtraMockLookupContent() {
        return new Object[0];
    }

    protected Class[] getMockServices() {
        return new Class[]{MockMimeLookup.class, TestEnvironmentFactory.class};
    }

    protected Class[] getServices() {
        return null;
    }

    protected Lookup createTestServices() {
        return Lookups.fixed(new TestEnvironmentFactory());
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
        /*
        String content = MdUtils.getFileContent(new File(getDataDir(), "testfiles/" + filename));
        ParsingUtils parsingUtils = new ParsingUtils();

        parsingUtils.parseText(content);
         */

//        CommonTokenStream tokenStream = MdUtils.getTokenStream(content);
//        System.out.print("\n---Psrser scan for <<" + filename + ">>\n\n");
//        MarkdownAntlrParser parser = new MarkdownAntlrParser(tokenStream);
//        ParseTreeListener listener = new MarkdownAntlrParserBaseListener() {
//
//        };
//        parser.addParseListener(listener);
//        parser.file();
        //System.out.println(parser.getBuildParseTree());
        MarkdownParserResult<?> result = null;

        MarkdownParserResult<?>[] parserResult = new MarkdownParserResult<?>[1];
        FileObject fo = getTestFile("testfiles/" + filename);
        ParserManager.parse(Collections.singleton(getTestSource(fo)), new UserTask() {
            @Override
            public void run(ResultIterator resultIterator) throws Exception {
                org.netbeans.modules.parsing.spi.Parser.Result result = resultIterator.getParserResult();
                if (result instanceof MarkdownParserResult) {
                    parserResult[0] = (MarkdownParserResult) result;
                }
            }
        });
//        if (parserResult[0] != null) {
//            result = parserResult[0];
//        }
//        //return createResult(tokenStream);
        return null;
    }

    protected Source getTestSource(FileObject f) {
        Document doc = GsfUtilities.getDocument(f, true);
        return Source.create(doc);
    }

    protected FileObject getTestFile(String relFilePath) {
        File wholeInputFile = new File(getDataDir(), relFilePath);
        if (!wholeInputFile.exists()) {
            NbTestCase.fail("File " + wholeInputFile + " not found.");
        }
        FileObject fo = FileUtil.toFileObject(wholeInputFile);
        assertNotNull(fo);

        return fo;
    }

//
//    protected String createResult(CommonTokenStream tokenStream) throws Exception {
//        StringBuilder result = new StringBuilder();
//
//        for (Token token : tokenStream.getTokens()) {
//            switch (token.getType()) {
////                case BLADE_ESCAPED_CONTENT:
////                    result.append("BLADE_ESCAPED_CONTENT ");
////                    break;
//            }
//
//            String text = replaceLinesAndTabs(token.getText());
//            result.append(text);
//            result.append(";");
//            result.append("\n");
//        }
//
//        return result.toString();
//    }
    public static String replaceLinesAndTabs(String input) {
        String escapedString = input;
        escapedString = escapedString.replaceAll("\n", "\\\\n"); //NOI18N
        escapedString = escapedString.replaceAll("\r", "\\\\r"); //NOI18N
        escapedString = escapedString.replaceAll("\t", "\\\\t"); //NOI18N
        return escapedString;
    }
}
