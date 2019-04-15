package shapes;

class Square extends Rectangle {

  public Square(double side) {
    super(side, side);
  };

  public double lengthSetter(double length) {
    return this.length;
  }

  public double widthSetter(double width) {
    return this.width;
  }

}