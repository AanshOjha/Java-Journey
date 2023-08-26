public class AreaPerimeterOfSquare {

    private int side;

    public AreaPerimeterOfSquare(int side) {
        this.side = side;
    }

    public int calculateArea() {
        if (side <= 0) {
            return -1;
        }
        else {
            return side * side;
        }

    }

    public int calculatePerimeter() {
        if (side <= 0) {
            return -1;
        }
        else {
            return side * 4;
        }

    }

    public static void main(String[] args) {
        AreaPerimeterOfSquare square = new AreaPerimeterOfSquare(5);
        System.out.println("Area of Square is: " + square.calculateArea());
        System.out.println("Perimeter of Square is: " + square.calculatePerimeter());
    }

}