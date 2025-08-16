package org.example.elements;

import org.example.core.HtmlElement;

public class Th extends HtmlElement<Th> {

    private String text = "";
    private HtmlElement<?>[] elements;

    public Th(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    public Th(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<th");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        if (!this.text.isEmpty()) {
            sb.append(this.text);
        }
        sb.append("</th>");
    }

    @Override
    protected Th self() {
        return this;
    }

    @Override
    public Th clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        this.text = "";
        return this;
    }
}
