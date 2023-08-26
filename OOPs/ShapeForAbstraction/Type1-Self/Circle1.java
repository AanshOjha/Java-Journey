
// Concrete class Circle extending Shape
class Circle1 extends Shape {
    private double radius;
    
    public Circle1(double radius) {
        this.radius = radius;
    }
    
    // Implementing the abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
