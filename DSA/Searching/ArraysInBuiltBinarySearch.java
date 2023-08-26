package DSA.Searching;

import java.util.Arrays;

public class ArraysInBuiltBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-10, -9, -1, 0, 4, 9, 13, 17, 24, 37, 49}; 
        int target = 13;
        int ans = Arrays.binarySearch(arr, 0, arr.length-1, target);
        System.out.println(ans);
    }
}
