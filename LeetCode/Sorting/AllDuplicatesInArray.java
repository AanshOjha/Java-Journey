package LeetCode.Sorting;

import DSA.Sorting.Swapping;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInArray {
    static public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length ) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                Swapping.swap(nums, i, correctIndex);
            } else {
                i++;
            }                
        }
        
        var duplicates = new ArrayList<Integer>();
        for (int index = 0; index<nums.length; index++) {
            if (nums[index] != index+1) {
                duplicates.add(nums[index]);
            }

        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        var result = findDuplicates(nums);
        result.stream().forEach(System.out::println);
    }
}