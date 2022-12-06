package qainterviewtasks;

public class PalindromInteger {

    /**
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     * Constraints:
     * -231 <= x <= 231 - 1
     */
    public boolean isPalindrom(int x){
        int temp =x;
        int reverse=0;
        boolean isPalindrom = false;

        while(x>0){
            int rest = x%10;
            reverse = reverse*10+rest;
            x = x/10;
        }
        if(temp==reverse){
            System.out.println("Palindrom");
            isPalindrom=true;
        }else
            System.out.println("Not Palindrom");
        return isPalindrom;
    }
}
