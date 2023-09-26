package LeetCode.DailyStreak;

public class IsSubsequence {
    static public boolean isSubsequence(String s, String t) {
        return helper(s, t, 0);
    }
    private static boolean helper(String s, String t, int p) {
        if (p == s.length()) {
            return true;  // All characters in s have been matched
        }

        if (t.isEmpty()) {
            return false;  // t is empty but s is not
        }

        if (s.charAt(p) == t.charAt(0)) {
            return helper(s, t.substring(1), p + 1);  // Move to the next character in both s and t
        } else {
            return helper(s, t.substring(1), p);  // Move to the next character in t, keep p the same
        }
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }
}