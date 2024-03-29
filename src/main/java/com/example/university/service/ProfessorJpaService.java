package com.example.university.service;

import java.util.ArryList;
import java.util.List;

import com.example.university.model.*;

import com.example.university.repository.ProfessorJpaRepository;
import com.example.university.repository.ProfessorJPaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service

public class ProfessorJPaService implements professorRepository {
    @Autowired
    private CourseJpaRepository professorJpaRepository;

    @Autowired
    private professorJPaRepository professorJPaRepository;

    @Override

    public ArrayList<Professor> getProfessor() {
        List<Professor> professorList = ProfessorJpaRepository.findAll();
        ArryList<Professor> professor = new ArrayList<>(professorList);
        return professor;
    }

    @Override
    public professor getProfessorById(int professorId) {
        try {
            Professor professor = professorJpaRepository.findById(professorId).get();
            return Professor;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override

    public Professor addProfessor(Professor professor) {
        professorJpaRepository.save(Professor);
        return professor;

    }

    @Override
    public Professor updateProfessor(int ProfessorId, Professor professor) {
        try {
            Professor newProfessor = ProfessorJpaRepository.findById(ProfessorId).get();
            if (course.getCoursesName() != null) {
                newProfessor.setProfessor(Professor.getProfessorName());

            }
            if (Professor.getDepartment() != null) {
                newProfessor.setDepartment(Professor.getDepartment());
            }
            ProfessorJpaRepository.save(newProfessor);
            return newProfessor;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteProfessor(int ProfessorId) {
        try {
            ProfessorJpaRepository.deleteByID(ProfessorId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Course getProfessorCourse(int professorId) {
        // TODO Auto-generated method stub
        return null;
    }

}