package fr.gf.hackerrank;

/**
 *
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
 * During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U,
 * or a downhill, D step. Gary's hikes start and end at sea level and each step up or down represents a 1
 * unit change in altitude. We define the following terms:
 *
 * - A mountain is a sequence of consecutive steps above sea level,
 *   starting with a step up from sea level and ending with a step down to sea level.
 * - A valley is a sequence of consecutive steps below sea level,
 * starting with a step down from sea level and ending with a step up to sea level.
 *
 * Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys
 * he walked through. For example, if Gary's path is s = [ DDUUUUDD ] he first enters a valley 2 units deep.
 * Then he climbs out an up onto a mountain 2 units high.
 * Finally, he returns to sea level and ends his hike.
 *
 * Complete the countingValleys function in the editor below.
 * It must return an integer that denotes the number of valleys Gary traversed.
 * countingValleys has the following parameter(s):
 *
 * - n: the number of steps Gary takes
 * - s: a string describing his path
 *
 */
public class countingValleys {

  static int countingValleys(int n, String s) {
    // sea level is 0
    // we track going down as -1
    // going up as +1
    // and record how many times we cross the 0 line
    int valleys = 0;
    int level = 0;
    for(int i=0; i<n; i++) {
      char c = s.charAt(i);
      if(c == 'D') {
        // going down
        level--;
//        System.out.println("going down, level = " + level);
      } else if(c == 'U') {
        // going up
        level++;
//        System.out.println("going up, level = " + level);
        // if level reaches 0 we are back at sea level
        if(level == 0) {
          valleys++;
//          System.out.println("sea level, number of valleys = " + valleys);
        }
      }
//      System.out.println(c);
    }
//    System.out.println();
    return valleys;
  }

  public static void main(String[] args) {
    // sample0
    // 8
    // UDDDUDUU
    // output -> 1
    /*
     *     _/\      _
     *        \    /
     *         \/\/
     *
     * _ as sea level
     * / as up
     * \ as down
     *
     * we start from sea level, and go back to it -> we entered and left ONE valley
     *
     */
    System.out.println(countingValleys(8, "UDDDUDUU"));
  }

}
