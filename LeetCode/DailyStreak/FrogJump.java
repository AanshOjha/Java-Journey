package LeetCode.DailyStreak;

import java.util.HashMap;

public class FrogJump {

    static public boolean canCross(int[] stones) {
        // Create a dynamic programming array to track if the frog can reach each stone
        // dp[i][j] will be true if the frog can reach stone at position i with a jump of j
        boolean[][] dp = new boolean[stones.length][stones.length + 1];
        dp[0][1] = true; // The first jump is 1 unit

        // Create a map to store the index of each stone for efficient lookup
        HashMap<Integer, Integer> stoneIndexMap = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            stoneIndexMap.put(stones[i], i);
        }

        for (int i = 0; i < stones.length; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if (dp[i][j]) {
                    int nextJump = stones[i] + j;
                    if (nextJump == stones[stones.length - 1]) {
                        return true; // Frog successfully reached the last stone
                    }

                    // Check if the next jump can land on a stone
                    if (stoneIndexMap.containsKey(nextJump)) {
                        int nextIndex = stoneIndexMap.get(nextJump);
                        if (j - 1 >= 1) dp[nextIndex][j - 1] = true;
                        dp[nextIndex][j] = true;
                        dp[nextIndex][j + 1] = true;
                    }
                }
            }
        }

        return false; // Frog couldn't reach the last stone
    }

    // Wrong Method
    static public boolean wrongMethodCanCross(int[] stones) {

        boolean canDo = false;
        int k = 1;
        for (int i = 0; i < stones.length - 1; i++) {
            if (stones[i] + k == stones[i+1] || stones[i] + k +1 == stones[i+1] || stones[i] + k -1 == stones[i+1]) {
                k = stones[i+1] - stones[i];
                canDo = true;
            } else {
                canDo = false;
            }


        }

        return canDo;
    }

    public static void main(String[] args) {
        int[] stones = {0,1,3,5,6,8,12,17};
//        int[] stones = {0,1,2,3,4,8,9,11};
        System.out.println(canCross(stones));
    }
}
