// RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {
    
    // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
        // write your code here
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getter method to get the red value of the color.
    public void getRed() {
        // write your code here
        System.out.println(this.red);
    }

    // Getter method to get the green value of the color.
    public void getGreen() {
        // write your code here
        System.out.println(this.green);
    }

    // Getter method to get the blue value of the color.
    public void getBlue() {
        // write your code here
        System.out.println(this.blue);
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        // write your code here
        this.blue =  255 - blue;
        this.green = 255 - green;
        this.red = 255 - red;
        System.out.println("Inversion of RED: " + this.red);
        System.out.println("Inversion of GREEN: " + this.green);
        System.out.println("Inversion of BLUE: " + this.blue);
    }

    public static void main(String[] args) {
        RGBColor colorRgb = new RGBColor(255, 250, 245);
        colorRgb.invert();
    }
}