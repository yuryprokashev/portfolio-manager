package com.devfactory.portfoliomanager.web.response;


import com.devfactory.portfoliomanager.model.Product;

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
