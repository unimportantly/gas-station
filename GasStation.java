package Vehicules;

public class GasStation {

    //attributes
    private double dieselPrice;
    private double essencePrice;
    private double electricityPrice;
    private double dieselStocks;
    private double essenceStocks;
    private double electricityStocks;
    private boolean hasAnyGas = true;

    //constructors
    public GasStation(double dieselPrice, double essencePrice, double electricityPrice, double dieselStocks, double essenceStocks, double electricityStocks) {
        this.dieselPrice = dieselPrice;
        this.essencePrice = essencePrice;
        this.electricityPrice = electricityPrice;
        this.dieselStocks = dieselStocks;
        this.essenceStocks = essenceStocks;
        this.electricityStocks = electricityStocks;
    }
    //methods

    //getters & setters
    public double getDieselPrice() {
        return dieselPrice;
    }
    public void setDieselPrice(double dieselPrice) {
        this.dieselPrice = dieselPrice;
    }
    public double getEssencePrice() {
        return essencePrice;
    }
    public void setEssencePrice(double essencePrice) {
        this.essencePrice = essencePrice;
    }
    public double getElectricityPrice() {
        return electricityPrice;
    }
    public void setElectricityPrice(double electricityPrice) {
        this.electricityPrice = electricityPrice;
    }
    public double getDieselStocks() {
        return dieselStocks;
    }
    public void setDieselStocks(double dieselStocks) {
        this.dieselStocks = dieselStocks;
    }
    public double getEssenceStocks() {
        return essenceStocks;
    }
    public void setEssenceStocks(double essenceStocks) {
        this.essenceStocks = essenceStocks;
    }
    public double getElectricityStocks() {
        return electricityStocks;
    }
    public void setElectricityStocks(double electricityStocks) {
        this.electricityStocks = electricityStocks;
    }
    public boolean isHasAnyGas() {
        return hasAnyGas;
    }
    public void setHasAnyGas(boolean hasAnyGas) {
        this.hasAnyGas = hasAnyGas;
    }
}
