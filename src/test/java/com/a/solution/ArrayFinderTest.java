package com.a.solution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArrayFinderTest {

    @Test
    public void testRegularCase() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subarray = {3, 7};
        assertEquals(2, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testSubarrayNotFound() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subarray = {5, 6};
        assertEquals(-1, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testSubarrayAtStart() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subarray = {4, 9};
        assertEquals(0, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testSubarrayAtEnd() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subarray = {7, 8};
        assertEquals(3, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testSubarrayIsEntireArray() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subarray = {4, 9, 3, 7, 8};
        assertEquals(0, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] subarray = {3, 7};
        assertEquals(-1, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testEmptySubarray() {
        int[] array = {4, 9, 3, 7, 8};
        int[] subarray = {};
        assertEquals(-1, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testBothArraysEmpty() {
        int[] array = {};
        int[] subarray = {};
        assertEquals(-1, ArrayFinder.findSubarrayIndex(array, subarray));
    }

    @Test
    public void testSubarrayLongerThanArray() {
        int[] array = {4, 9};
        int[] subarray = {4, 9, 3};
        assertEquals(-1, ArrayFinder.findSubarrayIndex(array, subarray));
    }
}
