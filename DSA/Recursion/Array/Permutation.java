package DSA.Recursion.Array;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        System.out.println(permutationRet("", "ab"));
        permutation("", "abc");
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
}
