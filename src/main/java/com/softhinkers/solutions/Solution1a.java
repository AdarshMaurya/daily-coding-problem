package com.softhinkers.solutions;

import com.softhinkers.problems.Problem1;

import java.util.List;

public class Solution1a implements Problem1 {


    @Override
    public boolean isTwoElementsAdditionIsInList(List<Integer> intList, int twoElementsAddtion) {

        for (int index = 0; index < intList.size(); index++) {
            for (int next = 0; next < intList.size(); next++) {
                if ((twoElementsAddtion == intList.get(index) + intList.get(next)) && (index != next)) {
                    System.out.println("Iteration "+(index+1)+" : "+ twoElementsAddtion + " = " + intList.get(index) + " + " + intList.get(next));
                    return true;
                }
            }
        }
        return false;
    }
}
