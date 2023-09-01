package com.problem.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.problem.event.entity.Student;
import com.problem.event.repository.StudentRepository;

@Service
public class Studentservice {
@Autowired
private StudentRepository studentRepository;
public Student saveStudent(Student student)
{
	return studentRepository.save(student);
}




}
