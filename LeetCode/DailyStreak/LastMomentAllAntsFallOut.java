package LeetCode.DailyStreak;

import java.util.Arrays;

public class LastMomentAllAntsFallOut {

    public static void main(String[] args) {
        int[] left = {4,3};
        int[] right = {0,1};
        System.out.println(getLastMoment(4, left, right));
    }
    static public int getLastMoment(int n, int[] left, int[] right) {
        int totalDistanceLeft;
        int totalDistanceRight;
        if (left.length == 0)
            totalDistanceLeft = 0;
        else
            totalDistanceLeft = Arrays.stream(left).max().getAsInt();
        if (right.length == 0)
            totalDistanceRight = n;
        else
            totalDistanceRight = Arrays.stream(right).min().getAsInt();
        return Math.max(totalDistanceLeft, n-totalDistanceRight);

    }
}