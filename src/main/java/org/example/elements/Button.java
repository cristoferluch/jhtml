package org.example.elements;

import org.example.core.HtmlElement;
import org.example.attributes.ButtonAttributes;

public class Button extends HtmlElement<Button> implements ButtonAttributes<Button> {

    private String text = "";

    public Button(String text) {
        this.text = text;
    }

    @Override
    public void build(StringBuilder sb) {
        sb.append("<button");
        this.props.buildAttributes(sb);
        sb.append(">").append(text).append("</button>");
    }

    @Override
    protected Button self() {
        return this;
    }

    @Override
    public Button clear() {
        this.props.clearAttributes();
        this.text = "";
        return this;
    }

    @Override
    public Button autofocus(boolean autofocus) {
        this.props.setAttribute("autofocus", autofocus);
        return this;
    }

    @Override
    public Button disabled(boolean disabled) {
        this.props.setAttribute("disabled", disabled);
        return this;
    }

    @Override
    public Button form(String form) {
        this.props.setAttribute("form", form);
        return this;
    }

    @Override
    public Button formAction(String formAction) {
        this.props.setAttribute("formAction", formAction);
        return this;
    }

    @Override
    public Button formMethod(String formMethod) {
        this.props.setAttribute("formMethod", formMethod);
        return this;
    }

    @Override
    public Button formNoValidate(String formNoValidate) {
        this.props.setAttribute("formNoValidate", formNoValidate);
        return this;
    }

    @Override
    public Button formTarget(String formTarget) {
        this.props.setAttribute("formTarget", formTarget);
        return this;
    }

    @Override
    public Button name(String name) {
        this.props.setAttribute("name", name);
        return this;
    }

    @Override
    public Button type(String type) {
        this.props.setAttribute("type", type);
        return this;
    }
}
