import java.util.Arrays;
import java.util.HashSet;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        // If there are no duplicate elements
        // Arrays.sort(nums);
        // return nums[nums.length-k];

        // If nums has duplicate element -->

        // Using a HashSet to remove duplicates
        var uniqueSet = new HashSet<Integer>();
        for (int num : nums) {
            uniqueSet.add(num);     // Adding nums[] values to uniqueSet 
        }

        // Convert the unique elements back to an array
        int[] uniqueArray = new int[uniqueSet.size()];      // uniqueArray of size of uniqueSet
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index] = num;       // Assigning uniqueSet values to uniqueArray
            index++;
        }

        // Sorting the unique elements
        Arrays.sort(uniqueArray);       // Sorting uniqueArray

        // Optional
        // Print the sorted unique elements
        // System.out.println("Sorted and unique elements:");
        // for (int num : uniqueArray) {
        //     System.out.print(num + " ");
        // }
        // System.out.print("\n%dth Largest Number from List is: ".formatted(k));
        
        return uniqueArray[uniqueArray.length-k];
    }

    public static void main(String[] args) {
        KthLargestElement k = new KthLargestElement();
        System.out.println(k.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6,6,6,5,5,7,7,7,6}, 2));
        
    }
}
