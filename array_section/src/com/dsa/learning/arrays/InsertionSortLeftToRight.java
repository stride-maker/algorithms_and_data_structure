package com.dsa.learning.arrays;

public class InsertionSortLeftToRight {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Complexity is O(n*n) = n square
        for (int firstUnSortedIndex = 1; firstUnSortedIndex < intArray.length; firstUnSortedIndex++) {
            int newElement = intArray[firstUnSortedIndex];
            for (int i = firstUnSortedIndex; i > 0; i--) {
                if (newElement < intArray[i - 1]) {
                    intArray[i] = intArray[i - 1];
                    intArray[i - 1] = newElement;
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
