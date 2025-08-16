package org.example.elements;

import org.example.core.HtmlElement;

public class Headings extends HtmlElement<Headings> {

    private String text = "";
    private String type = "h1";

    public Headings(String text, String type) {
        this.text = text;
        this.type = type;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<").append(type);
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</").append(type).append(">");
    }

    @Override
    protected Headings self() {
        return this;
    }

    @Override
    public Headings clear() {
        this.props.clearAttributes();
        this.text = "";
        this.type = "h1";
        return this;
    }
}
