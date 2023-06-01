package com.dsa.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @Before
    public void setup() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void totalSumShouldReturnZeroWithEmptyArray() {
        int numbers[] = {};

        int expected = 0;
        int actual = maximumSubarray.totalSum(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void totalSumShouldReturnSumOfAllElements() {
        int numbers[] = { 1, 2, 3, 4, 5 };

        int expected = 15;
        int actual = maximumSubarray.totalSum(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumSubarrayShouldReturnTheSingleElementOfArray() {
        int numbers[] = { 1 };

        int expected = 1;
        int actual = maximumSubarray.maxSubArray(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumSubarrayShouldReturnTheSumOfArray() {
        int numbers[] = { 5, 4, -1, 7, 8 };

        int expected = 23;
        int actual = maximumSubarray.maxSubArray(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void maximumSubarrayShouldReturnTheSumOfMaxSubArray() {
        int numbers[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int expected = 6;
        int actual = maximumSubarray.maxSubArray(numbers);

        Assert.assertEquals(expected, actual);
    }
}
