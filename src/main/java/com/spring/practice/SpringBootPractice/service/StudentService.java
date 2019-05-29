package com.spring.practice.SpringBootPractice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.spring.practice.SpringBootPractice.model.Course;
import com.spring.practice.SpringBootPractice.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private static List<Student> students = new ArrayList<>();

	static {
		// Initialize Data
		Course course1 = new Course("Course1", "Spring", "10 Steps",
				Arrays.asList("Learn Maven", "Import Project", "First Example", "Second Example"));
		Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
				Arrays.asList("Learn Maven", "Import Project", "First Example", "Second Example"));
		Course course3 =
				new Course("Course3", "Spring Boot", "6K Students", Arrays.asList("Learn Maven",
						"Learn Spring", "Learn Spring MVC", "First Example", "Second Example"));
		Course course4 = new Course("Course4", "Maven", "Most popular maven course on internet!",
				Arrays.asList("Pom.xml", "Build Life Cycle", "Parent POM", "Importing into Eclipse"));

		Student ranga = new Student("Student1", "Ranga Karanam", "Hiker, Programmer and Architect",
				new ArrayList<>(Arrays.asList(course1, course2, course3, course4)));

		Student satish = new Student("Student2", "Satish T", "Hiker, Programmer and Architect",
				new ArrayList<>(Arrays.asList(course1, course2, course3, course4)));

		students.add(ranga);
		students.add(satish);
	}

	// - Retrieve details for all students
	public List<Student> retrieveAllStudents() {
		return students;
	}

	// - Retrieve a specific student details
	public Student retrieveStudent(String studentId) {
		for (Student student : students) {
			if (student.getId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

	// - Retrieve all courses a student is registered for
	public List<Course> retrieveCourses(String studentId) {
		for (Student student : students) {
			if (student.getId().equals(studentId)) {
				return student.getCourses();
			}
		}
		return null;
	}

	// - Retrieve details of a specific course a student is registered for
	public Course retrieveCourse(String studentId, String courseId) {
		List<Course> courses = retrieveCourses(studentId);
		for (Course course : courses) {
			if (course.getId().equals(courseId)) {
				return course;
			}
		}
		return null;
	}

	// - Add a course to an existing student
	public Course addCourse(String studentId, Course course) {
		Student student = retrieveStudent(studentId);

		if (student == null)
			return null;

		student.getCourses().add(course);

		return course;
	}

	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}
}
