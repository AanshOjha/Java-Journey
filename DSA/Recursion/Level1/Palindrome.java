package DSA.Recursion.Level1;

public class Palindrome {

    static int reverse(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int remainder = n % 10;
        return remainder * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12421));
    }


}
