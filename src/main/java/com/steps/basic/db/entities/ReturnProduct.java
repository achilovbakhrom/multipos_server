package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "return_products")
public class ReturnProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String returnId;
    @Column
    private String nomenId;
    @Column
    private double count;
    @Column
    private Calendar date;
    @Column
    private String personId;
    public ReturnProduct() {}
    public ReturnProduct(String nomenId, double count, Calendar date, String personId) {
        this.nomenId = nomenId;
        this.count = count;
        this.date = date;
        this.personId = personId;
    }
    public String getReturnId() {
        return returnId;
    }
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
    public String getNomenId() {
        return nomenId;
    }
    public void setNomenId(String nomenId) {
        this.nomenId = nomenId;
    }
    public double getCount() {
        return count;
    }
    public void setCount(double count) {
        this.count = count;
    }
    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
}
