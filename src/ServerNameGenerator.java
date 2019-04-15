public class ServerNameGenerator {

  private static String[] adjectives = {
      "adamant", "adaptable", "heuristic", "intuitive", "inventive",
      "persistent", "propitious", "resourceful", "tenacious", "zealous"
  };

  private static String[] nouns = {
      "account", "apparatus", "condition", "distribution", "expansion",
      "instrument", "process", "selection", "tendency", "theory"
  };

  public static String randomElement(String[] words){
    return words[(int) Math.floor(Math.random() * 10)];
  }

  public static void main(String[] args) {
    System.out.printf("\n\tHere is your server name:\n\t%s-%s\n\n",
        randomElement(adjectives), randomElement(nouns));
  }
}

