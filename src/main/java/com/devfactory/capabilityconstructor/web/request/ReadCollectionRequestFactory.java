package com.devfactory.capabilityconstructor.web.request;

import org.springframework.stereotype.Service;

@Service
public class ReadCollectionRequestFactory {
    public Request create(ResourceName resourceName, Query query, Sort sort) {
        ReadCollectionRequest request = new ReadCollectionRequest(resourceName);
        request.setQuery(query);
        request.setSort(sort);
        return request;
    }
}
