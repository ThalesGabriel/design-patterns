package com.example.design.patterns.spring.factory.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

  @Test
  void whenValidTriangleIsCreatedItShouldGenerateNewInstance() {
    Triangle triangle = TriangleFactory.create("Triangulo", 3);

    assertNotNull(triangle);
    assertEquals(3, triangle.getSides());
  }

  @Test
  void whenInvalidTriangleIsCreatedItThrowAnError() {
    assertThrows(Error.class, () -> TriangleFactory.create("Triangulo", 2));
  }
}
