package com.spring.practice.SpringBootPractice.repository;

import com.spring.practice.SpringBootPractice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringBootPracticeRepo extends JpaRepository<Student, Integer> {

}