package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, find and print the maximum number of integers you can select from the array such that the
 * absolute difference between any two of the chosen integers is less than or equal to 1. For example, if your array is
 * a = [1,1,2,2,4,4,5,5,5] you can create two sub arrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5] The maximum
 * length sub array has elements.
 */
public class pickingNumbers {

  /**
   * The wording of this test is seriously wrong. It's not clear at all what is expected. Absolute difference it either
   * 0 or >0 so it is either 0 or 1 Not "less than or equal to 1" Not hard per se, but I am seriously getting tired of
   * poorly worded questions
   *
   * @param list array list
   * @return numbers of items obeying Abs(Difference) == 0 || 1
   */
  public static int pickingNumbers(final List<Integer> list) {
    int outerCount = 0;
    int temp = 0;

    final Integer[] arr = list.toArray(new Integer[0]);

    for (Integer integer : arr) {
      // values for curent, -1 and +1 position in array
      int plusOne = integer + 1;
      int minusOne = integer - 1;
      int currentValue = integer;

      // counts for each
      int plusOneCount = 0;
      int minusOneCount = 0;
      int currentValueCount = 0;

      for (Integer value : arr) {

        if (value == plusOne)      { plusOneCount++; }
        if (value == minusOne)     { minusOneCount++; }
        if (value == currentValue) { currentValueCount++; }

        // using Math.max feels a little like cheating but it's the Java API so not using it
        // would be stupid wheel reimplementation
        outerCount = Math.max((plusOneCount + currentValueCount),
                              (minusOneCount + currentValueCount));

      }

      if (outerCount > temp) {
        temp = outerCount;
      }

    }

    return temp;

  }

  public static void main(String[] args) {
    /*
     * sample input 0
     * 4 6 5 3 3 1
     * expected : 3
     *
     * sample input 1
     * 1 2 2 3 1 2
     * expected : 5
     *
     */

    final List<Integer> sample0 = Arrays.asList(4, 6, 5, 3, 3, 1);
    final List<Integer> sample1 = Arrays.asList(1, 2, 2, 3, 1, 2);

    System.out.println("expected : 3");
    System.out.println(pickingNumbers(sample0));

    System.out.println("expected : 5");
    System.out.println(pickingNumbers(sample1));
  }

}
