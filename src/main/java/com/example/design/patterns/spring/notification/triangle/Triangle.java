package com.example.design.patterns.spring.notification.triangle;

import com.example.design.patterns.spring.notification.polygon.Polygon;

public class Triangle extends Polygon {

  public Triangle(Integer sides, String name) {
    super(sides, name);
  }

  public void validate() {
    new TriangleValidator().validate(this);
  }
}