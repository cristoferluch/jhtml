package org.example.elements;

import org.example.core.HtmlElement;

public class Body extends HtmlElement<Body> {

    private HtmlElement<?>[] elements;

    public Body(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<body");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</body>");
    }

    @Override
    protected Body self() {
        return this;
    }

    @Override
    public Body clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }
}
