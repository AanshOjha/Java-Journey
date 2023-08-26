package DSA.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       int[] arr = {5, 1, 3, 2, 4};
       cyclicSort(arr);
       System.out.println(Arrays.toString(arr)); 
    }

    static void cyclicSort(int[] arr) {
        int i = 0; 
        while (i<arr.length) {      
            int correctIndex = arr[i]- 1;   // Correct index of element will be value of element -1
            if (arr[i] != arr[correctIndex]) {      // if element not in correct index, swap
                Swapping.swap(arr, i, correctIndex);
            }
            else {
                i++;        // or move to next element 
            }

        }
    }
}
