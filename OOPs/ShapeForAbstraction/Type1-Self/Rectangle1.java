

// Concrete class Rectangle extending Shape
class Rectangle1 extends Shape {
    private double length;
    private double width;
    
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementing the abstract method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}