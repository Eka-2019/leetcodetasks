package qainterviewtasks;

import java.util.Arrays;
import java.util.Iterator;

public class LengthOfLastWord {

    /**
     * Given a string s consisting of words and spaces, return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Constraints:
     * 1 <= s.length <= 104
     * s consists of only English letters and spaces ' '.
     * There will be at least one word in s.
     */

    public int lengthOfLastWord(String s) {
        String[] str = s.toLowerCase().split(" ");
        int lengthCount = 0;
        String lastWord = str[str.length-1];

        for(int i=0; i<lastWord.length(); i++){
            lengthCount = lengthCount + 1;
        }
        return lengthCount;
    }
}
