package com.devfactory.capabilityconstructor.web.request;

public class ReadCollectionRequest implements Request {
    private ResourceName resourceName;
    private RequestType requestType;
    private Query query;
    private Sort sort;

    public ReadCollectionRequest(ResourceName resourceName) {
        this.resourceName = resourceName;
        this.requestType = RequestType.READ_COLLECTION;
    }

    @Override
    public RequestType getType() {
        return this.requestType;
    }

    public ResourceName getResourceName() {
        return this.resourceName;
    }

    public Query getQuery() {
        return this.query;
    }

    public Sort getSort() { return this.sort; }

    public void setQuery(Query query) {
        this.query = query;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}