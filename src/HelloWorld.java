import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 25;
        System.out.println(myFavoriteNumber);

        String myString = "Here is a lovely string.";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        int y = 4;
        y++;

        int a = 3;
        int b = 4;
        b *= a;

        int e = 10;
        int f = 2;
        e /= f;
        f -= e;


//
//        String declarative = "I am the very model of a modern";
//        String rank = "Major-General";
//        String inform = "I've information";
//        String info1 = "vegetable";
//        String info2 = "animal";
//        String info3 = "mineral";
//
//        System.out.println(headLine);
//        System.out.println(leftLine + declarative + " " + rank + ".  " +
//            rightLine);
//        System.out.format("%s%s %s, %s, and %s.%s\n", leftLine, inform,
//            info1, info2, info3, rightLine);
//        System.out.println(headLine + "\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine();
        System.out.print("What is your last name? ");
        String lastName = scanner.nextLine();
        System.out.print("What is your street number? ");
        String stNum = scanner.nextLine();
        System.out.print("What is your street name? ");
        String stName = scanner.nextLine();
        System.out.print("What is your city? ");
        String city = scanner.nextLine();
        System.out.print("What is your state? ");
        String state = scanner.nextLine();
        System.out.print("What is your zipcode? ");
        String zipcode = scanner.nextLine();

        String headLine =
            "\t+----------------------------------------------------+";
        String leftLine = "\t|  ";
        String rightLine = "  |";


        System.out.format(
          "\n\tPrinting address label:" +
              "\n\n%s" +
              "\n%s %s %s %s" +
              "\n%s %s %s %s" +
              "\n%s %s, %s %s %s" +
              "\n%s\n\n",
          headLine,
            leftLine, firstName, lastName, rightLine,
            leftLine, stNum, stName, rightLine,
            leftLine, city, state, zipcode, rightLine,
            headLine
        );


    }
}
