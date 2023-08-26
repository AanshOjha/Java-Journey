public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
        
        // if n is less than 0, return -1 to indicate invalid input
        if (n < 0) {
            System.out.println("Only Positive value allowed");
        }
 
        // initialize sum to 0
        long sum = 0;
 
        // iterate over all numbers from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // square the current number and add it to the sum
            sum += i * i;
        }
 
        // return the calculated sum of squares
        return sum;
    }
    public static void main(String[] args) { 
        // Code goes here
        SumOfSquares instance = new SumOfSquares();
        long result = instance.calculateSumOfSquares(-56);
        System.out.println(result);
    }    

}