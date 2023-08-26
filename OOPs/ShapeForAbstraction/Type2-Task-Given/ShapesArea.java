

 abstract class ShapesArea {
    protected String name;

    public ShapesArea(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("ShapesArea: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

