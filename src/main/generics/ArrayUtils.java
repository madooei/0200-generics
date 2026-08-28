package generics;

import java.util.Comparator;

/** A namespace of general-purpose algorithms over a DynamicArray. */
public final class ArrayUtils {

  private ArrayUtils() {
    // This class is a namespace, not a blueprint — don't instantiate it.
  }

  // Assumes list is not null.
  public static <T> void swap(DynamicArray<T> list, int i, int j) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes list is not null. Returns the index of the smallest element
  // from index `from` to the end, by natural order.
  public static <T extends Comparable<T>> int indexOfMin(DynamicArray<T> list, int from) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes list is not null. Sorts in place by each element's natural order.
  public static <T extends Comparable<T>> void selectionSort(DynamicArray<T> list) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes list is not null. Returns the index of the smallest element
  // from index `from` to the end, by the given order.
  public static <T> int indexOfMin(DynamicArray<T> list, int from, Comparator<T> cmp) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes list is not null. Sorts in place by the order supplied in cmp;
  // elements need not be Comparable.
  public static <T> void selectionSort(DynamicArray<T> list, Comparator<T> cmp) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
