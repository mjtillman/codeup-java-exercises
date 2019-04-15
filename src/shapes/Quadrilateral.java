package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
  protected double width;
  protected double length;

  public Quadrilateral(double width, double length) {
    this.width = width;
    this.length = length;
  }
//
//  public Quadrilateral() {
//
//  }

  public abstract double widthSetter(double length);

  public abstract double lengthSetter(double width);

  public double widthGetter() {
    return width;
  }

  public double lengthGetter() {
    return length;
  }

  public double getPerimeter(double width, double length) {
    return 2 * (length + width);
  }

  public double getArea(double width, double length) {
    return length * width;
  }

}
