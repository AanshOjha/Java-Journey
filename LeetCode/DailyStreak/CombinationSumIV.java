package LeetCode.DailyStreak;

import java.util.Arrays;

public class CombinationSumIV {

    // ============================ Less Time Efficient ===========================================

    static public int IIcombinationSum4(int[] nums, int target) {
        var dp = new int[target + 1];
        dp[0] = 1;

        for (var i = 1; i <= target; i++)
            for (var num : nums)
                dp[i] += i - num >= 0 ? dp[i - num] : 0;

        return dp[target];
    }

    // ============================================================================================

    // =========================== More Time Efficent Method =================================
    private static final int MAX_TARGET = 1010; // Maximum possible target value
    private static final int[] dp = new int[MAX_TARGET]; // Array to store computed results

    private static int countCombinations(int[] nums, int remainingTarget) {
        // If the remaining target is 0, there's one valid combination.
        if (remainingTarget == 0)
            return 1;

        // If the remaining target becomes negative, it's not possible to reach it.
        if (remainingTarget < 0)
            return 0;

        // If the result for 'remainingTarget' is already computed, return it.
        if (dp[remainingTarget] != -1)
            return dp[remainingTarget];

        int currentCombinations = 0;

        // Iterate through the numbers in 'nums'.
        for (int currentNum : nums) {
            // Recursively calculate combinations for the new target.
            currentCombinations += countCombinations(nums, remainingTarget - currentNum);
        }

        // Store and return the computed result.
        return dp[remainingTarget] = currentCombinations;
    }

    static public int IcombinationSum4(int[] nums, int target) {
        // Initialize the 'dp' array with -1 to indicate uncomputed results.
        Arrays.fill(dp, -1);

        // Start the combination count calculation.
        return countCombinations(nums, target);
    }

    // ============================================================================================

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 4;
        System.out.println(IcombinationSum4(nums, target));
        System.out.println(IIcombinationSum4(nums, target));
    }


}
