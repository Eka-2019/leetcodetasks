package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ValidPhrasePalindrom;

public class ValidPhrasePalindromTest {

    @Test
    public void positiveTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A man, a plan, a canal: Panama");

        Assertions.assertTrue(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void negativeTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A men, a plan, a canal: Panama");

        Assertions.assertFalse(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void emptyStringTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome(" ");

        Assertions.assertTrue(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void positiveWithSymbolTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A!?@#-+= ^*(man), a [plan], <a> {canal}/: %Panama\"&");

        Assertions.assertTrue(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void positiveWithDigitsTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A 1man, a plan, a canal: Panam1a");

        Assertions.assertTrue(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void negativeWithDigitsTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A 1man, a plan, 0a canal: Panam1a");

        Assertions.assertFalse(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void minLengthTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A");

        Assertions.assertTrue(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void positiveMaxLengthTest(){
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama");

        Assertions.assertTrue(actual, "Unexpected actual retun. Actual is: " + actual);
    }

    @Test
    public void negativeeMaxLengthTest(){
        // should deeleetee 6 letter
        ValidPhrasePalindrom test = new ValidPhrasePalindrom();
        boolean actual = test.isPalindrome("A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama A man, a plan, a canal: Panama0");

        Assertions.assertFalse(actual, "Unexpected actual retun. Actual is: " + actual);
    }

}
