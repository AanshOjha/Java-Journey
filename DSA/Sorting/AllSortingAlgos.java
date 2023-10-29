package DSA.Sorting;

import java.util.Arrays;

public class AllSortingAlgos {
    public static void main(String[] args) {
        int[] nums = {3,1,5,2,4};
        cyclicSorting(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cyclicSorting(int[] arr) {
        int i = 0;
        while (i< arr.length) {
            int correctInd = arr[i] - 1;
            if (arr[i] != arr[correctInd]) {
                Swapping.swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
    }

    static void insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    Swapping.swap(arr, j, j - 1);
                }
            }
        }
    }

    static void selectionSorting(int[] nums) {
        // get the largest element index and swap to the last place
        for (int i = 0; i < nums.length; i++) {
            int endIndex = nums.length - i - 1;
            int maxIndex = indexOfMax(nums, 0, endIndex);
            Swapping.swap(nums, maxIndex, endIndex);
        }
    }

    static int indexOfMax(int[] nums, int start, int end) {
        int max = start;
        for (int i = 0; i < nums.length; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

    static void bubbleSorting(int[] nums) {
        // Largest element thrown to the last at every inner loop completion

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j-1] > nums[j]) {
                    Swapping.swap(nums, j - 1, j);
                }
            }
        }
    }
}


