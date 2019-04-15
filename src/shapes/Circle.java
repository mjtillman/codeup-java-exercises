package shapes;

public class Circle {

    private double radius;
    private int circleID;
    public static int circlePopulation;

    public Circle(double fooRadius, int ID) {
        radius = fooRadius;
        circleID = ID;

        Circle.circlePopulation += 1;
    }

    public void setRadius(double fooRadius) {
        radius = fooRadius;
    }

    public int getCircleID() {
        return this.circleID;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public int getCirclePopulation() {
        return Circle.circlePopulation;
    }

    public void printCircleStats() {
        System.out.printf(
                "\n\t+----------------------------+" +
                "\n\t|                            |" +
                "\n\t|  Circle ID:      %d         |" +
                "\n\t|  Radius:         %.3f     |" +
                "\n\t|  Circumference:  %.3f    |" +
                "\n\t|  Area:           %.3f    |" +
                "\n\t|                            |" +
                "\n\t+----------------------------+\n\n",
            this.getCircleID(), this.getRadius(), this.getCircumference(),
            this.getArea());
    }
}
