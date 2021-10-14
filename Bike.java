package Vehicules;

public class Bike extends Vehicle{

    //attributes
    private int passengers;

    //constructors
    public Bike() {
        super();
    }
    public Bike(int passengers) {
        this.passengers = passengers;
    }
    public Bike(String brand, String colour, double price, Motor motor, double fuelCapacity, double fuelLeft, int passengers) {
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
        return "Bike{" +
                "passengers=" + passengers +
                '}';
    }
}
