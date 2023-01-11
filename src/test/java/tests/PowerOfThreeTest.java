package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.PowerOfThree;

public class PowerOfThreeTest {

    @Test
    public void positiveTest(){
        PowerOfThree test = new PowerOfThree();
        boolean actual = test.isPowerOfThree(27);

        Assertions.assertTrue(actual,"Unexpected result. Actual result is: " + actual);
    }

    @Test
    public void positive1Test(){
        PowerOfThree test = new PowerOfThree();
        boolean actual = test.isPowerOfThree(243);

        Assertions.assertTrue(actual,"Unexpected result. Actual result is: " + actual);
    }

    @Test
    public void falseTest(){
        PowerOfThree test = new PowerOfThree();
        boolean actual = test.isPowerOfThree(28);

        Assertions.assertFalse(actual,"Unexpected result. Actual result is: " + actual);
    }

    @Test
    public void oneTest(){
        PowerOfThree test = new PowerOfThree();
        boolean actual = test.isPowerOfThree(1);

        Assertions.assertTrue(actual,"Unexpected result. Actual result is: " + actual);
    }

    @Test
    public void zeroTest(){
        PowerOfThree test = new PowerOfThree();
        boolean actual = test.isPowerOfThree(0);

        Assertions.assertFalse(actual,"Unexpected result. Actual result is: " + actual);
    }

    @Test
    public void negativeDigitTest(){
        PowerOfThree test = new PowerOfThree();
        boolean actual = test.isPowerOfThree(-1);

        Assertions.assertFalse(actual,"Unexpected result. Actual result is: " + actual);
    }
}
