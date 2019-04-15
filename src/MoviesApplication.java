import util.Input;
import movies.*;

public class MoviesApplication {

  static void viewAll(Movie[] movies) {
    for (Movie movie : movies) {
      System.out.printf("\nTitle: %s\nCategory: %s\n",
          movie.getName(), movie.getCategory());
    }
  }

  static void viewCategory(Movie[] movies, String category) {
    System.out.printf("\nListing %s:", category);
    for (Movie movie : movies) {
      if (movie.getCategory() == category) {
        System.out.printf("\t%s",movie.getName());
      }
    }
  }

  public static void main(String[] args) {

    Input sc = new Input();
    Movie[] myMovies = MoviesArray.findAll();
    boolean continueMovies = true;

    do {

      System.out.print(
          "\nMovie Database" +
              "\n0 - exit\t1 - list all" +
              "\n2 - comedy\t3 - drama\t4 - horror" +
              "\n5 - musical\t6 - animated\t7 - sci-fi"
      );
      String response = sc.getString();

      switch (response) {
        case "0":
          continueMovies = false;
          break;
        case "1":
          viewAll(myMovies);
          break;
        case "2":
          viewCategory(myMovies, "comedy");
          break;
        case "3":
          viewCategory(myMovies, "drama");
          break;
        case "4":
          viewCategory(myMovies, "horror");
          break;
        case "5":
          viewCategory(myMovies, "musical");
          break;
        case "6":
          viewCategory(myMovies, "animated");
          break;
        case "7":
          viewCategory(myMovies, "scifi");
          break;
      }

    } while (continueMovies);

    System.out.println("Goodbye!\n");
  }

}
