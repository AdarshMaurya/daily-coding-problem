package com.softhinkers.test;

import com.softhinkers.solutions.Solution2;

import java.time.Duration;
import java.time.Instant;

import static com.softhinkers.utility.GenericRandomGenerator.generateRandomIntArray;

public class TestSolution2 {
    public static void main(String[] args) {
        //int[] test = {1, 2, 3, 4, 5};
        //int[] test = {3, 2, 1};
        int[] test = generateRandomIntArray(10, 1, 10);
        testSolution1(test);
        testSolution2(test);
        testSolution3(test);
        testSolution4(test);

    }

    public static void testSolution1(int[] test) {
        Instant start = Instant.now();
        Solution2 sol = new Solution2();
        int[] result = sol.arrayElementWithProductOfAllElementExceptInIthIndex(test);
        Instant end = Instant.now();

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("\nTime taken: " + timeElapsed.toNanos() / 1000 + " micro second");

        for (Integer value : result)
            System.out.print(value + ",");
    }

    public static void testSolution2(int[] test) {
        Instant start2 = Instant.now();
        Solution2 sol2 = new Solution2();
        int[] result = sol2.generateProductFromSubSetOfArrayIgnoringIthIndexElement2(test);
        Instant end2 = Instant.now();

        Duration timeElapsed2 = Duration.between(start2, end2);
        System.out.println("\n\nTime taken: " + timeElapsed2.toNanos() / 1000 + " micro second");

        for (Integer value : result)
            System.out.print(value + ",");
    }

    public static void testSolution3(int[] test) {
        Instant start3 = Instant.now();
        Solution2 sol3 = new Solution2();
        int[] result = sol3.generateProductFromSubSetOfArrayIgnoringIthIndexElement3(test);
        Instant end3 = Instant.now();

        Duration timeElapsed3 = Duration.between(start3, end3);
        System.out.println("\n\nTime taken: " + timeElapsed3.toNanos() / 1000 + " micro second");

        for (Integer value : result)
            System.out.print(value + ",");
    }

    public static void testSolution4(int[] test) {
        Instant start4 = Instant.now();
        Solution2 sol4 = new Solution2();
        int[] result = sol4.generateProductFromSubSetOfArrayIgnoringIthIndexElement4(test);
        Instant end4 = Instant.now();

        Duration timeElapsed3 = Duration.between(start4, end4);
        System.out.println("\n\nTime taken: " + timeElapsed3.toNanos() / 1000 + " micro second");

        for (Integer value : result)
            System.out.print(value + ",");
    }
}
