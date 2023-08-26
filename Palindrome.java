import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to check if its a Palindrome.");
        String A=sc.next();
        A = A.toLowerCase();
        String rev = "";

        for (int i = A.length()-1; i>=0; i--) {
            rev+=A.charAt(i);
        }

        if (A.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();        
    }
}