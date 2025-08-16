package org.example.attributes;

public interface HyperlinkAttributes<T> {

    T href(String href);

    T hreflang(String hreflang);

    T referrerPolicy(String referrerPolicy);

    T rel(String rel);

    T target(String target);

    T type(String type);
}

