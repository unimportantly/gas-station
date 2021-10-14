package Vehicules;

abstract class Motor {
    //attributes
    private double speed, mileage;
    private double fuelEfficiency; //litres au 100

    //constructors
    public Motor(){}
    public Motor(double speed, double mileage, double fuelEfficiency){
        this.speed = speed;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
    }
    //methods

    //setters & getters
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "speed=" + speed +
                ", mileage=" + mileage +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
