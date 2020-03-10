package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Given an array of integers, find and print the maximum number of integers you can select from the array
 * such that the absolute difference between any two of the chosen integers is less than or equal to 1.
 * For example, if your array is a = [1,1,2,2,4,4,5,5,5] you can create two sub arrays meeting the criterion:
 * [1,1,2,2] and [4,4,5,5,5]
 * The maximum length sub array has elements.
 *
 */
public class pickingNumbers {

  public static int pickingNumbers(List<Integer> a) {
    // TODO
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
    List<Integer> sample0 = Arrays.asList(4,6,5,3,3,1);
    List<Integer> sample1 = Arrays.asList(1,2,2,3,1,2);

    System.out.println(pickingNumbers(sample0));
    System.out.println(pickingNumbers(sample1));
  }

}
