package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.PlusOne;

import java.util.Arrays;

public class PlusOneTest {

    @Test
    public void positiveTest() {
        PlusOne test = new PlusOne();
        int[] digits = {1, 2, 3};
        int[] actual = test.plusOneViaString(digits);
        int[] expected = {1, 2, 4};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveAllNineTest() {
        PlusOne test = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] actual = test.plusOneViaString(digits);
        int[] expected = {1, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveArrayIncreaseLengthTest() {
        PlusOne test = new PlusOne();
        int[] digits = {9};
        int[] actual = test.plusOneViaString(digits);
        int[] expected = {1, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveLengthOverIntegerTest() {
        PlusOne test = new PlusOne();
        int[] digits = {9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] actual = test.plusOneViaString(digits);
        int[] expected = {9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 7, 6, 5, 4, 3, 2, 1, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }


    @Test
    public void positiveLengthOverLongTest() {
        PlusOne test = new PlusOne();
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] actual = test.plusOneViaString(digits);
        int[] expected = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroTest() {
        PlusOne test = new PlusOne();
        int[] digits = {0};
        int[] actual = test.plusOneViaString(digits);
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    /**
     * tests for the second method without string
     */

    @Test
    public void positiveTestNoString() {
        PlusOne test = new PlusOne();
        int[] digits = {1, 2, 3};
        int[] actual = test.plusOneWithoutString(digits);
        int[] expected = {1, 2, 4};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveAllNineNoStringTest() {
        PlusOne test = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] actual = test.plusOneWithoutString(digits);
        int[] expected = {1, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveArrayIncreaseLengthNoStringTest() {
        PlusOne test = new PlusOne();
        int[] digits = {9};
        int[] actual = test.plusOneWithoutString(digits);
        int[] expected = {1, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveLengthOverIntegerNoStringTest() {
        PlusOne test = new PlusOne();
        int[] digits = {9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] actual = test.plusOneWithoutString(digits);
        int[] expected = {9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 7, 6, 5, 4, 3, 2, 1, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }


    @Test
    public void positiveLengthOverLongNoStringTest() {
        PlusOne test = new PlusOne();
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        int[] actual = test.plusOneWithoutString(digits);
        int[] expected = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroNoStringTest() {
        PlusOne test = new PlusOne();
        int[] digits = {0};
        int[] actual = test.plusOneWithoutString(digits);
        int[] expected = {1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array. Actual array is: " + Arrays.toString(actual));
    }

}
