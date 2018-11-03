package com.devfactory.portfoliomanager.web.request;

import java.util.Collection;
import java.util.Map;

public class ReadCollectionQuery implements Query {
    private Map<RequestParameter, String> queryMap;

    public ReadCollectionQuery(Map<RequestParameter, String> queryMap) {
        this.queryMap = queryMap;
    }

    @Override
    public String get(RequestParameter key) {
        return this.queryMap.get(key);
    }

    @Override
    public boolean has(RequestParameter key) {
        return this.queryMap.containsKey(key);
    }

    @Override
    public Collection<RequestParameter> getKeys() {
        return this.queryMap.keySet();
    }
}
