package fr.gf.hackerrank;

public class simpleArraySum {

  static int simpleArraySum(int[] ar) {
    int sum = 0;
    for (int i : ar) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] test = new int[] {1, 2, 3};
    System.out.println("sum = " + simpleArraySum(test));
  }

}
