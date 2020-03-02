package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Anna and Brian are sharing a meal at a restaurant and they agree to split the bill equally.
 * Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item.
 * Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
 *
 * For example, assume the bill has the following prices:
 * bill=[2,4,6]. Anna declines to eat item k=bill[2] which costs 6.
 * If Brian calculates the bill correctly, Anna will pay (2+4)/2=6.
 * If he includes the cost of bill[2], he will calculate (2+4+6)/2=3.
 * In the second case, he should refund 3 to Anna.
 */
public class bonAppetit {

  static void bonAppetit(List<Integer> bill, int k, int b) {
    // make a copy of bill items and reset what Anna didn't eat
    int[] arrayCopy = bill.stream().mapToInt(i->i).toArray();
    arrayCopy[k] = 0;
    // calculate correctly and compare to what bill charged
    final int properPrice = Arrays.stream(arrayCopy).sum() / 2;
    System.out.println(properPrice == b ? "Bon Appetit" : b - properPrice);
  }

  public static void main(String[] args) {
    // sample 0
    // k= 1
    // bill= 3 10 2 9
    // b = 12
    // result = 5
    List<Integer> sample0 = Arrays.asList(3, 10, 2, 9);
    System.out.println("expected = 5");
    bonAppetit(sample0, 1, 12);

    // sample 1
    // n,k = 4 1
    // bill = 3 10 2 9
    // b = 7
    // result = Bon Appetit
    List<Integer> sample1 = Arrays.asList(3, 10, 2, 9);
    System.out.println("expected = Bon Appetit");
    bonAppetit(sample1, 1, 7);
  }

}
