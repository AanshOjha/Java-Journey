package DSA.Recursion.Array.Sorting;

import java.util.Arrays;

public class QuickSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // low and hi: range of array currently working on
    // start and end: of the current range of arrays

    static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi) {    // one element or no element in the current range,
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {    // Going good
                start++;
            }
            while (arr[end] > pivot) {      // Going good
                end--;
            }

// If start is still less than or equal to end after the above two loops, it means there are elements to swap.

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, hi);
    }
}
