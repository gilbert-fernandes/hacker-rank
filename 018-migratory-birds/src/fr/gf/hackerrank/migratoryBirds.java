package fr.gf.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * You have been asked to help study the population of birds migrating across the continent.
 * Each type of bird you are interested in will be identified by an integer value.
 * Each time a particular kind of bird is spotted, its id number will be added to your array of sightings.
 * You would like to be able to find out which type of bird is most common given a list of sightings.
 * Your task is to print the type number of that bird and if two or more types of birds are equally common,
 * choose the type with the smallest ID number.
 *
 * For example, assume your bird sightings are of types arr=[1,1,2,2,3]
 * There are two each of types 1 and 2, and one sighting of type 3.
 * Pick the lower of the two types seen twice: type 1
 *
 * Complete the migratoryBirds function in the editor below.
 * It should return the lowest type number of the most frequently sighted bird.
 *
 */
public class migratoryBirds {

  /*
   * It is guaranteed that each type is 1,2,3,4,5
   */
  static int migratoryBirds(List<Integer> arr) {
    // array to store found types
    int[] typesFound = new int[5];
    for(Integer i : arr) {
      typesFound[i-1]++;
    }

    // output stats (dev only)
//    int index = 0;
//    for(int i : typesFound) {
//      System.out.println("type " + (index++ +1) + " : " + i);
//    }

    // find out highest-type index
    int highestTypeIndex = 0;
    int highestType = 0;
    for(int i=0; i<5; i++) {
      if (typesFound[i] > highestType) {
        highestType = typesFound[i];
        highestTypeIndex = i;
      }
    }
    return highestTypeIndex+1;
  }

  public static void main(String[] args) {
//    System.out.println("sample0");
    List<Integer> sample0 = Arrays.asList(1, 4, 4, 4, 5, 3);
//    System.out.println("expected = 4");
    System.out.println(migratoryBirds(sample0));

//    System.out.println();

//    System.out.println("sample1");
    List<Integer> sample1 = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
//    System.out.println("expected = 3");
    System.out.println(migratoryBirds(sample1));
  }

}
