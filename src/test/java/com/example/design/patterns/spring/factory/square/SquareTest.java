package com.example.design.patterns.spring.factory.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
  @Test
  void whenValidSquareIsCreatedItShouldGenerateNewInstance() {
    Square square = SquareFactory.create("Quadrado", 4);

    assertNotNull(square);
    assertEquals(4, square.getSides());
    assertEquals("Quadrado", square.getName());
  }

  @Test
  void whenInvalidSquareIsCreatedItThrowAnError() {
    assertThrows(Error.class, () -> SquareFactory.create("Quadrado", 2));
  }
}
