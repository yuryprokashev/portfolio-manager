package com.devfactory.capabilityconstructor.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity(name = "Capability")
public class Capability extends BaseModel {

    @Column(name = "milestone_id")
    private UUID milestoneId;

    @OneToMany(mappedBy = "parentId", targetEntity = Requirement.class)
    private List<Requirement> requirementList;

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }
}
