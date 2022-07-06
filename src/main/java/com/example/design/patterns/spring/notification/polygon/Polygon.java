package com.example.design.patterns.spring.notification.polygon;

import com.example.design.patterns.spring.notification.INotification;
import com.example.design.patterns.spring.notification.Notification;

public abstract class Polygon {
  private Integer sides;
  private String name;
  private INotification notification;

  public Polygon(Integer sides, String name) {
    this.sides = sides;
    this.name = name;
    this.notification = new Notification();
  }

  public Integer getSides() {
    return sides;
  }

  public void setSides(Integer sides) {
    this.sides = sides;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public INotification getNotification() {
    return notification;
  }

  public void setNotification(INotification notification) {
    this.notification = notification;
  }
}