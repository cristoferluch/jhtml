package org.example.elements;

import org.example.core.HtmlElement;

public class Div extends HtmlElement<Div> {

    private HtmlElement<?>[] elements;

    public Div(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<div");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</div>");
    }

    @Override
    protected Div self() {
        return this;
    }

    @Override
    public Div clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
