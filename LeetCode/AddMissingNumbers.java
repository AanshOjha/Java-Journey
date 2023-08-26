// This problem's not in LeetCode. This is my own created problem.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddMissingNumbers {
    public void firstMissingPositive(int[] nums) {
        Arrays.sort(nums); // -1,1,3,4
        var list = new ArrayList<Integer>();

        for (int i : nums) {    // all nums[] elements to list
            list.add(i);
        }

        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i+1] - nums[i] != 1) {
                list.add((nums[i+1] + nums[i])/2);
            }
        }
        Collections.sort(list);
        System.out.println(list.toString());  
    }
    public static void main(String[] args) {
        AddMissingNumbers first = new AddMissingNumbers(); // 2,3,4,5,7
        first.firstMissingPositive(new int[] {3,4,-1,1});
    }
}
