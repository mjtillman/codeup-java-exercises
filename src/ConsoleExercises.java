import java.util.Scanner;

public class ConsoleExercises {
  public static void main(String[] args) {
    double pi = 3.14159;
    System.out.format("\nThe value of pi is approximately %.2f.\n\n", pi);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter an integer: ");
    int num = scanner.nextInt();
    System.out.print("You entered the number " + num + ".\n");
    scanner.nextLine();

    System.out.println("Please enter a word: ");
    String word1 = scanner.nextLine();

    System.out.println("Please enter another word: ");
    String word2 = scanner.nextLine();

    System.out.println("Please enter an additional word: ");
    String word3 = scanner.nextLine();

    System.out.format("" + "" +
            "\nYou entered:\n\t%s\n\t%s\n\t%s\n\n",
            word1, word2, word3);

    System.out.println("Please enter a sentence: ");
    String sentence = scanner.nextLine();
    System.out.println("You said: " + sentence + "\n");
    scanner.nextLine();


    System.out.println(
        "Let's calculate properties of a rectangular prism!\n");

    System.out.println("Length: ");
    final double length = scanner.nextDouble();

    System.out.println("Width: ");
    final double width = scanner.nextDouble();

    System.out.println("Height: ");
    final double height = scanner.nextDouble();

    double area1 = length * width;
    double area2 = height * width;
    double area3 = height * length;

    double perimeter1 = 2 * (width + length);
    double perimeter2 = 2 * (width + height);
    double perimeter3 = 2 * (length + height);

    double volume = length * width * height;

    System.out.format(
        "\nThe three faces of the prism:\n" +
        "\tFace 1 =>  Area: %s  |  Perimeter: %s\n" +
        "\tFace 2 =>  Area: %s  |  Perimeter: %s\n" +
        "\tFace 3 =>  Area: %s  |  Perimeter: %s\n\n",
        area1, perimeter1, area2, perimeter2, area3, perimeter3);

    System.out.format("Volume of the prism: %s\n", volume);


  }
}
