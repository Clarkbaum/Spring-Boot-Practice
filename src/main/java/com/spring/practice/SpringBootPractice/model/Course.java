package com.spring.practice.SpringBootPractice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    private String id;
    private String name;
    private String description; 
    private List<String> steps;

    @JsonCreator
    public Course(@JsonProperty("id") String id, @JsonProperty("name") String name, 
    @JsonProperty("description") String description, @JsonProperty("steps")List<String> steps){
        this.id = id;
        this.name = name;
        this.description = description;
        this.steps = steps;
    }

    public String getId(){ return this.id;}
    public String getName(){ return this.name;}
    public String getDescription(){ return this.description;}
    public List<String> getSteps(){ return this.steps;}
    public void setId(String id){ this.id = id;}
}