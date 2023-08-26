import java.util.ArrayList;
import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); // -1,1,3,4
        var list = new ArrayList<Integer>();

        for (int i : nums) {    // all nums[] elements to list
            list.add(i);
        }

        int asd  = 0;
        for (int i = 0; i<nums.length-1; i++) {
            if (nums[i+1] - nums[i] != 1) {
                // list.add((nums[i+1] + nums[i])/2);
                asd = (nums[i+1] + nums[i])/2;
            }
        }
        String res = Integer.toString(asd);
        String[] ch = res.split("");
        int out = Integer.parseInt(ch[0]);
        return out;

    }
    public static void main(String[] args) {
        FirstMissingPositive first = new FirstMissingPositive(); // 2,3,4,5,7
        System.out.println(first.firstMissingPositive(new int[] {3,4,-1,1}));
    }
}
