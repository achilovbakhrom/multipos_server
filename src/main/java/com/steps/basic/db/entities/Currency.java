package com.steps.basic.db.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "currencies")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String sign;
    @Column
    private String uid;
    @Column
    private boolean mainCurrency;
    @Column
    public String accountUid;

    public String getAccountUid() {
        return accountUid;
    }

    public boolean isMainCurrency() {
        return mainCurrency;
    }

    public void setMainCurrency(boolean mainCurrency) {
        this.mainCurrency = mainCurrency;
    }

    public void setAccountUid(String accountUid) {
        this.accountUid = accountUid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String id) {
        this.uid = id;
    }
    public Currency() {
        super();
        uid = UUID.randomUUID().toString();
    }
    public Currency(String name, String sign, String accountId, boolean isMain) {
        super();
        this.name = name;
        this.sign = sign;
        uid = UUID.randomUUID().toString();
        this.accountUid = accountId;
        this.mainCurrency = isMain;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}