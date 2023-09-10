package DSA.Recursion;

public class ReverseNumber {
    static int reverse(int n) {
        int digits = (int) (Math.log10(n)) + 1;     // Special formula
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int remainder = n % 10;
        return (int) ((remainder * Math.pow(10, digits - 1)) + helper(n / 10, digits - 1));
    }

    public static void main(String[] args) {
        System.out.println(reverse(5678));
    }
}
