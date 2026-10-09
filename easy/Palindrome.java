package easy;

// Palindrome Check: Check if a string is a palindrome using recursion.
public class Palindrome {
    public static boolean checkPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() -1)) return false;
        return checkPalindrome(s.substring(1, s.length()-1));
    }
}
