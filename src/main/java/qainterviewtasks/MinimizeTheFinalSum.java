package qainterviewtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimizeTheFinalSum {

    /**
     * Given an array of integers, perform some number k of operations.
     * Each operation consists of removing any element from the array, dividing it by 2 and inserting the ceiling of that result back into the array.
     * Minimize the sum of the elements in the final array.
     * Example:
     * nums = [10, 20, 7]
     * k = 4
     * Pick    Pick/2    Ceiling         Result
     * Initial array                           [10, 20, 7]
     * 7         3.5           4               [ 10, 20, 4]
     * 10        5             5               [5, 20, 4]
     * 20        10           10               [5, 10, 4]
     * 10        5            5                [5, 5, 4]
     * The sum of the final array is 5 + 5 + 4 = 14, and that sum is minimal.
     * Function Description
     * Complete the function minSum in the editor below. The function must return an integer denoting the minimum sum of the array after k steps.
     * minSum has the following parameters:
     * int nums[n]:  an array of integers, indexed 0 to n-1
     * int k:  an integer
     * <p>
     * Constraints
     * 1 ≤ n ≤ 105
     * 1 ≤ num[i] ≤ 104 (where 0 ≤ i < n)
     * 1 ≤ k ≤ 107
     */

    /**
     * * Initial array                           [10, 20, 7]
     * * 20        10           10               [10, 10, 7]
     * * 10        5             5               [5, 10, 7]
     * * 10        5             5               [5, 5 , 7]
     * * 7        3.5            4                [5, 5, 4]
     *
     * @param arr
     * @param num
     * @return
     */

    public Integer[] minimizeFinalSum(Integer[] arr, int num) {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int max = 0;

        for (int i = 0; i < num; i++) {
            for (Integer element : list) {
                if (element > max) {
                    max = element;
                }
            }
            int newElement = (int) Math.ceil(max / 2.0);
            list.remove(Integer.valueOf(max));
            list.add(newElement);
            max = 0;
        }

        arr = list.toArray(arr);
        return arr;
    }
}
