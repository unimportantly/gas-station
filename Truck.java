package Vehicules;

public class Truck extends Vehicle{

    //attributes
    private int passengers;

    //constructors
    public Truck() {
        super();
    }
    public Truck(int passengers) {
        this.passengers = passengers;
    }
    public Truck(String brand, String colour, double price, Motor motor, double fuelCapacity, double fuelLeft, int passengers) {
        super(brand, colour, price, motor, fuelCapacity, fuelLeft);
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
        return "Truck{" +
                "passengers=" + passengers +
                '}';
    }
}
