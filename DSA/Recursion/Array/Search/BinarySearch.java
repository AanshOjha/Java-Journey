package DSA.Recursion.Array.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7; // 2
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

        else if (arr[middle] > target) {
            return binary(arr, target, start, middle - 1);

        }

        // If target == middle then,
        return middle;
    }
}
