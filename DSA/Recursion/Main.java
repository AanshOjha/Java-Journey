package DSA.Recursion;

public class Main {
    public static void main(String[] args) {
        message(5);

    }


    // Concept of i-- and --i
    // i-- : pass value then decrements value
    // --i : decrements then pass value
    private static void concept(int i) {    // 5 4 3 2 1
        if (i == 0) {
            return;
        }

        System.out.println(i);
        //concept(i--);    // Auto warning: The value changed at 'i--' is never used
        concept(--i);
    }
    private static void message(int i) {    // 5 4 3 2 1
        if (i == 0) {
            return;
        }

        System.out.println(i);
        message(i-1);
    }

    private static void messageRev(int i) {     // 1 2 3 4 5
        if (i == 0) {
            return;
        }
        messageRev(i-1);
        System.out.println(i);

    }

    private static void messageBoth(int i) {      // 5 4 3 2 1 then
        if (i == 0) {                             // 1 2 3 4 5
            return;
        }
        System.out.println(i);
        messageBoth(i-1);
        System.out.println(i);

    }
}

