package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recking_debt_borrows")
public class ReckingDebtBorrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String reckingId;
    @Column
    private Double amount;
    @Column
    private String currencyId;
    @Column
    private String debtBorrowId;

    public ReckingDebtBorrow() {}

    public String getReckingId() {
        return reckingId;
    }

    public void setReckingId(String reckingId) {
        this.reckingId = reckingId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getDebtBorrowId() {
        return debtBorrowId;
    }

    public void setDebtBorrowId(String debtBorrowId) {
        this.debtBorrowId = debtBorrowId;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
