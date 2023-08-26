package LeetCode.DailyStreak;

import java.util.Arrays;

public class MaxLengthOfPairChain {
    static public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int chain = 1;  // The first pair is always included
        int currentEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > currentEnd) {
                chain++;
                currentEnd = pairs[i][1];
            }
        }

        return chain;
    }

    public static void main(String[] args) {
        int[][] pairs = {{1, 2},{2, 3},{3, 4}};
        System.out.println(findLongestChain(pairs));
    }
}