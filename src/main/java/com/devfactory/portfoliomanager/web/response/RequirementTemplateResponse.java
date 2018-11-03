package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.RequirementTemplate;

public class RequirementTemplateResponse extends ObjectResponse {
    public RequirementTemplateResponse(RequirementTemplate model) {
        super(model.getId().toString(), model.getName());
    }
}
