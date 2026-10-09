package easy;

// Fibonacci Series: Generate the nth Fibonacci number.
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n<2) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
