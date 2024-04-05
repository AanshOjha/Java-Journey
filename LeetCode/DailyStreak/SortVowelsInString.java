package LeetCode.DailyStreak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowelsInString {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
    static public String sortVowels(String s) {
        // Extract the vowels
        char[] ch = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        int pos = 0;
        for (char c : ch) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
                vowels.add(c);
                pos++;
            }
        }

        // Sort the vowels
        Collections.sort(vowels);

        // add them to string
        StringBuilder sb = new StringBuilder(s);
        int hell = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u' || sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' || sb.charAt(i)=='U') {
                sb.replace(i, i+1, vowels.get(hell).toString());
                hell++;
            }
        }



        return sb.toString();
    }

    public String sortVowels2(String s) {
        // Step 1: Collect vowels and sort them in descending order
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        Collections.sort(vowels, Collections.reverseOrder());

        // Step 2: Construct the answer string by replacing vowels in sorted order
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                result.append(vowels.get(vowels.size() - 1));
                vowels.remove(vowels.size() - 1);
            } else {
                result.append(c);
            }
        }

        // Step 3: Return the final string
        return result.toString();
    }
}
