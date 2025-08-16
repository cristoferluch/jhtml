package org.example.attributes;

public interface ScriptAttributes<T> {

    T async(boolean async);

    T crossOrigin(String crossOrigin);

    T defer(boolean defer);

    T integrity(String integrity);

    T noModule(Boolean noModule);

    T referrerPolicy(String referrerPolicy);

    T src(String src);

    T type(String type);

}
