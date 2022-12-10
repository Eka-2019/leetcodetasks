package qainterviewtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZeros {

    /**
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
     * Note that elements beyond the length of the original array are not written.
     * Do the above modifications to the input array in place and do not return anything.
     * <p>
     * Constraints:
     * 1 <= arr.length <= 104
     * 0 <= arr[i] <= 9
     */
    public Integer[] duplicateZerosViaList(Integer[] arr) {

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == 0) {
                list.add(i, list.get(i));
                i++;
            }
        }
        ArrayList<Integer> nlist = new ArrayList(list.subList(0, arr.length));
        arr = nlist.toArray(arr);

        return arr;
    }
}
