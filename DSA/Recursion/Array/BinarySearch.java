package DSA.Recursion.Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 12, 14, 45, 67, 90};
        int target = 14; // 4
        System.out.println(binary(arr, target, 0, arr.length - 1));
    }

    static int binary(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = start + (end - start) / 2;

        if (arr[middle] < target) {
            return binary(arr, target, middle + 1, end);
        }

        if (arr[middle] < target) {
            return binary(arr, target, start, middle - 1);

        }

        // If target == middle then,
        return middle;
    }
}
