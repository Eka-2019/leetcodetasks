package qainterviewtasks;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

      /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * <p>
     * Constraints:
     * 1 <= nums.length <= 3 * 104
     * -3 * 104 <= nums[i] <= 3 * 104
     * Each element in the array appears twice except for one element which appears only once.
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length-1; i++) {
            Integer element = nums[i];
            //Integer count = map.getOrDefault(element,0);
            Integer count = map.get(element);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(element, count);
        }

        for(Map.Entry element: map.entrySet()){
            if(element.getValue().equals(1)){
                result = (int) element.getKey();
            }
        }
        return result;
    }
}
