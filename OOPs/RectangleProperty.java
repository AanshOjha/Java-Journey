package OOPs;

public class RectangleProperty {
    private int length;
    private int width;

    // Constructors
    public RectangleProperty(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    // Calculate Area
    public int area() {
        return length*width;
    } 


    // Calculate Perimeter
    public int perimeter() {
        return 2*(length+width);
    }

    // Print Result
    public String toString() {
        return String.format("Length: %d, Width: %d, Area: %d sq. units, Perimeter: %d units", length, width, area(), perimeter());
    }
}