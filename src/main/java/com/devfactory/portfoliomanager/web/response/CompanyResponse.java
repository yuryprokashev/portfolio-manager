package com.devfactory.portfoliomanager.web.response;

import com.devfactory.portfoliomanager.model.Company;

public class CompanyResponse extends ObjectResponse {

    public CompanyResponse(Company company) {
        super(company.getId().toString(), company.getName());
    }
}
