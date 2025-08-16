package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.InputAttributes;

public class Input extends HtmlElement<Input> implements InputAttributes<Input> {

    @Override
    public void build(StringBuilder sb) {
        sb.append("<input");
        this.props.buildAttributes(sb);
        sb.append(">");
    }

    @Override
    protected Input self() {
        return this;
    }

    @Override
    public Input clear() {
        this.props.clearAttributes();
        return this;
    }

    @Override
    public Input name(String name) {
        this.props.setAttribute("name", name);
        return this;
    }

    @Override
    public Input value(Object value) {
        this.props.setAttribute("value", value.toString());
        return this;
    }

    @Override
    public Input type(String type) {
        this.props.setAttribute("type", type);
        return this;
    }

    @Override
    public Input readOnly(boolean readOnly) {
        this.props.setAttribute("readonly", readOnly);
        return this;
    }

    @Override
    public Input disabled(boolean disabled) {
        this.props.setAttribute("disabled", disabled);
        return this;
    }

    @Override
    public Input size(int size) {
        this.props.setAttribute("size", size);
        return this;
    }

    @Override
    public Input maxLength(int maxLength) {
        this.props.setAttribute("maxlength", maxLength);
        return this;
    }

    @Override
    public Input min(int min) {
        this.props.setAttribute("min", min);
        return this;
    }

    @Override
    public Input max(int max) {
        this.props.setAttribute("max", max);
        return this;
    }

    @Override
    public Input multiple(boolean multiple) {
        this.props.setAttribute("multiple", multiple);
        return this;
    }

    @Override
    public Input pattern(String pattern) {
        this.props.setAttribute("pattern", pattern);
        return this;
    }

    @Override
    public Input placeholder(String placeholder) {
        this.props.setAttribute("placeholder", placeholder);
        return this;
    }

    @Override
    public Input required(boolean required) {
        this.props.setAttribute("required", required);
        return this;
    }

    @Override
    public Input step(int step) {
        this.props.setAttribute("step", step);
        return this;
    }

    @Override
    public Input autofocus(boolean autofocus) {
        this.props.setAttribute("autofocus", autofocus);
        return this;
    }

    @Override
    public Input autocomplete(boolean autocomplete) {
        this.props.setAttribute("autocomplete", autocomplete);
        return this;
    }

    @Override
    public Input onChange(String onChange) {
        this.props.setAttribute("onchange", onChange);
        return this;
    }

    @Override
    public Input onInput(String onInput) {
        this.props.setAttribute("oninput", onInput);
        return this;
    }

    @Override
    public Input onSelect(String onSelect) {
        this.props.setAttribute("onselect", onSelect);
        return this;
    }

    @Override
    public Input onInvalid(String onInvalid) {
        this.props.setAttribute("oninvalid", onInvalid);
        return this;
    }

    @Override
    public Input onReset(String onReset) {
        this.props.setAttribute("onreset", onReset);
        return this;
    }

    @Override
    public Input onSubmit(String onSubmit) {
        this.props.setAttribute("onsubmit", onSubmit);
        return this;
    }
}
