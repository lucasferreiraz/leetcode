package com.dsa.array;

public class MaximumSubarray {

    public int maxSubArray(int numbers[]) {
        int maxSum = numbers[0];

        int arrayLength = numbers.length;

        for(int initial = 0; initial < arrayLength; initial++) {
            int subArraySum = 0;
            for(int end = initial; end < arrayLength; end++) {
                subArraySum += numbers[end];
                maxSum = Math.max(subArraySum, maxSum);
            }
        }

        return maxSum;
    }
}

