package org.netbeans.modules.markdown.editor.parser;

import java.util.List;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.markdown.editor.parser.astnodes.MarkdownFile;
import org.netbeans.modules.markdown.syntax.antlr4.MarkdownAntlrParser;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author bhaidu
 */
public class MarkdownParserResultTest {
    
    public MarkdownParserResultTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createParser method, of class MarkdownParserResult.
     */
    @Test
    public void testCreateParser() {
        System.out.println("createParser");
        Snapshot snapshot = null;
        MarkdownParserResult instance = null;
        MarkdownAntlrParser expResult = null;
        MarkdownAntlrParser result = instance.createParser(snapshot);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class MarkdownParserResult.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        MarkdownParserResult instance = null;
        MarkdownParserResult expResult = null;
        MarkdownParserResult result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluateParser method, of class MarkdownParserResult.
     */
    @Test
    public void testEvaluateParser() {
        System.out.println("evaluateParser");
        MarkdownAntlrParser parser = null;
        MarkdownParserResult instance = null;
        instance.evaluateParser(parser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAstnMarkdownFile method, of class MarkdownParserResult.
     */
    @Test
    public void testGetAstnMarkdownFile() {
        System.out.println("getAstnMarkdownFile");
        MarkdownParserResult instance = null;
        MarkdownFile expResult = null;
        MarkdownFile result = instance.getAstnMarkdownFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createElementsListener method, of class MarkdownParserResult.
     */
    @Test
    public void testCreateElementsListener() {
        System.out.println("createElementsListener");
        MarkdownParserResult instance = null;
        ParseTreeListener expResult = null;
        ParseTreeListener result = instance.createElementsListener();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processingFinished method, of class MarkdownParserResult.
     */
    @Test
    public void testProcessingFinished() {
        System.out.println("processingFinished");
        MarkdownParserResult instance = null;
        boolean expResult = false;
        boolean result = instance.processingFinished();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnostics method, of class MarkdownParserResult.
     */
    @Test
    public void testGetDiagnostics() {
        System.out.println("getDiagnostics");
        MarkdownParserResult instance = null;
        List<? extends Error> expResult = null;
        List<? extends Error> result = instance.getDiagnostics();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invalidate method, of class MarkdownParserResult.
     */
    @Test
    public void testInvalidate() {
        System.out.println("invalidate");
        MarkdownParserResult instance = null;
        instance.invalidate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
