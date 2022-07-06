package com.example.design.patterns.spring.factory.triangle;

public class TriangleFactory {

  public static Triangle create(String name, Integer sides) {
    Triangle t = new Triangle(sides, name);
    new TriangleValidator().validate(t);
    return t;
  }

}