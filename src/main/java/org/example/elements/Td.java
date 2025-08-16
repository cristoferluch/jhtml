package org.example.elements;


import org.example.core.HtmlElement;

public class Td extends HtmlElement<Td> {

    private String text = "";
    private HtmlElement<?>[] elements;

    public Td(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    public Td(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<td");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        if (!this.text.isEmpty()) {
            sb.append(this.text);
        }
        sb.append("</td>");
    }

    @Override
    protected Td self() {
        return this;
    }

    @Override
    public Td clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        this.text = "";
        return this;
    }
}
