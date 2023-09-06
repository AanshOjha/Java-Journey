package DSA.Recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));   // 13
    }

    // This has time complexity of around 2 to power N
    // So if wanna see 50th Fibo no. not possible
    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
