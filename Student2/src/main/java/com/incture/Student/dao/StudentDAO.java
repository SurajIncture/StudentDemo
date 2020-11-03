package com.incture.Student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.Student.entity.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {

}
