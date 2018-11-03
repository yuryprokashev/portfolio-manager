package com.devfactory.portfoliomanager.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "Template_Capability")
public class CapabilityTemplate extends BaseModel {

    @OneToMany(mappedBy = "parentId", targetEntity = RequirementTemplate.class)
    List<RequirementTemplate> requirementTemplateList;

}
