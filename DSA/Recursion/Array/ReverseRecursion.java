package DSA.Recursion.Array;

public class ReverseRecursion {
    int reverse(int n) {
        if (n==0)
            return n;
        int rem = n % 10;
        return (rem * 10);
    }
    public static void main(String[] args) {

    }
}
