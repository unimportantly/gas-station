package Vehicules;

public class Car extends Vehicle{

    //attributes
    private int passengers;

    //constructors
    public Car() {
        super();
    }
    public Car(int passengers) {
        this.passengers = passengers;
    }
    public Car(String brand, String colour, double price, Motor motor, double fuelCapacity, int passengers) {
        super(brand, colour, price, motor, fuelCapacity);
        this.passengers = passengers;
    }

    //methods

    //getter & setter
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + passengers +
                '}';
    }
}
