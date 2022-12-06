package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.PalindromInteger;

public class PalindromIntegerTest {

    @Test
    public void positiveNumPositiveTest(){
        PalindromInteger test = new PalindromInteger();
        boolean isPalindrom = test.isPalindrom(134676431);

        Assertions.assertTrue(isPalindrom, "isPalindrom is " + isPalindrom);
    }

    @Test
    public void positiveNumNegativeTest(){
        PalindromInteger test = new PalindromInteger();
        boolean isPalindrom = test.isPalindrom(1376431);

        Assertions.assertFalse(isPalindrom, "isPalindrom is " + isPalindrom);
    }

    @Test
    public void negativeNumNegativeTest(){
        PalindromInteger test = new PalindromInteger();
        boolean isPalindrom = test.isPalindrom(-1346431);

        Assertions.assertFalse(isPalindrom, "isPalindrom is " + isPalindrom);
    }

    @Test
    public void oneDigitTest(){
        PalindromInteger test = new PalindromInteger();
        boolean isPalindrom = test.isPalindrom(5);

        Assertions.assertTrue(isPalindrom, "isPalindrom is " + isPalindrom);
    }

    @Test
    public void zeroTest(){
        PalindromInteger test = new PalindromInteger();
        boolean isPalindrom = test.isPalindrom(0);

        Assertions.assertTrue(isPalindrom, "isPalindrom is " + isPalindrom);
    }
}
