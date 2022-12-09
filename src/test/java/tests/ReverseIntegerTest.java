package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ReverseInteger;

public class ReverseIntegerTest {

    @Test
    public void positiveWithPositiveDigitsTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(2147483641);
        int expected = 1463847412;

        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void positiveWithNegativeDigitsTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(-2147483641);
        int expected = -1463847412;

        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void maxIntegerTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(Integer.MAX_VALUE); //2147483646
        int expected = 0;
        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void overMaxIntegerTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(Integer.MAX_VALUE + 1); //2147483647
        int expected = 0;

        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void overMaxIntegerAfterReverseTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(1346768839);
        int expected = 0;

        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void minIntegerTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(Integer.MIN_VALUE); // -2147483648
        int expected = 0;
        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void underMinIntegerTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(Integer.MIN_VALUE - 1); // -2147483649
        int expected = 0;
        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void underMinIntegerAfterReverseTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(-1346768839);
        int expected = 0;

        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void zeroTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void onePositiveDigitTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(5);
        int expected = 5;
        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }

    @Test
    public void oneNegativeDigitTest() {
        ReverseInteger test = new ReverseInteger();
        int actual = test.reverse(-5);
        int expected = -5;
        Assertions.assertEquals(expected, actual, "Unexpected reversed in. Actual int: " + actual);
    }
}
