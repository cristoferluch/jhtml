package org.example.attributes;

public interface OptionAttributes<T> {

    T disabled(boolean value);

    T label(Object value);

    T selected(boolean selected);

    T value(Object value);

}
