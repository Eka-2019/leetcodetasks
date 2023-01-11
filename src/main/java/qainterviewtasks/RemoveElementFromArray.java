package qainterviewtasks;

import org.apache.commons.lang3.ArrayUtils;
import utils.Elements;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.of;

public class RemoveElementFromArray {
    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
     * The relative order of the elements may be changed.
     * Since it is impossible to change the length of the array in some languages,
     * you must instead have the result be placed in the first part of the array nums.
     * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should
     * hold the final result. It does not matter what you leave beyond the first k elements.
     * Return k after placing the final result in the first k slots of nums.
     * <p>
     * Constraints:
     * 0 <= nums.length <= 100
     * 0 <= nums[i] <= 50
     * 0 <= val <= 100
     */
    public Elements removeElementViaList(int[] nums, int val) {
        List<Integer> list = of(nums).boxed().collect(Collectors.toList());
        list.removeAll(Collections.singleton(val));
        nums = list.stream().mapToInt(Integer::intValue).toArray();
        int k = nums.length;

        return new Elements(k, nums);
    }

    public Elements removeElement(int[] nums, int val) {
        nums = ArrayUtils.removeAllOccurrences(nums, val);
        int k = nums.length;
        return new Elements(k, nums);
    }
}

