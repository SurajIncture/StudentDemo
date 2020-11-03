package com.incture.Student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String instId;
	String instName;
	String courseId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", instId=" + instId + ", instName=" + instName + ", courseId=" + courseId
				+ "]";
	}
	
	
	
	

}
