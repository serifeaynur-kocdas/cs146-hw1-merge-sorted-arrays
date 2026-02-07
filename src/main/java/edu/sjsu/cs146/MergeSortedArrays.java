package edu.sjsu.cs146;

/**
 * CS 146 - Homework 1
 * Merge two sorted arrays.
 *
 * This follows the MERGE step from MergeSort:
 * - A is already sorted
 * - B is already sorted
 * - We combine them into one sorted array
 *
 * The final array size must be A.length + B.length.
 */
public class MergeSortedArrays {

    /**
     * Merge two sorted arrays into one sorted array.
     *
     * Example:
     * A = {3,4,5,8}
     * B = {1,2,6,7}
     * Result = {1,2,3,4,5,6,7,8}
     */
    public static int[] mergeSorted(int[] A, int[] B) {

        // Create result array large enough to hold all elements
        int[] result = new int[A.length + B.length];

        // i = pointer for array A
        // j = pointer for array B
        // k = pointer for result array
        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements while both arrays still have values
        while (i < A.length && j < B.length) {

            // Take the smaller element and move that pointer
            if (A[i] <= B[j]) {
                result[k] = A[i];
                i++;  // move pointer in A
            } else {
                result[k] = B[j];
                j++;  // move pointer in B
            }

            k++;  // always move result pointer
        }

        // If A still has elements left, copy them
        while (i < A.length) {
            result[k] = A[i];
            i++;
            k++;
        }

        // If B still has elements left, copy them
        while (j < B.length) {
            result[k] = B[j];
            j++;
            k++;
        }

        return result;
    }
}
