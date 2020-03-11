package fr.gf.hackerrank;

import java.util.Arrays;

import static java.util.stream.IntStream.of;

/**
 * Alice is playing an arcade game and wants to climb to the top of the leaderboard and wants to track her ranking
 * The game uses Dense Ranking(*), so its leaderboard works like this:
 * <p>
 * (*) https://en.wikipedia.org/wiki/Ranking#Dense_ranking_.28.221223.22_ranking.29
 * <p>
 * The player with the highest score is ranked number 1 on the leaderboard.
 * Players who have equal scores receive the same ranking number, and the next player(s) receive the
 * immediately following ranking number.
 * <p>
 * For example, the four players on the leaderboard have high scores of 100, 90, 80 and 80
 * Those players will have ranks 1, 2, 2, and 3, respectively.
 * ]If Alice's scores are 70, 80 and 105, her rankings after each game are 4, 3and 1st.
 */
public class climbingTheLeaderboard {

    static int[] climbingLeaderboard(final int[] scores, final int[] alice) {
        int[] rank = new int[scores.length];
        int[] res = new int[alice.length];
        rank[0] = 1;

        for (int i = 1; i < scores.length; i++) {
            rank[i] = (scores[i] == scores[i - 1]) ? rank[i - 1]
                    : rank[i - 1] + 1;
        }

        for (int i = 0; i < alice.length; i++) {
            if (alice[i] > scores[0]) {
                res[i] = 1;
            } else if (alice[i] < scores[scores.length - 1]) {
                res[i] = rank[scores.length - 1] + 1;
            } else {
                res[i] = rank[binarySearch(scores, alice[i])];

            }
        }
        return res;
    }

    private static int binarySearch(final int[] a, final int key) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
         * sample input 1
         * 100 100 50 40 40 20 10
         * 5 25 50 120
         * expected output :
         * 6
         * 4
         * 2
         * 1
         *
         * sample input 2
         * 100 90 90 80 75 60
         * 50 65 77 90 102
         * expected output :
         * 6
         * 5
         * 4
         * 2
         * 1
         *
         */
        final int[] sampleScores0 = new int[] { 100, 100, 50, 40, 40, 20, 10 };
        final int[] sampleArray0 = new int[] { 5, 25, 50, 120 };
        System.out.println("expected :\n6\n4\n2\n1\n");
        System.out.println(Arrays.toString(climbingLeaderboard(sampleScores0, sampleArray0)));

      final int[] sampleScores1 = new int[] { 100, 90, 90, 80, 75, 60 };
      final int[] sampleArray1 = new int[] { 50, 65, 77, 90, 102 };
      System.out.println("expected :\n6\n5\n4\n2\n1\n");
      System.out.println(Arrays.toString(climbingLeaderboard(sampleScores1, sampleArray1)));
    }

}
