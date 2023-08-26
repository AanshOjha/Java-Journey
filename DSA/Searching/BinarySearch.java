package DSA.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = {-10, -9, -1, 0, 4, 9, 13, 17, 24, 37, 49}; 
        int[] arr = {49, 37, 24, 17, 13, 9, 4, 0, -4, -18};
        int target = 13;
        int ans = binarySearch(arr, target);
        System.out.printf("Index of %d is: %d", target, ans);
    }

    // Returns index of target element
    // Returns -1 if not found 
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        // Checks if ascending or not
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
 
            if (arr[mid] == target) {
                return mid;
            }
            
            if (isAscending) {
                if (target > arr[mid]) {
                    // Search in the right 
                    start = mid + 1;
                } else {
                    // search in the left
                    end = mid - 1;
                }
            }

            else {
                if (target < arr[mid]) {
                    // Search in the right 
                    start = mid + 1;
                } else {
                    // search in the left
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int simpleBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
 
            if (arr[mid] == target) {
                return mid;
            }
            
            if (target > arr[mid]) {
                // Search in the right 
                start = mid + 1;
            } else if (target < arr[mid]) {
                // search in the left
                end = mid - 1;
            }
        }
        return -1;
    }
}
