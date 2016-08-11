package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "expanses")
public class Expance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String expanceId;
    @Column
    private String nomenId;
    @Column
    private int count;
    @Column
    private Calendar expanceDate;
    @Column
    private double sale;
    @Column
    private String personId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Expance() {}

    public Expance(String expanceId, String nomenId, int count, Calendar expanceDate, double sale) {
        this.expanceId = expanceId;
        this.nomenId = nomenId;
        this.count = count;
        this.expanceDate = expanceDate;
        this.sale = sale;
    }

    public String getExpanceId() {
        return expanceId;
    }

    public void setExpanceId(String expanceId) {
        this.expanceId = expanceId;
    }

    public String getNomenId() {
        return nomenId;
    }

    public void setNomenId(String nomenId) {
        this.nomenId = nomenId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Calendar getExpanceDate() {
        return expanceDate;
    }

    public void setExpanceDate(Calendar expanceDate) {
        this.expanceDate = expanceDate;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
