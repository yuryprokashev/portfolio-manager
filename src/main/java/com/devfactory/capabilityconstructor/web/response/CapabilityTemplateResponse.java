package com.devfactory.capabilityconstructor.web.response;

import com.devfactory.capabilityconstructor.model.CapabilityTemplate;

public class CapabilityTemplateResponse extends ObjectResponse {
    public CapabilityTemplateResponse(CapabilityTemplate model) {
        super(model.getId().toString(), model.getName());
    }
}
