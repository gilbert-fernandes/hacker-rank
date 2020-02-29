package fr.gf.hackerrank;

import java.util.Arrays;

/**
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
 * In the diagram below, the red region denotes his house, where s is the start point,
 * and t is the endpoint. The apple tree is to the left of his house, and the orange
 * tree is to its right. You can assume the trees are located on a single point, where
 * the apple tree is at point a, and the orange tree is at point b.
 *
 *                          a.........s..........t..........b
 *                          d-------->HHHHHHHHHHHH
 *
 * When a fruit falls from its tree, it lands d units of distance from its tree of origin
 * along the x-axis. A negative value of d means the fruit fell d units to the tree's left,
 * and a positive value of means it falls d units to the tree's right.
 *
 * Given the value of d for m apples and n oranges, determine how many apples and oranges
 * will fall on Sam's house (i.e., in the inclusive range [s,t] )?
 *
 */
public class appleAndOrange {

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    // between s and t = house
    // a = apple tree
    // b = orange tree
    // Arrays = distances to tree
    //          negative is left of tree
    //          positive is right of tree
    // apple tree : left of house
    // orange tree : right of house

    // version 1 - basic
    // apples
//    long appleCount = 0;
//    for(int apple : apples) {
//      int applePosition = a + apple;
//      //System.out.println("apple position = " + a + " + " + apple + " = " + applePosition);
//      if(applePosition >= s && applePosition <= t) {
//        appleCount++;
//      }
//    }
//    System.out.println(appleCount);

    // version 2 - lambda
    // stream over apples, filter when +a >= s && +a <= t
    System.out.println(
    Arrays.stream(apples)
          .filter(x -> (x+a) >= s && (x+a) <= t)
          .count()
    );

    // version 1 - basic
//    // oranges
//    long orangeCount = 0;
//    for(int orange : oranges) {
//      int orangePosition = b + orange;
//      //System.out.println("orange position = " + b + " + " + orange + " = " + orangePosition);
//      if(orangePosition >= s && orangePosition <= t) {
//        orangeCount++;
//      }
//    }
//    System.out.println(orangeCount);

    // version 2
    System.out.println(
    Arrays.stream(oranges)
          .filter(x -> (x+b) >= s && (x+b) <= t)
          .count()
    );
  }

  public static void main(String[] args) {
    final int s = 7;
    final int t = 11;
    final int a = 5;
    final int b = 15;
    final int[] apples = new int[] {-2, 2, 1};
    final int[] oranges = new int[] {5, -6};
    System.out.println("expected = 1, 1");
    countApplesAndOranges(s, t, a, b, apples, oranges);
  }
}
