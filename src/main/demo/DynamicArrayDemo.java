package demo;

import generics.DynamicArray;
import generics.Student;

/** A demo of the generic DynamicArray: a roster of students, then the Integer remove trap. */
public final class DynamicArrayDemo {

  private DynamicArrayDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    // One class, any element type: here a roster of Student objects.
    DynamicArray<Student> roster = new DynamicArray<>();
    roster.add(new Student(3, "Ada", 3.9));
    roster.add(new Student(1, "Linus", 3.4));
    roster.add(new Student(2, "Grace", 4.0));
    System.out.print("roster: ");
    print(roster);

    // Expect Ada (#3, GPA 3.9).
    System.out.println("get(0): " + roster.get(0));

    // Student.equals compares ids, so a freshly built Student with id 1 is on the roster. Expect true.
    Student probe = new Student(1, "Linus", 3.4);
    System.out.println("contains student #1? " + roster.contains(probe));

    // The same class holds Integers.
    DynamicArray<Integer> scores = new DynamicArray<>();
    scores.add(50);
    scores.add(60);
    scores.add(70);
    System.out.print("scores: ");
    print(scores);

    // remove(int) removes the element at index 2. Expect [50, 60].
    scores.remove(2);
    System.out.print("after remove(2): ");
    print(scores);

    // remove(T) removes the value 50. Expect [60].
    scores.remove(Integer.valueOf(50));
    System.out.print("after remove(Integer.valueOf(50)): ");
    print(scores);
  }

  // Prints the elements as [a, b, c], reaching them only through public operations.
  private static <T> void print(DynamicArray<T> list) {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < list.size(); i++) {
      str.append(list.get(i));
      if (i < list.size() - 1) {
        str.append(", ");
      }
    }
    str.append("]");
    System.out.println(str.toString());
  }
}
