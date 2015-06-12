package com.sunilp.web.model;

import java.util.Date;

/**
 * Created by sunilprakash on 10/6/15.
 */
public class Message {

  private String text;

  private Date createdDate;

  public Message(String text){
    this.text = text;
    this.createdDate = new Date();
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Date getCreatedDate() {
    return createdDate;
  }


}
