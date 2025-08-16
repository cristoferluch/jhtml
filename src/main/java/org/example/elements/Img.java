package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.ImgAttributes;

public class Img extends HtmlElement<Img> implements ImgAttributes<Img> {

    @Override
    public void build(StringBuilder sb) {
        sb.append("<img");
        this.props.buildAttributes(sb);
        sb.append(">");
    }

    @Override
    protected Img self() {
        return this;
    }

    @Override
    public Img clear() {
        this.props.clearAttributes();
        return this;
    }

    @Override
    public Img alt(String alt) {
        this.props.setAttribute("alt", alt);
        return this;
    }

    @Override
    public Img crossOrigin(String crossOrigin) {
        this.props.setAttribute("cross-origin", crossOrigin);
        return this;
    }

    @Override
    public Img height(int height) {
        this.props.setAttribute("height", height);
        return this;
    }

    @Override
    public Img width(int width) {
        this.props.setAttribute("width", width);
        return this;
    }

    @Override
    public Img loading(String loading) {
        this.props.setAttribute("loading", loading);
        return this;
    }

    @Override
    public Img longDesc(String longDesc) {
        this.props.setAttribute("longDesc", longDesc);
        return this;
    }

    @Override
    public Img referrerPolicy(String referrerPolicy) {
        this.props.setAttribute("referrerpolicy", referrerPolicy);
        return this;
    }

    @Override
    public Img src(String src) {
        this.props.setAttribute("src", src);
        return this;
    }

    @Override
    public Img useMap(String useMap) {
        this.props.setAttribute("usemap", useMap);
        return this;
    }

    @Override
    public Img isMap(String isMap) {
        this.props.setAttribute("ismap", isMap);
        return this;
    }
}
