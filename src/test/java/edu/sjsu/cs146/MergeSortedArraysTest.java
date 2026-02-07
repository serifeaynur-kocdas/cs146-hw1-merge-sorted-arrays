package edu.sjsu.cs146;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * CS 146 - Homework 1
 * JUnit tests for mergeSorted method.
 */
public class MergeSortedArraysTest {

    @Test
    public void testBasicMerge() {
        // Normal case from lecture example
        int[] A = {3, 4, 5, 8};
        int[] B = {1, 2, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expected, MergeSortedArrays.mergeSorted(A, B));
    }

    @Test
    public void testFirstArrayEmpty() {
        // If A is empty, result should just be B
        int[] A = {};
        int[] B = {1, 2, 3};
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, MergeSortedArrays.mergeSorted(A, B));
    }

    @Test
    public void testSecondArrayEmpty() {
        // If B is empty, result should just be A
        int[] A = {1, 2, 3};
        int[] B = {};
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, MergeSortedArrays.mergeSorted(A, B));
    }

    @Test
    public void testWithDuplicates() {
        // Check that duplicates are merged correctly
        int[] A = {1, 2, 2};
        int[] B = {2, 3};
        int[] expected = {1, 2, 2, 2, 3};

        assertArrayEquals(expected, MergeSortedArrays.mergeSorted(A, B));
    }

    @Test
    public void testBothArraysEmpty() {
        // Edge case: both arrays empty
        int[] A = {};
        int[] B = {};
        int[] expected = {};

        assertArrayEquals(expected, MergeSortedArrays.mergeSorted(A, B));
    }
}
