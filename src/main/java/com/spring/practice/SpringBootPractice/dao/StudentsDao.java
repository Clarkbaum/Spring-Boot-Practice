package com.spring.practice.SpringBootPractice.dao;

import java.util.ArrayList;
import java.util.Optional;
import com.spring.practice.SpringBootPractice.model.Student;

public class StudentsDao implements Dao<Student> {

	@Override
	public Optional<Student> get(int id) {
		return null;
	}

	@Override
	public ArrayList<Student> getAll() {
		return null;
	}

	@Override
	public void save(Student t) {

	}

	@Override
	public void update(Student t) {

	}
}
