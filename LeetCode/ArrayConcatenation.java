import java.util.Arrays;

public class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        
        for (int i = 0; i<nums.length; i++) {
            // Arrays.fill(ans, 0, nums.length, nums[i]);
            ans[i] = nums[i];
        }
        for (int i = nums.length; i<2*nums.length; i++) {
            ans[i] = nums[i-nums.length];
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayConcatenation concat = new ArrayConcatenation();
        System.out.println(
            Arrays.toString(
                concat.getConcatenation(new int[] {1,2,1})
            )
        );
    }
}
