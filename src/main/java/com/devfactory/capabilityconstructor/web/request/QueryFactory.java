package com.devfactory.capabilityconstructor.web.request;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class QueryFactory {

    public Query create(Map<RequestParameter, String> queryMap) {
        return new ReadCollectionQuery(queryMap);
    }
}
