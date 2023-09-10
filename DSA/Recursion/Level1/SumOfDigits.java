package DSA.Recursion.Level1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));    // 10
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return n;
        }

        return (n % 10) + sumOfDigits(n / 10);

    }
}
