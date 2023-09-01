package com.problem.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.problem.event.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
