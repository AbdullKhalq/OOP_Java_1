import java.lang.classfile.Superclass;

public class SpeedBoat extends Ship {
    private float enginePower, maxSpeed;
    private float acceleration = 1;

    SpeedBoat() {
    }

    // directly pass to parent class consturctor
    SpeedBoat(String name) {
        super(name);
    }

    SpeedBoat(String name, 
              double x, double y) {
        super(name, x, y);
    }

    SpeedBoat(String name, 
              double x, double y, 
              double speed,
              double direction) {
        super(name, x, y, speed, direction);
    }

    SpeedBoat(String name, 
               double x, double y, 
               double speed, 
               float enginePower, 
               float maxSpeed) {
        super(name, x, y, speed);
        this.enginePower    = enginePower;
        this.maxSpeed       = maxSpeed;
    }

    SpeedBoat (String name, 
                double x, double y,
                double speed,
                double direction,   
                float enginePower, 
                float maxSpeed, 
                float acceleration) {
        super(name, x, y, speed, direction);
        this.enginePower    = enginePower;
        this.maxSpeed       = maxSpeed;
        this.acceleration   = acceleration;
    }

    void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    void setMaxSpeed(float maxSpeed) {
        this.maxSpeed =  maxSpeed;
    }

    void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    } 

    float getEnginePower() {
        return enginePower;
    }

    float getMaxSpeed() {
        return maxSpeed;
    }

    float getAcceleration() {
        return acceleration;
    }

    void displayEnginePower() {
        System.out.printf("%s engine power is %f\n", 
                          getName(), getEnginePower());
    }

    void displayMaxSpeed() {
        System.out.printf("%s max speed is %f\n", 
                          getName(), getMaxSpeed());
    }

    void displayAcceleration() {
        System.out.printf("%s acceleration is %f\n", 
                          getName(), getAcceleration());
    }

    void displayAllInformation() {
        super.displayAllInformation();
        displayEnginePower();
        displayAcceleration();
        displayMaxSpeed();
    }
}