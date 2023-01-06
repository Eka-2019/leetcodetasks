package qainterviewtasks;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array,
     * and return false if every element is distinct.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     */
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer element = nums[i];
            Integer count = map.get(element);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(element, count);
        }
         for(Map.Entry element: map.entrySet()){
             if(!element.getValue().equals(1)){
                 result = true;
             }
        }
        return result;
    }
}
