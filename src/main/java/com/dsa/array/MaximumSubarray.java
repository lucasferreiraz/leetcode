package com.dsa.array;

import java.util.Arrays;

public class MaximumSubarray {

    public int maxSubArray(int numbers[]) {
        int maxSum = numbers[0];

        int subArraySize = 1;
        int arrayLength = numbers.length;

        while (subArraySize <= arrayLength) {
            for (int i = 0; i < arrayLength - subArraySize + 1; i++) {
                int subArraySum = Arrays.stream(numbers, i, i + subArraySize).sum();

                maxSum = Math.max(subArraySum, maxSum);

            }
            subArraySize++;
        }
        return maxSum;
    }
}
