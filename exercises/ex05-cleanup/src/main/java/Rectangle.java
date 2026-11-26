/**
 * Represents a rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle.
   *
   * @param w the width of the new rectangle
   * @param h the height of the new rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area of the rectangle.
   *
   * @return the calculated area
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor to scale the rectangle by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Checks whether this rectangle is larger than another.
   *
   * @param other the rectangle being compared to
   * @return a boolean representing whether this rectangle is larger than the other
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
