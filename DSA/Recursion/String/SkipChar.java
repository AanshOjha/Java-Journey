package DSA.Recursion.String;

public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skipChar("ahaaelaalaoa"));
        skipChar2("", "ahaaelaalaoa");
    }

    static String skipChar(String s) {
        if (s.isEmpty()) {
            return "";
        }

        char ch = s.charAt(0);

        if (ch == 'a') {
            return skipChar(s.substring(1));
        } else {    // if char is other than 'a' add that char
            return ch + skipChar(s.substring(1));
        }

    }

    static void skipChar2(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);

        if (c == 'a'){
            skipChar2(p, up.substring(1));
        } else {
            skipChar2(p + c, up.substring(1));
        }
    }

}
