package fr.gf.hackerrank;

import java.util.Arrays;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
 * the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long
 * integers. For example, arr = [1, 3, 5, 7, 9]. Our minimum sum is 1 + 3 + 5 + 7 = 16 and our maximum sum is 3 + 5 + 7
 * + 9 = 24 We would print 16 24
 * input format -> A single line of five space-separated integers
 * output format -> Print two space-separated long integers denoting the respective minimum and maximum values that
 * can be calculated by summing exactly four of the five integers
 * (The output can be greater than a 32 bit integer.)
 */
public class miniMaxSum {

  static void miniMaxSum(int[] arr) {
    // initialize minimum at sigma as a start
    // at first I used .sum() which returns an int and does an overflow by being limited to 32-bits
    // using asLongStream() mais sum() return a long
    final long sigma = Arrays.stream(arr).asLongStream().sum();
    long minimum = sigma;
    long maximum = 0;
    for(int i=0; i<arr.length; i++) {
      // each time we loop, make a copy of the array and ZERO position i
      // sigma the copy and record min and max
      // by zeroing position i from 0 to arr.length we basically sigma the arr
      // skipping 1 value each time
      // while exercise says array is length=5 this will work on any length
      // with [1,3,5,7,9] this gives us
      // [0, 3, 5, 7, 9]
      // [1, 0, 5, 7, 9]
      // [1, 3, 0, 7, 9]
      // [1, 3, 5, 0, 9]
      // [1, 3, 5, 7, 0]
      // the 0 moves here from [0] to [n-1]
      int[] arrayCopy = arr.clone();
      arrayCopy[i] = 0;
//      System.out.println("summing " + Arrays.toString(arrayCopy));
      final long newSum = Arrays.stream(arrayCopy).asLongStream().sum();
//      System.out.println("= " + newSum);
      // record min and max
      if(newSum < minimum) {
        minimum = newSum;
      }
      if(newSum > maximum) {
        maximum = newSum;
      }
    }
    // output min and max
      System.out.println(minimum + " " + maximum);
  }

  public static void main(String[] args) {
    // expected 2063136757 2744467344
//    System.out.println("2063136757 2744467344");
    int[] arr = new int[] { 256741038, 623958417, 467905213, 714532089, 938071625 };
    miniMaxSum(arr);
  }

}
