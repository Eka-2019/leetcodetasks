package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import qainterviewtasks.AmountTheSameDigitsInArray;

import java.util.HashMap;
import java.util.Map;

public class AmountTheSameDigitsInArrayTest {
    
    @Test
    public void duplicationAtTheBeginningTest(){
        AmountTheSameDigitsInArray test = new AmountTheSameDigitsInArray();
        int[] input = {1, 1, 2, 3, 4, 5};
        HashMap<Integer, Integer> actual = test.amountTheSameDigitsInArray(input);
        Map<Integer, Integer> expected = new HashMap(Map.of(1,2, 2,1, 3,1, 4,1, 5,1));

        Assertions.assertTrue(actual.equals(expected));
    }

    @Test
    public void duplicationInTheMiddleTest(){
        AmountTheSameDigitsInArray test = new AmountTheSameDigitsInArray();
        int[] input = {1, 2, 2, 2, 3, 4, 5};
        HashMap<Integer, Integer> actual = test.amountTheSameDigitsInArray(input);
        Map<Integer, Integer> expected = new HashMap(Map.of(1,1, 2,3, 3,1, 4,1, 5,1));

        Assertions.assertTrue(actual.equals(expected));
    }
    
    @Test
    public void duplicationAtTheEndTest(){
        AmountTheSameDigitsInArray test = new AmountTheSameDigitsInArray();
        int[] input = {1, 2, 3, 4, 6, 6, 6};

        HashMap<Integer, Integer> actual = test.amountTheSameDigitsInArray(input);
        Map<Integer, Integer> expected = new HashMap(Map.of(1,1, 2,1, 3,1, 4,1, 6,3));

        Assertions.assertTrue(actual.equals(expected));
    }

    @Test
    public void duplicationEverywhereTest(){
        AmountTheSameDigitsInArray test = new AmountTheSameDigitsInArray();
        int[] input = {1, 1, 2, 3, 3, 3, 4, 5, 5};

        HashMap<Integer, Integer> actual = test.amountTheSameDigitsInArray(input);
        Map<Integer, Integer> expected = new HashMap(Map.of(1,2, 2,1, 3,3, 4,1, 5,2));

        Assertions.assertTrue(actual.equals(expected));

    }
    
    @Test
    public void withZeroTest(){
        AmountTheSameDigitsInArray test = new AmountTheSameDigitsInArray();
        int[] input = {0, 1, 0, 3, 3, 0, 4, 5, 0};

        HashMap<Integer, Integer> actual = test.amountTheSameDigitsInArray(input);
        Map<Integer, Integer> expected = new HashMap(Map.of(0,4, 1,1, 3,2, 4,1, 5,1));

        Assertions.assertTrue(actual.equals(expected));
    }
    
    @Test
    public void negativeNumbersTest(){
        AmountTheSameDigitsInArray test = new AmountTheSameDigitsInArray();
        int[] input = {-1, 1, -1, 2, 3, -3, -3, 4, 5, -6, -6};

        HashMap<Integer, Integer> actual = test.amountTheSameDigitsInArray(input);
        Map<Integer, Integer> expected = new HashMap(Map.of(-6,2, -3, 2, -1,2, 1, 1, 2,1, 3,1, 4,1, 5,1));

        Assertions.assertTrue(actual.equals(expected));

    }
    
}
