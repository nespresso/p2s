package org.p2s;

/**
 * A setting cannot be both:
 *  - a list and an optional
 */
public class Setting {
    private final boolean isNestedType;
    private String name, type, pkg;
    private boolean isOptional, isList;

    public Setting(String name, String type, String pkg, boolean isOptional, boolean isNestedType, boolean isList) {
        this.name = name;
        this.type = type;
        this.isOptional = isOptional;
        this.isNestedType = isNestedType;
        this.pkg = pkg;
        this.isList = isList;

        if( isList && isOptional ) {
            throw new IllegalArgumentException("A setting cannot be both a list and optional.");
        }
    }

    public boolean isList() {
        return isList;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public boolean isNestedType() {
        return isNestedType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPkg() {
        return pkg;
    }
}
