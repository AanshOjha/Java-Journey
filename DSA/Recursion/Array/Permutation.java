package DSA.Recursion.Array;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationCount2("", "abc"));
//        permutation("", "abc");
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {     // i max upto p.length()
            String f = p.substring(0, i);
            String s = p.substring(i);  // i -> end
            permutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutationRet(String p, String up) {
        ArrayList<String> ans = new ArrayList<>();
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);  // i -> end
            permutation(f + ch + s, up.substring(1));

        }

        return ans;     // Returns empty element
    }


    static int count = 0;
    static int permutationCount(String p, String up) {

        if (up.isEmpty()) {
            count++;
            return count;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {     // i max upto p.length()
            String f = p.substring(0, i);
            String s = p.substring(i);  // i -> end
            permutationCount(f + ch + s, up.substring(1));
        }

        return count;
    }

//   ========================= OR =========================

    static int permutationCount2(String p, String up) {
        int count2 = 0;
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {     // i max upto p.length()
            String f = p.substring(0, i);
            String s = p.substring(i);  // i -> end
            count2 += permutationCount(f + ch + s, up.substring(1));
        }

        return count2;
    }
}
