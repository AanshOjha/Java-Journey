package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void bubbleSort(int[] arr) {
        // Checking if swapped or not for testing hello
        boolean swapped;
        for (int i = 0 ; i<arr.length; i++) {
            swapped = false;
            for (int j = 1; j< arr.length - i; j++){    
                if (arr[j] < arr[j-1]) {
                    Swapping.swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped) {     // If true, break. Means if the inner loop is executed swapping will be true.
                break;          // then !swapped will be false. THIS STATEMENT WILL NOT BE USED.
            }                   // IF SWAPPING NOT DONE THIS WILL EXECUTE. (WHEN ALREADY SORTED)
        }
    }
}
