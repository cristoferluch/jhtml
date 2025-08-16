package org.example.elements;

import org.example.core.HtmlElement;

public class Table extends HtmlElement<Table> {

    private HtmlElement<?>[] elements;

    public Table(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    protected Table self() {
        return this;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<table");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</table>");
    }

    @Override
    public Table clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}