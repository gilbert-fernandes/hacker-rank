package fr.gf.hackerrank;

/**
 * Given a time in 24-hour AM/PM format, convert it to military (24-hour) time
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock
 * Complete the timeConversion function in the editor below. It should return a new string representing
 * the input time in 24 hour format.
 * timeConversion has the following parameter(s): s: a string representing time in hour format
 * A single string s containing a time in 12-hour clock format (i.e.:hh:mm:ssAM or hh:mm:ssPM),
 * where 01 <= hh <= 12 and 00 <= mm,ss <= 59
 */
public class timeConversion {

  static String timeConversion(String s) {
    // could directly use some kind of scan based method..
    // but seriously, I would directly parse the time string as Time
    // and re-output it properly in the target format
    // re-doing all of this.. is non optimal
    final String[] splitted = s.split(":");
    final String meridian = splitted[2].substring(2);
    int hours = Integer.parseInt(splitted[0]);
    // Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock.
    if(meridian.equalsIgnoreCase("AM")) {
      if(hours == 12) {
        hours = 0;
      }
    } else {
      if(hours != 12)
        hours += 12;
    }
    final int minutes = Integer.parseInt(splitted[1]);
    final int seconds = Integer.parseInt(splitted[2].substring(0, 2));
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }

  public static void main(String[] args) {
    // sample input : 07:05:45PM
    // expected     : 19:05:45
    System.out.println(timeConversion("07:05:45PM"));
    System.out.println(timeConversion("12:40:22AM"));
    System.out.println(timeConversion("12:45:54PM"));
  }

}
