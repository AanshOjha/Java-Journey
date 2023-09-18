package DSA.Recursion.String;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("happlei"));
    }

    static String skipString(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipString(s.substring(5));
        } else {
            return s.charAt(0) + skipString(s.substring(1));
        }

    }
}
