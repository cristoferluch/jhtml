package org.example.attributes;

public interface InputAttributes<T> {

    T name(String name);

    T value(Object value);

    T type(String type);

    T readOnly(boolean readOnly);

    T disabled(boolean disabled);

    T size(int size);

    T maxLength(int maxLength);

    T min(int min);

    T max(int max);

    T multiple(boolean multiple);

    T pattern(String pattern);

    T placeholder(String placeholder);

    T required(boolean required);

    T step(int step);

    T autofocus(boolean autofocus);

    T autocomplete(boolean autocomplete);

    T onChange(String onChange);

    T onInput(String onInput);

    T onSelect(String onSelect);

    T onInvalid(String onInvalid);

    T onReset(String onReset);

    T onSubmit(String onSubmit);
}
