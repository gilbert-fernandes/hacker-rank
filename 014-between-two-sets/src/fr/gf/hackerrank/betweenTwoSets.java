package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 *
 * of all the hackrank problems I have seen, this is the most shittiest yet.
 *
 * first, it's not "easy" because of the very poor wording which is confusing
 * and even incorrect when you get to the example, and second, it requires
 * mathematical knowledge of groups, and how numbers are defined to be
 * both part of A and B group, that is :
 * - find the LCM of first group
 * - the tested number MUST be a divisor of that LCM
 * - find the GCD of second group
 * - the test number MUST be a divisor of that GCD
 *
 * in other words : GCD/n && n/LCM if n is to be accepted
 *
 * complexity is for both GCD and LCM steps O(n.log(n))
 * the LCM can quickly get out of hand and overflow
 *
 */
public class betweenTwoSets {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    int result = 0;
    int GCD = applyFunction(b, GCD());
    int LCM = applyFunction(a, LCM());
    for (int i = LCM; i <= GCD; i += LCM) {
        if (GCD % i == 0) {
            result++;
        }
    }
    return result;
  }

  private static int applyFunction(List<Integer> n, BiFunction<Integer, Integer, Integer> f) {
    int result = n.get(0);
    for (int i = 1; i < n.size(); i++) {
        result = f.apply(result, n.get(i));
    }
    return result;
  }

  private static BiFunction<Integer, Integer, Integer> LCM() {
      return (a, b) -> a * (b / GCD().apply(a, b));
  }

  private static BiFunction<Integer, Integer, Integer> GCD() {
      return (a, b) -> {
          while (b > 0) {
              int temp = b;
              b = a % b;
              a = temp;
          }
          return a;
      };
  }

  public static void main(String[] args) {
    List<Integer> listA = Arrays.asList(2, 4);
    List<Integer> listB = Arrays.asList(16, 32, 96);
    System.out.println(getTotalX(listA,listB));
  }

}
