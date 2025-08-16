package org.example.elements;

import org.example.core.HtmlElement;

public class Dialog extends HtmlElement<Dialog> {

    private HtmlElement<?>[] elements;

    public Dialog(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<dialog");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</dialog>");
    }

    @Override
    protected Dialog self() {
        return this;
    }

    @Override
    public Dialog clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
