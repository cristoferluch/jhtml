package org.example.attributes;

public interface SelectAttributes<T> {

    T autofocus(String value);

    T disabled(boolean value);

    T form(boolean value);

    T multiple(boolean value);

    T name(String value);

    T required(boolean value);

    T size(int value);

    T onChange(String onChange);

    T onInput(String onInput);

    T onSelect(String onSelect);

    T onInvalid(String onInvalid);

    T onReset(String onReset);

    T onSubmit(String onSubmit);
}
