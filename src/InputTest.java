import util.Input;

public class InputTest {

  public static void main(String[] args) {
    Input foo = new Input();
    boolean fooContinue = true;

    do {

      System.out.print("\nPlease enter a string:\n> ");
      String fooString = foo.getString();
      System.out.println("You said: " + fooString + "\n");

      System.out.print("\nPlease enter an integer:\n> ");
      int fooInt = foo.getInt();
      System.out.println("You said: " + fooInt + "\n");

      fooInt = foo.getInt(1, 100);
      System.out.println("You said: " + fooInt + "\n");

      System.out.print("\nPlease enter a double:\n> ");
      double fooDbl = foo.getDouble();
      System.out.println("You said: " + fooDbl + "\n");

      fooDbl = foo.getDouble(1, 100);
      System.out.println("You said: " + fooDbl + "\n");

      System.out.println("\nWould you like to continue testing?");
      fooContinue = foo.yesNo();

      if (fooContinue)
        System.out.println("Okay!");
      else
        System.out.println("Goodbye!");

    } while (fooContinue);
  }

}
