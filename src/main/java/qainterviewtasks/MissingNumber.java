package qainterviewtasks;

import java.util.Arrays;

public class MissingNumber {

    /**
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that
     * is missing from the array.
     * <p>
     * Constraints:
     * n == nums.length
     * 1 <= n <= 104
     * 0 <= nums[i] <= n
     * All the numbers of nums are unique.
     */

    public int missingNumberViaSortedArray(int[] nums) {
        int result = 0;
        Arrays.sort(nums);

        if (nums.length == 1) {
            if (nums[0] == 0) {
                result = 1;
            }
        }

        for (int i = 1; i <= nums.length - 1; i++) {
            int diff = nums[i] - nums[i - 1];
            if (nums[nums.length - 1] != nums.length) {
                result = nums[i] + 1;
            } else if (diff > 1) {
                result = nums[i - 1] + 1;
            }
        }
        return result;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2; //sum of consecutive elements
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }
}
