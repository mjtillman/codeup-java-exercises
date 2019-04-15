public class BurgerTester {

  public static void main(String[] args) {
    BurgerTools hamburger = new BurgerTools();
    hamburger.mostPopularTopping = "pickles";
    hamburger.averageDaysBeforeExpiration = 1;
    hamburger.temperatureWhenCooked = 170;

    System.out.printf("\nMost popular topping: %s" +
        "\nAverage Days before expiration: %d" +
        "\nTemperature when cooked: %d\n",
        hamburger.mostPopularTopping, hamburger.averageDaysBeforeExpiration, hamburger.temperatureWhenCooked);

    hamburger.grill();

  }
}