package com.spring.practice.SpringBootPractice.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String id;
    private String name;
    private String description;
    private List<Course> courses;

    @JsonCreator
    public Student(@JsonProperty("id") String id, @JsonProperty("name") String name,
            @JsonProperty("description") String description,
            @JsonProperty("courses") List<Course> courses) {
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
