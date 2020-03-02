package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks
 * with matching colors there are.
 * For example, there are n=7 socks with colors ar=[1,2,1,2,1,3,2]
 * There is one pair of color 1 and one of color 2
 * There are three odd socks left, one of each color.
 * The number of pairs is 2
 *
 * Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available
 *
 */
public class sockMerchant {

  static int sockMerchant(int n, int[] ar) {
    // version 2 using sorting + one-traversal

    // sort array so socks of the same color are one after another
    Arrays.sort(ar);

    // traverse the whole-array, increments pairs if current + next sock == same color
    int pairs = 0;
    for(int i=0; i<ar.length-1;i++)  {
      if(ar[i] == ar[i+1]) {
        pairs++;
        // increment i to jump +1 further because we already
        // saw the next sock as a pair !
        i++;
      }
    }
    return pairs;

    // version 1
    // record each color in a HashMap
    // displaying count/2 when %2 == 0 shows the amount of pairs
//    HashMap<Integer,Integer> socksList = new HashMap<>();
//    for(int i : ar) {
//      if(socksList.containsKey(i)) {
//        final int count = socksList.get(i);
//        socksList.put(i, count+1);
//      } else {
//        socksList.put(i, 1);
//      }
//    }
//    // calculate total amount of pairs
//    int count = 0;
//    for(Entry<Integer,Integer> e : socksList.entrySet()) {
//      final int socks = e.getValue();
//      if(socks > 2) {
//        count += e.getValue() / 2;
//      }
//    }
//    return count;
  }

  public static void main(String[] args) {
    // 10 20 20 10 10 30 50 10 20
    // output = 3
    int[] socks = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
    System.out.println(sockMerchant(socks.length, socks));
  }

}
