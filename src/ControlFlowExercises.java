import java.util.Scanner;

public class ControlFlowExercises {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a grade (0-100): ");
    int numGrade = scanner.nextInt();
    char letterGrade = ' ';

    if (numGrade > 87) {
      letterGrade = 'A';
    } else if (numGrade > 79) {
      letterGrade = 'B';
    } else if (numGrade > 66) {
      letterGrade = 'C';
    } else if (numGrade > 59) {
      letterGrade = 'D';
    } else {
      letterGrade = 'F';
    }

    System.out.format("%d is equivalent to: %s.\n", numGrade, letterGrade);
  }

  public static void squareCuber(String[] args) {
    int squared = 0;
    int cubed = 0;

    Scanner scanner = new Scanner(System.in);
    Scanner keyIn = new Scanner(System.in);

    System.out.println("Please enter an integer: ");
    int num = scanner.nextInt();
    scanner.nextLine();

    System.out.format("You entered %d. Press [Enter] to continue.", num);
    keyIn.nextLine();

    System.out.println(
        "\nSquares and Cubes:\n\n" +
            " number | squared | cubed\n" +
            "--------|---------|-------");

    for (int i = 1; i <= num; i++) {
      squared = i * i;
      cubed = i * i * i;
      System.out.format(
          "  %d     |  %d      |  %d\n",
          i, squared, cubed);
    }
  }

  public static void loopDoWhile(String[] args) {
    int num = 100;

    do {

      System.out.println(num);
      num += 2;

    } while (num <= 100);


    do {

      System.out.println(num);
      num -= 5;

    } while (num >= -10);

///////////////////////

    long num2 = 2;

    do {

      System.out.println(num2);
      num2 *= num2;

    } while (num2 < 1000000);

  }

  public static void loopWhile(String[] args) {

    int i = 5;

    while (i <= 15) {

      System.out.println(i);
      i++;

    }

  }

}
