package OOPs.Basics;

class Student {
    String name;
    int age;

    // Non Parameterized constructor. Created auto if we don't make
//    Student() {
//        System.out.println("Constructor called");
//    }

    // Parameterized constructor
//    Student(String name, int age) {
//        // Assigning value to object which is given at object declaration
//        this.name = name;
//        this.age = age;
//    }

    // Copy Constructor also requires a non parameterized constructor
    // Copy data of object to another object
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    Student() {

    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class OOPs {
    public static void main(String[] args) {
        // Parameterized constructor
//        Student s1 = new Student("Aansh Ojha", 18);

        // For non parameterized constructor
//        Student s1 = new Student();
//        s1.name = "Aansh Ojha";
//        s1.age = 18;

        // Copy constructor
        Student s1 = new Student();
        s1.name = "Aansh Ojha";
        s1.age = 18;

        Student s2 = new Student(s1);
        s1.printInfo();
    }

}
