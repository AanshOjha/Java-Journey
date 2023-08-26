public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;  // Reset wealth for each customer
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];  // Accumulate wealth for the current customer
            }
            maxWealth = Math.max(maxWealth, wealth);  // Update maxWealth if necessary
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] testCase = {
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        System.out.println(maximumWealth(testCase));
    }
}
