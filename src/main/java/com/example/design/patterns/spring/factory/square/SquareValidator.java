package com.example.design.patterns.spring.factory.square;

import com.example.design.patterns.spring.factory.polygon.PolygonValidator;

public class SquareValidator extends PolygonValidator<Square> {

  @Override
  protected void validate(Square object) {
    if (object.getSides() != 4)
      throw new Error("A square must have 4 sides");
  }
}
