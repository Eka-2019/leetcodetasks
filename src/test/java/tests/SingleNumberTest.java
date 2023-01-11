package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.SingleNumber;

public class SingleNumberTest {

    @Test
    public void numAtTheBeginningTest() {
        int[] nums = {4, 1, 2, 1, 2};
        SingleNumber test = new SingleNumber();
        int actual = test.singleNumber(nums);

        Assertions.assertEquals(4, actual, "Unexpected return. Actual number is: " + actual);
    }

    @Test
    public void numAtTheEndTest() {
        int[] nums = {1, 2, 1, 2, 4};
        SingleNumber test = new SingleNumber();
        int actual = test.singleNumber(nums);

        Assertions.assertEquals(4, actual, "Unexpected return. Actual number is: " + actual);
    }

    @Test
    public void numAtTheMiddleTest() {
        int[] nums = {1, 2, 4, 3, 1, 2, 4};
        SingleNumber test = new SingleNumber();
        int actual = test.singleNumber(nums);

        Assertions.assertEquals(3, actual, "Unexpected return. Actual number is: " + actual);
    }

    @Test
    public void negativeNumTest() {
        int[] nums = {4, 2, 1, -2, 1, 2, 4};
        SingleNumber test = new SingleNumber();
        int actual = test.singleNumber(nums);

        Assertions.assertEquals(-2, actual, "Unexpected return. Actual number is: " + actual);
    }

    @Test
    public void oneDigitArrayTest() {
        int[] nums = {4};
        SingleNumber test = new SingleNumber();
        int actual = test.singleNumber(nums);

        Assertions.assertEquals(4, actual, "Unexpected return. Actual number is: " + actual);
    }
}
