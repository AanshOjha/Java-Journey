import java.util.Arrays;

public class ShuffleArray2 {
    static int[] shuffle(int[] nums, int n) {
        int[] newNum = new int[2 * n];
        int newIndex = 0; // Index for the newNum array

        for (int i = 0; i < n; i++) {
            newNum[newIndex++] = nums[i]; // 0, 2, 4 --> 0, 1, 2
            newNum[newIndex++] = nums[i + n]; // 1, 3, 5 --> 3, 4, 5
        }

        return newNum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7}, 3)));
    }
}
