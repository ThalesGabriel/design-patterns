package com.example.design.patterns.spring.notification.triangle;

import com.example.design.patterns.spring.factory.triangle.Triangle;
import com.example.design.patterns.spring.factory.triangle.TriangleFactory;
import com.example.design.patterns.spring.notification.square.Square;
import com.example.design.patterns.spring.notification.square.SquareFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

  private final static String expectedErrorSquare = "[triangle]: A triangle must have 3 sides";

  @Test
  void whenInvalidTriangleIsCreatedItShouldContainErrors() {
    Square square = SquareFactory.create("Triangulo", 2);

    assertNotNull(square);
    assertTrue(square.getNotification().hasErrors());
    assertEquals(expectedErrorSquare, square.getNotification().messages(""));

  }
}
