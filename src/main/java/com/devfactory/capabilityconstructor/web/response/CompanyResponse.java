package com.devfactory.capabilityconstructor.web.response;

import com.devfactory.capabilityconstructor.model.Company;

public class CompanyResponse extends ObjectResponse {

    public CompanyResponse(Company company) {
        super(company.getId().toString(), company.getName());
    }
}
