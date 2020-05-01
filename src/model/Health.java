package model;

import java.io.Serializable;

public class Health implements Serializable {
  private double height;
  private double weight;
  private double bmi;
  private String bodyType;

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getBmi() {
    return this.bmi;
  }

  public String getBodyType() {
    return this.bodyType;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setHWeight(double weight) {
    this.weight = weight;
  }

  public void setBmi(double bmi) {
    this.bmi = bmi;
  }

  public void setBodyType(String bodyType) {
    this.bodyType = bodyType;
  }
}
