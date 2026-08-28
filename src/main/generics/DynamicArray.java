package generics;

import java.util.Objects;

/**
 * A growable array of any element type T.
 *
 * @param <T> the type of element stored in this array.
 */
public class DynamicArray<T> {

  private T[] arr;
  private int size;

  // arr is private and only ever holds T (added via add/set), so casting the
  // Object[] to T[] is safe even though the compiler cannot verify it; there
  // is no way to create an array of a type parameter directly.
  @SuppressWarnings("unchecked")
  public DynamicArray() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public void add(T value) {
    if (size == arr.length) {
      grow();
    }
    arr[size] = value;
    size++;
  }

  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return arr[index];
  }

  public void set(int index, T value) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    arr[index] = value;
  }

  public int size() {
    return size;
  }

  public boolean contains(T value) {
    return indexOf(value) != -1;
  }

  // Returns -1 if value is not found.
  public int indexOf(T value) {
    for (int i = 0; i < size; i++) {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }
    return -1;      // not found
  }

  // Remove the element at a given index; return what was removed.
  public T remove(int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Remove the first element equal to value; return whether anything was removed.
  public boolean remove(T value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  private void grow() {
    // Same cast rationale as the constructor: a fresh Object[] viewed as a T[].
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
