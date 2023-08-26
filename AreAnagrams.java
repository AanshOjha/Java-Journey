import java.util.Arrays;

public class AreAnagrams {
    
    public boolean areAnagrams(String str1, String str2) {
        // Handle null strings
        if (str1 == null || str2 == null) {
            return false;
        }
    
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;
        }
    
        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
    
        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
    
        // Check if the sorted char arrays are the same
        return Arrays.equals(charArray1, charArray2);
    }
    

    public static void main(String[] args) {
        AreAnagrams are = new AreAnagrams();
        System.out.println(are.areAnagrams(null, "iceman"));
    }
}