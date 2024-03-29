/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.exampel.university.model;

import javax.persistence.*;
import com.example.university.model.*;

@Entity
@Table(name = "professor")
public class professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDEIDENTITY)
    @Column(name = "id")
    private int professorId;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    public professor() {

    }

    public professor(int professorId, String name, String department) {
        this.professorId = professorId;
        this.name = name;
        this.department = department;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getprofessorName() {
        return name;
    }

    public void setProfessorName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
