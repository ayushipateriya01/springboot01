package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new Course(142,"Javacore","This is basic"));
		list.add(new Course(143,"Spring","This is advance api"));
		
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseID) {
		Course c=null;
		for(Course course:list)
			if(course.getId()==courseID) {
				c=course;
				break;
			}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course ;
	}

}
