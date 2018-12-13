package com.softhinkers.test;

import com.softhinkers.solutions.Solution1;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import static com.softhinkers.utility.GenericRandomGenerator.*;

public class TestSolution1 {

    public static void main(String[] args) {
        testSolution1();
        testSolution2();
        testSolution3();
    }

    static int twoNumberAddition = generateRandomNumber(-100000, 100000);
    //static List<Integer> intList = generateListOfInteger(100000, -100000, 100000);
    //static List<Integer> intList = generateUniqueListOfInteger(100000, -100000, 100000);
    //static List<Integer> intList = generateUniqueSortedListOfInteger(100000, -100000, 100000);
    static List<Integer> intList = generateRandomSizeListOfInteger(100000, -100000, 100000);

    public static void testSolution1() {
        Instant start = Instant.now();
        Solution1 sol = new Solution1();
        boolean isPresent = sol.isTwoElementsAdditionIsInList(intList, twoNumberAddition);
        Instant end = Instant.now();

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds\n");

        if (isPresent) {
            System.out.println(twoNumberAddition + " can be added with two elements present in the list ");
        } else {
            System.out.println(twoNumberAddition + ": cannot be added with two elements present in the list");
        }
        System.out.println("---------------------------------");
    }

    public static void testSolution2() {
        Instant start2 = Instant.now();
        Solution1 sol2 = new Solution1();
        boolean isPresent2 = sol2.isTwoElementsAdditionIsInList2(intList, twoNumberAddition);
        Instant end2 = Instant.now();

        Duration timeElapsed2 = Duration.between(start2, end2);
        System.out.println("Time taken: " + timeElapsed2.toMillis() + " milliseconds\n");

        if (isPresent2) {
            System.out.println(twoNumberAddition + " can be added with two elements present in the list ");
        } else {
            System.out.println(twoNumberAddition + ": cannot be added with two elements present in the list");
        }
        System.out.println("---------------------------------");
    }

    public static void testSolution3() {
        Instant start3 = Instant.now();
        Solution1 sol3 = new Solution1();
        boolean isPresent3 = sol3.isTwoElementsAdditionIsInList3(intList, twoNumberAddition);
        Instant end3 = Instant.now();

        Duration timeElapsed3 = Duration.between(start3, end3);
        System.out.println("Time taken: " + timeElapsed3.toMillis() + " milliseconds\n");

        if (isPresent3) {
            System.out.println(twoNumberAddition + " can be added with two elements present in the list ");
        } else {
            System.out.println(twoNumberAddition + ": cannot be added with two elements present in the list");
        }
        System.out.println("---------------------------------");
    }
}
