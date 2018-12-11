package com.softhinkers.problems;

/*

Daily Coding Problem: Problem #1

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

for example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

*/

import java.util.List;

public interface Problem1 {
    boolean isTwoElementsAdditionIsInList(List<Integer> intList, int twoElementsAddtion);

}
