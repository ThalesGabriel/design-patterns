package com.example.design.patterns.spring.notification.triangle;

public class TriangleFactory {

  // TODO não permitir que um objeto seja instanciado se ele possui erros
  public static Triangle create(String name, Integer sides) {
    Triangle t = new Triangle(sides, name);
    new TriangleValidator().validate(t);
    return t;
  }

}