package LeetCode.Sorting;

import DSA.Sorting.Swapping;

public class FirstMissingPositive {
    static public int firstMissingPositive(int[] nums) {
        int i = 0; 
        while (i<nums.length) {     // i = 1,2,3 or 4
            int correctIndex = nums[i] - 1;

            // if element 3 > 0 (yes) and 3 < 4 (yes) and 3 isn't in its correct index then swap 
            // else move to next element 
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                Swapping.swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // searching missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {     // 
                return index + 1;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
}
