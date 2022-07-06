package com.example.design.patterns.spring.factory.square;

import com.example.design.patterns.spring.factory.polygon.Polygon;

public class Square extends Polygon {

  protected Square(String name, Integer sides) {
    super(sides, name);
  }

}