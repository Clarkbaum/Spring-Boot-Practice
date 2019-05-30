package com.spring.practice.SpringBootPractice.dao;

import java.util.ArrayList;
import java.util.Optional;

//not sure if i want this yet
public interface Dao<T> {
	Optional<T> get(int id);
	ArrayList<T> getAll();
	void save(T t);
	void update(T t);
}