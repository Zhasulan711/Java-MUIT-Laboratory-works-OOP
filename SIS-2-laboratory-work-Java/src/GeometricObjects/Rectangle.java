package GeometricObjects;

import java.io.Serializable;

public class Rectangle extends GeometricObject implements Serializable {

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  private final double width;
  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }
}
