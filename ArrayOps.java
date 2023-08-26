import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {
        int[] arr = {12,4,56,3,63,87};

        // System.out.println(min(arr));
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(sortedArray(arr)));
    }

    static int max(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int index = 0; index<arr.length; index++) {
            if (arr[index] > maxNum) {
                maxNum = arr[index];
            }
        }
        return maxNum;
    }

    static int min(int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int index = 0; index<arr.length; index++) {
            if (arr[index] < minNum) {
                minNum = arr[index];
            }
        }
        return minNum;
    }

    static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int index = 0; index<arr.length; index++) {
            reversedArray[index] = arr[arr.length-index-1];
        }
        return reversedArray;
    }

    static int[] sortedArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
