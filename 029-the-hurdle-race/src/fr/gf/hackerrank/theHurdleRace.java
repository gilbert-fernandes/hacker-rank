package fr.gf.hackerrank;

/**
 *
 * Dan is playing a video game in which his character competes in a hurdle race
 * Hurdles are of varying heights, and Dan has a maximum height he can jump
 * There is a magic potion he can take that will increase his maximum height by 1 unit for each dose
 *
 * How many doses of the potion must he take to be able to jump all of the hurdles ?
 *
 * Given an array of hurdle heights 'height' and an initial maximum height Dan can jump, k,
 * determine the minimum number of doses Dan must take to be able to clear all the hurdles in the race
 *
 * For example, if height = [1,2,3,3,2] and Dan can jump 1 unit high naturally
 * he must take 3 - 1 = 2 doses of potion to be able to jump all of the hurdles
 *
 */
public class theHurdleRace {

    static int hurdleRace(final int k, final int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++)
            if (height[i] > max) {
                max = height[i];
            }
        return (max < k) ? 0 : max - k;
    }

    public static void main(String[] args) {
        // sample 0
        // input : 1 6 3 5 2
        // output : 2
        System.out.println("expected : 2");
        final int[] sample0 = new int[] {1,6,3,5,2};
        System.out.println(hurdleRace(4, sample0));
    }

}
