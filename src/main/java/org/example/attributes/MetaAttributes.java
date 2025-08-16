package org.example.attributes;

public interface MetaAttributes<T> {

    T charset(String charset);

    T content(String content);

    T httpEquiv(String httpEquiv);

    T name(String name);
}
