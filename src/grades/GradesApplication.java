package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

  static int randomGrade() {
    return (int) Math.floor(Math.random()*100);
  }

  public static void main(String[] args) {
    HashMap<String, Student> students = new HashMap<>();

    Student carlo = new Student("Carlo");
    carlo.addGrade(randomGrade());
    carlo.addGrade(randomGrade());
    carlo.addGrade(randomGrade());

    Student mike = new Student("Mike Flores");
    mike.addGrade(randomGrade());
    mike.addGrade(randomGrade());
    mike.addGrade(randomGrade());

    Student cory = new Student("Cory Musick");
    cory.addGrade(randomGrade());
    cory.addGrade(randomGrade());
    cory.addGrade(randomGrade());

    Student cerissa = new Student("Cerissa");
    cerissa.addGrade(randomGrade());
    cerissa.addGrade(randomGrade());
    cerissa.addGrade(randomGrade());

    students.put("Carlo", carlo);
    students.put("Mike", mike);
    students.put("Cory", cory);
    students.put("Cerissa", cerissa);

  }
}
