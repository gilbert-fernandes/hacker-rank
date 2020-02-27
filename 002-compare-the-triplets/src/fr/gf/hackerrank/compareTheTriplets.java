package fr.gf.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class compareTheTriplets {

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int alicePoints = 0;
    int bobPoints = 0;

    int[] aliceTriplets = new int[a.size()];
    for (int i = 0; i < a.size(); i++) {
      aliceTriplets[i] = a.get(i);
    }

    int[] bobTriplets = new int[b.size()];
    for (int i = 0; i < b.size(); i++) {
      bobTriplets[i] = b.get(i);
    }

    for (int i = 0; i < 3; i++) {
      if (aliceTriplets[i] > bobTriplets[i]) {
        alicePoints++;
      } else if (aliceTriplets[i] < bobTriplets[i]) {
        bobPoints++;
      }
    }

    List<Integer> returnObject = new ArrayList<>();
    returnObject.add(alicePoints);
    returnObject.add(bobPoints);
    return returnObject;
  }

  public static void main(String[] args) {
    // sample input 1

    List<Integer> alist = new ArrayList<>();
    // 17 28 30
    alist.add(17);
    alist.add(28);
    alist.add(30);

    List<Integer> blist = new ArrayList<>();
    // 99 16 8
    blist.add(99);
    blist.add(16);
    blist.add(8);
    System.out.println(compareTriplets(alist,blist));
  }

}
