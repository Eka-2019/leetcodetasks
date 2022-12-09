package qainterviewtasks;

public class ReverseInteger {

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * <p>
     * Constraints:
     * -2 31 <= x <= 2 31 - 1
     */

    public int reverse(int x) {

        long newX = 0;

        if (x >= (-Math.pow(2, 31)) && x < (Math.pow(2, 31) - 1)) {
            for (int i = 0; 0 < Math.abs(x); i++) {
                long temp = x % 10;
                newX = newX * 10 + temp;
                x = x / 10;
            }
        } else newX = 0;

        if (newX <= Integer.MIN_VALUE || newX >= Integer.MAX_VALUE) {
            newX = 0;
        }
        return (int) newX;
    }
}
