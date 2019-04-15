package util;

import java.util.Scanner;

public class Input {

  private Scanner sc = new Scanner(System.in);

  public String getString() {
    System.out.print("> ");
    return sc.nextLine();
  }

  public char getChar() {
    System.out.print("> ");
    return sc.next().charAt(0);
  }

  public boolean yesNo() {
    sc.nextLine();
    System.out.print("> ");
    String response = sc.nextLine().toLowerCase();

    switch (response) {
      case "yes":
      case "y":
        return true;
      default:
        return false;
    }

  }

  public int getInt(int min, int max) {
    int num;
    do {
      System.out.printf("Please enter an integer between %d and %d: ",
          min, max);
      num = sc.nextInt();

    } while (num <= min || num >= max);

    return num;
  }

  public int getInt() {
    return sc.nextInt();
  }

  public double getDouble(double min, double max) {
    double num;
    do {
      System.out.printf("Please enter a double between %.3f and %.3f: ",
          min, max);
      num = sc.nextDouble();

    } while (num <= min || num >= max);

    return num;
  }

  public double getDouble() {
    return sc.nextDouble();
  }

  public static void main(String[] args) {
    Input sc = new Input();
    System.out.println("Give integer:");
    sc.getInt();
  }
}
