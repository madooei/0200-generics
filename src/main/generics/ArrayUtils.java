package generics;

import java.util.Comparator;

/** A namespace of general-purpose algorithms over a DynamicArray. */
public final class ArrayUtils {

  private ArrayUtils() {
    // This class is a namespace, not a blueprint — don't instantiate it.
  }

  // Assumes list is not null.
  public static <T> void swap(DynamicArray<T> list, int i, int j) {
    T temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }

  // Assumes list is not null. Returns the index of the smallest element
  // from index `from` to the end, by natural order.
  public static <T extends Comparable<T>> int indexOfMin(DynamicArray<T> list, int from) {
    int minIndex = from;
    for (int i = from + 1; i < list.size(); i++) {
      if (list.get(i).compareTo(list.get(minIndex)) < 0) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  // Assumes list is not null. Sorts in place by each element's natural order.
  public static <T extends Comparable<T>> void selectionSort(DynamicArray<T> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int min = indexOfMin(list, i);
      swap(list, i, min);
    }
  }

  // Assumes list is not null. Returns the index of the smallest element
  // from index `from` to the end, by the given order.
  public static <T> int indexOfMin(DynamicArray<T> list, int from, Comparator<T> cmp) {
    int minIndex = from;
    for (int i = from + 1; i < list.size(); i++) {
      if (cmp.compare(list.get(i), list.get(minIndex)) < 0) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  // Assumes list is not null. Sorts in place by the order supplied in cmp;
  // elements need not be Comparable.
  public static <T> void selectionSort(DynamicArray<T> list, Comparator<T> cmp) {
    for (int i = 0; i < list.size() - 1; i++) {
      int min = indexOfMin(list, i, cmp);
      swap(list, i, min);
    }
  }
}
