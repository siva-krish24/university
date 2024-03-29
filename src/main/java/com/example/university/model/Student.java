package com.example.university.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(nmae = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @ManyToMany(mappedBy = "students")
    @JsonIngoreProperties("students")
    private List<Course> Courses = new ArrayList<>();

    public Student() {

    }

    public student(int id, string name, String email,List<coures> coures) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courses = courses;
    }

    public int getStudentId() {
        teturn id;
    }

    public void set

    setStudentId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return name;
    }

    public void setStudentName(String name) {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        return courses;
    }

    public List<course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        return courses;
    }
}