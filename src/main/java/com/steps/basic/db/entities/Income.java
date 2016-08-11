package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = "incomes")
public class Income {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String incomeId;
    @Column
    private String nomenId;
    @Column
    private int incomeCount;
    @Column
    private Calendar incomeDate;
    @Column
    private String personId;

    public Income() {}

    public String getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId;
    }

    public Income(String personId, Calendar incomeDate, int incomeCount, String nomenId) {
        this.personId = personId;
        this.incomeDate = incomeDate;
        this.incomeCount = incomeCount;
        this.nomenId = nomenId;
    }

    public String getNomenId() {
        return nomenId;
    }

    public void setNomenId(String nomenId) {
        this.nomenId = nomenId;
    }

    public int getIncomeCount() {
        return incomeCount;
    }

    public void setIncomeCount(int incomeCount) {
        this.incomeCount = incomeCount;
    }

    public Calendar getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Calendar incomeDate) {
        this.incomeDate = incomeDate;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }}
