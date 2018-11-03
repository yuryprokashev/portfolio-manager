package com.devfactory.portfoliomanager.web.request;

public class CollectionSort implements Sort {

    private SortOrder sortOrder;
    private RequestParameter sortProperty;

    public CollectionSort(SortOrder sortOrder, RequestParameter sortProperty) {
        this.sortOrder = sortOrder;
        this.sortProperty = sortProperty;
    }

    @Override
    public SortOrder getSortOrder() {
        return this.sortOrder;
    }

    @Override
    public RequestParameter getSortBy() {
        return this.sortProperty;
    }
}
