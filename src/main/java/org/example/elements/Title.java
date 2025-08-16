package org.example.elements;

import org.example.core.HtmlElement;

public class Title extends HtmlElement<Title> {

    private String text;

    public Title(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<title");
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</title>");
    }

    @Override
    protected Title self() {
        return this;
    }

    @Override
    public Title clear() {
        this.props.clearAttributes();
        this.text = "";
        return this;
    }
}
