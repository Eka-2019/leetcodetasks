package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.TwoSum;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void positiveNumsTest() {
        int[] nums = {2, 7, 11, 15};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 13);
        int[] expected = {0, 2};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void negativeNumsTest() {
        int[] nums = {-2, -7, -11, -15};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, -18);
        int[] expected = {2, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void oneNegativeNumsTest() {
        int[] nums = {2, -7, 11, 15};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 4);
        int[] expected = {2, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void sortedArraySumAtTheBeginningTest() {
        int[] nums = {2, 7, 9, 11, 15};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 9);
        int[] expected = {0, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void sortedArraySumInTheMiddleTest() {
        int[] nums = {2, 7, 9, 11, 15};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 16);
        int[] expected = {2, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void sortedArraySumAtTheEndTest() {
        int[] nums = {2, 7, 9, 11, 15};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 26);
        int[] expected = {3, 4};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void unsortedArraySumAtTheBeginningTest() {
        int[] nums = {3, 2, 7, 11, 15, 9};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 5);
        int[] expected = {0, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void unsortedArraySumInTheMiddleTest() {
        int[] nums = {3, 2, 7, 11, 15, 8};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 18);
        int[] expected = {3, 2};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void unsortedArraySumAtTheEndTest() {
        int[] nums = {3, 2, 7, 11, 15, 8};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 23);
        int[] expected = {4, 5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void noIndexesInSumTest() {
        int[] nums = {3, 2, 7, 11};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 12);
        int[] expected = {0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

    @Test
    public void sumWithZeroTest() {
        int[] nums = {3, 0, 2, 7, 11};
        TwoSum test = new TwoSum();
        int[] actual = test.twoSum(nums, 11);
        int[] expected = {1, 4};

        Assertions.assertArrayEquals(expected, actual, "Unexpected indexes, Actual indexes are: " + Arrays.toString(actual));
    }

}