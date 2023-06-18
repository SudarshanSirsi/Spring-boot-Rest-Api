package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}

	@Override
	public Course getCourseById(long courseID) {
		return courseDao.findById(courseID).get();
	}

	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourseById(Course course, long parseLong) {

		courseDao.save(course);
		return course;
	}

	public Course deleteCourseById(long id) {
		Course entity = courseDao.getReferenceById(id);
		courseDao.delete(entity);
		return entity;
	}

}
