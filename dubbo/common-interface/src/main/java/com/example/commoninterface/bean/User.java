package com.example.commoninterface.bean;

import java.io.Serializable;

/**
 * @author hongchanglin
 * @date 2022年09月02日 01:48
 */
public class User implements Serializable {

  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
