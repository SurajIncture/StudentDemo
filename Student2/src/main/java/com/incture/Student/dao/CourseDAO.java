package com.incture.Student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.Student.entity.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Integer>{

}
