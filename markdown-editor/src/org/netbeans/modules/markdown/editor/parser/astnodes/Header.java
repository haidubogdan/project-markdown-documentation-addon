package org.netbeans.modules.markdown.editor.parser.astnodes;

import java.util.Arrays;
import java.util.Optional;
import org.netbeans.modules.markdown.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class Header extends MdElement {

    String content;
    Type htype;

    public static enum Type {

        H1(1),
        H2(2),
        H3(3),
        H4(4),
        H5(5),
        H6(6);

        private final int typeNumber;

        Type(int typeNumber) {
            this.typeNumber = typeNumber;
        }

        public static Type getTypeByNumber(int typeNumber) {
            for (Type type : Type.values()) {
                if (type.getTypeNumber() == typeNumber) {
                    return type;
                }
            }
            return null;
        }

        public int getTypeNumber() {
            return typeNumber;
        }
    }

    public Header(int start, int end, String content, int typeNumber) {
        super(start, end);
        this.content = content;
        this.htype = Type.getTypeByNumber(typeNumber);
    }

    @Override
    public String toString() {
        String hType = String.valueOf(htype.getTypeNumber());
        return "<h" + hType + ">" + content + "</h" + hType + ">";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
