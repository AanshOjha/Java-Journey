package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int tempIndex = 0;

        int[] temp = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[tempIndex] = arr[i];
                i++;
            } else {
                temp[tempIndex] = arr[j];
                j++;
            }
            tempIndex++;
        }

        while (i <= mid) {
            temp[tempIndex] = arr[i];
            i++;
            tempIndex++;
        }

        while (j <= end) {
            temp[tempIndex] = arr[j];
            j++;
            tempIndex++;
        }

        // Copy elements from temp back to arr
        System.arraycopy(temp, 0, arr, start, temp.length);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}
