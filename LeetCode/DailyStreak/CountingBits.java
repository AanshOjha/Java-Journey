package LeetCode.DailyStreak;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
        int[] result = new int[n+1];

        for (int i = 0; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }

        return result;
    }
}
