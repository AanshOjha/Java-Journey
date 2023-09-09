package DSA.Recursion;

public class CountZeroes {
    static int countZeroes(int n) {
        int count = 0;
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }

        int remainder = n % 10;
        if (remainder == 0) {
            return helper(n / 10, count + 1);
        }
        // If no 0 found, return original count i.e., 0
        return helper(n / 10, count);
    }

    public static void main(String[] args) {
        System.out.println(countZeroes(30204));
    }
}
