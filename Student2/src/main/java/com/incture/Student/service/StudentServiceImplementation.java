package com.incture.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.Student.dao.StudentDAO;
import com.incture.Student.entity.Student;

@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	public StudentServiceImplementation(StudentDAO theStudentDAO){
		studentDAO = theStudentDAO;
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		
		studentDAO.save(student);
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}


}
