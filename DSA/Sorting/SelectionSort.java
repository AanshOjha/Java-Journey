package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr2 = {5, 3, 4, 1, 2};
        selectionSort(arr2);
        System.out.println(Arrays.toString((arr2)));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int last = arr.length - i - 1;      // Index of last element excluding sorted ones
            int indexOfLargestNumber = getMaxIndex(arr, 0, last); // between start and end
            Swapping.swap(arr, indexOfLargestNumber, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        // Index of Largest number between start and end

        int max = start;
        for (int i = start; i <= end; i++) {    
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
