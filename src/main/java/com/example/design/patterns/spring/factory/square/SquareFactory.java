package com.example.design.patterns.spring.factory.square;

public class SquareFactory {
  public static Square create(String name, Integer sides) {
    Square s = new Square(name, sides);
    new SquareValidator().validate(s);
    return s;
  }
}