package demo;

import generics.ArrayUtils;
import generics.DynamicArray;
import generics.GpaComparator;
import generics.Student;

/** A demo of the generic ArrayUtils: sort a roster by natural order, then with a Comparator. */
public final class ArrayUtilsDemo {

  private ArrayUtilsDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    DynamicArray<Student> roster = new DynamicArray<>();
    roster.add(new Student(3, "Ada", 3.9));
    roster.add(new Student(1, "Linus", 3.4));
    roster.add(new Student(2, "Grace", 4.0));
    System.out.print("roster: ");
    print(roster);

    // Natural order: Student.compareTo orders by id. Expect Linus, Grace, Ada.
    ArrayUtils.selectionSort(roster);
    System.out.print("by id: ");
    print(roster);

    // External order: a Comparator orders by GPA, lowest first. Expect Linus, Ada, Grace.
    ArrayUtils.selectionSort(roster, new GpaComparator());
    System.out.print("by GPA: ");
    print(roster);
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
