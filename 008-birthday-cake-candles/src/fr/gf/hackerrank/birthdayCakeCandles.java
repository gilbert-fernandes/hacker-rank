package fr.gf.hackerrank;

import java.util.HashMap;

/**
 * You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year
 * of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones. Your task is to
 * find out how many candles she can successfully blow out.
 *
 * For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4, 4, 1, 3 she will be
 * able to blow out  2 candles successfully, since the tallest candles are of height 4 and there are 2 such candles.
 *
 * constraints :
 * 1 <= n <= 10^5
 * 1 <= ar[i] <= 10^5
 *
 */
public class birthdayCakeCandles {

  static int birthdayCakeCandles(final int[] ar) {
    // in one loop, traverse the array and record which is the highest value
    // and build a map of value:count
    // and print the count from the map, using highest value found as key

    int tallest = Integer.MIN_VALUE;

    //HashMap<Integer, Integer> seenValues = new HashMap<>(ar.length);
    int count = 0;

    for(int v : ar) {
      if(v > tallest) {
        tallest = v;
        count = 1;
      } else if (v == tallest) {
        count++;
      }

      // keep a record of seen values, start @1 or increment
      //final int count = seenValues.getOrDefault(v, 0);
      //seenValues.put(v, count + 1);
    }

    // DEV
    System.out.println("tallest seen = " + tallest);
    System.out.println("count        = " + count);
//    System.out.println("count        = " + seenValues.get(tallest));

    return count;
    //return seenValues.get(tallest);
  }

  public static void main(String[] args) {
    final int[] test = new int[] {9, 4, 7, 5, 6, 8, 7, 9, 3, 4, 5, 6, 1, 2, 4, 3, 5, 4, 7, 8, 5, 6, 7, 2, 3, 4, 3, 1, 2, 3};
    birthdayCakeCandles(test);
  }

}
