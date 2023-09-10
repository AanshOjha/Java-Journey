package DSA.Recursion.Level1;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(ProductOfDigits(1342));    // 10
    }

    static int ProductOfDigits(int n) {
        if (n == 1) {
            return n;
        }

        return (n % 10) * ProductOfDigits(n / 10);
    }
}
