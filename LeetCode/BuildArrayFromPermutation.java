import java.util.Arrays;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
            
    }
    public static void main(String[] args) {
        BuildArrayFromPermutation arr = new BuildArrayFromPermutation();
        System.out.println(
            Arrays.toString(
                arr.buildArray(new int[] {0, 2, 1, 5, 3, 4})
            )
        );
    }
}
