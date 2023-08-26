public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        person1.printDetails();
        
        Person person2 = new Person("Jane Smith", 25);
        person2.printDetails();
    }
}
