package DSA.Recursion.Array.Search;

public class LinearSearchBoolean {
    static boolean searchBoolean(int[] nums, int target) {
        int index = 0;
        return helper(nums, target, index);
    }

    // So that user don't have to enter index
    private static boolean helper(int[] nums, int target, int index) {
        if (index == nums.length - 1) {
            return false;
        }

        return nums[index] == target || helper(nums, target, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,57,34,6,34,98,23};
        int target = 57;
        System.out.println(searchBoolean(nums, target));
    }
}
