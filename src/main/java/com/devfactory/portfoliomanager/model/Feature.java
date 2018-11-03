package com.devfactory.portfoliomanager.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Feature")
public class Feature extends BaseModel {

    @OneToMany(mappedBy = "parentId", targetEntity = Capability.class)
    private List<Capability> capabilityList;

    public List<Capability> getCapabilityList() {
        return capabilityList;
    }

    public void setCapabilityList(List<Capability> capabilityList) {
        this.capabilityList = capabilityList;
    }
}
