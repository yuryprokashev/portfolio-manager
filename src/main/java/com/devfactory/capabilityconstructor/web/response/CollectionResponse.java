package com.devfactory.capabilityconstructor.web.response;

import java.util.Collection;

public class CollectionResponse implements Response {
    private Collection<ObjectResponse> collection;

    public CollectionResponse(Collection<ObjectResponse> objectResponseCollection) {
        this.collection = objectResponseCollection;
    }

    public Collection<ObjectResponse> getCollection() {
        return collection;
    }
}
