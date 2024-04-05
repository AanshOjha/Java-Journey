package OOPs.Basics;

abstract class Shapes {
    abstract void area();
    int n;
}

abstract class Cars {
    abstract void model();
}

// ERROR AS A CLASS CANNOT EXTEND 2 ABSTRACT CLASSES
//class Test extends Cars, Shapes {
//    @Override
//    void model() {
//        System.out.println("");
//    }
//
//
//    @Override
//    void area() {
//        System.out.println("");
//    }
//}

class Circles extends Shapes {
    void area() {
        int r = 8;
        System.out.println(3.14*r*r);
    }
}
public class Abstraction {
    public static void main(String[] args) {

    }
}
