public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);         // Integer to String
        String reverse = "";                    // Initiate reverse of string
        for (int i = s.length()-1; i>=0; i--) {
            reverse += s.charAt(i);             // Reverses the word
        }
        if (reverse.equals(s)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        System.out.println(palindrome.isPalindrome(12345));
    }
}