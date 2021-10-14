package Vehicules;

public class Vehicle {
    //attributes
    private String brand, colour;
    private double price;
    private Motor motor;
    private double fuelCapacity;
    private double fuelLeft = fuelCapacity;
    private boolean needsGas = false;

    //constructors
    public Vehicle(){}
    public Vehicle(String brand, String colour, double price, Motor motor, double fuelCapacity) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.motor = motor;
        this.fuelCapacity = fuelCapacity;
    }

    //method
    public void drive(double distance) {
        this.motor.setMileage(this.motor.getMileage() + distance);
        System.out.println("you have driven " + distance + "km.");
    }
    public boolean fuelConsumption(double distance) {
        this.fuelLeft -= distance * (this.motor.getFuelEfficiency() / 100);
        if (this.fuelLeft <= (this.fuelCapacity / 5)){
        needsGas = true;
    }return needsGas;
    }
    //getters & setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public double getFuelLeft() {
        return fuelLeft;
    }
    public void setFuelLeft(double fuelLeft) {
        this.fuelLeft = fuelLeft;
    }
    public boolean isNeedsGas() {
        return needsGas;
    }
    public void setNeedsGas(boolean needsGas) {
        this.needsGas = needsGas;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", motor=" + motor +
                ", fuelCapacity=" + fuelCapacity +
                ", fuelLeft=" + fuelLeft +
                ", needsGas=" + needsGas +
                '}';
    }
}
