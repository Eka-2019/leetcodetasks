package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import qainterviewtasks.MajorityElement;

public class MajorityElementTest {

    @Test
    public void maxValueMinKeyTest() {
        int[] nums = {3, 3, 4};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(3, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }

    @Test
    public void maxValueMaxKeyTest() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(2, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }


    @Test
    public void minValueMaxKeyTest() {
        int[] nums = {2, 1, 1, 1, 2};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(1, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }

    @Test
    public void differentValuesTest() {
        int[] nums = {3, 2, 3, 3, 3, 1, 1, 3, 4, 5};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(3, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }

    @Test
    public void equalKeysTest() {
        int[] nums = {2, 1, 1, 2, 1, 2};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(2, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }

    @Test
    public void zeroTest() {
        int[] nums = {0, 1, 1, 0, 0};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(0, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }


    @Test
    public void negativeTest() {
        int[] nums = {-3, -2, -3, -2, -3, -1, -3, -3, -4, -5};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(-3, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }

    @Test
    public void negativePositiveTest() {
        int[] nums = {-3, 3, -2, -3, -1, -3, -3, -4, -3};
        MajorityElement test = new MajorityElement();
        int actualElement = test.majorityElement(nums);

        Assertions.assertEquals(-3, actualElement, "Actual Element is not expected. Actual element is: " + actualElement);
    }

}
