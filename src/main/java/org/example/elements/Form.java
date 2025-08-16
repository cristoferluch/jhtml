package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.FormAttributes;

public class Form extends HtmlElement<Form> implements FormAttributes<Form> {

    private HtmlElement<?>[] elements;

    public Form(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<form");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</form>");
    }

    @Override
    protected Form self() {
        return this;
    }

    @Override
    public Form clear() {
        this.props.clearAttributes();
        this.elements = new HtmlElement<?>[0];
        return this;
    }

    @Override
    public Form name(String name) {
        this.props.setAttribute("name", name);
        return this;
    }

    @Override
    public Form action(String action) {
        this.props.setAttribute("action", action);
        return this;
    }

    @Override
    public Form target(String target) {
        this.props.setAttribute("target", target);
        return this;
    }

    @Override
    public Form method(String method) {
        this.props.setAttribute("method", method);
        return this;
    }

    @Override
    public Form autocomplete(String autocomplete) {
        this.props.setAttribute("autocomplete", autocomplete);
        return this;
    }
}
