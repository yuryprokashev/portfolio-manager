package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.Milestone;

public class MilestoneResponse extends ObjectResponse {
    public MilestoneResponse(Milestone model) {
        super(model.getId().toString(), model.getName());
    }
}
