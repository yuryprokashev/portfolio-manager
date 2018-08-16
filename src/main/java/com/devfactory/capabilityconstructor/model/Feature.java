package com.devfactory.capabilityconstructor.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.UUID;

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
