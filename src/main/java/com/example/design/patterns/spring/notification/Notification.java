package com.example.design.patterns.spring.notification;

import java.util.ArrayList;

public class Notification implements INotification {

  private ArrayList<NotificationErrorProps> errors = new ArrayList<NotificationErrorProps>();

  @Override
  public void add(NotificationErrorProps error) {
    this.errors.add(error);
  }

  @Override
  public boolean hasErrors() {
    return this.errors.size() > 0;
  }

  @Override
  public ArrayList<NotificationErrorProps> get() {
    return this.errors;
  }

  @Override
  public String messages(String context) {
    String message = "";
    for (NotificationErrorProps error: this.errors) {
      if (context.isEmpty() || error.context() == context)
        message = message.concat(String.format("[%s]: %s", error.context(), error.message()));
    }
    return message;
  }
}
