package org.example.elements;

import org.example.core.HtmlElement;

public class Span extends HtmlElement<Span> {

    private String text;

    public Span(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<span");
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</span>");
    }

    @Override
    protected Span self() {
        return this;
    }

    @Override
    public Span clear() {
        this.props.clearAttributes();
        this.text = "";
        return this;
    }
}
