package com.example.design.patterns.spring.factory.polygon;

public abstract class Polygon {
  private Integer sides;
  private String name;

  public Polygon(Integer sides, String name) {
    this.sides = sides;
    this.name = name;
  }

  public Integer getSides() {
    return sides;
  }

  public void setSides(Integer sides) {
    this.sides = sides;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}