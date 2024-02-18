package Recursion;

public class Plaindrome_recursion {
    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str,0);
    }
    public static boolean isPalindromeHelper(String str, int i){
        if(i>=(str.length())/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }

        return isPalindromeHelper(str,i+1);
    }
}
