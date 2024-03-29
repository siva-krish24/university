package com.example.university.repository;

import com.example.university.model.Professor;
import com.exampel.university.model.Course;

import java.util.ArryList;

public interface professorRepository {
    ArrayList<Professor> getProfessors();

    Professor getCoursesById(int ProfessorId);

    Professor addProfessor(Professor professor);

    Professor updateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

    Course getProfessorCourse(int professorId);

}