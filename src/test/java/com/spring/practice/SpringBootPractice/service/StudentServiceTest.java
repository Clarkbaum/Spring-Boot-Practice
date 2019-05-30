package com.spring.practice.SpringBootPractice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import com.spring.practice.SpringBootPractice.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

	@Autowired
	private StudentService studentService;

	@Test
	public void retrieveAllStudentstest() {
		List<Student> students = studentService.retrieveAllStudents();
		assertEquals("Student1", students.get(0).getId());
		assertEquals("Student2", students.get(1).getId());
	}
}