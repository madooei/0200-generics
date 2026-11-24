package demo;

import generics.Student;

/** A demo of Student: equality and natural order, both by id. */
public final class StudentDemo {

  private StudentDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Student ada = new Student(1, "Ada", 3.9);
    Student sameAda = new Student(1, "Ada", 3.9);
    Student linus = new Student(2, "Linus", 3.4);
    System.out.println("ada: " + ada);
    System.out.println("sameAda: " + sameAda);
    System.out.println("linus: " + linus);

    // Two separate objects, so expect false.
    System.out.println("ada == sameAda? " + (ada == sameAda));

    // Same id, so expect true.
    System.out.println("ada.equals(sameAda)? " + ada.equals(sameAda));

    // Equal objects have equal hash codes. Expect true.
    System.out.println("same hashCode? " + (ada.hashCode() == sameAda.hashCode()));

    // Id 1 comes before id 2. Expect a negative number.
    System.out.println("ada.compareTo(linus): " + ada.compareTo(linus));
  }
}
