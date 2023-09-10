package DSA.Recursion.Array;

public class CheckArraySorted {
    static boolean isArraySorted(int[] nums) {
        int i = 0;
        return helper(nums, i);
    }

    static boolean helper(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }

        return nums[i] < nums[i+1] && helper(nums, i+1);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,8,198,12,34,56};
        System.out.println(isArraySorted(nums));

    }
}
