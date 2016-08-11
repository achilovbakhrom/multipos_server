package com.steps.basic.db.entities;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String uid;
    @Column
    private String categoryName;
    @Column
    private String categoryParId;
    public Category() {
        uid = UUID.randomUUID().toString();
    }
    public Category(String categoryId, String categoryName, String categoryParId) {
        this.uid = categoryId;
        this.categoryName = categoryName;
        this.categoryParId = categoryParId;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryParId() {
        return categoryParId;
    }
    public void setCategoryParId(String categoryParId) {
        this.categoryParId = categoryParId;
    }
}
