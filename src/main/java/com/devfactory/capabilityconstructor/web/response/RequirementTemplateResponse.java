package com.devfactory.capabilityconstructor.web.response;

import com.devfactory.capabilityconstructor.model.RequirementTemplate;

public class RequirementTemplateResponse extends ObjectResponse {
    public RequirementTemplateResponse(RequirementTemplate model) {
        super(model.getId().toString(), model.getName());
    }
}
