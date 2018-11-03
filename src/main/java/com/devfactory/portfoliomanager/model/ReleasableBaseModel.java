package com.devfactory.portfoliomanager.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class ReleasableBaseModel extends BaseModel {

    @Column(name = "release_date")
    private Date releaseDate;
}
