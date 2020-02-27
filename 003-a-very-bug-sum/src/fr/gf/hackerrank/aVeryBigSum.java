package fr.gf.hackerrank;

public class aVeryBigSum {

  static long aVeryBigSum(long[] ar) {
    // nothing special when using Java's long
    // this exercice is pointless
    long sum = 0;
    for (long l : ar) {
      sum += l;
    }
    return sum;
  }

  public static void main(String[] args) {
    long[] arr = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
    System.out.println(aVeryBigSum(arr));
  }

}
