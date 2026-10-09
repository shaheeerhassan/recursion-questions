package easy;

//Power of a Number: Implement a function to calculate x^n.
public class Power {
    public static int pow(int x, int n) {
        if (n==0) return 1;
        return x * pow(x, n-1);
    }
}
