package com.devfactory.portfoliomanager.web.request;

import java.util.Arrays;

public enum SortOrder {
    ASC("asc"),
    DESC("desc");

    private final String value;

    SortOrder(String value) {this.value = value; }
    public static SortOrder fromValue(String value) {
        for (SortOrder parameter : values()) {
            if (parameter.toString().equalsIgnoreCase(value)) {
                return parameter;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }
    public String getValue() {
        return this.value;
    }
}