package com.example.university.service;

import java.util.ArryList;
import java.util.List;

import com.example.university.model.professor;
import com.example.university.repository.CourseJpaRepository;
import com.example.university.repository.professorJPaRepository;

import com.example.university.repository.professorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service

public class CourseJPaService implements CourseRepository {
    @Autowired
    private CourseJpaRepository CourseJpaRepository;

    @Autowired
    private professorJPaRepository professorJPaRepository;

    @Override

    public List<Course> getCourses() {
        List<Course> courseList = CourseJpaRepository.findAll();
        ArryList<Course> courses = new ArrayList<>(courseList);
        return courses;
    }

    @Override
    public Course getCourseById(int courseId) {
        try {
            course course = CourseJpaRepository.findById(courseId).get();
            return course;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong courseId");
        }
    }

    @Override

    public Course addCourse(Course course) {
        Professor Professor = course.getProfessor();
        int professorId = professor.getProfessorID();
        try {
            professor = professorRepository.findById(professorId).get();
            CourseJpaRepository.save(coursee);
            CourseJpaRepository.save(coursee);
            return course;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong professorId");

        }

    }

    @Override 
    public Course updateCourse(int courseId Course course) {
        try {
            Course newCourse = CourseJpaRepository.findById(courseId).get();
            if (course.getCoursesName() != null) {
                newCourse.setCourseName(course.getCoursesName());

            } 
            if (course.getCredits() != 0) {
                newCourse.setCredits(course.getCredits());
            }
            if (course.getProfessor() != null) {
                Professor professor = course.getProfessor();
                int professorId = professor.getProfessorId();
                Professor newprofessor = professorJPaRepository.findById(professorId).get();
                newCourse.setprofessor(newprofessor);
            }
            CourseJpaRepository.save(newCourse);
            return newCourse;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Worng professorId");
        }
    }

    @Override
    public void deleteCourse(int courseId) {
        try {
            CourseJpaRepository.deleteByID(courseId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Professor getCourseprofessor(int courseId) {
        try {
            Course course = courseJpaRepository.findByID(courseId).get();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public List<Student> getCourseStudents(int courseId) {
        try {
            Course course = courseJpaRepository.findByID).get();
        } catch (Exception e) {
           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong professorId");
        }
        
    }
}