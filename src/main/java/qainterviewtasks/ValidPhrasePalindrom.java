package qainterviewtasks;

public class ValidPhrasePalindrom {
    //Example 1:
    //
    //Input: s = "A man, a plan, a canal: Panama"
    //Output: true
    //Explanation: "amanaplanacanalpanama" is a palindrome.
    //Example 2:
    //
    //Input: s = "race a car"
    //Output: false
    //Explanation: "raceacar" is not a palindrome.
    //Example 3:
    //
    //Input: s = " "
    //Output: true
    //Explanation: s is an empty string "" after removing non-alphanumeric characters.
    //Since an empty string reads the same forward and backward, it is a palindrome.

    public static void main(String[] arg) {
        isPalindrome("race  a car");
        isPalindrome("A man, a plan, a canal: Panama");
        isPalindrome(" ");
    }

    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * <p>
     * Constraints:
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     */

    public static boolean isPalindrome(String s) {
        String str = s.replace(":", "")
                .replace(";", "")
                .replace(" ","")
                .replace(".", "")
                .replace("@", "")
                .replace("#", "")
                .replace("&", "")
                .replace("%", "")
                .replace("!", "")
                .replace("?", "")
                .replace("$", "")
                .replace("*", "")
                .replace("_", "")
                .replace("(", "")
                .replace(")", "")
                .replace("{", "")
                .replace("}", "")
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .replace("|", "")
                .replace("+", "")
                .replace("/", "")
                .replace("'", "")
                .replace("-", "")
                .replace("--", "")
                .replace("=", "")
                .replace("`", "")
                .replace(",", "").toLowerCase();
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
