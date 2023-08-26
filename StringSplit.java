
import java.util.*;

public class StringSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replaceAll("[!?,._\\s'@]+", " ");
        String[] str =  s.split(" ");
        
        System.out.println(str.length);
        for (int i = 0; i<=str.length-1; i++) {
            System.out.println(str[i]);
        }
        // Write your code here.
        scan.close();
    }
}
