package com.example.university.Repository;

import java.util.ArryList;
import java.util.List;

import com.example.university.model.Course;
import com.example.university.model.Student;

public interface StudentRepository {
    ArryList<Student> getStudent();

    Student addStudentById(int studentId);

    Student addStudent(Student, student);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

    List<Course> getStudentCourses(int studentId);

}