package org.example.attributes;

public interface FormAttributes<T> {

    T name(String name);

    T action(String action);

    T target(String target);

    T method(String method);

    T autocomplete(String autocomplete);

}
