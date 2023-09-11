package DSA.Recursion.Array.Search;

public class LinearSearchIndex {
    static int searchIndex(int[] nums, int target) {
        int index = 0;
        return helper(nums, target, index);
    }

    private static int helper(int[] nums, int target, int index) {
        if (index == nums.length - 1) {
            return -1;
        }

        if (nums[index] == target) {
            return index;
        }
        return helper(nums, target, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,57,34,6,34,98,23};
        int target = 34;
        System.out.println(searchIndex(nums, target));
    }
}
