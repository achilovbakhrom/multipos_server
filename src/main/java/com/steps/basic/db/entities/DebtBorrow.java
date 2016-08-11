package com.steps.basic.db.entities;


import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "debt_borrows")
public class DebtBorrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String debtBorrowId;
    @Column
    private String nomenId;
    @Column
    private double count;
    @Column
    private Calendar currentDate;
    @Column
    private Calendar returnDate;
    @Column
    private String personId;

    public DebtBorrow() {}

    public DebtBorrow(String nomenId, double count, Calendar currentDate, Calendar returnDate, String personId) {
        this.nomenId = nomenId;
        this.count = count;
        this.currentDate = currentDate;
        this.returnDate = returnDate;
        this.personId = personId;
    }

    public String getDebtBorrowId() {
        return debtBorrowId;
    }

    public void setDebtBorrowId(String debtBorrowId) {
        this.debtBorrowId = debtBorrowId;
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

    public Calendar getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Calendar currentDate) {
        this.currentDate = currentDate;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
