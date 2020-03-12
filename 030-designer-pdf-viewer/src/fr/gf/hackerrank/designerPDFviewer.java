package fr.gf.hackerrank;

import java.util.HashMap;

/**
 *
 * In this challenge, you will be given a list of letter heights in the alphabet and a string
 * Using the letter heights given, determine the area of the rectangle highlight in mm2
 * assuming all letters are 1 mm wide
 *
 * For example, the highlighted word=torn
 * Assume the heights of the letters are t=2, o=1, r=1 and n=1
 * The tallest letter is 2 high and there are 4 letters
 * The hightlighted area will be 2 * 4 mm = 8 mm
 *
 */
public class designerPDFviewer {

    static int designerPdfViewer(int[] h, String word) {
        // create HashMap with each letter + associated size from array
        HashMap<Character, Integer> map = new HashMap<>();
        int index = 0;
        for(char c='a'; c <= 'z'; c++) {
            map.put(c, h[index]);
            index++;
        }
        // now loop over string and grab size for each char from the constructed map
        // what we want is to find out the biggest char in size and store this as maximum
        // since smaller chars will fit below this size, once we have found the max all we have
        // to do is max * length for total size in mm2
        int maximum = 0;
        for(int i=0; i < word.length(); i++) {
            final int value = map.get(word.charAt(i));
            if(value > maximum) {
                maximum = value;
            }
        }
        // now that we have found the maximum, just return max * length for area
        return maximum * word.length();
    }

    /**
     *
     * input format
     * The first line contains 26 space-separated integers describing the respective heights of each consecutive
     * lowercase English letter, ascii[a-z].
     * The second line contains a single word, consisting of lowercase English alphabetic letters.
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
        // abc
        final int[] sizes = new int[] {1, 3, 1, 3, 1, 4, 1, 3, 2,
                                       5, 5, 5, 5, 5, 5, 5, 5, 5,
                                       5, 5, 5, 5, 5, 5, 5, 5};
        System.out.println("expected : 9");
        System.out.println(designerPdfViewer(sizes, "abc"));
    }
}
