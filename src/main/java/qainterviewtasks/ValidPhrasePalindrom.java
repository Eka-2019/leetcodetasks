package qainterviewtasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhrasePalindrom {

    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
     * Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * <p>
     * Constraints:
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     */

    public boolean isPalindrome(String s) {
        String pattern = "[^a-z0-9]";
        String str = s.toLowerCase().replaceAll(pattern, "");

        String temp = str;
        String reverse = "";
        boolean isPalindrome = false;

        for(int i=0; i<temp.length(); i++){
            reverse  = temp.charAt(i) + reverse;
        }

        if(str.equals(reverse)){
            isPalindrome = true;
            System.out.println("Palindrome");
        }else
        System.out.println("NOT Palindrome");

        return isPalindrome;
    }

}
