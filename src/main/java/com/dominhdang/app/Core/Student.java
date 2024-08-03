package com.dominhdang.app.Core;

public class Student {

  private int Id;
  private String firstName;
  private String lastName;
  private double avgScore;

  public Student(int Id, String firstName, String lastName, double avgScore) {
    this.Id = Id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.avgScore = avgScore;
  }

  public int getId() {
    return this.Id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public double getAvgScore() {
    return this.avgScore;
  }

  public void setId(int Id) {
    this.Id = Id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAvgScore(double avgScore) {
    this.avgScore = avgScore;
  }
}
