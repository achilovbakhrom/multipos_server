package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String uid;
    @Column
    private String name;
    @Column
    private int iconNumber;
    public Account() {
        uid = UUID.randomUUID().toString();
    }
    public Account(String name, int iconNumber) {
        this.name = name;
        this.iconNumber = iconNumber;
        uid = UUID.randomUUID().toString();
    }
    public String getUid() {
        return uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIconNumber() {
        return iconNumber;
    }
    public void setIconNumber(int iconNumber) {
        this.iconNumber = iconNumber;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
}
