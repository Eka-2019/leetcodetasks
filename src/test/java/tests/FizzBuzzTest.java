package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.FizzBuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzTest {

    @Test
    public void allVariantsTest(){
        FizzBuzz test = new FizzBuzz();
        List<String> actual = test.fizzBuzz(15);
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        Assertions.assertEquals(expected, actual, "Unexpected actual list. Actual list is: " + actual);
    }

    @Test
    public void zeroTest(){
        FizzBuzz test = new FizzBuzz();
        List<String> actual = test.fizzBuzz(0);
        List<String> expected = Arrays.asList(); // ??

        Assertions.assertEquals(expected, actual, "Unexpected actual list. Actual list is: " + actual);
    }

    @Test
    public void evenTest(){
        FizzBuzz test = new FizzBuzz();
        List<String> actual = test.fizzBuzz(16);
        List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16");

        Assertions.assertEquals(expected, actual, "Unexpected actual list. Actual list is: " + actual);
    }
}
