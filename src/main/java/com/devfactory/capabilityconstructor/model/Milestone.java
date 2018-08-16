package com.devfactory.capabilityconstructor.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "Milestone")
public class Milestone extends ReleasableBaseModel {

    @OneToMany(mappedBy = "milestoneId", targetEntity = Capability.class)
    private List<Capability> capabilityList;
}
