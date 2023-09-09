package LeetCode.Arrays;

import java.awt.desktop.PreferencesEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidWithGreatestCandies {
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Finding max in candies array
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Real code goes here
        List<Boolean> result = new ArrayList<>();
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                result.add(true);
            }
            else result.add(false);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies).toString());
    }
}
