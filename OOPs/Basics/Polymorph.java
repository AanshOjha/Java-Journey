package OOPs.Basics;

class Students {
    String name;
    int age;

    // Complie time polymorh
    void printInfo(String name) {
        System.out.println(name);
    }
    void printInfo(String name, int age) {
        System.out.println(name + " " +  age);
    }

    void printInfo(int age) {
        System.out.println(age);
    }
}
public class Polymorph {
    public static void main(String[] args) {
        Students s3 = new Students();

        s3.printInfo("Aansh", 18);
        s3.printInfo(20);
        s3.printInfo("Ananay");
    }

}
