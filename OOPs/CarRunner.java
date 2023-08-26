package OOPs;

// Engine class represents a car's engine
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

// Car class represents a car and uses object composition to have an Engine
class Car {
    private String make;
    private String model;
    private Engine engine; // Composition: Car "has-a" Engine

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println(make + " " + model + " starting.");
        engine.start(); // Using the Engine object's functionality
    }

    public void stop() {
        System.out.println(make + " " + model + " stopping.");
        engine.stop(); // Using the Engine object's functionality
    }
}

public class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Toyota", "Camry", engine);

        car.start();
        car.stop();
    }
}

