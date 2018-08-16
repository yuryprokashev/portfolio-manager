package com.devfactory.capabilityconstructor.web.response;


import com.devfactory.capabilityconstructor.model.Product;

public class ProductResponse extends ObjectResponse {
    private String companyId;

    public ProductResponse(Product product) {
        super(product.getId().toString(), product.getName());
        this.companyId = product.getParentId().toString();
    }

    public String getCompanyId() {
        return companyId;
    }
}
