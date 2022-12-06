package qainterviewtasks;

public class ReverseString {

    /**
     * Write a function that reverses a string. The input string is given as an array of characters s.
     * <p>
     * Constraints:
     * 1 <= s.length <= 105
     * s[i] is a printable ascii character.
     */
    public char[] reverseCharsInNewArray(char[] s) {
        char[] newS = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            newS[i] = s[(s.length - 1) - i];
        }
        return newS;
    }

    public char[] reverseCharsInExistingArray(char[] s) {

        for (int i = 0; i <= s.length / 2-1; i++) {
            char temp = s[i];
            s[i] = s[(s.length-1) - i];
            s[(s.length-1) - i] = temp;
        }
        return s;
    }
}
