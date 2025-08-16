package org.example.core;

import org.example.elements.*;

import java.util.List;

public class HtmlFactory<T> {

    public static Div div(HtmlElement<?>... elements) {
        return new Div(elements);
    }

    public static Div div(List<HtmlElement<?>> elements) {
        return div(elements.toArray(new HtmlElement[0]));
    }

    public static Input input() {
        return new Input();
    }

    public static Hyperlink a(Object text) {
        return new Hyperlink(text.toString());
    }

    public static Hyperlink a(HtmlElement<?>... elements) {
        return new Hyperlink(elements);
    }

    public static Hyperlink a(List<HtmlElement<?>> elements) {
        return a(elements.toArray(new HtmlElement[0]));
    }

    public static Body body(HtmlElement<?>... elements) {
        return new Body(elements);
    }

    public static Body body(List<HtmlElement<?>> elements) {
        return body(elements.toArray(new HtmlElement[0]));
    }

    public static Form form(HtmlElement<?>... elements) {
        return new Form(elements);
    }

    public static Form form(List<HtmlElement<?>> elements) {
        return form(elements.toArray(new HtmlElement[0]));
    }

    public static Table table(HtmlElement<?>... elements) {
        return new Table(elements);
    }

    public static Table table(List<HtmlElement<?>> elements) {
        return table(elements.toArray(new HtmlElement[0]));
    }

    public static Table table(HtmlElement<?> element, List<HtmlElement<?>> elements) {
       // elements.addFirst(element);
        return table(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Tr tr(HtmlElement<?>... elements) {
        return new Tr(elements);
    }

    public static Tr tr(List<HtmlElement<?>> elements) {
        return tr(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Td td(HtmlElement<?>... elements) {
        return new Td(elements);
    }

    public static Td td(List<HtmlElement<?>> elements) {
        return td(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Td td(Object text) {
        return new Td(text.toString());
    }

    public static Th th(HtmlElement<?>... elements) {
        return new Th(elements);
    }

    public static Th th(List<HtmlElement<?>> elements) {
        return new Th(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Th th(Object text) {
        return new Th(text.toString());
    }

    public static Button button(Object text) {
        return new Button(text.toString());
    }

    public static Html html(HtmlElement<?>... elements) {
        return new Html(elements);
    }

    public static Html html(List<HtmlElement<?>> elements) {
        return html(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Img img() {
        return new Img();
    }

    public static Dialog dialog(HtmlElement<?>... elements) {
        return new Dialog(elements);
    }

    public static Dialog dialog(List<HtmlElement<?>> elements) {
        return dialog(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Head head(HtmlElement<?>... elements) {
        return new Head(elements);
    }

    public static Head head(List<HtmlElement<?>> elements) {
        return head(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Title title(Object teste) {
        return new Title(teste.toString());
    }

    public static Label label(String text) {
        return new Label(text);
    }

    public static Label label(HtmlElement<?>... elements) {
        return new Label(elements);
    }

    public static Label label(List<HtmlElement<?>> elements) {
        return label(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Link link() {
        return new Link();
    }

    public static Paragraph p(Object text) {
        return new Paragraph(text.toString());
    }

    public static Span span(Object text) {
        return new Span(text.toString());
    }

    public static THead thead(HtmlElement<?>... elements) {
        return new THead(elements);
    }

    public static THead thead(List<HtmlElement<?>> elements) {
        return thead(elements.toArray(new HtmlElement<?>[0]));
    }

    public static TBody tbody(HtmlElement<?>... elements) {
        return new TBody(elements);
    }

    public static TBody tbody(List<HtmlElement<?>> elements) {
        return tbody(elements.toArray(new HtmlElement<?>[0]));
    }

    public static TFoot tfoot(HtmlElement<?>... elements) {
        return new TFoot(elements);
    }

    public static TFoot tfoot(List<HtmlElement<?>> elements) {
        return tfoot(elements.toArray(new HtmlElement<?>[0]));
    }

    public static Select select(HtmlElement<?>... options) {
        return new Select(options);
    }

    public static Select select(List<HtmlElement<?>> Options) {
        return select(Options.toArray(new HtmlElement[0]));
    }

    public static Option option(Object text) {
        return new Option(text.toString());
    }

    public static TextArea textarea() {
        return new TextArea();
    }

    public static Headings h1(String text) {
        return new Headings(text, "h1");
    }

    public static Headings h2(String text) {
        return new Headings(text, "h2");
    }

    public static Headings h3(String text) {
        return new Headings(text, "h3");
    }

    public static Headings h4(String text) {
        return new Headings(text, "h4");
    }

    public static Headings h5(String text) {
        return new Headings(text, "h5");
    }

    public static Headings h6(String text) {
        return new Headings(text, "h6");
    }

    public static Script script(String script) {
        return new Script(script);
    }

    public static Script script() {
        return new Script();
    }

    public static Meta meta() {
        return new Meta();
    }

}