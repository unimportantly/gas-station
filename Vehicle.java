package Vehicules;

public class Vehicle {
    //attributes
    private String brand, colour;
    private double price;
    private Motor motor;
    private double fuelCapacity;
    private boolean needsGas = false;
    private double fuelLeft;

    //constructors
    public Vehicle(){}
    public Vehicle(String brand, String colour, double price, Motor motor, double fuelCapacity, double fuelLeft) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.motor = motor;
        this.fuelCapacity = fuelCapacity;
        this.fuelLeft = fuelLeft;
    }

    //method
    public boolean drive(double distance) {
        this.motor.setMileage(this.motor.getMileage() + distance);
        System.out.println("you have driven " + distance + "km. You've driven a total of " + this.motor.getMileage() + "km!");
        this.setFuelLeft(this.getFuelLeft() - distance * (this.motor.getFuelEfficiency() / 100));
        System.out.println("you have " + fuelLeft +"L of gas left.");
        if (this.fuelLeft <= (this.fuelCapacity / 5) && this.fuelLeft > 0){
            needsGas = true;
            System.out.println("you need gas!");
        }else if (this.fuelLeft < 0){
            System.out.println("you ran out of gas, you're gonna die in the wilderness now, tough luck.");
        }else {
            System.out.println("you don't need gas");
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
