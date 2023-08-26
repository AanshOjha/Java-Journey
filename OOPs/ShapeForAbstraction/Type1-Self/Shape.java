

// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();
    
    // Just to show abstract class can have a Concrete method
    public void display() {
        System.out.println("This is a shape."); // Print this normally by instance
    }
}