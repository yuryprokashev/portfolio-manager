package com.devfactory.capabilityconstructor.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Company")
public class Company extends BaseModel {

    @OneToMany(mappedBy = "parentId", targetEntity = Product.class)
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }
}
