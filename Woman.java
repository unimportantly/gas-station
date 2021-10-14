package Vehicules;

public class Woman {

    //attributes
    private double cash;
    private Vehicle vehicle;
    private GasStation gasStation;
    private double gasBought;
    private double cashLeft;

    //constructor
    public Woman(){}
    public Woman(double cash, Vehicle vehicle, GasStation gasStation) {
        this.cash = cash;
        this.vehicle = vehicle;
        this.gasStation = gasStation;
    }

    //method
    public void getGas(double cashSpent){
        cashLeft = cash - cashSpent;
    if (this.vehicle.isNeedsGas() == true && cashLeft >= 0){
        if (this.vehicle.getMotor() instanceof MotorDiesel){
            gasBought = cashSpent / this.gasStation.getDieselPrice();
            this.vehicle.setFuelLeft(this.vehicle.getFuelLeft() + gasBought);
            this.gasStation.setDieselStocks(this.gasStation.getDieselStocks() - gasBought);
            System.out.println("You have put " + gasBought + "L in your tank for " + cashSpent + "E." );
            System.out.println("You have " + cashLeft + "E left.");
            System.out.println("You should be able to drive for about " + this.vehicle.getFuelLeft() / this.vehicle.getMotor().getFuelEfficiency() + "km.");
        } else if (this.vehicle.getMotor() instanceof MotorEssence){
            this.vehicle.setFuelLeft(this.vehicle.getFuelLeft() + (cashSpent / this.gasStation.getEssencePrice()));
        } else if (this.vehicle.getMotor() instanceof MotorElectrique){
            this.vehicle.setFuelLeft(this.vehicle.getFuelLeft() + (cashSpent / this.gasStation.getElectricityPrice()));
        }
    }   cash -= cashSpent;
        System.out.println("You have put " + gasBought + "L in your tank for " + cashSpent + "E." );
        System.out.println("You have " + cashLeft + "E left.");
        System.out.println("You should be able to drive for about " + this.vehicle.getFuelLeft() / this.vehicle.getMotor().getFuelEfficiency() + "km.");

    }


    //getters & setters
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "cash=" + cash +
                ", vehicle=" + vehicle +
                '}';
    }
}
