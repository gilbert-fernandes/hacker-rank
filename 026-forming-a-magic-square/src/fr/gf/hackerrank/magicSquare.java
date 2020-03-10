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

  /**
   *
   * https://en.wikipedia.org/wiki/Magic_square
   *
   * Fastest way is to start from all pre-computed magic squares of rank 3
   * We loop and calculate the absolute difference between the supplied square
   * and each of the possible ones, recording the cost.
   * We return the lowest cost found to fix and return a fixed valid magic square
   * (which is not asked of us).
   *
   * 4,9,2    4,3,8    2,9,4    2,7,6
   * 3,5,7    9,5,1    7,5,3    9,5,1
   * 8,1,6    2,7,6    6,1,8    4,3,8
   *
   * 8,1,6    8,3,4    6,7,2    6,1,8
   * 3,5,7    1,5,9    1,5,9    7,5,3
   * 4,9,2    6,7,2    8,3,4    2,9,4
   *
   * @param s magic square to fix
   * @return minimum cost to fix to valid magic square
   */

  static int[][] precalc = new int[][]{
      {492, 357, 816},
      {438, 951, 276},
      {294, 753, 618},
      {276, 951, 438},
      {816, 357, 492},
      {834, 159, 672},
      {672, 159, 834},
      {618, 753, 294}
};

  static int formingMagicSquare(int[][] s) {
    // sum of all values in a magic square of rank 3 is always 45
    // thus cost will be <= 45
    int min = 45;

    int[] row = new int[3];

    for (int i = 0; i < precalc.length; i++) {
      // grab one from precalculated, reset cost to 0
      int[] p = precalc[i];
      int cost = 0;
      // calculate cost to change supplied square towards current precalculated
      for (int k = 0; k < 3; k++) {
        row[0] = p[k] % 1000 / 100;
        row[1] = p[k] % 100 / 10;
        row[2] = p[k] % 10;
        for (int j = 0; j < 3; j++) {
          // either cost or 0 if no change required
          cost += row[j] == s[k][j] ? 0
                                    : Math.abs(row[j] - s[k][j]);
        }
      }
      // record min found
      min = Math.min(cost, min);
    }
    return min;
  }

  public static void main(String[] args) {
    /*
     * sample input :
     * 4 8 2
     * 4 5 7
     * 6 1 6
     * output :
     * 4
     */
    int[][] sample0 = new int[][] { { 4, 8, 2 } ,
                                    { 4, 5, 7 } ,
                                    { 6, 1, 6 } };
    System.out.println("expected : 4");
    System.out.println(formingMagicSquare(sample0));
  }
}
