package com.exampel.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampel.university.model.*;

@Repository
public interface professorJPaRepository extends JpaRepository<Professor, Integer> {

}