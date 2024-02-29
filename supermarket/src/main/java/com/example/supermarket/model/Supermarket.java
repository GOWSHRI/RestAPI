package com.example.supermarket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="supermarket")
public class Supermarket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long userId;
    String fruits;
    String vegetable;
    String cleaningandhousehold;
    String snacks;
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getFruits() {
        return fruits;
    }
    public void setFruits(String fruits) {
        this.fruits = fruits;
    }
    public String getvegetable() {
        return vegetable;
    }
    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }
    public String getcleaningandhousehold() {
        return cleaningandhousehold;
    }
    public void setCleaningandhousehold(String cleaningandhousehold) {
        this.cleaningandhousehold = cleaningandhousehold;
    }
    public String getsnacks() {
        return snacks;
    }
    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
    
}