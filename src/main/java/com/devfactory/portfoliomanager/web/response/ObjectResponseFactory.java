package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.*;
import com.devfactory.portfoliomanager.web.request.Request;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ObjectResponseFactory {

    public Collection<ObjectResponse> create(Request request, Collection<Model> modelCollection) {
        List<ObjectResponse> objectResponseCollection = new ArrayList<>();
        modelCollection.forEach(model -> {
            ObjectResponse objectResponse = null;
            switch (request.getResourceName()) {
                case PRODUCTS:
                    objectResponse = new ProductResponse((Product) model);
                    break;
                case COMPANIES:
                    objectResponse = new CompanyResponse((Company) model);
                    break;
                case FEATURES:
                    objectResponse = new FeatureResponse((Feature) model);
                    break;
                case CAPABILITIES:
                    objectResponse = new CapabilityResponse((Capability) model);
                    break;
                case REQUIREMENTS:
                    objectResponse = new RequirementResponse((Requirement) model);
                    break;
                case RELEASES:
                    objectResponse = new ReleaseResponse((Release) model);
                    break;
                case MILESTONES:
                    objectResponse = new MilestoneResponse((Milestone) model);
                    break;
                case CAPABILITY:
                    objectResponse = new CapabilityTemplateResponse((CapabilityTemplate) model);
                    break;
                case REQUIREMENT:
                    objectResponse = new RequirementTemplateResponse((RequirementTemplate) model);
                    break;
            }
            objectResponseCollection.add(objectResponse);
        });

        return objectResponseCollection;
    }
}
