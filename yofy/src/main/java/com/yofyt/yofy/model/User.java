package com.yofyt.yofy.model;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import lombok.Setter;
import lombok.Getter;

@Setter @Getter
public class User {
    @Getter
    private String username;
    @Getter
    private int userID;
    @Getter @Setter
    private String bio;
    @Getter @Setter
    private String gender;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private String mood;
    List<String> medicalHistory = new ArrayList<>();

    public User(String u, int id, String b, String g, int a, String m) {
        this.username = u;
        this.userID = id;
        this.bio = b;
        this.gender = g;
        this.age = a;
        this.mood = m;
    }

    public void setUsername(String u) {
        // Maybe make function to check to see if the username is taken.
        this.username = u;
    }
}
