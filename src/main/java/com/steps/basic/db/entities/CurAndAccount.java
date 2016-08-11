package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "cur_account")
public class CurAndAccount {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String curAcId;
    @Column
    private String acId;
    @Column
    private String curId;

    public CurAndAccount(String acId, String curId) {
        this.acId = acId;
        this.curId = curId;
        curAcId = UUID.randomUUID().toString();
    }

    public CurAndAccount() {
        curAcId = UUID.randomUUID().toString();
    }

    public String getCurAcId() {
        return curAcId;
    }

    public void setCurAcId(String curAcId) {
        this.curAcId = curAcId;
    }

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId;
    }

    public String getCurId() {
        return curId;
    }

    public void setCurId(String curId) {
        this.curId = curId;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}