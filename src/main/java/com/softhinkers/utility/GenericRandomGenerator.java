package com.softhinkers.utility;

import java.util.*;

public class GenericRandomGenerator {

    public static List<Integer> generateRandomSizeListOfInteger(int maxElement, int rangeMin, int rangeMax) {

        List<Integer> intList = new ArrayList<>();
        Random random = new Random();

        int listSize = random.nextInt(maxElement + 1);

        for (int index = 0; index < listSize; index++) {
            intList.add(random.nextInt((rangeMax + 1) - rangeMin) + rangeMin);
        }
        System.out.println("\nSize: " + intList.size());
        System.out.println(intList + "\n");
        System.out.println("---------------------------------");
        return intList;

    }

    public static List<Integer> generateUniqueSortedListOfInteger(int maxElement, int rangeMin, int rangeMax) {

        Set<Integer> intSet = new HashSet<>();
        Random random = new Random();

        while (intSet.size() != maxElement) {
            intSet.add(random.nextInt((rangeMax + 1) - rangeMin) + rangeMin);
        }
        List<Integer> intList = new ArrayList<Integer>(intSet);

        System.out.println("\nSize: " + intSet.size());
        System.out.println(intList + "\n");
        System.out.println("---------------------------------");

        return intList;

    }

    public static List<Integer> generateUniqueListOfInteger(int maxElement, int rangeMin, int rangeMax) {
        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        while (intList.size() != maxElement) {
            int val = random.nextInt((rangeMax + 1) - rangeMin) + rangeMin;
            if (!intList.contains(val)) {
                intList.add(val);
            }
        }
        System.out.println("\nSize: " + intList.size());
        System.out.println(intList + "\n");
        System.out.println("---------------------------------");
        return intList;

    }


    public static List<Integer> generateListOfInteger(int maxElement, int rangeMin, int rangeMax) {

        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < maxElement; index++) {
            intList.add(random.nextInt((rangeMax + 1) - rangeMin) + rangeMin);
        }
        System.out.println("\nSize: " + intList.size());
        System.out.println(intList + "\n");
        System.out.println("---------------------------------");
        return intList;

    }

    public static int generateRandomNumber(int rangeMin, int rangeMax) {
        Random random = new Random();
        int randomNumber = random.nextInt((rangeMax + 1) - rangeMin) + rangeMin;
        System.out.println("\nRandom Number: " + randomNumber);
        return randomNumber;
    }

    public static int[] generateRandomIntArray(int maxElement, int rangeMin, int rangeMax) {
        return generateListOfInteger(maxElement, rangeMin, rangeMax).stream().mapToInt(i -> i).toArray();
    }
}
