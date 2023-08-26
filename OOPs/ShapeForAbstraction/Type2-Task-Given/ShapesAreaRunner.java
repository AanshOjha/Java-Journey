

public class ShapesAreaRunner {
        public static void main(String[] args) {
            ShapesArea circle = new Circle2("Circle", 5.0);
            circle.displayInfo();
     
            ShapesArea rectangle = new Rectangle2("Rectangle", 4.0, 6.0);
            rectangle.displayInfo();
        }
    }