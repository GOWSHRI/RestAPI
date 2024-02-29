package com.example.supermarket.model;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long userId;
    String userName;
    String emailAddress;
    Long superId;
    String gender;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="users_id")
    List<Supermarket>superMarket = new ArrayList<>();
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Long getSuperId() {
        return superId;
    }
    public void setSuperId(Long superId) {
        this.superId = superId;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Supermarket> getSupermarkets(){
        return superMarket;
    }
    public void setSuperMarket(List<Supermarket> superMarket){
        this.superMarket=superMarket;
    }
}