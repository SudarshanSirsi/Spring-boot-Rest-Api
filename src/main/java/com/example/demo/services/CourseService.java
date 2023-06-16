package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Course getCourseById(long parseLong);

	public Course addCourse(Course course);

	public Course updateCourseById(Course course, long parseLong);

	public Course deleteCourseById(long l);
}
