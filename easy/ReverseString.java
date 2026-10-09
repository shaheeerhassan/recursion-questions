package easy;

// Reverse a String: Reverse a given string using recursion.
public class ReverseString {
    public static String revString(String s) {
        if (s==null || s.length()<=1) return s;
        return s.charAt(s.length()-1) + revString(s.substring(0, s.length()-1));
    }
}
