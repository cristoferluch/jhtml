package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.HtmlAttributes;

public class Html extends HtmlElement<Html> implements HtmlAttributes<Html> {

    private HtmlElement<?>[] elements;

    public Html(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<html");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</html>");
    }

    @Override
    protected Html self() {
        return this;
    }

    @Override
    public Html clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }

    @Override
    public Html lang(String lang) {
        this.props.setAttribute("lang", lang);
        return this;
    }
}
