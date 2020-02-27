package fr.gf.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class diagonalDifference {

  public static int diagonalDifference(List<List<Integer>> arr) {
    // matrix is not always 3x3 ><
    int leftSum = 0;
    int rightSum = 0;
    for (int i = 0; i < arr.size(); i++) {
      // List -> use .get()
      leftSum += arr.get(i).get(i);
      rightSum += arr.get(i).get(arr.size() - (1 + i));
    }
    return Math.abs(leftSum - rightSum);
  }


  public static void main(String[] args) {
    // sample input
    // 11 2 4
    // 4 5 6
    // 10 8 -12
    List<List<Integer>> outerList = new ArrayList<>();

    List<Integer> line1 = new ArrayList<>();
    line1.add(11);
    line1.add(2);
    line1.add(4);

    List<Integer> line2 = new ArrayList<>();
    line2.add(4);
    line2.add(5);
    line2.add(6);

    List<Integer> line3 = new ArrayList<>();
    line3.add(10);
    line3.add(8);
    line3.add(-12);

    outerList.add(line1);
    outerList.add(line2);
    outerList.add(line3);

    System.out.println(diagonalDifference(outerList));
  }

}
