import util.Input;
import shapes.Circle;

public class myCircle {

  public static void main(String[] args) {
    Input fooCircle = new Input();
    boolean continueCircle;
    double myRadius;
    int i = 1;

    do {

      System.out.print("\nPlease enter a radius (double):\n> ");
      myRadius = fooCircle.getDouble();

      Circle myCircle = new Circle(myRadius, i);

      myCircle.printCircleStats();

      System.out.print("Would you like to continue?\n");
      continueCircle = fooCircle.yesNo();

      if (continueCircle == true) {
        i++;
      } else if (continueCircle == false) {
        System.out.printf("\nYou created %d circle(s).  Bye!\n\n",
            myCircle.getCirclePopulation());
        continueCircle = false;
      }

    } while (continueCircle);

  }

}
