package qainterviewtasks;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /**
     * Given an integer n, return a string array answer (1-indexed) where:
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     * <p>
     * Constraints:
     * 1 <= n <= 104
     */
    public List<String> fizzBuzz(int n) {

        List<String> strArray = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strArray.add(String.valueOf("FizzBuzz"));
            } else if (i % 3 == 0) {
                strArray.add(String.valueOf("Fizz"));
            } else if (i % 5 == 0) {
                strArray.add(String.valueOf("Buzz"));
            } else {
                strArray.add(String.valueOf(i));
            }
        }
        return strArray;
    }
}
