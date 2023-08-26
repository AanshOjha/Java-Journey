package LeetCode.Sorting;

import DSA.Sorting.Swapping;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    static public int missingNumber(int[] nums) {
        int i = 0; 
        while (i<nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                Swapping.swap(nums, i, correctIndex);
            }
            else {
                i++;
            }

        }

        for (int index = 0; index<nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
            
        }

        return nums.length;
    }
}
