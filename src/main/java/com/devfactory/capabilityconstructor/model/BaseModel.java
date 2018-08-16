package com.devfactory.capabilityconstructor.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.UUID;

@MappedSuperclass
public class BaseModel implements Model {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "BINARY(16)")
    private UUID id;

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @Column(name = "parent_id")
    private UUID parentId;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }
}
