package com.example.College.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String collegeAdmin;
    private String collegeName;
    private String location;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCollegeAdmin() {
        return collegeAdmin;
    }

    public void setCollegeAdmin(String collegeAdmin) {
        this.collegeAdmin = collegeAdmin;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

