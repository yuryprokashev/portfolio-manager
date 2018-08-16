package com.devfactory.capabilityconstructor.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="Release")
public class Release extends ReleasableBaseModel {
    @OneToMany(mappedBy = "parentId", targetEntity = Milestone.class)
    private List<Milestone> milestoneList;
}
