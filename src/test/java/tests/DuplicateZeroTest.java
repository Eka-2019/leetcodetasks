package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.DuplicateZeros;

import java.util.Arrays;

public class DuplicateZeroTest {

    @Test
    public void duplicateZeroViaListPositiveTest() {
        Integer[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 0, 0, 2, 3, 0, 0, 4};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroEvenViaListTest() {
        Integer[] arr = {1, 0, 2, 0, 3, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 0, 0, 2, 0, 0, 3};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroOddViaListTest() {
        Integer[] arr = {0, 1, 0, 3, 0, 4, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {0, 0, 1, 0, 0, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void withoutZeroViaListTest() {
        Integer[] arr = {1, 3, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 3, 4, 5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroInTheMiddleViaListTest() {
        Integer[] arr = {1, 3, 0, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 3, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheBeginningViaListTest() {
        Integer[] arr = {0, 0, 1, 3, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {0, 0, 0, 0, 1, 3, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheEndViaListTest() {
        Integer[] arr = {1, 3, 0, 0};
        DuplicateZeros test = new DuplicateZeros();
        Integer[] actual = test.duplicateZerosViaList(arr);
        Integer[] expected = {1, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }


    /**
     * Tests for the second method
     */

    @Test
    public void duplicateZeroPositiveTest() {
        int[] arr = {1, 0, 2, 3, 0, 4};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {1, 0, 0, 2, 3, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroEvenTest() {
        int[] arr = {1, 0, 2, 0, 3, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {1, 0, 0, 2, 0, 0, 3};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroOddTest() {
        int[] arr = {0, 1, 0, 3, 0, 4, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {0, 0, 1, 0, 0, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void withoutZeroTest() {
        int[] arr = {1, 3, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {1, 3, 4, 5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroInTheMiddleTest() {
        int[] arr = {1, 3, 0, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {1, 3, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheBeginningTest() {
        int[] arr = {0, 0, 1, 3, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {0, 0, 0, 0, 1, 3, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheEndTest() {
        int[] arr = {1, 3, 0, 0};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZeros(arr);
        int[] expected = {1, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    /**
     * Tests for the third method
     */

    @Test
    public void duplicateZeroPositiveTheSameArrayTest() {
        int[] arr = {1, 0, 2, 3, 0, 4};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {1, 0, 0, 2, 3, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroEvenTheSameArrayTest() {
        int[] arr = {1, 0, 2, 0, 3, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {1, 0, 0, 2, 0, 0, 3};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void zeroOddTheSameArrayTest() {
        int[] arr = {0, 1, 0, 3, 0, 4, 0, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {0, 0, 1, 0, 0, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void withoutZeroTheSameArrayTest() {
        int[] arr = {1, 3, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {1, 3, 4, 5};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroInTheMiddleTheSameArrayTest() {
        int[] arr = {1, 3, 0, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {1, 3, 0, 0, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheBeginningTheSameArrayTest() {
        int[] arr = {0, 0, 1, 3, 0, 4, 5};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {0, 0, 0, 0, 1, 3, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

    @Test
    public void duplicateZeroAtTheEndTheSameArrayTest() {
        int[] arr = {1, 3, 0, 0};
        DuplicateZeros test = new DuplicateZeros();
        int[] actual = test.duplicateZerosSameList(arr);
        int[] expected = {1, 3, 0, 0};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual array. Actual array is: " + Arrays.toString(actual));
    }

}
