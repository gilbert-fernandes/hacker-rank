package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * Monica wants to buy a keyboard and a USB drive from her favorite electronics store.
 * The store has several models of each. Monica wants to spend as much as possible for the 2 items, given her budget.
 *
 * Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the
 * amount of money Monica will spend. If she doesn't have enough money to both a keyboard and a USB drive,
 * print -1 instead. She will buy only the two required items.
 *
 * For example, suppose she has b = 60 to spend. Three types of keyboards cost keyboards = [40,50,60].
 * Two USB drives cost drives=[5,8,12]. She could purchase a 40 keyboard + 12 usb drive = 52, or a
 * 50 keyboard + 8 usb drive = 58. She chooses the latter.
 * She can't buy more than 2 items so she can't spend exactly 60.
 *
 */
public class electronicsShop {

  /*
   * sort keyboard in DESC order
   * sort usb keys in  ASC order
   * with this, we now that going one way increases price, the other lowers it
   * and we check if we're within the max amount
   */
  static int getMoneySpent(final int[] keyboards, final int[] drives, final int b) {
    // convert keyboards and int to array of Integer (base type can't be reverse-sorted)
    Integer[] keyboardAsIntegers = Arrays.stream(keyboards).boxed().toArray(Integer[]::new);
    Arrays.sort(keyboardAsIntegers, Collections.reverseOrder());
    // sort usb keys in ASC order
    Arrays.sort(drives);

    // -1 is expected if NOK
    int max = -1;

    // j is not modified in the outer loop
    for(int i=0,j=0; i < keyboardAsIntegers.length; i++) {
      // here we ++ j to cycle over all drives, keyboard by keyboard
      for(; j < drives.length; j++) {
        if (keyboardAsIntegers[i] + drives[j] > b) {
          break;
        }
        if(keyboardAsIntegers[i]+drives[j] > max) {
          max = keyboardAsIntegers[i]+drives[j];
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    // sample0
    // 10 2 3     budget , keyboard.length , drives.length
    // 3 1        keyboards
    // 5 2 8      drives
    final int[] sample0keyboards = new int[] {3, 1};
    final int[] sample0drives = new int[] {5, 2, 8};
    System.out.println("expected = 9");
    System.out.println(getMoneySpent(sample0keyboards, sample0drives, 10));

    // sample1
    // 5 1 1      budget , keyboard.length , drives.length
    // 4          keyboards
    // 5          drives
    final int[] sample1keyboards = new int[] {4};
    final int[] sample1drives = new int[] {5};
    System.out.println("expected = -1");
    System.out.println(getMoneySpent(sample1keyboards, sample1drives, 5));
  }

}
