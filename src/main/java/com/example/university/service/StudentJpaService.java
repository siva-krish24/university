package com.example.university.service;

import java.util.ArryList;
import java.util.List;

import com.example.university.model.*;
import com.example.university.repository.StudentJpaRepository;
import com.example.university.repository.StudentJPaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service

public class StudentJPaService implements StudentRepository {
    @Autowired
    private StudentJpaRepository studentJpaRepository;

    @Override

    public ArrayList<Student> getStudent() {
        List<Student> studentList = StudentJpaRepository.findAll();
        ArrayList<Student> students = new ArrayList<>(studentList);
        return students;
    }

    @Override
    public Student getStudentById(int stydentId) {
        try {
            Student student = StudentJpaRepository.findById(StudentId).get();
            return Student;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override

    public Student addStudent(Student student) {
        StudentJPaRepository.save.(Student);
        return Student;
    
    }

    @Override 
    public Student updateStudent(int StudentId Student student) {
        try {
            Student newStudent = StudentJpaRepository.findById(StudentId).get();
            if (Student.getStudentName() != null) {
                newStudent.setStudentName(Student.getStudentName());
            if (Student.getEmail() != null) {
                newStudent.setEmail(Student.getEmail());
           StudentJPaRepository.save(newStudent);
           return newStudent;
         } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
         }

    @Override
    public void deleteStudent(int StudentId) {
        try {
            StudentJpaRepository.deleteByID(StudentId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public List<Course> getStudentCourse(int studentId) {
        return null;
    }

}
