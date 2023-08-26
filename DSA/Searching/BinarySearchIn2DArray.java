package DSA.Searching;

import java.util.Arrays;

// Returns index of Target number

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 13;
        System.out.println(Arrays.toString(binarySearchIn2DArray(matrix, target)));
    }

    static int[] binarySearchIn2DArray(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >=0) {
            
            if (target == matrix[row][col]) {
                return new int[] {row, col};
            }
            if (target > matrix[row][col]) {
                row++;
            }
            else {
                col--;
            }
        }

        return new int[] {-1, -1};
    }
}
