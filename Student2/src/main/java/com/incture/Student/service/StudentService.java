package com.incture.Student.service;

import java.util.List;

import com.incture.Student.entity.Student;

public interface StudentService {
	public void save(Student student);
	
	public List<Student>findAll();

}
