package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.Requirement;

public class RequirementResponse extends ObjectResponse {
    private String capabilityId;
    public RequirementResponse(Requirement model) {
        super(model.getId().toString(), model.getName());
        this.capabilityId = model.getParentId().toString();
    }

    public String getCapabilityId() {
        return capabilityId;
    }
}
