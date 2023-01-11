package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.MissingNumber;

public class MissingNumberTest {

    @Test
    public void positiveTestViaArray(){
        int[] nums = {3,0,1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumberViaSortedArray(nums);

        Assertions.assertEquals(2, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void longArrayTestViaArray(){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumberViaSortedArray(nums);

        Assertions.assertEquals(8, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void outOfArrayTestViaArray(){
        int[] nums = {0,1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumberViaSortedArray(nums);

        Assertions.assertEquals(2, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void zeroTestViaArray(){
        int[] nums = {0};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumberViaSortedArray(nums);

        Assertions.assertEquals(1, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void oneElementTestViaArray(){
        int[] nums = {1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumberViaSortedArray(nums);

        Assertions.assertEquals(0, actual, "Unexpected return. Actual return is: " + actual);
    }

    /**
     * test for the second method
     */

    @Test
    public void positiveTest(){
        int[] nums = {3,0,1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumber(nums);

        Assertions.assertEquals(2, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void longArrayTest(){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumber(nums);

        Assertions.assertEquals(8, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void outOfArrayTest(){
        int[] nums = {0,1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumber(nums);

        Assertions.assertEquals(2, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void zeroTest(){
        int[] nums = {0};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumber(nums);

        Assertions.assertEquals(1, actual, "Unexpected return. Actual return is: " + actual);
    }

    @Test
    public void oneElementTest(){
        int[] nums = {1};
        MissingNumber test = new MissingNumber();
        int actual = test.missingNumber(nums);

        Assertions.assertEquals(0, actual, "Unexpected return. Actual return is: " + actual);
    }


}
