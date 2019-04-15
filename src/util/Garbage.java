package util;

public class Garbage {

  public static void main(String[] args) {
    String[] words = {"macaroni", "linguine", "tortellini"};
    int i = 2;

    try {
      if (i < 0 || i >= words.length) {
        throw new Exception("Erroneous array index");
      }
        System.out.println("Here we are in the danger zone!");
        System.out.println(words[i]);
    }
    catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Caught the built-in exception:");
      System.out.printf("\n%s", ex);
    }
    catch (Exception e) {
      System.out.println("Caught our own exception:");
      System.out.printf("\n%s", e);
    }
    System.out.println("Reached the end of the program");

  }
}
