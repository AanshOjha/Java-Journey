package LeetCode.DailyStreak;

public class MaximalNetworkRank {
    public static int maximalNetworkRank(int n, int[][] roads) {
        int[] cityCount = new int[n]; // Array to store the count of roads connected to each city
        boolean[][] connected = new boolean[n][n]; // Matrix to track if two cities are directly connected
        
        for (int[] road : roads) {
            int city1 = road[0];
            int city2 = road[1];
            
            cityCount[city1]++;
            cityCount[city2]++;
            connected[city1][city2] = true;
            connected[city2][city1] = true;
        }
        
        int maxRank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = cityCount[i] + cityCount[j];
                if (connected[i][j]) {
                    rank--; // Subtract 1 if the cities are directly connected by a road
                }
                maxRank = Math.max(maxRank, rank);
            }
        }
        
        return maxRank;
    }

    public static void main(String[] args) {
        int[][] roads = {
            {0,1},
            {1,2},
            {2,3},
            {2,4},
            {5,6},
            {5,7}
        };
        System.out.println(maximalNetworkRank(8, roads));

        
    }
}

