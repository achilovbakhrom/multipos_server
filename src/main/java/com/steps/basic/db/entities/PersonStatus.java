package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "personStatus")
public class PersonStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String statusId;

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public PersonStatus() {
    }
    public PersonStatus(String name) {
        this.name = name;
        statusId = UUID.randomUUID().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
