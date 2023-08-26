public class FeetsAndInches {
    private int feet;
    private int inches;
    
    public FeetsAndInches(int inches) {
        // Store the feet and inches in their respective instance variables.
        
        // return -1 if inch < 0
        if (inches < 0) {
            this.feet = -1;
            this.inches = -1;
        }
        
        else {
            // when divisible return feet
            this.feet = inches / 12; 
            this.inches = inches % 12;
        }
    }
    
    public int getFeet() {
        return feet;
    }
    
    public int getInches() {
        return inches;
    } 
    
    public static void main(String[] args) {
        FeetsAndInches dim = new FeetsAndInches(121);
        System.out.println(dim.getFeet());
        System.out.println(dim.getInches());
    }
}