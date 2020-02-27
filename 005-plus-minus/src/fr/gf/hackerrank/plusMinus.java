package fr.gf.hackerrank;

public class plusMinus {

  static void plusMinus(int[] arr) {
    float positives = 0;
    float negatives = 0;
    float zeroes = 0;
    for (int i : arr) {
      if (i > 0) {
        positives++;
      } else if (i < 0) {
        negatives++;
      } else {
        zeroes++;
      }
    }
    final float size = arr.length;
    System.out.println(String.format("%.6f", positives / size));
    System.out.println(String.format("%.6f", negatives / size));
    System.out.println(String.format("%.6f", zeroes / size));
  }

  public static void main(String[] args) {
    // sample input : -4 3 -9 0 4 1
    int[] sample = new int[] {-4, 3, -9, 0, 4, 1};
    plusMinus(sample);
  }

}
