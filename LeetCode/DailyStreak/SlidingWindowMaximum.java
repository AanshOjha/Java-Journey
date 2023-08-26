package LeetCode.DailyStreak;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = nums[0];
        rightMax[n - 1] = nums[n - 1];
        
        for (int i = 1; i < n; i++) {
            leftMax[i] = (i % k == 0) ? nums[i] : Math.max(leftMax[i - 1], nums[i]);
            
            int j = n - i - 1;
            rightMax[j] = (j % k == 0) ? nums[j] : Math.max(rightMax[j + 1], nums[j]);
        }
        
        int[] result = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            result[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum slide = new SlidingWindowMaximum();
        System.out.println(Arrays.toString(slide.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
    }
}
