package LeetCode.Sorting;

import DSA.Sorting.Swapping;

import java.util.Arrays;

class MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]==0 && index<nums2.length){
                nums1[i] = nums2[index++];
            }
        }
     
        for (int i = 0; i<nums1.length-1; i++) {      // first pass, then second
            for (int j = i+1; j>0; j--) {   
                if (nums1[j-1] > nums1[j]) {    // if previous element > present element, swap
                    Swapping.swap(nums1, j, j-1);     // then update i for next i
                } 
            }
        }


        // ===================== ADVANCED METHOD ===========================
        // //variables to work as pointers
        // int i = m - 1; // will point at m-1 index of nums1 array || {1,2,3,0,0,0} i = index of 3
        // int j = n - 1; // will point at n-1 index of nums2 array || {2, 5, 6} j = index of 6
        // int k = nums1.length - 1; //will point at the last position of the nums1 array

        // // Now traversing the nums2 array
        // while (j >= 0){
        //     // If element at i index of nums1 > element at j index of nums2
        //     // then it is largest among two arrays and will be stored at k position of nums1
        //     // using i>=0 to make sure we have elements to compare in nums1 array
        //     if (i >= 0 && nums1[i] > nums2[j]){
        //         nums1[k] = nums1[i];
        //         k--; 
        //         i--; //updating pointer for further comparisons
        //     } else {
        //         // element at j index of nums2 array is greater than the element at i index of nums1 array 
        //         // or there is no element left to compare with the nums1 array 
        //         // and we just have to push the elements of nums2 array in the nums1 array.
        //         nums1[k] = nums2[j];
        //         k--; 
        //         j--; //updating pointer for further comparisons
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}