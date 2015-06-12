package com.sunilp.web.controller;

import com.sunilp.web.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunilprakash on 10/6/15.
 */
@RestController
public class MessageController {

  @RequestMapping("/greet/{person}")
  public Message message(@PathVariable String person) {

    Message msg = new Message("Hello " + person);



    return msg;
  }

}
