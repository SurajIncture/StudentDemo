package com.incture.Student.service;

import java.util.List;

import com.incture.Student.entity.Course;

public interface CourseService {
	
	public void save(Course course);
	
	public List<Course> findAll();

}
