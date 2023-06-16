package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList();
		list.add(new Course(123, "Core java",
				"All core java concepts including object oriented programming concepts are there"));
		list.add(new Course(326, "Spring framework", "Spring IOC, Spring MVC and Spring Boot are there"));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

	@Override
	public Course getCourseById(long courseID) {
		Course c = null;
		for (Course course : list) {
			if (course.getId() == courseID) {
				c = course;
				break;
			}
		}
		return c;
	}

	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourseById(Course course, long parseLong) {
		for (Course course2 : list) {
			if (course2.getId() == course.getId()) {
				int i = list.indexOf(course2);
				list.set(i, course);
				break;
			}
		}
		return course;
	}

	public Course deleteCourseById(long id) {
		for (Course course : list) {
			if(course.getId()==id) {
				return list.remove(list.indexOf(course));
			}
		}
		return null;
	}

}
