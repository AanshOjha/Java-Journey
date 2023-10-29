package LeetCode.DailyStreak;

public class ReverseWordsInString3 {
    public static void main(String[] args) {
        System.out.println(reverseWords2("Let's take LeetCode contest"));
    }
    static public String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            StringBuilder revWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {

                revWord.insert(i, word.charAt(word.length() - i - 1));
            }
            ans.append(revWord + " ");
        }

        return ans.toString().trim();
    }

    static public String reverseWords2(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        char[] charArray = s.toCharArray();
        while (j < n) {
            if (charArray[j] == ' ') {
                reverse(charArray, i, j);
                i = j + 1;
            }
            if (j == n - 1) reverse(charArray, i, n);
            j++;
        }
        return new String(charArray);
    }

    static private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1] = temp;
            start++;
            end--;
        }
    }
}
