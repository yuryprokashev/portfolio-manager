package com.devfactory.capabilityconstructor.web.response;

import com.devfactory.capabilityconstructor.model.Feature;

public class FeatureResponse extends ObjectResponse {
    private String productId;
    public FeatureResponse(Feature model) {
        super(model.getId().toString(), model.getName());
        this.productId = model.getParentId().toString();
    }

    public String getProductId() {
        return productId;
    }
}
