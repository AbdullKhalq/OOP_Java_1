import java.lang.classfile.Superclass;

public class SpeedBoat extends Ship {
    private float enginePower, maxSpeed;
    private float acceleration = 1;

    SpeedBoat () {
    }

    SpeedBoat (String name, float enginePower, 
                float maxSpeed) {
        // 'super' to call from main class 
        super(name);
        this.enginePower    = enginePower;
        this.maxSpeed       = maxSpeed;
    }

    SpeedBoat (float enginePower, 
                float maxSpeed, 
                float acceleration) {
        this.enginePower    = enginePower;
        this.maxSpeed       = maxSpeed;
        this.acceleration   = acceleration;
    }

    void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    void setMaxSpeed (float maxSpeed) {
        this.maxSpeed =  maxSpeed;
    }

    void setAcceleration (float acceleration) {
        this.acceleration = acceleration;
    } 
}