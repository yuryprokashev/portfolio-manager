package com.devfactory.capabilityconstructor.web.response;

import com.devfactory.capabilityconstructor.model.Milestone;

public class MilestoneResponse extends ObjectResponse {
    public MilestoneResponse(Milestone model) {
        super(model.getId().toString(), model.getName());
    }
}
