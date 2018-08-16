package com.devfactory.capabilityconstructor.web.response;

import com.devfactory.capabilityconstructor.model.Release;

public class ReleaseResponse extends ObjectResponse {
    public ReleaseResponse(Release model) {
        super(model.getId().toString(), model.getName());
    }
}
