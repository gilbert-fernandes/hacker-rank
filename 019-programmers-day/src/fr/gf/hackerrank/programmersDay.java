package fr.gf.hackerrank;

/*
 * Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer
 * (the 256th day of the year) during a year in the inclusive range from 1700 to 2700
 *
 * From 1700 to 1917, Russia's official calendar was the Julian calendar;
 * since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system
 * occurred in 1918, when the next day after January 31th was February 14th.
 * [ skipping Feb 01 to Feb 13 ]
 * This means that in 1918, February 14th was the 32th ay of the year in Russia.
 *
 * In both calendar systems, February is the only month with a variable amount of days;
 * it has 29 days during a leap year, and 28 days during all other years.
 * In the Julian calendar, leap years are divisible by 4\
 * In the Gregorian calendar, leap years are either of the following:
 * - divisible by 400
 * - divisible by 4 but not by 100
 *
 * Given a year y, find the date of the 256th day of that year according to the official Russian calendar
 * during that year. Then print it in the format dd.mm.yyyy
 *
 */
public class programmersDay {

  static String dayOfProgrammer(int year) {
    return "";
  }

  public static void main(String[] args) {
    System.out.println("expected : 13.09.2017");
    System.out.println(dayOfProgrammer(2017));
    System.out.println();

    System.out.println("expected : 12.09.2016");
    System.out.println(dayOfProgrammer(2016));
    System.out.println();

    System.out.println("expected : 12.09.1800");
    System.out.println(dayOfProgrammer(1800));
    System.out.println();
  }

}
