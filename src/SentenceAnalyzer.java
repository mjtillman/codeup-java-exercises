
import java.util.Scanner;

public class SentenceAnalyzer {

  public static int vowels(String str) {
    str = str.toLowerCase();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
          str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
          str.charAt(i) == 'u') {
        count++;
      }
    }

    return count;
  }

  public static int consonants(String str) {
    str = str.toLowerCase();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != 'a' && str.charAt(i) != 'e' &&
          str.charAt(i) != 'i' && str.charAt(i) != 'o' &&
          str.charAt(i) != 'u') {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    String sentence;
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nPlease enter a sentence:");
    System.out.print("> ");
    sentence = scanner.nextLine();

    int vowels = vowels(sentence);
    int consonants = consonants(sentence);

    System.out.printf("\nYou entered: %s", sentence);
    System.out.printf("\nIt contains: %d vowels and %d consonants\n",
        vowels, consonants);


  }

}