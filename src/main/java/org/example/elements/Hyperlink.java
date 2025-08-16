package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.HyperlinkAttributes;

public class Hyperlink extends HtmlElement<Hyperlink> implements HyperlinkAttributes<Hyperlink> {

    private String text = "";
    private HtmlElement<?>[] elements;

    public Hyperlink(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    public Hyperlink(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<a");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        if (!this.text.isEmpty()) {
            sb.append(this.text);
        }
        sb.append("</a>");
    }

    @Override
    protected Hyperlink self() {
        return this;
    }

    @Override
    public Hyperlink clear() {
        this.props.clearAttributes();
        this.text = "";
        this.elements = new HtmlElement<?>[0];
        return this;
    }

    @Override
    public Hyperlink href(String href) {
        this.props.setAttribute("href", href);
        return this;
    }

    @Override
    public Hyperlink hreflang(String hreflang) {
        this.props.setAttribute("hreflang", hreflang);
        return this;
    }

    @Override
    public Hyperlink referrerPolicy(String referrerPolicy) {
        this.props.setAttribute("referrerpolicy", referrerPolicy);
        return this;
    }

    @Override
    public Hyperlink rel(String rel) {
        this.props.setAttribute("rel", rel);
        return this;
    }

    @Override
    public Hyperlink target(String target) {
        this.props.setAttribute("target", target);
        return this;
    }

    @Override
    public Hyperlink type(String type) {
        this.props.setAttribute("type", type);
        return this;
    }
}
