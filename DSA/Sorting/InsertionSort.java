package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i<arr.length-1; i++) {      // first pass, then second
            for (int j = i+1; j>0; j--) {   
                if (arr[j-1] > arr[j]) {    // if previous element > present element, swap
                    Swapping.swap(arr, j, j-1);     // then update i for next i
                } 
            }
        }
    }
}
