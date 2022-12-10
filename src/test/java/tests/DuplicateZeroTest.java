package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.DuplicateZeros;

import java.util.Arrays;

public class DuplicateZeroTest {

    @Test
    public void zeroPositiveTest() {
        Integer[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 0, 0, 2, 3, 0, 0, 4};

        Assertions.assertArrayEquals(actual, expected, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroEvenTest() {
        Integer[] arr = {1, 0, 2, 0, 3, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 0, 0, 2, 0, 0, 3};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroOddTest() {
        Integer[] arr = {0, 1, 0, 3, 0, 4, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {0, 0, 1, 0, 0, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void withoutZeroTest() {
        Integer[] arr = {1, 3, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 3, 4, 5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroInTheMiddleTest() {
        Integer[] arr = {1, 3, 0, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 3, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheBeginningTest() {
        Integer[] arr = {0, 0, 1, 3, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {0, 0, 0, 0, 1, 3, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheEndTest() {
        Integer[] arr = {1, 3, 0, 0};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }
}
