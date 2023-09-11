package DSA.Recursion.Patterns;

public class Triangle {

    static void triangle2(int n) {
        if (n == 0) {
            return;
        }

        if (n > 0) {
            triangle2(n-1);     // Copy this and paste below to print opp triangle
            System.out.println("*".repeat(n));

        }
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    public static void main(String[] args) {
//        triangle(4, 0);
        triangle2(7);
    }
}
