package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ValidAnagram;

public class ValidAnagramTest {

    @Test
    public void positiveTest(){
        ValidAnagram test = new ValidAnagram();
        boolean sortedMethod = test.isAnagramSortedArray("anagram", "nagaram");
        boolean unsortedMethod = test.isAnagramUnsortedArray("anagram", "nagaram");
        boolean unsortedMethodSimplify = test.isAnagramUnsortedArraySimplify("anagram", "nagaram");

        Assertions.assertTrue(sortedMethod, "Unexpected result. Method return: " + sortedMethod);
        Assertions.assertTrue(unsortedMethod, "Unexpected result. Method return: " + unsortedMethod);
        Assertions.assertTrue(unsortedMethodSimplify, "Unexpected result. Method return: " + unsortedMethodSimplify);
    }

    @Test
    public void oneLetterTest(){
        ValidAnagram test = new ValidAnagram();
        boolean sortedMethod = test.isAnagramSortedArray("aa", "aa");
        boolean unsortedMethod = test.isAnagramUnsortedArray("aa", "aa");
        boolean unsortedMethodSimplify = test.isAnagramUnsortedArraySimplify("aa", "aa");

        Assertions.assertTrue(sortedMethod, "Unexpected result. Method return: " + sortedMethod);
        Assertions.assertTrue(unsortedMethod, "Unexpected result. Method return: " + unsortedMethod);
        Assertions.assertTrue(unsortedMethodSimplify, "Unexpected result. Method return: " + unsortedMethodSimplify);
    }

    @Test
    public void emptySpaceTest(){
        ValidAnagram test = new ValidAnagram();
        boolean sortedMethod = test.isAnagramSortedArray(" ", " ");
        boolean unsortedMethod = test.isAnagramUnsortedArray(" ", " ");
        boolean unsortedMethodSimplify = test.isAnagramUnsortedArraySimplify(" ", " ");

        Assertions.assertTrue(sortedMethod, "Unexpected result. Method return: " + sortedMethod);
        Assertions.assertTrue(unsortedMethod, "Unexpected result. Method return: " + unsortedMethod);
        Assertions.assertTrue(unsortedMethodSimplify, "Unexpected result. Method return: " + unsortedMethodSimplify);
    }

    @Test
    public void emptyStringTest(){
        ValidAnagram test = new ValidAnagram();
        boolean sortedMethod = test.isAnagramSortedArray("", "");
        boolean unsortedMethod = test.isAnagramUnsortedArray("", "");
        boolean unsortedMethodSimplify = test.isAnagramUnsortedArraySimplify("", "");

        Assertions.assertTrue(sortedMethod, "Unexpected result. Method return: " + sortedMethod);
        Assertions.assertTrue(unsortedMethod, "Unexpected result. Method return: " + unsortedMethod);
        Assertions.assertTrue(unsortedMethodSimplify, "Unexpected result. Method return: " + unsortedMethodSimplify);
    }

    @Test
    public void negativeTest(){
        ValidAnagram test = new ValidAnagram();
        boolean sortedMethod = test.isAnagramSortedArray("rat", "car");
        boolean unsortedMethod = test.isAnagramUnsortedArray("rat", "car");
        boolean unsortedMethodSimplify = test.isAnagramUnsortedArraySimplify("rat", "car");

        Assertions.assertFalse(sortedMethod, "Unexpected result. Method return: " + sortedMethod);
        Assertions.assertFalse(unsortedMethod, "Unexpected result. Method return: " + unsortedMethod);
        Assertions.assertFalse(unsortedMethodSimplify, "Unexpected result. Method return: " + unsortedMethodSimplify);
    }
}
