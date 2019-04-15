public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    public static void eat() {
      System.out.println("Nom nom nom!");
    }

    public void setCostInCents(int cost) {
        this.costInCents = cost;
    }

    public void setNameOfDish(String dishName) {
        this.nameOfDish = dishName;
    }

    public void setWouldRecommend(boolean recommended) {
       this.wouldRecommend = recommended;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }


}
