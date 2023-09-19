package DSA.Recursion.String;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//        System.out.println(subSeqList("", "abc"));
        System.out.println(subSeqListAscii("", "abc"));
    }


    static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> ans = new ArrayList<>();
    static ArrayList<String> subSeqList(String p, String up) {
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        subSeqList(p + ch, up.substring(1));
        subSeqList(p, up.substring(1));
        return ans;
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> ansAscii = new ArrayList<>();
    static ArrayList<String> subSeqListAscii(String p, String up) {
        if (up.isEmpty()) {
            ansAscii.add(p);
            return null;
        }

        char ch = up.charAt(0);
        subSeqListAscii(p + ch, up.substring(1));
        subSeqListAscii(p, up.substring(1));
        subSeqListAscii(p + (ch+0), up.substring(1));

        return ansAscii;
    }
}
