package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.LinkAttributes;

public class Link extends HtmlElement<Link> implements LinkAttributes<Link> {

    @Override
    public void build(StringBuilder sb) {
        sb.append("<link");
        this.props.buildAttributes(sb);
        sb.append(">");
    }

    @Override
    protected Link self() {
        return this;
    }

    @Override
    public Link clear() {
        this.props.clearAttributes();
        return this;
    }

    @Override
    public Link crossOrigin(String crossOrigin) {
        this.props.setAttribute("crossorigin", crossOrigin);
        return this;
    }

    @Override
    public Link href(String href) {
        this.props.setAttribute("href", href);
        return this;
    }

    @Override
    public Link hreflang(String hreflang) {
        this.props.setAttribute("hreflang", hreflang);
        return this;
    }

    @Override
    public Link media(String media) {
        this.props.setAttribute("media", media);
        return this;
    }

    @Override
    public Link referrerPolicy(String referrerPolicy) {
        this.props.setAttribute("referrerpolicy", referrerPolicy);
        return this;
    }

    @Override
    public Link rel(String rel) {
        this.props.setAttribute("rel", rel);
        return this;
    }

    @Override
    public Link sizes(String sizes) {
        this.props.setAttribute("sizes", sizes);
        return this;
    }

    @Override
    public Link type(String type) {
        this.props.setAttribute("type", type);
        return this;
    }
}
