package org.netbeans.modules.markdown.editor.parser.astnodes;

import org.netbeans.modules.markdown.editor.parser.astnodes.visitors.Visitor;


/**
 *
 * @author bhaidu
 */
public class BreakLine extends MdElement {
    String content;

    public BreakLine(int start, int end, String content) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
        return "<hr>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
