package textadventure;

import util.Input;
import java.util.Random;

public class Main {

  public static String getName(Input sc) {
    System.out.printf("" +
            "\n\nText Adventure!" +
            "\n\nWhat is your name?\n\n"
    );

    String heroName = sc.getString();

    return heroName;
  }

  //////////////////////////////////////////////////////////////////////

  public static char getSpecies(Input sc) {

    boolean valid = false;
    char heroSelect;
    char heroSpecies = ' ';

    do {
      System.out.print("" +
              "\n\nChoose a species:" +
              "\n\n\tH - Human" +
              "\n\n\tE - Elf" +
              "\n\n\tL - Halfling\n\n"
      );

      heroSelect = sc.getChar();

      if (heroSelect == 'h' || heroSelect == 'H' ||
          heroSelect == 'e' || heroSelect == 'E' ||
          heroSelect == 'l' || heroSelect == 'L') {
        valid = true;
        heroSpecies = Character.toUpperCase(heroSelect);
      }

    } while (!valid);

    return heroSpecies;
  }

  //////////////////////////////////////////////////////////////////////

  public static char getJob(Input sc) {

    boolean valid = false;
    char jobSelect;
    char jobSpecies = ' ';

    do {
      System.out.print("" +
              "\n\nChoose a job:" +
              "\n\nR - Ranger" +
              "\n\nF - Fighter" +
              "\n\nS - Sorcerer\n\n"
      );

      jobSelect = sc.getChar();

      if (jobSelect == 'R' || jobSelect == 'r' ||
          jobSelect == 'F' || jobSelect == 'f' ||
          jobSelect == 'S' || jobSelect == 's') {
        valid = true;
        jobSelect = Character.toUpperCase(jobSelect);
      }

    } while (!valid);

    switch (jobSelect) {
      case 'R':
        jobSpecies = 'R';
        break;
      case 'F':
        jobSpecies = 'F';
        break;
      case 'S':
        jobSpecies = 'S';
        break;
    }

    return jobSpecies;
  }

  //////////////////////////////////////////////////////////////////////

  public static Hero createHero() {

    Input sc = new Input();
    String[] heroDetails = new String[3];

    String heroName = getName(sc);
    char heroSpecies = getSpecies(sc);
    char heroJob = getJob(sc);

    Hero myHero = new Hero(heroName, heroSpecies, heroJob);

    return myHero;
  }

  //////////////////////////////////////////////////////////////////////

  public static void main(String[] args) {

    Input sc = new Input();
    boolean confirm = false;

    do {
      Hero myHero = createHero();
      System.out.printf("\n\nYou are %s.\n\n%s\n\n%s\n\nAre you sure?",
              myHero.getName(), myHero.getSpecDesc(),
              myHero.getJobDesc());
      confirm = sc.yesNo();
    } while (!confirm);
  }

}