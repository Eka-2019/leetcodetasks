package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.SearchInsertPosition;

public class SearchInsertPositionTest {

    @Test
    public void positiveNumberArrayFirstPositionTest(){
        int[] nums = {2, 4, 5, 6};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, 1);

        Assertions.assertEquals(0, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void positiveNumberArrayMiddlePositionTest(){
        int[] nums = {2, 4, 5, 6};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, 3);

        Assertions.assertEquals(1, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void positiveNumberArrayLastPositionTest(){
        int[] nums = {2, 4, 5, 6};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, 7);

        Assertions.assertEquals(4, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void positiveNumberArrayZeroTest(){
        int[] nums = {2, 4, 5, 6};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, 0);

        Assertions.assertEquals(0, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void positiveNumberArraySameValueTest(){
        int[] nums = {2, 4, 5, 6};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, 4);

        Assertions.assertEquals(1, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void negativeNumberArrayFirstPositionTest(){
        int[] nums = {-6, -5, -4, -2};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, -7);

        Assertions.assertEquals(0, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void negativeNumberArrayMiddlePositionTest(){
        int[] nums = {-6, -5, -4, -2};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, -3);

        Assertions.assertEquals(3, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void negativeNumberArrayLastPositionTest(){
        int[] nums = {-6, -5, -4, -2};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, -1);

        Assertions.assertEquals(4, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void negativeNumberArrayZeroTest(){
        int[] nums = {-6, -5, -4, -2};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, 0);

        Assertions.assertEquals(4, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

    @Test
    public void negativeNumberArraySameValueTest(){
        int[] nums = {-6, -5, -4, -2};
        SearchInsertPosition test = new SearchInsertPosition();
        int actualIndex = test.searchInsert(nums, -4);

        Assertions.assertEquals(2, actualIndex, "Unexpected actual index. Actual index is: " + actualIndex );
    }

}
