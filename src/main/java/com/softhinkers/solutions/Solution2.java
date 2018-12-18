package com.softhinkers.solutions;

import com.softhinkers.problems.Problem2;

public class Solution2 implements Problem2 {
    @Override
    public int[] arrayElementWithProductOfAllElementExceptInIthIndex(int[] inputIntArray) {//O(n*n)
        int[] productArray = new int[inputIntArray.length];

        for (int index = 0; index < inputIntArray.length; index++) {//O(n)
            productArray[index] = generateProductFromSubSetOfArrayIgnoringIthIndexElement(inputIntArray, index);//O(n)
        }
        return productArray;
    }

    public int generateProductFromSubSetOfArrayIgnoringIthIndexElement(int[] parentArray, int ignoreIndex) {
        int product = 1;
        for (int index = 0; index < parentArray.length; index++) {//O(n)
            if (index == ignoreIndex) continue;//O(1)
            product *= parentArray[index];//O(1)
        }
        return product;
    }


    /*
       {              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }
       { a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }
     https://stackoverflow.com/questions/2680548/given-an-array-of-numbers-return-array-of-products-of-all-other-numbers-no-div?answertab=votes#tab-top

     Both of which can be done in O(n) by starting at the left and right edges respectively.
     Then multiplying the two arrays element by element gives the required result
     */
    public int[] generateProductFromSubSetOfArrayIgnoringIthIndexElement2(int[] inputIntArray) { //O(N) time-complexity
        int N = inputIntArray.length;
        int[] a = new int[N]; // This is the input
        a = inputIntArray;
        int[] products_below = new int[N];
        int p = 1;
        for (int i = 0; i < N; ++i) { //O(N)
            products_below[i] = p;
            p *= a[i];
        }

        int[] products_above = new int[N];
        p = 1;
        for (int i = N - 1; i >= 0; --i) {
            products_above[i] = p;
            p *= a[i];
        }

        int products[] = new int[N]; // This is the result
        for (int i = 0; i < N; ++i) {
            products[i] = products_below[i] * products_above[i];
        }

        return products;
    }

    public int[] generateProductFromSubSetOfArrayIgnoringIthIndexElement3(int[] inputIntArray) { //O(N) time-complexity, O(1) space
        int N = inputIntArray.length;
        int[] a = new int[N]; // This is the input
        int[] products = new int[N];
        a = inputIntArray;

        int p = 1;
        for (int i = 0; i < N; ++i) { //O(N)
            products[i] = p;
            p *= a[i];
        }


        p = 1;
        for (int i = N - 1; i >= 0; --i) {
            products[i] *= p;
            p *= a[i];
        }

        return products;
    }

    public int[] generateProductFromSubSetOfArrayIgnoringIthIndexElement4(int[] inputIntArray) {//O(n)
        int[] productArray = new int[inputIntArray.length];
        int product = 1;

        for (int index = 0; index < inputIntArray.length; index++) {//O(n)
            product *= inputIntArray[index];//O(1)
        }
        for (int index = 0; index < inputIntArray.length; index++) {//O(n)
            productArray[index] = product / inputIntArray[index];
        }
        return productArray;
    }


}
