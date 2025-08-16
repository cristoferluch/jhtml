package org.example.elements;

import org.example.core.HtmlElement;

public class Paragraph extends HtmlElement<Paragraph> {

    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<p");
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</p>");
    }

    @Override
    protected Paragraph self() {
        return this;
    }

    @Override
    public Paragraph clear() {
        this.props.clearAttributes();
        this.text = "";
        return this;
    }
}
