package fr.gf.hackerrank;

/**
 *
 * We define a magic square to be an n x m matrix of distinct positive integers from 1 to n^2
 * where the sum of any row, column, or diagonal of length n is always equal to the same number:
 * the magic constant.
 *
 * You will be given a 3 x 3 matrix of s integers in the inclusive range [1,9]
 * We can convert any digit a to any other digit b in the range [1,9] at cost of |a - b|
 * Given s convert it into a magic square at minimal cost.
 * Print this cost on a new line.
 *
 * Note: The resulting magic square must contain distinct integers in the inclusive range [1,9]
 *
 * For example, we start with the following matrix s :
 *
 *   5 3 4
 *   1 5 8
 *   6 4 2
 *
 * We can convert it to the following magic square :
 *
 *   8 3 4
 *   1 5 9
 *   6 7 2
 *
 * This took three replacements at cost |5 - 8| + |8 - 9| + |4 - 7| = 7
 *
 */
public class magicSquare {

  static int formingMagicSquare(int[][] s) {
    // TODO
  }

  public static void main(String[] args) {
    // TODO
  }
}
