package org.example.core;


import org.example.attributes.HtmlGlobalAttributes;

import java.io.PrintWriter;


public abstract class HtmlElement<T extends HtmlElement<T>> implements HtmlGlobalAttributes<T> {

    protected final HtmlAttribute props = new HtmlAttribute();

    public abstract void build(StringBuilder sb);

    protected abstract T self();

    public String build() {
        StringBuilder sb = new StringBuilder();
        build(sb);
        return sb.toString();
    }

    public void build(PrintWriter out) {
        StringBuilder sb = new StringBuilder();
        build(sb);
        out.print(sb);
    }

    @Override
    public T id(String id) {
        this.props.setAttribute("id", id);
        return self();
    }

    @Override
    public T className(String className) {
        this.props.setAttribute("class", className);
        return self();
    }

    @Override
    public T hidden(boolean hidden) {
        this.props.setAttribute("hidden", hidden);
        return self();
    }

    @Override
    public T contenteditable(boolean contenteditable) {
        this.props.setAttribute("contenteditable", contenteditable);
        return self();
    }

    @Override
    public T lang(String lang) {
        this.props.setAttribute("lang", lang);
        return self();
    }

    @Override
    public T spellcheck(boolean spellcheck) {
        this.props.setAttribute("spellcheck", spellcheck);
        return self();
    }

    @Override
    public T style(String style) {
        this.props.setAttribute("style", style);
        return self();
    }

    @Override
    public T tabindex(int tabindex) {
        this.props.setAttribute("tabindex", tabindex);
        return self();
    }

    @Override
    public T title(String title) {
        this.props.setAttribute("title", title);
        return self();
    }

    @Override
    public T onClick(String onClick) {
        this.props.setAttribute("onclick", onClick);
        return self();
    }

    @Override
    public T onDblclick(String onDblclick) {
        this.props.setAttribute("ondblclick", onDblclick);
        return self();
    }

    @Override
    public T onMousedown(String onMousedown) {
        this.props.setAttribute("onmousedown", onMousedown);
        return self();
    }

    @Override
    public T onMouseup(String onMouseup) {
        this.props.setAttribute("onmouseup", onMouseup);
        return self();
    }

    @Override
    public T onMouseover(String onMouseover) {
        this.props.setAttribute("onmouseover", onMouseover);
        return self();
    }

    @Override
    public T onMousemove(String onMousemove) {
        this.props.setAttribute("onmousemove", onMousemove);
        return self();
    }

    @Override
    public T onMouseout(String onMouseout) {
        this.props.setAttribute("onmouseout", onMouseout);
        return self();
    }

    @Override
    public T onMouseenter(String onMouseenter) {
        this.props.setAttribute("onmouseenter", onMouseenter);
        return self();
    }

    @Override
    public T onMouseleave(String onMouseleave) {
        this.props.setAttribute("onmouseleave", onMouseleave);
        return self();
    }

    @Override
    public T onKeydown(String onKeydown) {
        this.props.setAttribute("onkeydown", onKeydown);
        return self();
    }

    @Override
    public T onKeypress(String onKeypress) {
        this.props.setAttribute("onkeypress", onKeypress);
        return self();
    }

    @Override
    public T onKeyup(String onKeyup) {
        this.props.setAttribute("onkeyup", onKeyup);
        return self();
    }

    @Override
    public T onFocus(String onFocus) {
        this.props.setAttribute("onfocus", onFocus);
        return self();
    }

    @Override
    public T onBlur(String onBlur) {
        this.props.setAttribute("onblur", onBlur);
        return self();
    }

    @Override
    public T onContextmenu(String onContextmenu) {
        this.props.setAttribute("oncontextmenu", onContextmenu);
        return self();
    }

    @Override
    public T onScroll(String onScroll) {
        this.props.setAttribute("onscroll", onScroll);
        return self();
    }

    @Override
    public T attr(String name, String value) {
        this.props.setAttribute(name, value);
        return self();
    }

}
