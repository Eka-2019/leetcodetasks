package qainterviewtasks;

import java.util.HashMap;

public class AmountTheSameDigitsInArray {

    public HashMap<Integer, Integer> amountTheSameDigitsInArray(int[] input) {
        HashMap<Integer, Integer> dMap = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int element = input[i];
            Integer count = dMap.getOrDefault(element,0);
            count++;
            dMap.put(element, count);
        }
        return dMap;
    }

}
