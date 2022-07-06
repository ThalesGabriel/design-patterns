package com.example.design.patterns.spring.notification;

import java.util.ArrayList;

public interface INotification {
  void add(NotificationErrorProps error);
  boolean hasErrors();
  ArrayList<NotificationErrorProps> get();
  String messages(String context);
}
