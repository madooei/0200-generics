# Generics

A growable array that works for any element type, evolved from Chapter 1's
int-only `DynamicArray`.

## Prerequisites

- JDK 17+

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  src/
    main/
      generics/
        DynamicArray.java   # the growable array, now generic: DynamicArray<T>
        Student.java        # a sample element type: equals, hashCode, Comparable
        ArrayUtils.java     # generic algorithms: swap, indexOfMin, selectionSort
        GpaComparator.java  # an external ordering for Student, by GPA
        Main.java           # a small demo
  scripts/
    run.sh                  # compile everything and run the Main demo
```

## How to compile and run

- `scripts/run.sh` — compiles all source into `out/` and runs the `Main` demo.

There is no build tool and no test suite: testing is introduced later in the
course. The script above is all you need.

## What's here

- `generics.DynamicArray<T>` — Chapter 1's growable array, made generic. It
  stores any reference type, backs itself with `(T[]) new Object[...]`, compares
  elements with `equals` (through `indexOf`), and overloads `remove` by index and
  by value.
- `generics.Student` — a sample element type. Defines value equality by `id`
  (`equals`/`hashCode`) and a natural order by `id` (`Comparable<Student>`),
  keeping the two consistent.
- `generics.ArrayUtils` — generic algorithms that touch a `DynamicArray` only
  through its public operations: `swap` (unbounded), plus `indexOfMin` and
  `selectionSort` in two forms each — by natural order
  (`<T extends Comparable<T>>`) and by a supplied `Comparator<T>`.
- `generics.GpaComparator` — an ordering of students by GPA, supplied from
  outside the `Student` type.
- `generics.Main` — a runnable demo: a roster of students sorted by id and by
  GPA, plus the `DynamicArray<Integer>` `remove` overload trap.
