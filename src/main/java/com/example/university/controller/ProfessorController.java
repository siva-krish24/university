package com.example.university.controller;

import com.example.university.model.*;

import com.example.university.service.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@RestController
public class ProfessorController {
    @Autowired
    public ProfessorJpaService ProfessorJpaService;

    @GetMapping("/professors")
    public ArrayList<professors> getProfessors() {
        return ProfessorJpaService.getProfessors();
    }

    @GetMapping("/professors/{professorid}/course")
    public List<Course> getProfessorsCourses@PathVariable("professorId") int professorId)
    {
        return ProfessorJpaService.getProfessorsCourses(professorId);

    }
    @GetMapping("/professors/{professorId}")
    public Professor getProfessorById@PathVariable("professorId") int professorId)
    {
        return professorJpaService.getProfessorById(professorId);
    }
    @PostMapping("/professors")
    public Professor addProfessor@RequestBody professor professor)
    {
        return ProfessorJpaService.addProfessor(professor);
    }
    @PutMapping("/professors/{professorId}")
    public Professor updateProfessor@PathVariable("professorId") int professorId,
    @RequsetBody
    professor professor)
    {
        return professorJpaService.updateProfessor(professorId, professor);
    }
    @DeleteMapping("/professors/{professorId}")
    public void dateteProfessor@PathVariable("professorId") int ProfessorId)
    {
        ProfessorJpaService.deleteprofessor(professorId);
    }

}