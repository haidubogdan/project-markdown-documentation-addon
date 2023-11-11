package org.netbeans.modules.markdown.editor.preview;

import org.netbeans.modules.markdown.editor.parser.astnodes.*;
import org.netbeans.modules.markdown.editor.parser.astnodes.visitors.DefaultVisitor;


/**
 *
 * @author bhaidu
 */
public class ViewerVisitor extends DefaultVisitor {

    private String html = "";

    @Override
    public void visit(Header node) {
        if (node != null) {
            html += node.toString();
        }
    }

    @Override
    public void visit(MdLine node) {
        if (node != null) {
            html += node.toString();
        }
    }

    @Override
    public void visit(Code node) {
        if (node != null) {
            html += node.toString();
        }
    }

    public String getHtmlOutput() {
        return html;
    }

    @Override
    public void visit(MdList node) {
        if (node != null) {
            html += node.toString();
        }
    }

    @Override
    public void visit(BreakLine node) {
        if (node != null) {
            html += node.toString();
        }
    }
    
    @Override
    public void visit(Scalar node) {
        if (node != null) {
            html += node.toString();
        }
    }
    
    @Override
    public void visit(HyperLink node) {
        if (node != null) {
            html += node.toString();
        }
    }
}
