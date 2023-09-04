package DSA.Recursion;

public class Main {
    public static void main(String[] args) {
        message(1);

    }

    private static void message(int i) {
        if (i == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(i);
        message(i+1);
    }
}

