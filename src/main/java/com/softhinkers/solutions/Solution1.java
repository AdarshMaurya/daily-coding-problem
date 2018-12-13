package com.softhinkers.solutions;

import com.softhinkers.problems.Problem1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1 implements Problem1 {

    // O(n*n)
    @Override
    public boolean isTwoElementsAdditionIsInList(List<Integer> intList, int twoElementsAddtion) {

        for (int index = 0; index < intList.size(); index++) {
            for (int next = 0; next < intList.size(); next++) {
                if ((twoElementsAddtion == intList.get(index) + intList.get(next)) && (index != next)) {
                    System.out.println("Iteration " + (index + 1));
                    return true;
                }
            }
        }
        return false;
    }


    // O(n)
    public boolean isTwoElementsAdditionIsInList2(List<Integer> intList, int twoElementsAddtion) {
        int counter = 0;
        Set<Integer> set = new HashSet<>(intList); //O(n) : n elements
        for (Integer num : set) { // O(n)
            counter++;
            if (set.contains(twoElementsAddtion - num)) { //O(n)
                System.out.println("Iteration " + counter);
                return true;
            }
        }
        return false;
    }

    public boolean isTwoElementsAdditionIsInList3(List<Integer> intList, int twoElementsAddtion) {
        int counter = 0;
        for (Integer element : intList) {
            counter++;
            if (intList.contains(twoElementsAddtion - element)) {
                System.out.println("Iteration " + counter);
                return true;
            }
        }
        return false;
    }
}
