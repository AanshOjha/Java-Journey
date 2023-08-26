import java.util.Arrays;

public class ShuffleArray1 {
    static int[] shuffle(int[] nums, int n) {
        int[] num1 = new int[n];
        for (int i = 0; i<n; i++) {
            num1[i] = nums[i];
        }

        int[] num2 = new int[n];
        for (int i = n; i<(n*2); i++) {
            num2[i-n] = nums[i];
        }

        int[] newNum = new int[2*n];
        for (int i = 0; i<2*n; i = i + 2) { // i = 0, 2, 4
            newNum[i] = num1[i/2];
        }
        for (int i = 1; i<2*n; i = i + 2) { // i = 1, 3, 5
            newNum[i] = num2[i/2];
        }
        
        return newNum;
        
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7}, 3)));
    }
}
