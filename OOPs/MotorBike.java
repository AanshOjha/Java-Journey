package OOPs;

public class MotorBike {
    
    // Instance variable for speed
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike Started");
    }
    public static void main(String[] args) { 
        // Defining Bikes
        MotorBike BMW = new MotorBike();
        MotorBike Honda = new MotorBike();
        // Start Bikes
        BMW.start();
        Honda.start();
        // Setting speed
        BMW.speed = 80;
        Honda.speed = 100;
        
        
        
    }
}
