package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userID")

    @GeneratedValue
    private int userID;

    @Column(name = "user_name")
    private String userName;

    // Constructor
    public User() {
    }

    public User(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }

    // Getters

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    // Setters
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
