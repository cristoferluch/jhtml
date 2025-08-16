package org.example.elements;

import org.example.core.HtmlElement;

public class Tr extends HtmlElement<Tr> {

    private HtmlElement<?>[] elements;

    public Tr(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<tr");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</tr>");
    }

    @Override
    protected Tr self() {
        return this;
    }

    @Override
    public Tr clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
