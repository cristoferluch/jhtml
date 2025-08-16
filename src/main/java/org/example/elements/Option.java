package org.example.elements;


import org.example.core.HtmlElement;
import org.example.attributes.OptionAttributes;

public class Option extends HtmlElement<Option> implements OptionAttributes<Option> {

    private String text;

    public Option(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<option");
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</option>");
    }

    @Override
    protected Option self() {
        return this;
    }

    @Override
    public Option clear() {
        this.props.clearAttributes();
        this.text = "";
        return this;
    }

    @Override
    public Option disabled(boolean value) {
        this.props.setAttribute("disabled", value);
        return this;
    }

    @Override
    public Option label(Object value) {
        this.props.setAttribute("label", value.toString());
        return this;
    }

    @Override
    public Option selected(boolean selected) {
        this.props.setAttribute("selected", selected);
        return this;
    }

    @Override
    public Option value(Object value) {
        this.props.setAttribute("value", value.toString());
        return this;
    }
}
