package GeometricObjects;

import java.io.Serializable;

public class Circle extends GeometricObject implements Serializable {

  public double getRadius() {
    return radius;
  }

  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }
}
