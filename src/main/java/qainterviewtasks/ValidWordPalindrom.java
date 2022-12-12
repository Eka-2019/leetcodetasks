package qainterviewtasks;

public class ValidWordPalindrom {
    public boolean isPalindrome(String s) {
        String temp = s.toLowerCase();
        String reverse = "";
        boolean isPalindrome = false;

        for(int i=0; i<temp.length(); i++){
            reverse  = temp.charAt(i) + reverse;
        }

        if(s.toLowerCase().equals(reverse)){
            isPalindrome = true;
            System.out.println("Palindrome");
        }else
            System.out.println("NOT Palindrome");

        return isPalindrome;
    }
}
