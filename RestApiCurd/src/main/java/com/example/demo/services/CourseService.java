package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
}
