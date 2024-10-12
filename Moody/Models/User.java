package Moody.Models;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private int userID;
    private String bio;
    private String gender;
    private int age;
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
    public String getUsername() {
        return this.username;
    }

    public void setUserID(int uID) {
        this.userID = uID;
    }
    public int getUserID() {
        return this.userID;
    }

    public void setBio(String b) {
        this.bio = b;
    }
    public String getBio() {
        return this.bio;
    }

    public void setGender(String g) {
        this.gender = g;
    }
    public String getGender() {
        return this.gender;
    }

    public void setAge(int a) {
        this.age = a;
    }
    public int getAge() {
        return this.age;
    }

    public void setMood(String m) {
        this.mood = m;
    }
    public String getMood() {
        return this.mood;
    }
}