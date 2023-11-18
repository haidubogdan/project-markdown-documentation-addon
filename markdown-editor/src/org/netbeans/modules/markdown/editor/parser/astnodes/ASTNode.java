package org.netbeans.modules.markdown.editor.parser.astnodes;

import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.markdown.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public abstract class ASTNode {

    private int startOffset;
    private int endOffset;

    public ASTNode(int start, int end) {
        assert start >= 0;
        assert end >= start;

        this.startOffset = start;
        this.endOffset = end;
    }

    public final int getStartOffset() {
        return startOffset;
    }

    public final int getEndOffset() {
        return endOffset;
    }

    public final void setEndOffset(int offset) {
        endOffset = offset;
    }

    public final void setSourceRange(int startOffset, int endOffset) {
        if (startOffset >= 0 && endOffset < 0) {
            throw new IllegalArgumentException();
        }
        if (startOffset < 0 && endOffset != 0) {
            throw new IllegalArgumentException();
        }
        assert startOffset >= 0;
        assert endOffset >= startOffset;

        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }

    public abstract void accept(Visitor visitor);

    public OffsetRange getOffsetRange() {
        return new OffsetRange(this.getStartOffset(), this.getEndOffset());
    }
}
