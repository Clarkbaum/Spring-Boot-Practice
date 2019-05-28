package com.spring.practice.SpringBootPractice.model;

import java.util.List;

public class Student {
    String id;
    String name;
    String description;
    List<Course> courses;

    public Student(String id, String name, String description, List<Course> courses){
        this.id = id;
        this.name = name;
        this.description = description;
        this.courses = courses;
    }

    public String getId(){ return this.id;}
    public String getName(){ return this.name;}
    public String getDescription(){ return this.description;}
    public List<Course> getCourses(){ return this.courses;}
}