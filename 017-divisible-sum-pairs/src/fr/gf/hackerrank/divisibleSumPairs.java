package fr.gf.hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array of n integers. a0, a1... an-1, and a positive integer k. Find and print the number of (i,j)
 * pairs where i < j and ai + aj is divisible by k
 */
public class divisibleSumPairs {

  /*
   * another fucking problem with extremely poor wording of what is asked.
   * seriously, is that all hackerrank is ? simple problems worded very poorly so I spend
   * 15 minutes trying to find out what really is asked of me, and then realize it takes me
   * less than 5 minutes doing it ?
   *
   * wanbo, go fuck yourself.
   *
   * we need first to go through the array and % k each value
   * all those where % k = 0 are put together,
   * all those where % k = 1 also,
   * etc. until we reach %(k-1)
   * then we start making pairs, we will get n(n-1)/2 of those
   * n = length of the submitted array
   */
  static int divisibleSumPairs(int n, int k, int[] ar) {
    // HashMap to store complements
    Map<Integer, Integer> buckets = new HashMap<>();
    int pairs = 0;

    for (int i = 0; i < n; i++) {
      // grab number from array, calculate % k
      int num = ar[i];
      num %= k;
      // complement
      int complement = (k - num) % k;
      // check size of bucket, not empty -> increment amount of pairs
      Integer count = buckets.get(complement);
      if (count != null) {
        pairs += count;
      }
      // try to get num from bucket. not there -> add it
      // already there -> increment count
      count = buckets.get(num);
      if (count == null) {
        buckets.put(num, 1);
      } else {
        buckets.put(num, count + 1);
      }
    }
    return pairs;
  }

  public static void main(String[] args) {
    int[] sample0 = new int[]{1, 3, 2, 6, 1, 2};
    System.out.println(divisibleSumPairs(6, 3, sample0));
  }

}
