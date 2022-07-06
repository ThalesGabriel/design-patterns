package com.example.design.patterns.spring.notification.square;

import com.example.design.patterns.spring.notification.NotificationErrorProps;
import com.example.design.patterns.spring.notification.polygon.PolygonValidator;

public class SquareValidator extends PolygonValidator<Square> {

  @Override
  protected void validate(Square object) {
    if (object.getSides() != 4)
      object.getNotification().add(new NotificationErrorProps("A square must have 4 sides", "square"));
  }
}
