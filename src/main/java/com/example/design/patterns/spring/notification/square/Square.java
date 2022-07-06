package com.example.design.patterns.spring.notification.square;

import com.example.design.patterns.spring.notification.polygon.Polygon;

public class Square extends Polygon {

  protected Square(String name, Integer sides) {
    super(sides, name);
  }

}