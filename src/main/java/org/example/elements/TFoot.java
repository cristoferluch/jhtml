package org.example.elements;

import org.example.core.HtmlElement;

public class TFoot extends HtmlElement<TFoot> {

    private HtmlElement<?>[] elements;

    public TFoot (HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<tfoot");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</tfoot>");
    }

    @Override
    protected TFoot self() {
        return this;
    }

    @Override
    public TFoot clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
