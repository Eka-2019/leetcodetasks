package qainterviewtasks;

import static java.lang.Math.log;

public class PowerOfThree {

    /**
     * Given an integer n, return true if it is a power of three. Otherwise, return false.
     * An integer n is a power of three, if there exists an integer x such that n == 3x.
     * <p>
     * Constraints:
     * -231 <= n <= 231 - 1
     */

    public boolean isPowerOfThree(int n) {
        /**
         * example, how to find log:
         * log2 8 = 3;
         * double st = log(8)/log(2);
         */
        boolean result = false;
        double x = Math.round((log(n)) / (log(3)));
        if(n==0) {
            result = false;
        } else if (Math.pow(3, x) == n) {
            result = true;
        }
        return result;
    }


}
