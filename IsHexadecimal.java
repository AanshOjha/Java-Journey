public class IsHexadecimal {
 
    public String str;
 
    public IsHexadecimal(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        // Check if the character is in the range for hexadecimal digits (A-F or a-f)
        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }
 
    public boolean isHexadecimal() {
        // A null string or an empty string is not a valid hexadecimal
        if (str == null || str.length() == 0) {
            return false;
        }
 
        for (char ch : str.toCharArray()) {
            // If any character is not a digit or a hexadecimal character, it's not a valid hexadecimal
            if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
                return false;
            }
        }
 
        // If we have gone through all characters and they are all valid,
        // then the string is a valid hexadecimal
        return true;
    }

    public static void main(String[] args) {
        IsHexadecimal hex = new IsHexadecimal("12324ABF");
        System.out.println(hex.isHexadecimalChar('A'));
        System.out.println(hex.isHexadecimal());
    }
}
