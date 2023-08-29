package LeetCode.DailyStreak;

public class PenaltyForShop {
    static public int bestClosingTime(String customers) {
        char[] chars = customers.toCharArray();
        int bestTime = 0, penaltyDiff = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'Y') {
                penaltyDiff--;
            } else {
                penaltyDiff++;
            }

            if (penaltyDiff < 0) {
                penaltyDiff = 0;
                bestTime = i + 1;
            }
        }
        return bestTime;
    }

    public static void main(String[] args) {
        System.out.println(bestClosingTime("YNYY"));
    }
}
