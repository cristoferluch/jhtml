package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.TextAreaAttributes;

public class TextArea extends HtmlElement<TextArea> implements TextAreaAttributes<TextArea> {

    private String value = "";

    @Override
    public void build(StringBuilder sb) {
        sb.append("<textarea");
        this.props.buildAttributes(sb);
        sb.append(">").append(value).append("</textarea>");
    }

    @Override
    protected TextArea self() {
        return this;
    }

    @Override
    public TextArea clear() {
        this.props.clearAttributes();
        this.value = "";
        return this;
    }

    @Override
    public TextArea autofocus(boolean autofocus) {
        this.props.setAttribute("autofocus", autofocus);
        return this;
    }

    @Override
    public TextArea cols(int cols) {
        this.props.setAttribute("cols", cols);
        return this;
    }

    @Override
    public TextArea disabled(boolean disabled) {
        this.props.setAttribute("disabled", disabled);
        return this;
    }

    @Override
    public TextArea form(String form) {
        this.props.setAttribute("form", form);
        return this;
    }

    @Override
    public TextArea maxLength(int maxLength) {
        this.props.setAttribute("maxlength", maxLength);
        return this;
    }

    @Override
    public TextArea name(String name) {
        this.props.setAttribute("name", name);
        return this;
    }

    @Override
    public TextArea placeholder(String placeholder) {
        this.props.setAttribute("placeholder", placeholder);
        return this;
    }

    @Override
    public TextArea readonly(boolean readonly) {
        this.props.setAttribute("readonly", readonly);
        return this;
    }

    @Override
    public TextArea required(boolean required) {
        this.props.setAttribute("required", required);
        return this;
    }

    @Override
    public TextArea rows(int rows) {
        this.props.setAttribute("rows", rows);
        return this;
    }

    @Override
    public TextArea wrap(String wrap) {
        this.props.setAttribute("wrap", wrap);
        return this;
    }

    @Override
    public TextArea value(Object value) {
        this.value = value.toString();
        return this;
    }

    @Override
    public TextArea onChange(String onChange) {
        this.props.setAttribute("onchange", onChange);
        return this;
    }

    @Override
    public TextArea onInput(String onInput) {
        this.props.setAttribute("oninput", onInput);
        return this;
    }

    @Override
    public TextArea onSelect(String onSelect) {
        this.props.setAttribute("onselect", onSelect);
        return this;
    }

    @Override
    public TextArea onInvalid(String onInvalid) {
        this.props.setAttribute("oninvalid", onInvalid);
        return this;
    }

    @Override
    public TextArea onReset(String onReset) {
        this.props.setAttribute("onreset", onReset);
        return this;
    }

    @Override
    public TextArea onSubmit(String onSubmit) {
        this.props.setAttribute("onsubmit", onSubmit);
        return this;
    }
}
