package LeetCode.Recursion;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombination {
    public static void main(String[] args) {
        System.out.println(letterCombinations("78"));
    }

    static public List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<>();
        if(digits.isEmpty()) return list;

        return phonePad("",digits);
    }
    public static List<String> phonePad(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        // this will convert char to int, i.e. '2' into 2
        int digit = up.charAt(0) - '0';

        // Local to the Call
        ArrayList<String> list = new ArrayList<>();

        int i = (digit - 2) * 3;

        if (digit > 7) {
            i += 1;
        }

        int len = i + 3;

        if (digit == 7 || digit == 9) {
            len += 1;
        }

        for (; i < len; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonePad(p + ch, up.substring(1)));
        }

        return list;
    }
}
