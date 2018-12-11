package com.softhinkers.test;

import com.softhinkers.solutions.Solution1a;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import static com.softhinkers.utility.GenericRandomGenerator.generateRandomNumber;
import static com.softhinkers.utility.GenericRandomGenerator.generateListOfInteger;

public class TestSolution1 {

    public static void main(String[] args) {
        testSolution1();
    }

    public static void testSolution1() {
        List<Integer> intList = generateListOfInteger(100000, 0, 100000);
        int twoNumberAddition = generateRandomNumber(0, 100000);

        Instant start = Instant.now();
        Solution1a sol = new Solution1a();
        boolean isPresent = sol.isTwoElementsAdditionIsInList(intList, twoNumberAddition);
        Instant end = Instant.now();

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds\n");

        if (isPresent) {
            System.out.println(twoNumberAddition + " can be added with two elements present in the list ");
        } else {
            System.out.println(twoNumberAddition + ": cannot be added with two elements present in the list");
        }
    }
}
