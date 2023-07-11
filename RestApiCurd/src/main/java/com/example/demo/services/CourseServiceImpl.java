package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course>list;
	public CourseServiceImpl() {
		list=new ArrayList();
		list.add(new Course(145,"Java Core","This Course Contain Core Java"));
		list.add(new Course(146,"Java Advnce","This Course Contain Advance Java"));
		list.add(new Course(147,"Spring Core","This Course Contain Spring Core"));
		list.add(new Course(148,"SpringBoot Core","This Course Contain SpringBoot Core"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c =null;
		for (Course course : list) {
			if(course.getId() ==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}
	

}
