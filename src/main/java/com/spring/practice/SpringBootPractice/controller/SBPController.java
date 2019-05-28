package com.spring.practice.SpringBootPractice.controller;

import java.util.List;

import com.spring.practice.SpringBootPractice.model.Course;
import com.spring.practice.SpringBootPractice.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SBPController {

  @Autowired
  private StudentService studentService;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String hello() {
    return "hello you hit root: " ;
  }

  @RequestMapping(path = "/students/{studentId}/courses", method = RequestMethod.GET)
  public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
    return studentService.retrieveCourses(studentId);
  }

  @RequestMapping(path = "/students/{studentId}/courses/{courseId}", method = RequestMethod.GET)
  public Course retrieveDetailsForCourse(@PathVariable String studentId, @PathVariable String courseId) {
    return studentService.retrieveCourse(studentId, courseId);
  }
}
