package fr.gf.hackerrank;

/**
 *
 * Brie’s Drawing teacher asks her class to open their books to a page number.
 * Brie can either start turning pages from the front of the book or from the back of the book.
 * She always turns pages one at a time. When she opens the book, page is always on the right side :
 *
 *   +------+------+
 *   |      |      |
 *   |      |      |
 *   |      |    1 |
 *   +------+------+
 *
 * When she flips page 1, she sees pages 2 and 3.
 * Each page except the last page will always be printed on both sides.
 * The last page may only be printed on the front, given the length of the book.
 * If the book is n pages long, and she wants to turn to page p
 * what is the minimum number of pages she will turn?
 * She can start at the beginning or the end of the book.
 *
 * Given n and p, find and print the minimum number of pages Brie must turn in order to arrive at page p.

 */
public class drawingBook {

  /**
   * return the minimum number of pages to turn in a book made of n pages
   * to reach page p. calculate turning from beginning or end of book
   * and return the lowest number of pages to turn to reach page
   *
   * @param n number of pages in book
   * @param p page we want to reach
   * @return minimum pages to turn to reach page from either beginning or end
   */
  static int pageCount(int n, int p) {
    // 2 pages per sheet
    final int total = n / 2;
    // amount of pages to the right and left
    final int toTheRight = p / 2;
    final int toTheLeft = total - toTheRight;
    return Math.min(toTheRight, toTheLeft);
  }

  public static void main(String[] args) {
    // sample0
    // 6, 2
    // expected -> 1
    // 1 page from page 1
    // 2 pages from page 6
    System.out.println("6,2 -> 1");
    System.out.println(pageCount(6,2));
    // sample1
    // 5, 4
    // expected -> 0
    // 2 pages from page 1
    // none from page 5 : page 4 is already visible
    System.out.println("5,4 -> 0");
    System.out.println(pageCount(5,4));
  }

}
