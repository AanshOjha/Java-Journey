
public class Circle2 extends ShapesArea {
    private double radius;
    
    public Circle2(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
public double calculateArea() {
    return Math.PI * radius * radius;
}
    
}