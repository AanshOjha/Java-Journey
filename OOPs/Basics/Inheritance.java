package OOPs.Basics;

class Shape {
    void area() {
        System.out.println("Prints area");
    }
}

class Triangle extends Shape {
    void area(int b, int h) {
        System.out.println(0.5*b*h);
    }

}

class Circle extends Shape {
    void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

class EquilateralTriangle extends Triangle {
    void area(int b, int h) {
        System.out.println(0.5*b*h);
    }
}
public class Inheritance {
    public static void main(String[] args) {

    }
}
