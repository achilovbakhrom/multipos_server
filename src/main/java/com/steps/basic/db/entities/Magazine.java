package com.steps.basic.db.entities;
import javax.persistence.*;
import java.util.UUID;
@Entity
@Table(name = "magazines")
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String magazineId;
    public Magazine(String name) {
        this.name = name;
        magazineId = UUID.randomUUID().toString();
    }
    public Magazine() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMagazineId() {
        return magazineId;
    }
    public void setMagazineId(String magazineId) {
        this.magazineId = magazineId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
