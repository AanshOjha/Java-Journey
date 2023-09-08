package DSA.Recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        //System.out.println(fibonacci(7));   // 13
        System.out.println(fiboFormula(3));
    }


    // As this is direct formula so can find 50th even 100th fibo number!
    static int fiboFormula(int n) {
        return (int) (
                (Math.pow(((1 + Math.sqrt(5)) / 2), n)
                        - Math.pow(((1 - Math.sqrt(5)) / 2), n)
                ) / Math.sqrt(5)
        );
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
