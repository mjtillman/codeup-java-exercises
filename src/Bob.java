import java.util.Scanner;

public class Bob {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String utterance = "";
    String line = "\n-----------------------------------------------" +
        "-----------------------------------------";
    String dblLine = "\n============================================" +
        "============================================";

    System.out.print(dblLine +
        "\nIn Zion Classroom" +
        line +
        "\nYou are sitting in an open classroom located on the 6th" +
        " floor of the Codeup building.\nThe north and west walls" +
        " consist entirely of glass, giving the room an atmosphere" +
        " not\nunlike an aquarium.\n" +
        "There is a teenager named Bob sitting in the same row as you," +
        " but two seats down.\n" +
        "Use \"exit\" to stop talking to Bob.\n\n");


    do {
      System.out.print(">");
      utterance = scanner.nextLine();

      if (utterance.equals("Hello")) {
        System.out.println("Bob says, \"Hi.\"");

      } else if (utterance.endsWith("?")) {
        System.out.println("Bob says, \"Sure.\"");

      } else if (utterance.endsWith("!")) {
        System.out.println("Bob says, \"Whoa, chill out!\"");

      } else if (utterance.isEmpty()) {
        System.out.println("Bob says, \"Fine! Be that way!\"");

      } else if (utterance.equals("Bye")) {
        System.out.println("Bob sighs.");

      } else if (utterance.equals("exit")) {
        System.out.println("Bob takes no notice when you stand up to" +
            " leave." + line + "\n");

      } else {
        System.out.println("Bob says, \"Whatever.\"");

      }

    } while (!utterance.equals("exit"));

  }

}
