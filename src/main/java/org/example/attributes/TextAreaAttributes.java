package org.example.attributes;

public interface TextAreaAttributes<T> {

    T autofocus(boolean autofocus);

    T cols(int cols);

    T disabled(boolean disabled);

    T form(String form);

    T maxLength(int maxLength);

    T name(String name);

    T placeholder(String placeholder);

    T readonly(boolean readonly);

    T required(boolean required);

    T rows(int rows);

    T wrap(String wrap);

    T value(Object value);

    T onChange(String onChange);

    T onInput(String onInput);

    T onSelect(String onSelect);

    T onInvalid(String onInvalid);

    T onReset(String onReset);

    T onSubmit(String onSubmit);

}
