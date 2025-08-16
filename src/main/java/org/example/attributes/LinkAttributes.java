package org.example.attributes;

public interface LinkAttributes<T> {

    T crossOrigin(String crossOrigin);

    T href(String href);

    T hreflang(String hreflang);

    T media(String media);

    T referrerPolicy(String referrerPolicy);

    T rel(String rel);

    T sizes(String sizes);

    T title(String title);

    T type(String type);

}
