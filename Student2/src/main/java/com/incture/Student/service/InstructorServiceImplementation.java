package com.incture.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.Student.dao.InstructorDAO;
import com.incture.Student.entity.Instructor;

@Service
public class InstructorServiceImplementation implements InstructorService {

	
	@Autowired
	InstructorDAO instructorDAO;
	@Override
	public void save(Instructor instructor) {
		// TODO Auto-generated method stub
		instructorDAO.save(instructor);
		
	}

	@Override
	public List<Instructor> findAll() {
		// TODO Auto-generated method stub
		return instructorDAO.findAll();
	}

}
