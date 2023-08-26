

public class Rectangle2 extends ShapesArea {
    private double length;
    private double width;
    
    public Rectangle2(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
public double calculateArea() {
    return length * width;
}
    
}