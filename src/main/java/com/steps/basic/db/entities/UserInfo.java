package com.steps.basic.db.entities;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String eMail;
    @Column
    private String mode;
    @Column
    private String uid;
    @Column
    private String fcmToken;
    @ElementCollection
    private List<SimpleGrantedAuthority> authorities;
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserInfo() {
        this.username = "";
        this.password = "";
        this.authorities = new ArrayList<SimpleGrantedAuthority>();
    }
    public UserInfo(String username, String password, List<SimpleGrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }
    public String getMode() {return mode;}
    public void setMode(String mode) {this.mode = mode;}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getUid() {return uid;}
    public void setUid(String uid) {
        this.uid = uid;
    }
    public void generateUid() {
        this.uid = UUID.randomUUID().toString();
    }
    public String getFcmToken() {
        return fcmToken;
    }
    public void setFcmToken(String fcmToken) {
        this.fcmToken = fcmToken;
    }
    public void setAuthorities(List<SimpleGrantedAuthority> authorities) {
        this.authorities = authorities;
    }
    public void addAuthority(SimpleGrantedAuthority authority) {
        authorities.add(authority);
    }

    public List<SimpleGrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
