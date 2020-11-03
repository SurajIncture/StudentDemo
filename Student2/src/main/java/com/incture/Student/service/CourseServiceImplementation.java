package com.incture.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.Student.dao.CourseDAO;
import com.incture.Student.entity.Course;

@Service
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
	CourseDAO courseDAO;

	@Override
	public void save(Course course) {

		courseDAO.save(course);
	}

	@Override
	public List<Course> findAll() {
		
		return courseDAO.findAll();
	}

}
