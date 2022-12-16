package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.RemoveElementFromArray;
import utils.Elements;

import java.util.Arrays;

public class RemoveElementFromArrayTest {

    @Test
    public void positiveViaListTest() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElementFromArray test = new RemoveElementFromArray();
        Elements actual = test.removeElementViaList(nums, 2);
        int[] expected = {0, 1, 3, 0, 4};

        Assertions.assertEquals(5, actual.getNumOfDeletedElements(), "Unexpected return. Actual return is: " + actual.getNumOfDeletedElements());
        Assertions.assertArrayEquals(expected, actual.getUpdatedArray(), "Unexpected array. Actual array is: " + Arrays.toString(actual.getUpdatedArray()));
    }

    @Test
    public void nothingToDeleteViaListTest() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElementFromArray test = new RemoveElementFromArray();
        Elements actual = test.removeElementViaList(nums, 5);
        int[] expected = {0, 1, 2, 2, 3, 0, 4, 2};

        Assertions.assertEquals(8, actual.getNumOfDeletedElements(), "Unexpected return. Actual return is: " + actual.getNumOfDeletedElements());
        Assertions.assertArrayEquals(expected, actual.getUpdatedArray(), "Unexpected array. Actual array is: " + Arrays.toString(actual.getUpdatedArray()));
    }

    @Test
    public void positiveTest() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElementFromArray test = new RemoveElementFromArray();
        Elements actual = test.removeElement(nums, 2);
        int[] expected = {0, 1, 3, 0, 4};

        Assertions.assertEquals(5, actual.getNumOfDeletedElements(), "Unexpected return. Actual return is: " + actual.getNumOfDeletedElements());
        Assertions.assertArrayEquals(expected, actual.getUpdatedArray(), "Unexpected array. Actual array is: " + Arrays.toString(actual.getUpdatedArray()));
    }

    @Test
    public void nothingToDeleteTest() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElementFromArray test = new RemoveElementFromArray();
        Elements actual = test.removeElement(nums, 5);
        int[] expected = {0, 1, 2, 2, 3, 0, 4, 2};

        Assertions.assertEquals(8, actual.getNumOfDeletedElements(), "Unexpected return. Actual return is: " + actual.getNumOfDeletedElements());
        Assertions.assertArrayEquals(expected, actual.getUpdatedArray(), "Unexpected array. Actual array is: " + Arrays.toString(actual.getUpdatedArray()));
    }

}
