package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.Release;

public class ReleaseResponse extends ObjectResponse {
    public ReleaseResponse(Release model) {
        super(model.getId().toString(), model.getName());
    }
}
