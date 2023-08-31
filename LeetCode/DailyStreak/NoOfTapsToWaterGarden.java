package LeetCode.DailyStreak;

public class NoOfTapsToWaterGarden {
    static public int minTaps(int n, int[] ranges) {
        int[] intervals = new int[n + 1]; // Create an array to store intervals covered by each tap

        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            intervals[left] = Math.max(intervals[left], right); // Store the rightmost point covered by each tap
        }

        int end = 0; // Initialize the current end of the covered area
        int maxEnd = 0; // Initialize the maximum end of the covered area
        int taps = 0; // Initialize the number of taps used

        for (int i = 0; i <= n; i++) {
            maxEnd = Math.max(maxEnd, intervals[i]); // Update the maximum end of the covered area

            if (i == end) { // If we've reached the end of the currently covered area
                taps++; // Place a tap
                end = maxEnd; // Update the current end to the maximum end of the covered area

                if (end >= n) { // If the entire garden is covered
                    return taps;
                }
            }
        }

        return -1; // If the entire garden cannot be covered
    }

    public static void main(String[] args) {
        int[] ranges = {3,4,1,1,0,0};
        System.out.println(minTaps(5, ranges));
    }
}
