package com.example.design.patterns.spring.notification.square;

public class SquareFactory {

  // TODO não permitir que um objeto seja instanciado se ele possui erros
  public static Square create(String name, Integer sides) {
    Square s = new Square(name, sides);
    new SquareValidator().validate(s);
    return s;
  }
}