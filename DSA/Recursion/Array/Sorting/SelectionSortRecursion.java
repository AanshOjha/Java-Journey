package DSA.Recursion.Array.Sorting;

import java.util.Arrays;

public class SelectionSortRecursion {
    static void selection(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[row - 1];
            arr[row - 1] = arr[max];
            arr[max] = temp;
            selection(arr, row -1, 0, 0);   // Resetting col and max to 0 with row updated to row - 1
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,7,3,2,4,1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
