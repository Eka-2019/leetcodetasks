package qainterviewtasks;

public class ReverseWordsInStringIII {

    /**
     * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 5 * 104
     * s contains printable ASCII characters.
     * s does not contain any leading or trailing spaces.
     * There is at least one word in s.
     * All the words in s are separated by a single space.
     */
    public String reverseWordsInString(String s) {

        String[] strArray = s.split(" ");
        String[] strArray_r = new String[strArray.length];

        for (int j = 0; j < strArray.length; j++) {
            String reverse = "";
            for (int i = 0; i < strArray[j].length(); i++) {
                char value = strArray[j].charAt(i);
                reverse = value + reverse;
            }
            strArray_r[j] = reverse;
        }
        String str = String.join(" ", strArray_r);
        return str;
    }
}


