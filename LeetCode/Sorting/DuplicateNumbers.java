package LeetCode.Sorting;

import DSA.Sorting.Swapping;

public class DuplicateNumbers {
    static public int findDuplicate(int[] nums) {
        int i = 0; 
        while (i<nums.length) {
            int correctIndex = nums[i]- 1;  
            if (nums[i] != i+1) {
                if (nums[i] != nums[correctIndex]) {
                    Swapping.swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
