package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.SelectAttributes;

public class Select extends HtmlElement<Select> implements SelectAttributes<Select> {

    private HtmlElement<?>[] elements;

    public Select(HtmlElement<?>... elements) {
        this.elements = elements;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<select");
        this.props.buildAttributes(sb);
        sb.append(">");
        for (int i = 0; i < elements.length; i++) {
            elements[i].build(sb);
        }
        sb.append("</select>");
    }

    @Override
    protected Select self() {
        return this;
    }

    @Override
    public Select clear() {
        this.props.setAttribute("clearAttributes", true);
        this.elements = new HtmlElement<?>[0];
        return this;
    }

    @Override
    public Select autofocus(String value) {
        this.props.setAttribute("value", value);
        return this;
    }

    @Override
    public Select disabled(boolean value) {
        this.props.setAttribute("disabled", value);
        return this;
    }

    @Override
    public Select form(boolean value) {
        this.props.setAttribute("form", value);
        return this;
    }

    @Override
    public Select multiple(boolean value) {
        this.props.setAttribute("multiple", value);
        return this;
    }

    @Override
    public Select name(String value) {
        this.props.setAttribute("name", value);
        return this;
    }

    @Override
    public Select required(boolean value) {
        this.props.setAttribute("required", value);
        return this;
    }

    @Override
    public Select size(int value) {
        this.props.setAttribute("size", value);
        return this;
    }

    @Override
    public Select onChange(String onChange) {
        this.props.setAttribute("onchange", onChange);
        return this;
    }

    @Override
    public Select onInput(String onInput) {
        this.props.setAttribute("oninput", onInput);
        return this;
    }

    @Override
    public Select onSelect(String onSelect) {
        this.props.setAttribute("onselect", onSelect);
        return this;
    }

    @Override
    public Select onInvalid(String onInvalid) {
        this.props.setAttribute("oninvalid", onInvalid);
        return this;
    }

    @Override
    public Select onReset(String onReset) {
        this.props.setAttribute("onreset", onReset);
        return this;
    }

    @Override
    public Select onSubmit(String onSubmit) {
        this.props.setAttribute("onsubmit", onSubmit);
        return this;
    }
}
