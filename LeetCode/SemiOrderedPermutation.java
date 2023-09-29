package LeetCode;

public class SemiOrderedPermutation {

    public static void main(String[] args) {
        System.out.println(semiOrderedPermutation(new int[] {2,1,4,3}));
    }
    static public int semiOrderedPermutation(int[] nums) {
        int count = 0;
        boolean swapped;
        for (int i = 1 ; i<nums.length; i++) {
            swapped = false;
            if (nums[i] < nums[i-1]) {
                swap(nums, i, i-1);
                swapped = true;
                count++;

            }

            if (!swapped) {
                break;
            }
        }
        return count;
    }

    static public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}