package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.CapabilityTemplate;

public class CapabilityTemplateResponse extends ObjectResponse {
    public CapabilityTemplateResponse(CapabilityTemplate model) {
        super(model.getId().toString(), model.getName());
    }
}
