package com.devfactory.portfoliomanager.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Product")
public class Product extends BaseModel {

    @OneToMany(mappedBy = "parentId", targetEntity = Feature.class)
    private List<Feature> featureList;

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }
}
