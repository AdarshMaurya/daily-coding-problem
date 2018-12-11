package com.softhinkers.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenericRandomGenerator {

    public static List<Integer> generateRandomSizeListOfInteger(int maxElement, int rangeMin, int rangeMax) {

        List<Integer> intList = new ArrayList<>();
        Random random = new Random();

        int listSize = random.nextInt(maxElement + 1);

        for (int index = 0; index < listSize; index++) {
            intList.add(random.nextInt((rangeMax + 1) - rangeMin) + rangeMin);
        }
        System.out.println("ListSize: "+intList.size());
        System.out.println(intList);
        return intList;

    }

    public static List<Integer> generateListOfInteger(int maxElement, int rangeMin, int rangeMax) {

        List<Integer> intList = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < maxElement; index++) {
            intList.add(random.nextInt((rangeMax + 1) - rangeMin) + rangeMin);
        }
        System.out.println("ListSize: "+intList.size());
        System.out.println(intList);
        return intList;

    }

    public static int generateRandomNumber(int rangeMin, int rangeMax) {
        Random random = new Random();
        return random.nextInt((rangeMax + 1) - rangeMin) + rangeMin;
    }
}
