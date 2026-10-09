package easy;

// SumofDigits: Find the sum of digits of a number using recursion.
public class SumOfDigits {
    public static int sumDigits(int n) {
        if (n==0) return 0;
        return (n%10) + sumDigits(n/10);
    }
}
