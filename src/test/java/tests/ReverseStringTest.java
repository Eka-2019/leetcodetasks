package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ReverseString;

public class ReverseStringTest {

    @Test
    public void simplePositiveOddTest() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInExistingArray(chars);
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void simplePositiveEvenTest() {
        char[] chars = {'h', 'e', ' ', 'l', 'l', 'o'};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInExistingArray(chars);
        char[] expected = {'o', 'l', 'l', ' ',  'e', 'h'};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void simplePositiveTest() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInNewArray(chars);
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void emptyExArrayTest() {
        char[] chars = {};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInExistingArray(chars);
        char[] expected = {};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void emptyNewArrayTest() {
        char[] chars = {};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInNewArray(chars);
        char[] expected = {};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void emptyCharInNewArrayTest() {
        char[] chars = {' '};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInNewArray(chars);
        char[] expected = {' '};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void emptyCharInExArrayTest() {
        char[] chars = {' '};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInExistingArray(chars);
        char[] expected = {' '};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void caseTest() {
        char[] chars = {'H', 'a', 'n', 'n', 'a', 'h'};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInNewArray(chars);
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void emptySpaceTest() {
        char[] chars = {'H', ' ', 'a', 'h'};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInNewArray(chars);
        char[] expected = {'h', 'a', ' ', 'H'};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

    @Test
    public void symbolTest() {
        char[] chars = {'H', ':', 'a', 'h'};
        ReverseString test = new ReverseString();
        char[] actual = test.reverseCharsInNewArray(chars);
        char[] expected = {'h', 'a', ':', 'H'};

        Assertions.assertArrayEquals(expected, actual, "Unexpected actual Array of chars. Actual array is: " + actual);
    }

}
