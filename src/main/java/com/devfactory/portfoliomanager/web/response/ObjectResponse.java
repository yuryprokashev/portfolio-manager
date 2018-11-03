package com.devfactory.portfoliomanager.web.response;

public class ObjectResponse implements Response {
    private String id;
    private String name;

    public ObjectResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
