package com.devfactory.capabilityconstructor.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

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
