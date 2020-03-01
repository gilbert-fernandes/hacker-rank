package fr.gf.hackerrank;

public class Kangaroo {

  /**
   *
   * we want x1 + y * v1 = x2 + y * v2
   * turning this into an equation :
   *
   * x1 + y * v1 - x2 - y * v2 = 0
   * (x1 - x2) + y(v1 - v2) = 0
   * (x1 - x2) / (v1 - v2) = -y
   *
   * We want y > 0 and to be non-fractional
   * Which means that (x1 - x2) % (v1 - v2) = 0
   * for a y to exist that is a natural integer
   *
   * v1 MUST > v2 or we will never catch kangaroo 2 that
   * will get further each turn
   *
   * @param x1 kangaroo 1 start position
   * @param v1 kangaroo 1 speed per turn
   * @param x2 kangaroo 2 start position
   * @param v2 kangaroo 2 speed per turn
   * @return YES or NO if they ever meet
   */
  static String kangaroo(int x1, int v1, int x2, int v2) {
    return (v1 > v2) && ((x1 - x2) % (v1 - v2) == 0) ? "YES" : "NO";
  }

  public static void main(String[] args) {
    System.out.println(kangaroo(0, 2, 5, 3));
  }

}
