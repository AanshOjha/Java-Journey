package DSA.Recursion.Level1;

public class SumToN {
    public static void main(String[] args) {
        System.out.println(sumToN(5));
    }

    static int sumToN(int n) {
        if (n == 0) {
            return n;
        }

        int sum = 0;
        sum = n + sumToN(n-1);
        return sum;
    }

}
