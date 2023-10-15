package oocminihw2;

public class Truck extends Vehicle implements Drivable {

    //Implemented the drivable interface's methods. 
    //Not coding the methods for the moment so just returning 0/null.
    @Override
    public void accelerate(float speed) {
    }

    @Override
    public void brake() {
    }

    @Override
    public void turn(float angle) {
    }

    @Override
    public float getDirection() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }
    
}
