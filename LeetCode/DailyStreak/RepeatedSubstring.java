package LeetCode.DailyStreak;

public class RepeatedSubstring {
    static public boolean repeatedSubstringPattern(String s) {        
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {      // Common sense
                String subStr = s.substring(0, i);
                int repetitions = s.length() / i;
                StringBuilder constructedString = new StringBuilder();
                for (int j = 0; j < repetitions; j++) {
                    constructedString.append(subStr);
                }
                if (constructedString.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        String s = "abcabcabcab";
        System.out.println(repeatedSubstringPattern(s));
    }
}
