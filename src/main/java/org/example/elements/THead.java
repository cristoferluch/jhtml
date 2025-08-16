package org.example.elements;

import org.example.core.HtmlElement;

public class THead extends HtmlElement<THead> {

    private HtmlElement<?>[] elements;

    public THead(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<thead");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</thead>");
    }

    @Override
    protected THead self() {
        return this;
    }

    @Override
    public THead clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
