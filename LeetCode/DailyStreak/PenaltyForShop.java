package LeetCode.DailyStreak;

public class PenaltyForShop {
    static public int bestClosingTime(String customers) {
        int max_score = 0, score = 0, best_hour = -1;
        for (int i = 0; i < customers.length(); ++i) {
            score += (customers.charAt(i) == 'Y') ? 1 : -1;
            if (score > max_score) {
                max_score = score;
                best_hour = i;
            }
        }
        return best_hour + 1;
    }

    public static void main(String[] args) {
        System.out.println(bestClosingTime("YNYY"));
    }
}
