package qainterviewtasks;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ValidAnagram {
    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     * <p>
     * Constraints:
     * 1 <= s.length, t.length <= 5 * 104
     * s and t consist of lowercase English letters.
     */
    public boolean isAnagramSortedArray(String s, String t) {

        boolean isAnagram = false;
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);

        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);

        if (Arrays.equals(sChar, tChar)) {
            isAnagram = true;
        }

        return isAnagram;
    }

    public boolean isAnagramUnsortedArray(String s, String t) {

        boolean isAnagram = false;
        char[] sChar = s.toCharArray();

        Map<Character, Integer> sMap = new TreeMap<>();
        for (char ch : sChar) {
            Integer count = sMap.get(ch);
            if (count == null) {
                count = 0;
            }
            count++;
            sMap.put(ch, count);
        }

        Map<Character, Integer> tMap = new TreeMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            Integer count = tMap.get(ch);
            if (count == null) {
                count = 0;
            }
            count++;
            tMap.put(ch, count);
        }

        if (sMap.entrySet().equals(tMap.entrySet())) {
            isAnagram = true;
        }
        return isAnagram;
    }

    public boolean isAnagramUnsortedArraySimplify(String s, String t) {

        boolean isAnagram = false;

        Map<Character, Integer> sMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> tMap = new TreeMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        if (sMap.entrySet().equals(tMap.entrySet())) {
            isAnagram = true;
        }

        return isAnagram;
    }

}
