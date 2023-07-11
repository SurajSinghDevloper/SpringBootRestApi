package com.example.demo.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "This from Home Api";
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Course>getCourses(){
		System.out.println("Sending the Courses List....");
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseid}")
	public Course getCourse(@PathVariable String courseid) {
		System.out.println("Searching the Course by Id");
		return this.courseService.getCourse(Long.parseLong(courseid));
	}
	
	@PostMapping(path ="/courses",consumes = "application/json")
	public Course addCourse(@RequestBody Course course) {
		System.out.println("Data Adding....");
		return this.courseService.addCourse(course);
	}
}
