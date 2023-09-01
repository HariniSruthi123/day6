package com.problem.event.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.problem.event.entity.Student;
import com.problem.event.service.Studentservice;

import ch.qos.logback.classic.Logger;

@RestController
public class StudentController {
	Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class);
@Autowired
private Studentservice studentservice;
@PostMapping("/student")
public Student saveStudent(@RequestBody Student student)
{
	return studentservice.saveStudent(student);
}

@GetMapping(path="/loggerdemo")
	public String loggerDemo() {
		logger.info("Logger info");
		logger.warn("Logger warn");
		logger.error("logger error");
		return "Hello from logger demo";
	}
}
