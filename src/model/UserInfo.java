package model;

import java.io.Serializable;

public class Userinfo implements Serializable{
  private String name;
  private String pass;
  
  public UserInfo() {
    ;
  }
  
  public UserInfo(
      String name,
      String pass) {
    this.name = name;
    this.pass = pass;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getPass() {
    return this.pass;
  }
}
