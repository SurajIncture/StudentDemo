package com.incture.Student.service;

import java.util.List;

import com.incture.Student.entity.Instructor;

public interface InstructorService {
	
	public void save(Instructor instructor);
	
	public List<Instructor> findAll();

}
