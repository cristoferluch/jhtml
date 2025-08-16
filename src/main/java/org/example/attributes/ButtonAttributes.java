package org.example.attributes;

public interface ButtonAttributes<T> {

    T autofocus(boolean autofocus);

    T disabled(boolean disabled);

    T form(String form);

    T formAction(String formAction);

    T formMethod(String formMethod);

    T formNoValidate(String formNoValidate);

    T formTarget(String formTarget);

    T name(String name);

    T type(String type);

}
