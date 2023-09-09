package LeetCode.DailyStreak;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) {
            return triangle;
        }

        // First row (always contains 1)
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // First element in each row is always 1
            row.add(1);

            for (int j = 1; j < rowNum; j++) {
                // Calculate the middle elements by summing the two elements above
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                row.add(sum);
            }

            // Last element in each row is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        // Printing the result
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
