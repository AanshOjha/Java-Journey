package OOPs.Basics;

class Person1 {
    private String name;
    private int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(String name, int age) {
        System.out.printf("My name is %s and age is %d\n", name, age);
    }

    public void printInfo() {
        System.out.printf("My name is %s and age is %d\n", name, age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Aansh", 18);
        p1.setAge(20);
        p1.printInfo();
    }
}