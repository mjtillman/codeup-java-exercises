import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    System.out.println("Please enter an integer between 1 and 10.");
    int userInput = getInteger(1, 10);
    System.out.println("Good job. " + userInput + " is between 1 and 10.");
  }

  public static int getInteger(int min, int max) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    while ((userInput < min) || (userInput > max)) {
      System.out.println("That's not an integer between 1 and 10. Try again.");
      userInput = scanner.nextInt();
    }
    return userInput;
  }

}
