public class LongestStringNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        String s2 = "";
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); // a
            if(s2.indexOf(c)==-1){
                s2 += String.valueOf(c);
                if(max<s2.length())
                max = s2.length();
            }
            else{
                s2 = s2.substring(s2.indexOf(c)+1)+String.valueOf(c);
            }
        }
        // System.out.println(s2);
        return max;
    }
    public static void main(String[] args) {
        LongestStringNoRepeat str = new LongestStringNoRepeat();
        System.out.println(str.lengthOfLongestSubstring("ananay"));

    }
}