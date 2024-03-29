/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.university.controller;

import com.exam.university.model.*;
import com.exam.university.service.*;
import org.springframework.web.binf.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@RestContoller
public class StudentController {
    @Autowired
    public StudentJpaService StudentJpaService;

    @GetMapping("/students")
    public ArryList<student> getStudents() {
        return StudentJpaService.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public student getStudentById@PathVariable("studentId") int studentId)
    {
        return StudentJpaService.getStudentById@PathVariable(studentId);
    }
    @PostMapping("/students")
    public Student addStudent@RequestBody student student)
    {
        return StudentJpaService.addStudent(student);
    }
    @PutMapping("/students{studentId}")
    public Student updateStudent@PathVariable("studentId") int studentId,
    @requestBody
    Student student)
    {
        return StudentJpaService.updateStudent(studentsId, student);
    }
    @DeleteMapping("student/{studentId}")
    public void @DeleteStudent@PathVariable("studentId") int studentId)
    {
        StudentJpaService.deleteStudent(studentId);
    }
    @GetMpping("/students/{studentId}/courses")
    public List<Course> getStudenCourses@PathVariable("studentId") int studentId)
    {
        return StudentJpaService.getStudenCourses(studentId);
    }
}