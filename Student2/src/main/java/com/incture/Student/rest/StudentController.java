package com.incture.Student.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.Student.entity.Course;
import com.incture.Student.entity.Instructor;
import com.incture.Student.entity.Student;
import com.incture.Student.service.CourseService;
import com.incture.Student.service.InstructorService;
import com.incture.Student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private InstructorService instructorService;
	
	@Autowired
	public StudentController(StudentService theStudentService, CourseService theCourseService, InstructorService theInstructorService) {
		
		studentService = theStudentService;
		courseService = theCourseService;
		instructorService = theInstructorService;
	}
	
	@GetMapping("/trial")
	public String trial(){
		return "TRIAL";
	}
	
	@GetMapping("/allStudents")
	public List<Student>getAllStd(){
		return studentService.findAll();
	}
	
	@GetMapping("/allCourses")
	public List<Course>getAllCourse(){
		return courseService.findAll();
	}
	
	@GetMapping("/allInstructors")
	public List<Instructor>getAllInstructor(){
		return  instructorService.findAll();
	}
	
	@PostMapping("/createNewStudent")
	public String addNewStd(@RequestBody Student theStudent){
		
		try{
			theStudent.setId(0);
			studentService.save(theStudent);
			return "SUCCESS";
		}
		catch(Exception e){
			e.printStackTrace();
			return "FAIL";
		}
	}
	
	@PostMapping("createNewCourse")
	public String addNewCourse(@RequestBody Course theCourse){
		try{
			theCourse.setId(0);
			courseService.save(theCourse);
			return "SUCCESS";
		}
		catch(Exception e){
			e.printStackTrace();
			return "FAILED";
		}
	}
	
	@PostMapping("createNewInstructor")
	public String addNewInstructor(@RequestBody Instructor theInstructor){
		try{
			theInstructor.setId(0);
			instructorService.save(theInstructor);
			return "SUCCESS";
		}
		catch(Exception e){
			e.printStackTrace();
			return "FAILED";
		}
	}


}
