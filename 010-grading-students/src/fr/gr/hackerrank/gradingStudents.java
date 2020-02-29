package fr.gr.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * HackerLand University has the following grading policy:
 * Every student receives a grade in the inclusive range from 0 to 100
 * Any tess than 40 is a failing grade.
 * <p>
 * Sam is a professor at the university and likes to round each student's grades
 * according to these rules:
 * <p>
 * If the difference between the grade and the next multiple of 5 is less than 3,
 * round grade up to the next multiple of 5
 * <p>
 * If the value of grade is less than 38 no rounding occurs as the result will still be a failing grade.
 * <p>
 * For example, grade = 84 will be rounded to 85 but grade=29 will not be rounded because the rounding
 * would result in a number that is less than 40
 * <p>
 * Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
 *
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class gradingStudents {

    /**
     * Complete the function gradingStudents in the editor below.
     *
     * Constraints
     * 1 <= n <= 60
     * 0 <= grades[i] <= 100
     *
     * Sample Input 0
     * 73, 67, 38, 33
     *
     * Sample Output 0
     * 75, 67, 40, 33
     *
     * @param grades list of grades
     * @return rounded list of grades
     */
    public static List<Integer> gradingStudents(final List<Integer> grades) {
        List<Integer> rounded = new ArrayList<>(grades.size());
        for(Integer i : grades) {
            // If the value of grade is less than 38 no rounding occurs
            // If the difference between the grade and the next multiple of 5 is less than 3
            // round grade up to the next multiple of 5
/*            if(i < 38 || i % 5 < 3) {
                //System.out.println(i + " -> not rounding");
                rounded.add(i);
            } else {
                Integer r = (i + 5) - (i % 5);
                //System.out.println(i + " -> " + r);
                rounded.add(r);
            }*/
            rounded.add(i < 38 || i % 5 < 3 ? i
                                            : (i + 5) - (i % 5));
        }
        return rounded;
    }

    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(73,67,38,33);
        System.out.println("grades   = " + Arrays.asList(test));
        System.out.println("expected = [[75, 67, 40, 33]]");

        List<Integer> roundedGrades = gradingStudents(test);
        System.out.println("rounded  = " + Arrays.asList(roundedGrades));
    }

}
