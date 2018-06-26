package com.spring.practice.SpringBootPractice.controller;

import com.spring.practice.SpringBootPractice.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SBPController {

  @Autowired
  private Data data;

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String hello() {
    data.setResult(4);
    return "hello you hit root: " + data.getResult() + "!";
  }

  @RequestMapping(path="/add", method = RequestMethod.GET)
  public String add() {
    data.setResult(data.getResult() + 5);
    return "hello you hit /add: " + data.getResult() + "!";
  }

  @RequestMapping(path="/sub", method=RequestMethod.GET)
  public String sub() {
    data.setResult(data.getResult() - 5);
    return "hello you hit /sub: " + data.getResult() + "!";
  }
}
