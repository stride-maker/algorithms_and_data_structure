package com.dsa.learning.arrays;

public class InsertionSortRightToLeft {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Complexity is O(n*n) = n square
        for (int lastUnsortedIndex = intArray.length - 2; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            int newElement = intArray[lastUnsortedIndex];
            for (int i = lastUnsortedIndex; i < intArray.length - 1; i++) {
                if (newElement < intArray[i + 1]) {
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = newElement;
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
