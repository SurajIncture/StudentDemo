package com.incture.Student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.Student.entity.Instructor;

@Repository
public interface InstructorDAO extends JpaRepository<Instructor, Integer> {

}
