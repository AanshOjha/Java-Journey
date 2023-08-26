
public class ShapeRunner {
    public static void main(String[] args) {
        Shape circle = new Circle1(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        
        Shape rectangle = new Rectangle1(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

    }
}