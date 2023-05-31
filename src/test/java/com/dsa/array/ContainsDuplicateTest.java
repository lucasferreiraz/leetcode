package com.dsa.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @Before
    public void setup() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    public void testContainsDuplicateWithEmptyArray() {
        // setup
        int numbers[] = {};

        // scenario
        boolean expected = false;
        boolean actual = containsDuplicate.containsDuplicate(numbers);

        // assertions
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsDuplicateWithoutRepeatedElements() {
        int numbers[] = { 1, 2, 3, 4 };

        boolean expected = false;
        boolean actual = containsDuplicate.containsDuplicate(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsDuplicateWithSingleRepeatedElements() {
        int numbers[] = { 1, 2, 3, 1 };

        boolean expected = true;
        boolean actual = containsDuplicate.containsDuplicate(numbers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsDuplicateWithMultipleRepeatedElements() {
        int numbers[] = { 1, 2, 3, 1 };

        boolean expected = true;
        boolean actual = containsDuplicate.containsDuplicate(numbers);

        Assert.assertEquals(expected, actual);
    }
}
