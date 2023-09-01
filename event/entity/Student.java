package com.problem.event.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
@Id
private Long studentId;
private String studentName;
@OneToOne(cascade =CascadeType.ALL)
private Address address;
public Long getStudentId() {
	return studentId;                   
}
public void setStudentId(Long studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Student(Long studentId, String studentName, Address address) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.address = address;
}
public Student() {
	super();
}

}
