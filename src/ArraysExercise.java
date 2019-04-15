public class ArraysExercise {
  public static void main(String[] args) {
//    int[] numbers = {1, 2, 3, 4, 5};
//    System.out.println(numbers);

    Person[] people = {new Person(), new Person(), new Person()};

    String[] names = {"Aramis", "Athos", "Porthos"};

    int index = 0;

    for (Person person : people) {
      person.setName(names[index]);
      System.out.println("\t" + person.getName());
      index++;
    }

  }
}
