package com.dsa.learning.arrays;

public class SelectionSortRightToLeft {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Complexity is O(n*n) = n square
        for (int firstSortedIndex = 0; firstSortedIndex < intArray.length - 1; firstSortedIndex++) {
            int largestIndex = intArray.length - 1;
            for (int i = intArray.length - 2; i >= firstSortedIndex; i--) {
                if (intArray[i] > intArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(intArray, largestIndex, firstSortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
