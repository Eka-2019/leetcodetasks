package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.ContainsDuplicates;

public class ContainsDuplicatesTest {

    @Test
    public void hasDuplicatesTest() {
        int[] nums = {1, 2, 3, 1};
        ContainsDuplicates test = new ContainsDuplicates();
        boolean actual = test.containsDuplicate(nums);

        Assertions.assertTrue(actual, "Unexpected actual return. Actual is: " + actual);
    }

    @Test
    public void hasNotDuplicatesTest() {
        int[] nums = {1, 2, 3, 4};
        ContainsDuplicates test = new ContainsDuplicates();
        boolean actual = test.containsDuplicate(nums);

        Assertions.assertFalse(actual, "Unexpected actual return. Actual is: " + actual);
    }

    @Test
    public void hasTriplicatesTest() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        ContainsDuplicates test = new ContainsDuplicates();
        boolean actual = test.containsDuplicate(nums);

        Assertions.assertTrue(actual, "Unexpected actual return. Actual is: " + actual);
    }

    @Test
    public void hasNegativeDuplicatesTest() {
        int[] nums = {1, 3, -3, 5, -3, 4, 2};
        ContainsDuplicates test = new ContainsDuplicates();
        boolean actual = test.containsDuplicate(nums);

        Assertions.assertTrue(actual, "Unexpected actual return. Actual is: " + actual);
    }
}
