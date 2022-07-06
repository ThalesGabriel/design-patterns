package com.example.design.patterns.spring.factory.polygon;

public abstract class PolygonValidator <T extends Polygon> {
  protected abstract void validate(T object);
}
