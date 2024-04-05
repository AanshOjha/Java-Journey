package DSA.Searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-10, -9, -1, 0, 4, 9, 13, 17, 24, 37, 49};
        System.out.println(Arrays.toString(arr));
        int target = 13;
        int ans = linearSearch(arr, target);
        System.out.printf("Index of %d is: %d", target, ans);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

