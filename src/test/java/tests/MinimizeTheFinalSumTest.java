package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.MinimizeTheFinalSum;

import java.util.Arrays;

public class MinimizeTheFinalSumTest {

    @Test
    public void positiveEvenDividerTest() {
        Integer[] arr = {10, 20, 7};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 4);
        Integer[] expected = {5, 5, 4};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void positiveOddDividerTest() {
        Integer[] arr = {10, 20, 7};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 3);
        Integer[] expected = {7, 5, 5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void oneDigitTest() {
        Integer[] arr = {10};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 1);
        Integer[] expected = {5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroTest() {
        Integer[] arr = {0};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 1);
        Integer[] expected = {0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void overMaxValueLengthTest() {
        //10000 max
        Integer[] arr = {10, 20, 100000};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 4);
        Integer[] expected = {10, 20, 6250};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void maxValueLengthTest() {
        //10000
        Integer[] arr = {10, 20, 10000};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 4);
        Integer[] expected = {10, 20, 625};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }


    @Test
    public void maxOperationNumTest() {
        Integer[] arr = {10000, 2000, 1999, 2000, 9000, 8000, 7000, 5000, 3000, 6000, 4000};
        MinimizeTheFinalSum test = new MinimizeTheFinalSum();
        Integer[] actual = test.minimizeFinalSum(arr, 10000000);
        Integer[] expected = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        Assertions.assertArrayEquals(expected, actual, "Unexpected array returned. Actual array is: " + Arrays.toString(actual));
    }

}
