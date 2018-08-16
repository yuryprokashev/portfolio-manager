package com.devfactory.capabilityconstructor.web.request;

public interface Request {
    RequestType getType();
    ResourceName getResourceName();
    Query getQuery();
    void setQuery(Query query);
    Sort getSort();
    void setSort(Sort sort);
}
