package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.List;

/*
 * Lily has a chocolate bar that she wants to share it with Ron for his birthday.
 * Each of the squares has an integer on it. She decides to share a contiguous segment of the bar
 * selected such that the length of the segment matches Ron's birth month and the sum of the integers
 * on the squares is equal to his birth day.
 * You must determine how many ways she can divide the chocolate.
 */
public class birthdayChocolate {

  /*
   * Consider the chocolate bar as an array of squares, s = [2,2,1,3,2].
   * She wants to find segments summing to Ron's birth day, d=4 with a length equalling
   * his birth month, m=2.
   * In this case, there are two segments meeting her criteria: [2,2] and [1,3].
   */
  static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    // loop over List, but stop at list.size-m since length must be equal to birth month
    for(int i=0; i<= s.size() - m; i++) {
      if( s.subList(i, i+m).stream().mapToInt(n -> n).sum() == d) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    /*
    in
    1 2 1 3 2
    3 2
    out
    2
     */
    List<Integer> sample0 = Arrays.asList(1, 2, 1, 3, 2);
    System.out.println("expected : 2");
    System.out.println(birthday(sample0, 3, 2));

    /*
    in
    1 1 1 1 1 1
    3 2
    out
    0
     */
    List<Integer> sample1 = Arrays.asList(1, 1, 1, 1, 1, 1);
    System.out.println("expected : 0");
    System.out.println(birthday(sample1, 3, 2));

    /*
    in
    4
    4 1
    out
    1
     */
    List<Integer> sample2 = Arrays.asList(4);
    System.out.println("expected : 1");
    System.out.println(birthday(sample2, 4, 1));
  }

}
