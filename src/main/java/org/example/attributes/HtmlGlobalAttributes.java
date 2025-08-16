package org.example.attributes;


public interface HtmlGlobalAttributes<T> {

    T id(String id);

    T className(String className);

    T hidden(boolean hidden);

    T contenteditable(boolean contenteditable);

    T lang(String lang);

    T spellcheck(boolean spellcheck);

    T style(String style);

    T tabindex(int tabindex);

    T title(String title);

    T onClick(String onClick);

    T onDblclick(String onDblclick);

    T onMousedown(String onMousedown);

    T onMouseup(String onMouseup);

    T onMouseover(String onMouseover);

    T onMousemove(String onMousemove);

    T onMouseout(String onMouseout);

    T onMouseenter(String onMouseenter);

    T onMouseleave(String onMouseleave);

    T onKeydown(String onKeydown);

    T onKeypress(String onKeypress);

    T onKeyup(String onKeyup);

    T onFocus(String onFocus);

    T onBlur(String onBlur);

    T onContextmenu(String onContextmenu);

    T onScroll(String onScroll);

    T attr(String name, String value);

    T clear();

}
