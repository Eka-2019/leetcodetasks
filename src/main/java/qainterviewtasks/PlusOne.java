package qainterviewtasks;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order.
     * The large integer does not contain any leading 0's.
     * Increment the large integer by one and return the resulting array of digits.
     * <p>
     * Constraints:
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     * digits does not contain any leading 0's.
     */

    public int[] plusOneViaString(int[] digits) {
        BigInteger combineDigit = BigInteger.valueOf(0);

        for (int i = 0; i < digits.length; i++) {
            combineDigit = combineDigit.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(digits[i]));
        }

        combineDigit = combineDigit.add(BigInteger.valueOf(1));
        String combineD = combineDigit.toString(10);

        int[] newDigits = new int[combineD.length()];
        for (int i = 0; i < combineD.length(); i++) {
            newDigits[i] = combineD.charAt(i) - '0';
        }
        return newDigits;
    }

    public int[] plusOneWithoutString(int[] digits) {
        int increase = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + increase;
            if (num == 10) {
                digits[i] = 0;
                increase = 1;
            } else {
                digits[i] = num;
                increase = 0;
                break;
            }
        }

        if (increase == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;

            digits = newDigits;
            System.out.println("New array: " + Arrays.toString(newDigits));

            //Arrays.fill(newDigits, 1);
            System.out.println("New array after 1 added: " + Arrays.toString(newDigits));

        }
        return digits;
    }


}
