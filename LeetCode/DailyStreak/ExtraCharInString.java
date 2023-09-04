package LeetCode.DailyStreak;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExtraCharInString {
    static public int minExtraChar(String s, String[] dictionary) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = i; // Initialize dp[i] to maximum possible value

            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (wordSet.contains(substring)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                } else {
                    dp[i] = Math.min(dp[i], dp[j] + substring.length());
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String s = "leetscode";
        String[] dictionary = {"leet","code","leetcode"};
        System.out.println(minExtraChar(s, dictionary));
    }
}
