public class RestaurantTest {

  public static void main(String[] args) {
    RestaurantDish meal = new RestaurantDish();
      meal.setCostInCents(999);
      meal.setNameOfDish("Fried Chicken");
      meal.setWouldRecommend(true);

    System.out.println(meal.getNameOfDish());
    System.out.println(meal.getCostInCents());
    System.out.println(meal.getWouldRecommend());
    meal.eat();

  }

}
