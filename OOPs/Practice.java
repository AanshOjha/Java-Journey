package OOPs;

public class Practice {

    public static void main(String[] args) {
        Practice pr = new Practice("Aansh", 18, 75);
        System.out.println(pr.printString());
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int weight;


    public Practice(String naam, int umar, int weight) {
        this.name = naam;
        this.age = umar;
        this.weight = weight;
    }

    public String printString() {
        return String.format("Name: %s\nAge: %d\nWeight: %d", name, age, weight);
    }
}
