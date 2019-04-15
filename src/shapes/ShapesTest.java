package shapes;

public class ShapesTest {
  public static void main(String[] args) {

    Measurable myShape1;
    Measurable myShape2;

    myShape1 = new Rectangle(5, 4);
    myShape2 = new Square(6);

    System.out.printf("\nPerimeter: %f", myShape1.getPerimeter());
    System.out.printf("\nArea: %f", myShape1.getArea());

    System.out.printf("\nPerimeter: %f", myShape2.getPerimeter());
    System.out.printf("\nArea: %f", myShape2.getArea());




//    Rectangle box1 = new Rectangle(4, 5);
//    Rectangle box2 = new Square(5);
//    System.out.printf("\nPerimeter: %f\tArea: %f", box1.getPerimeter(), box1.getArea());
//    System.out.printf("\nPerimeter: %f\tArea: %f", box2.getPerimeter(), box2.getArea());
  }
}