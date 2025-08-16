package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.ScriptAttributes;

public class Script extends HtmlElement<Script> implements ScriptAttributes<Script> {

    private String text = "";

    public Script() {}

    public Script(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<script");
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</script>");
    }

    @Override
    protected Script self() {
        return this;
    }

    @Override
    public Script clear() {
        this.props.clearAttributes();
        this.text = "";
        return this;
    }

    @Override
    public Script async(boolean async) {
        this.props.setAttribute("async", async);
        return this;
    }

    @Override
    public Script crossOrigin(String crossOrigin) {
        this.props.setAttribute("crossorigin", crossOrigin);
        return this;
    }

    @Override
    public Script defer(boolean defer) {
        this.props.setAttribute("defer", defer);
        return this;
    }

    @Override
    public Script integrity(String integrity) {
        this.props.setAttribute("integrity", integrity);
        return this;
    }

    @Override
    public Script noModule(Boolean noModule) {
        this.props.setAttribute("nomodule", noModule);
        return this;
    }

    @Override
    public Script referrerPolicy(String referrerPolicy) {
        this.props.setAttribute("referrerpolicy", referrerPolicy);
        return this;
    }

    @Override
    public Script src(String src) {
        this.props.setAttribute("src", src);
        return this;
    }

    @Override
    public Script type(String type) {
        this.props.setAttribute("type", type);
        return this;
    }
}
