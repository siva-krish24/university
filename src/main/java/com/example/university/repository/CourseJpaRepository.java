package com.exampel.university.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.Jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exampel.university.model.*;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {

}