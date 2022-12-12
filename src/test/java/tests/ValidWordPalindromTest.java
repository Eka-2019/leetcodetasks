package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ValidWordPalindrom;

public class ValidWordPalindromTest {

    @Test
    public void positiveTest(){
        ValidWordPalindrom test = new ValidWordPalindrom();
        boolean actual = test.isPalindrome("Madam");

        Assertions.assertTrue(actual, "Unexpected result. Actual is: " + actual);
    }

    @Test
    public void negativeTest(){
        ValidWordPalindrom test = new ValidWordPalindrom();
        boolean actual = test.isPalindrome("limone");

        Assertions.assertFalse(actual, "Unexpected result. Actual is: " + actual);
    }

    @Test
    public void emptyStringTest(){
        ValidWordPalindrom test = new ValidWordPalindrom();
        boolean actual = test.isPalindrome(" ");

        Assertions.assertTrue(actual, "Unexpected result. Actual is: " + actual);
    }

    @Test
    public void minLengthTest(){
        ValidWordPalindrom test = new ValidWordPalindrom();
        boolean actual = test.isPalindrome("P");

        Assertions.assertTrue(actual, "Unexpected result. Actual is: " + actual);
    }
    @Test
    public void maxLengthTest(){
        ValidWordPalindrom test = new ValidWordPalindrom();
        boolean actual = test.isPalindrome("MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadamMadam" +
                "MadamMadamMadam");

        Assertions.assertTrue(actual, "Unexpected result. Actual is: " + actual);
    }

}
