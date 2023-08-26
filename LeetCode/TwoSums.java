// Takes input of a list of numbers and a target integer
// Returns index of two numbers whose sum is target integer

import java.util.Arrays;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i<= nums.length; i++){      // Eg. here i is from 0 - 4
            for (int j = i+1; j<nums.length; j++){  // here j is from (i+1) - 3
                if (nums[i] + nums[j] == target) {  // so i[0] is compared to j(every element)
                    int[] list = {i,j};
                    return list;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSums s = new TwoSums();
        var res = s.twoSum(new int[] {1,3,2,4}, 6);
        System.out.println(Arrays.toString(res));
    }
}