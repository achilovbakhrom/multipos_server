package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String statusId;
    @Column
    private String address;
    @Column
    private String personId;
    @Column
    private String organization;
    @Column
    private String personPhoto;

    public Person() {
        personId = UUID.randomUUID().toString();
    }

    public Person(String personPhoto, String organization,
                  String address, String status, String name) {
        this.organization = organization;
        personId = UUID.randomUUID().toString();
        this.address = address;
        this.statusId = status;
        this.name = name;
        this.personPhoto = personPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getOrganization() {
        return organization;
    }

    public String getPersonPhoto() {
        return personPhoto;
    }

    public void setPersonPhoto(String personPhoto) {
        this.personPhoto = personPhoto;
    }

    public void setOrganization(String organization)  {
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
