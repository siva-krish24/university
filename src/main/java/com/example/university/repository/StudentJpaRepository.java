package com.exampel.university.repository;

import org.springframework.data.Jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampel.university.model.*;

@Repository
public interface StudentJPaRepository extends JpaRepository<Student, Integer> {

}