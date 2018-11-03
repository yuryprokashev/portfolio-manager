package com.devfactory.portfoliomanager.web.request;

import java.util.Arrays;

public enum RequestParameter {
    NAME("name"),
    PARENT_ID("parent_id");

    private final String name;

    RequestParameter(String parameterKey) {
        this.name = parameterKey;
    }

    public static RequestParameter fromValue(String value) {
        for (RequestParameter parameter : values()) {
            if (parameter.toString().equalsIgnoreCase(value)) {
                return parameter;
            }
        }
        throw new IllegalArgumentException(
                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
    }

    public static String getModelFieldName(RequestParameter requestParameter) {
        String result = null;
        switch (requestParameter) {
            case NAME:
                result = "name";
                break;
            case PARENT_ID:
                result = "parentId";
                break;
            default:
                break;
        }
        return result;
    }
}