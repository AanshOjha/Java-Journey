public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int sum = 0;
        for (int i=1; i<number; i++) {
            if (number % i == 0) {
                sum += i;
            }
            
        }
        if (sum == number) {
            return true;
        }
        else{
            return false;
        } 
        
    }
    public static void main(String[] args) { 
            // Code goes here
            PerfectNumberChecker instance = new PerfectNumberChecker();
            boolean result = instance.isPerfectNumber(28);
            System.out.println(result);
            
    }
}