import java.util.Scanner;
import java.util.*;

public class MethodsExercise {

  public static int getInteger(int min, int max) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    while ((userInput < min) || (userInput > max)) {
      System.out.println("That's not an integer between 1 and 10." +
          " Try again.");
      userInput = scanner.nextInt();
    }
    return userInput;
  }

  public static String add(int num1, int num2) {
    int result = num1 + num2;
    return num1 + " + " + num2 + " = " + result;
  }

  public static String subtract(int num1, int num2) {
      int result = num1 - num2;
      return num1 + " - " + num2 + " = " + result;
  }

  public static String multiply(int num1, int num2) {
    int result = num1 * num2;
    return num1 + " * " + num2 + " = " + result;
  }

  public static String divide(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return "Error: divide by zero";
    }

    int result = num1 / num2;
    return num1 + " / " + num2 + " = " + result;
  }

  public static String modulus(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return "Error: divide by zero";
    }
    int result = num1 % num2;
    return num1 + " % " + num2 + " = " + result;
  }

  public static void calculate(String[] arg) {
    Scanner scanner = new Scanner(System.in);

    boolean conArth = true;
    char answer = ' ';

    do {
      System.out.print("Please enter an integer:\n>");
      int num1 = scanner.nextInt();
      System.out.print("Please enter another integer:\n>");
      int num2 = scanner.nextInt();
      System.out.println("Please enter an operator (+, - , *, /, %): ");
      char operand = scanner.next().charAt(0);

      String result = "";

      switch (operand) {
        case '+':
          result = add(num1, num2);
          break;

        case '-':
          result = subtract(num1, num2);
          break;

        case '*':
          result = multiply(num1, num2);
          break;

        case '/':
          result = divide(num1, num2);
          break;

        case '%':
          result = modulus(num1, num2);

        default:

      }

      System.out.format("\tResult: %s", result);
      System.out.println("\n\nWould you like to continue? (y / n)");
      answer = scanner.next().charAt(0);

      System.out.println("\n");
      if (answer == 'n') conArth = false;

    } while (conArth);
  }

  public static String factorial(int num) {
    long factorial = 1;
    String text = num + "! = ";

    for (int i = num; i > 0; i--) {
      factorial *= i;

      if (i == 1){
        text += i + " = " + factorial;
      } else {
        text += i + " x ";
      }
    }

    return text;
  }

//  public static void factorialMain(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int num = 1;
//    char continueFact = 'n';
//
//    do {
//
//      do {
//
//        System.out.print("\nPlease enter an integer (1-10): ");
//        num = scanner.nextInt();
//
//      } while (num < 0 || num > 10);
//
//      System.out.println(factorial(num));
//      System.out.print("\nPress 'y' to continue: ");
//      continueFact = scanner.next().charAt(0);
//
//    } while (continueFact == 'y');
//
//  }

  public static int diceRoller(int sides) {
    return (int) Math.floor(Math.random() * sides) + 1;
  }

  public static void dblDiceRoller(String[] args) {

    Scanner scanner = new Scanner(System.in);
    char continueRoll = 'n';
    int sides = 0;
    int roll1 = 0;
    int roll2 = 0;

    do {
      System.out.print("\nPlease enter the number of sides on the dice: ");
      sides = scanner.nextInt();

      scanner.nextLine();
      roll1 = diceRoller(sides);
      roll2 = diceRoller(sides);

      System.out.println("\nYou rolled: " + roll1 + " and " + roll2);
      System.out.print("\nPress 'y' to continue: ");
      continueRoll = scanner.nextLine().charAt(0);

    } while (continueRoll == 'y');
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = 1;
    char continueFact = 'n';

    do {

      num = getInteger(1, 10);

      System.out.println(factorial(num));
      System.out.print("\nPress 'y' to continue: ");
      continueFact = scanner.next().charAt(0);

    } while (continueFact == 'y');

  }


}