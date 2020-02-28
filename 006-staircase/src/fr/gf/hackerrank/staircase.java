package fr.gf.hackerrank;

public class staircase {

  /*
   * n is height of tower
   * number of spaces to add is n-1 from first line, remove 1 space per line after
   * number of # to add after spaces : 1 per line, add 1 per line after
   *
   * n=4
   * 123#
   * 12##
   * 1###
   * ####
   *
   */
  static void staircase(int n) {
    int spaces = n-1;
    int marks = 1;
    for(int i=1; i<n+1; i++) {
      // print spaces " "
      for(int s=0; s<spaces; s++) {
        System.out.print(" ");
      }
      // print marks
      for(int m=0; m<marks; m++) {
        System.out.print("#");
      }
      // endline, prepare next loop
      System.out.println();
      spaces--;
      marks++;
    }
  }

  public static void main(String[] args) {
    staircase(14);
  }

}
