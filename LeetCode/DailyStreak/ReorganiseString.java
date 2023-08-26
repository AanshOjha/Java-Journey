package LeetCode.DailyStreak;

import java.util.PriorityQueue;

class ReorganiseString {
    static public String reorganizeString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> count[b - 'a'] - count[a - 'a']);
        for (char c = 'a'; c <= 'z'; c++) {
            if (count[c - 'a'] > 0) {
                maxHeap.offer(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            if (result.isEmpty() || result.charAt(result.length() - 1) != current) {
                result.append(current);
                count[current - 'a']--;
                if (count[current - 'a'] > 0) {
                    maxHeap.offer(current);
                }
            } else {
                if (maxHeap.isEmpty()) {
                    return "";
                }
                char next = maxHeap.poll();
                result.append(next);
                count[next - 'a']--;
                if (count[next - 'a'] > 0) {
                    maxHeap.offer(next);
                }
                maxHeap.offer(current);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aabbbaab"));
    }
}