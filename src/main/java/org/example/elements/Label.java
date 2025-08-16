package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.LabelAttributes;

public class Label extends HtmlElement<Label> implements LabelAttributes<Label> {

    private String text = "";
    private HtmlElement<?>[] elements;

    public Label(String text) {
        this.text = text;
    }

    public Label(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public Label clear() {
        this.props.clearAttributes();
        this.elements = new  HtmlElement<?>[0];
        this.text = "";
        return this;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<label");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        if (!this.text.isEmpty()) {
            sb.append(this.text);
        }
        sb.append("</label>");
    }

    @Override
    protected Label self() {
        return this;
    }

    @Override
    public Label forElement(String forElement) {
        this.props.setAttribute("for", forElement);
        return this;
    }

    @Override
    public Label form(String form) {
        this.props.setAttribute("form", form);
        return this;
    }
}
