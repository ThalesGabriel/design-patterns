package com.example.design.patterns.spring.factory.triangle;

import com.example.design.patterns.spring.factory.polygon.PolygonValidator;

public class TriangleValidator extends PolygonValidator<Triangle> {
  @Override
  protected void validate(Triangle object) {
    if (object.getSides() != 3)
      throw new Error("A square must have 3 sides");
  }
}