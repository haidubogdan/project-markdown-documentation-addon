package org.netbeans.modules.markdown.editor.parser.astnodes.visitors;

import org.netbeans.modules.markdown.editor.parser.astnodes.*;

/**
 *
 * @author bhaidu
 */
public interface Visitor {

    public void visit(MarkdownFile program);

    public void visit(ASTNode node);
    
    public void visit(Header node);

    public void visit(MdLine node);

    public void visit(Code node);
    
    public void visit(MdList node);
    
    public void visit(HtmlElement node);
    
    public void visit(BreakLine node);
    
    public void visit(Scalar node);
    
    public void visit(HyperLink node);
    
    public void visit(TextEffect node);
}
