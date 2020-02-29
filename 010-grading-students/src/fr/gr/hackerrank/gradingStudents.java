package fr.gr.hackerrank;

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
     * It should return an integer array consisting of rounded grades.
     * gradingStudents has the following parameter(s):
     * grades: an array of integers representing grades before rounding
     *
     * The first line contains a single integer, n, the number of students
     * Each line i of the n subsequent lines contains a single integer, grades[i]
     * denoting student i grade.
     *
     * Constraints
     * 1 <= n <= 60
     * 0 <= grades[i] <= 100
     *
     * For each grades[i] print the rounded grade on a nez line
     *
     * Sample Input 0
     * 4
     * 73
     * 67
     * 38
     * 33
     *
     * Sample Output 0
     * 75
     * 67
     * 40
     * 33
     *
     * @param grades
     * @return
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {

    }

    public static void main(String[] args) {

    }

}
