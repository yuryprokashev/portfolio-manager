package com.devfactory.capabilityconstructor.web.request;

public enum RequestType {
    READ_COLLECTION (1),
    ADD_OBJECT_TO_COLLECTION (2),
    UPDATE_OBJECT (3),
    CONSUME_OBJECT (4),
    DELETE_OBJECT (5);

    private final int code;

    RequestType(int requestTypeCode) {
        this.code = requestTypeCode;
    }
}
