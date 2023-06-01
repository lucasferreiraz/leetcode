package com.dsa.array;

import java.util.Arrays;

public class MaximumSubarray {

    public int maxSubArray(int numbers[]) {
        int maxSum = numbers[0];

        int subArraySize = 1;
        int arrayLength = numbers.length;
        int subArray[] = { };

        while (subArraySize <= arrayLength) {
            for (int i = 0; i < arrayLength - subArraySize + 1; i++) {
                subArray = Arrays.copyOfRange(numbers, i, i + subArraySize);
                int sum = totalSum(subArray);

                if (sum > maxSum)
                    maxSum = sum;

            }

            subArraySize++;
        }

        return maxSum;
    }

    public int totalSum(int numbers[]) {
        int sum = Arrays.stream(numbers)
                .reduce(0, (prev, next) -> (prev + next));
        return sum;
    }
}
