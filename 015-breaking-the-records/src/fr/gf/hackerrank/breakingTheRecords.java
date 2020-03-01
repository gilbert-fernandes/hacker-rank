package fr.gf.hackerrank;

import java.util.Arrays;

/**
 * received array gives score, game by game
 * we record the highest and lowest, and how many times they get updated
 * we return the number of updates
 */
public class breakingTheRecords {

  static int[] breakingRecords(int[] scores) {
    int[] result = new int[2];
    int lowest = scores[0];
    int highest = scores[0];
    for(int i : scores) {
      if(i < lowest) {
        result[1]++;
        lowest = i;
      }
      if(i > highest) {
        highest = i;
        result[0]++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] scores = new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1};
    int[] result = breakingRecords(scores);
    System.out.println(result[0] + " " + result[1]) ;
  }

}
