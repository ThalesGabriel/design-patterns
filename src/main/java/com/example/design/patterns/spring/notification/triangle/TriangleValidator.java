package com.example.design.patterns.spring.notification.triangle;

import com.example.design.patterns.spring.notification.NotificationErrorProps;
import com.example.design.patterns.spring.notification.polygon.PolygonValidator;

public class TriangleValidator extends PolygonValidator<Triangle> {
  @Override
  protected void validate(Triangle object) {
    if (object.getSides() != 3)
      object.getNotification().add(new NotificationErrorProps("A square must have 3 sides", "triangle"));
  }
}