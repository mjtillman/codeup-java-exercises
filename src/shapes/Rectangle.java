package shapes;

class Rectangle extends Quadrilateral {

  public Rectangle(double length, double width) {
    super(length, width);
  };

  public double lengthSetter(double length) {
    return this.length;
  }

  public double widthSetter(double width) {
    return this.width;
  }


  public double widthGetter() {
    return width;
  }

  public double lengthGetter() {
    return length;
  }

  public double getPerimeter() {

    return 2 * (length + width);
  }

  public double getArea() {

    return length * width;
  }

//
//  public Rectangle() {
//
//  }
//
//  public double widthSetter() {
//    return super.width;
//  }
//
//  public double lengthSetter() {
//    return super.length;
//  }
//
//  public double getPerimeter();
//
//  public double getArea() {
//
//  }
}