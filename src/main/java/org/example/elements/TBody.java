package org.example.elements;

import org.example.core.HtmlElement;

public class TBody extends HtmlElement<TBody> {

    private HtmlElement<?>[] elements;

    public TBody(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<tbody");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</tbody>");
    }

    @Override
    protected TBody self() {
        return this;
    }

    @Override
    public TBody clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
