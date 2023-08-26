import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Sorting given array
        Arrays.sort(nums);

        List<List<Integer>> triplets = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            // avoid duplicate entry at the first element in the triplet
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            // use two pointer approach to solve for two sum on remaining array
            int left = i+1;
            int right = nums.length - 1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }
                else if(nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                }
                else {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    // avoid duplicate entry at the 2nd element in the triplet
                    while(nums[left] == nums[left-1] && left < right)left++;
                }
            }
        }
        return triplets;
    }


    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println((threeSum(nums)));
    }
}
