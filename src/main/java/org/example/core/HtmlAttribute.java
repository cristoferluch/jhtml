package org.example.core;

import java.util.HashMap;
import java.util.Map;

public class HtmlAttribute {

    protected HashMap<String, String> attributes = new HashMap<>();

    public void setAttribute(String name, Object value) {

        String separator = " ";

        if (name.equals("style") || name.startsWith("on")) {
            separator = ";";
        } else if (name.equals("accept") || name.equals("headers")) {
            separator = ",";
        }

        if (this.attributes.containsKey(name)) {
            this.attributes.put(name, this.attributes.get(name) + separator  + value);
        } else {
            this.attributes.put(name, String.valueOf(value));
        }
    }

    public void clearAttributes() {
        this.attributes.clear();
    }

    public void buildAttributes(StringBuilder sb) {

        if (this.attributes.isEmpty()) return;

        for (Map.Entry<String, String> entry : this.attributes.entrySet()) {

            sb.append(" ")
                    .append(entry.getKey())
                    .append("=\"")
                    .append(entry.getValue())
                    .append('"');
        }
    }

}
