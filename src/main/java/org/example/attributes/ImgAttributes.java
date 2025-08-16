package org.example.attributes;

public interface ImgAttributes<T> {

    T alt(String alt);

    T crossOrigin(String crossOrigin);

    T height(int height);

    T width(int width);

    T loading(String loading);

    T longDesc(String longDesc);

    T referrerPolicy(String referrerPolicy);

    T src(String src);

    T useMap(String useMap);

    T isMap(String isMap);
}
