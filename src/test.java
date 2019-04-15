import java.util.*;

public class test {

  public static void main(String[] args) {
    String[] greekArray = new String[11];

    greekArray[0] = "alpha";
    greekArray[1] = "beta";
    greekArray[2] = "gamma";
    greekArray[3] = "delta";
    greekArray[4] = "epsilon";
    greekArray[5] = "zeta";
    greekArray[6] = "eta";
    greekArray[7] = "theta";
    greekArray[8] = "iota";
    greekArray[9] = "kappa";
    greekArray[10] = "lambda";

    System.out.println(greekArray);

    ArrayList<String> greekLetters = new ArrayList<>();
    greekLetters.add("alpha");
    greekLetters.add("beta");
    greekLetters.add("gamma");
    greekLetters.add("delta");
    greekLetters.add("epsilon");
    greekLetters.add("zeta");
    greekLetters.add("eta");
    greekLetters.add("theta");
    greekLetters.add("iota");
    greekLetters.add("kappa");
    greekLetters.add("lambda");

    System.out.println(greekLetters);
  }
}
