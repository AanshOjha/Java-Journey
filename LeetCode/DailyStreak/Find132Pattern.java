package LeetCode.DailyStreak;

public class Find132Pattern {

    public static void main(String[] args) {
        System.out.println(find132pattern(new int[] {1,2,3,4}));    // false
        System.out.println(find132pattern(new int[] {3,1,4,2}));    // true
        System.out.println(find132pattern(new int[] {-1,3,2,0}));   // true
        System.out.println(find132pattern(new int[] {1,2}));        // false

    }
    static public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int prevMin = Integer.MIN_VALUE;
        int potentialPeak = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < prevMin) {
                return true;
            }
            while (potentialPeak < nums.length && nums[i] > nums[potentialPeak]) {
                prevMin = nums[potentialPeak++];
            }
            potentialPeak--;
            nums[potentialPeak] = nums[i];
        }
        return false;
    }
}
