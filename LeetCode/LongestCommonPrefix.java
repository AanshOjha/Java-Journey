import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // Sort to facilitate
        String s1 = strs[0]; // First element
        String s2 = strs[strs.length-1]; // Last element
        int ind = 0;
        while (ind<s1.length() && ind<s2.length()) {
            if (s1.charAt(ind) == s2.charAt(ind)) {     // If character at ind in s1 = s2
                ind++;       // First and last string have character common at index "ind"
            }
            else {
                break;
            }
        }
        return s1.substring(0, ind);
    }

    public static void main(String[] args) {
        LongestCommonPrefix common = new LongestCommonPrefix();
        System.out.println(common.longestCommonPrefix(new String[] {"flower","flow","floght"}));;
    }
}
