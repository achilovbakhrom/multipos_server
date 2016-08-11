package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "nomenclatures")
public class Nomenklatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomenId;
    @Column
    private String nomenName;
    @Column
    private double buy;
    @Column
    private String buyCurrency;
    @Column
    private String cellCurrency;
    @Column
    private double cell;
    @Column
    private String categoryId;
    @Column
    private String country;
    @Column
    private String person;
    @Column
    private String shtrixCode;

    public String getShtrixCode() {
        return shtrixCode;
    }

    public void setShtrixCode(String shtrixCode) {
        this.shtrixCode = shtrixCode;
    }

    public Nomenklatura() {
        nomenId = UUID.randomUUID().toString();
    }

    public String getNomenId() {
        return nomenId;
    }

    public void setNomenId(String nomenId) {
        this.nomenId = nomenId;
    }

    public String getNomenName() {
        return nomenName;
    }

    public void setNomenName(String nomenName) {
        this.nomenName = nomenName;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public String getBuyCurrency() {
        return buyCurrency;
    }

    public void setBuyCurrency(String buyCurrency) {
        this.buyCurrency = buyCurrency;
    }

    public String getCellCurrency() {
        return cellCurrency;
    }

    public void setCellCurrency(String cellCurrency) {
        this.cellCurrency = cellCurrency;
    }

    public double getCell() {
        return cell;
    }

    public void setCell(double cell) {
        this.cell = cell;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
