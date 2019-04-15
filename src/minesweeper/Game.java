package minesweeper;

public class Game {

  public static void main(String[] args) {
    Board easy = new EasyBoard();

    System.out.println(easy.minesToString());
//    System.out.println(easy.fieldToString());
    System.out.println(easy.showEasyBoard());

  }

}
