package qainterviewtasks;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Given an array nums of size n, return the majority element.
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     *Constraints:
     * n == nums.length
     * 1 <= n <= 5 * 104
     * -109 <= nums[i] <= 109
     */

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityElement = 0;
        for (int i = 0; i < nums.length; i++) {
            Integer element = nums[i];
            Integer count = map.getOrDefault(element, 0);
            count++;
            map.put(element, count);
        }

        for (Map.Entry element : map.entrySet()) {
            if ((int) element.getValue() >= (float)nums.length / 2) {
                majorityElement = (int) element.getKey();
            }
        }
        return majorityElement;
    }

}
