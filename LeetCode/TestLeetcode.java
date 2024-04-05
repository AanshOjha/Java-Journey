package LeetCode;

import java.util.Arrays;

public class TestLeetcode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
    }

    static public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length; i++){      // Eg. here i is from 0 - 4
            for (int j = i+1; j < nums.length; j++){  // here j is from (i+1) - 3
                if (nums[i] + nums[j] == target) {  // so i[0] is compared to j(every element)
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
