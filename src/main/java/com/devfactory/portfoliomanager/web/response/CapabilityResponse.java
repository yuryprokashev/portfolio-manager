package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.Capability;

public class CapabilityResponse extends ObjectResponse {
    private String featureId;
    public CapabilityResponse(Capability model) {
        super(model.getId().toString(), model.getName());
        this.featureId = model.getParentId().toString();
    }

    public String getFeatureId() {
        return featureId;
    }
}
