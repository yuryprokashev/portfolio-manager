package com.devfactory.portfoliomanager.gateway;

import com.devfactory.portfoliomanager.model.*;
import com.devfactory.portfoliomanager.web.request.Request;
import com.devfactory.portfoliomanager.web.request.ResourceName;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GatewayFactory {
    private Map<ResourceName, Class> resourceNameToModelClassMap;
    private SessionFactory sessionFactory;
    private CriteriaFactory criteriaFactory;

    @Autowired
    public GatewayFactory(SessionFactory sessionFactory, CriteriaFactory criteriaFactory) {
        this.resourceNameToModelClassMap = new HashMap<>();
        this.resourceNameToModelClassMap.put(ResourceName.PRODUCTS, Product.class);
        this.resourceNameToModelClassMap.put(ResourceName.COMPANIES, Company.class);
        this.resourceNameToModelClassMap.put(ResourceName.FEATURES, Feature.class);
        this.resourceNameToModelClassMap.put(ResourceName.CAPABILITIES, Capability.class);
        this.resourceNameToModelClassMap.put(ResourceName.REQUIREMENTS, Requirement.class);
        this.resourceNameToModelClassMap.put(ResourceName.RELEASES, Release.class);
        this.resourceNameToModelClassMap.put(ResourceName.MILESTONES, Milestone.class);
        this.resourceNameToModelClassMap.put(ResourceName.CAPABILITY, CapabilityTemplate.class);
        this.resourceNameToModelClassMap.put(ResourceName.REQUIREMENT, RequirementTemplate.class);
        this.sessionFactory = sessionFactory;
        this.criteriaFactory = criteriaFactory;
    }

    public Gateway create(Request request) {
        Gateway gateway = null;
        Class modelClass = this.resourceNameToModelClassMap.get(request.getResourceName());
        switch (request.getType()) {
            case READ_COLLECTION:
                gateway = new ReadCollectionGateway(modelClass, this.sessionFactory, this.criteriaFactory);
                break;
            case ADD_OBJECT_TO_COLLECTION:
                break;
            case UPDATE_OBJECT:
                break;
            case CONSUME_OBJECT:
                break;
            case DELETE_OBJECT:
                break;
        }
        return gateway;
    }
}
