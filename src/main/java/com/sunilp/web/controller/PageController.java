package com.sunilp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sunilprakash on 10/6/15.
 */
@Controller
public class PageController {

  @RequestMapping(value = "/home" , method = RequestMethod.GET)
  public String home() {
    System.out.println("queried for index");
    return "index";
  }

}
