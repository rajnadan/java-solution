package com.a.solution;

import java.util.Arrays;

public class ArrayFinder {

    public static int findSubarrayIndex(int[] array, int[] subArray) {

        // Invalid input or no match possible
        if (array == null || subArray == null || array.length == 0 || subArray.length == 0 || array.length < subArray.length) {
            return -1;
        }

        for (int i = 0; i <= array.length - subArray.length; i++) {
            // Check if subArray matches the slice of array starting at index i
            if (Arrays.equals(Arrays.copyOfRange(array, i, i + subArray.length), subArray)) {
                return i;
            }
        }

        return -1; // Subarray not found
    }
}
