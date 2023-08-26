package LeetCode.DailyStreak;

class InterleavingString {
    static public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length();
        int m = s2.length();

        if (n + m != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[n + 1][m + 1];

        // Base case: empty strings match each other
        dp[0][0] = true;

        // Fill the first row (s1 is empty)
        for (int j = 1; j <= m; j++) {
            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        // Fill the first column (s2 is empty)
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
        }

        // Fill the rest of the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Check if current character in s1 matches s3 and previous state is true
                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
                        // Check if current character in s2 matches s3 and previous state is true
                        || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";

        System.out.println(isInterleave(s1, s2, s3));
    }
}

