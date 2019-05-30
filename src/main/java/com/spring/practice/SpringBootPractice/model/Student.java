package com.spring.practice.SpringBootPractice.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String name;
	private String description;
	private List<Course> courses;

	public Student(String id, String name, String description, List<Course> courses) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.courses = courses;
	}


	@JsonCreator
	public Student(@JsonProperty("id") String id, @JsonProperty("name") String name,
			@JsonProperty("description") String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.courses = null;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public List<Course> getCourses() {
		return this.courses;
	}
}
