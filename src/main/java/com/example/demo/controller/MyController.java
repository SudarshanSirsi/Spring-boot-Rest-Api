package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping("/home")
	public String home() {
		return "welcome to courses application";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.service.getCourses();
	}
	
	@GetMapping("/courses/{courseID}")
	public Course getCourse(@PathVariable String courseID) {
		return this.service.getCourseById(Long.parseLong(courseID));
		
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.service.addCourse(course);
	}
	
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course, @PathVariable String courseId) {
		return this.service.updateCourseById(course, Long.parseLong(courseId));
	}
	
	@DeleteMapping("courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId) {
		return this.service.deleteCourseById(Long.parseLong(courseId));
		
	}
	
	
	
	
	
}
