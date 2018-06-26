package com.spring.practice.SpringBootPractice.model;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class Data {

  private Integer result = 0;
  private String code = "+";
  private ArrayList<Integer> input = new ArrayList<>();

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void addInput(Integer value) {
    input.add(value);
  }

  public ArrayList<Integer> getInput() {
    return input;
  }
}
