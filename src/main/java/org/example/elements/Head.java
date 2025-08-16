package org.example.elements;

import org.example.core.HtmlElement;

public class Head extends HtmlElement<Head> {

    private HtmlElement<?>[] elements;

    public Head(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<head");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</head>");
    }

    @Override
    protected Head self() {
        return this;
    }

    @Override
    public Head clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
