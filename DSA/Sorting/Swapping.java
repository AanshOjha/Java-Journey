package DSA.Sorting;

// Method to swap elements. Given an array, first element and second element

public class Swapping {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first]; 
        arr[first] = arr[second]; 
        arr[second] = temp;
    }
}
