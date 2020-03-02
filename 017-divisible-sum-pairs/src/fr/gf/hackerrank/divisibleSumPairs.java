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
    int[] reminderList = new int[k];
    // calculate and store reminders of each array value % k
    for(int i=0; i < ar.length; i++) {
      final int r = ar[i] % k;
      reminderList[r]++;
    }
    // all items that produced 0 under % k can only be paired among themselves
    final int count = reminderList[0];
    // calculate pair count
    int pairCount = (count * (count-1)) /2;
    // iterate through half the remaining reminders
    for(int i=1; i < k/2 && i != k-i; i++) {
      pairCount += reminderList[i] * reminderList[k-i];
    }
    // the loop above, if there is an even amount of reminders, skips
    // the middle one. so we check for evenness and act accordingly :
    if(k % 2== 0) {
      int half = reminderList[k/2];
      pairCount += (half * (half-1)) / 2;
    }
    // return number of pairs
    return pairCount;
  }

  public static void main(String[] args) {
    int[] sample0 = new int[]{1, 3, 2, 6, 1, 2};
    System.out.println(divisibleSumPairs(6, 3, sample0));
  }

}
