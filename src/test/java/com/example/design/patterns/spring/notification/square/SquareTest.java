package com.example.design.patterns.spring.notification.square;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class SquareTest {

  private final static String expectedErrorSquare = "[square]: A square must have 4 sides";

  @Test
  void whenInvalidSquareIsCreatedItShouldContainErrors() {
    Square square = SquareFactory.create("Quadrado", 3);

    assertNotNull(square);
    assertTrue(square.getNotification().hasErrors());
    assertEquals(expectedErrorSquare, square.getNotification().messages(""));

  }

}
