package DSA.Recursion.Array.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchAllIndex {
    static List<Integer> result = new ArrayList<>();

    // The one interacting with user
    static ArrayList searchAllIndex(int[] nums, int target) {
        int index = 0;
        return helper(nums, target, result, index);
    }

    // To add index = 0 without having to be entered by user
    private static ArrayList helper(int[] nums, int target, List<Integer> result, int index) {
        if (index == nums.length - 1) {
            return new ArrayList(result);
        }

        if (nums[index] == target) {
            result.add(index);
        }
        return helper(nums, target, result, index + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,57,34,6,34,98,23};
        int target = 34;
        searchAllIndex(nums, target);
//        helper(nums, target, result, 0);    // Could use this directly but you have
                                              // to provide a list, and index too !
        System.out.println(result);

    }
}
