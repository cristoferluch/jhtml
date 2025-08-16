package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.MetaAttributes;

public class Meta extends HtmlElement<Meta> implements MetaAttributes<Meta> {

    @Override
    public void build(StringBuilder sb) {
        sb.append("<meta");
        this.props.buildAttributes(sb);
        sb.append(">");
    }

    @Override
    protected Meta self() {
        return this;
    }

    @Override
    public Meta clear() {
        this.props.clearAttributes();
        return this;
    }

    @Override
    public Meta charset(String charset) {
        this.props.setAttribute("charset", charset);
        return this;
    }

    @Override
    public Meta content(String content) {
        this.props.setAttribute("content", content);
        return this;
    }

    @Override
    public Meta httpEquiv(String httpEquiv) {
        this.props.setAttribute("httpEquiv", httpEquiv);
        return this;
    }

    @Override
    public Meta name(String name) {
        this.props.setAttribute("name", name);
        return this;
    }
}
