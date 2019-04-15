import java.util.Scanner;


public class HighLow {

  public static int guess(String text) {

    Scanner scanner = new Scanner(System.in);
    boolean validGuess = false;
    int guess = 0;

    do {
      System.out.print(text);
      guess = scanner.nextInt();

      if (guess > 0 && guess < 101) {
        validGuess = true;
      }

    } while (!validGuess);

    return guess;
  }

  public static void main(String[] args) {

    int numToGuess = (int) Math.floor(Math.random() * 100) + 1;
    boolean gameOver = false;
    boolean playAgain = true;
    Scanner scanner = new Scanner(System.in);
    char continuePlaying = 'y';

    String newGame = "Guessing Game: Please enter a number between 1" +
        " and 100: ";
    String newGuess = "\tGuess again: ";

    do {

      int turnGuess = guess(newGame);

      do {

        if (turnGuess < numToGuess) {
          System.out.println("HIGHER! ");
          turnGuess = guess(newGuess);

        } else if (turnGuess > numToGuess) {
          System.out.println("LOWER! ");
          turnGuess = guess(newGuess);

        } else if (turnGuess == numToGuess) {
          System.out.println("GOOD GUESS! You win!");
          gameOver = true;
        }

      } while (!gameOver);

      System.out.print("\tPlay again? y / n: ");
      continuePlaying = scanner.next().charAt(0);

      if (continuePlaying == 'n') {
        playAgain = false;
      }

    } while (playAgain);

  }

}
