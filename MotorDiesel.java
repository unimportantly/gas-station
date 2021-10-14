package Vehicules;

public class MotorDiesel extends Motor {

    //attributes
    private String greenness;

    //constructors
    public MotorDiesel() {
        super();
    }
    public MotorDiesel(double speed, double mileage, double fuelEfficiency) {
        super(speed, mileage, fuelEfficiency);
    }
    public MotorDiesel(double speed, double mileage, double fuelEfficiency, String greenness) {
        super(speed, mileage, fuelEfficiency);
        this.greenness = greenness;
    }
    //methods


    //getter & setter
    public String getGreenness() {
        return greenness;
    }
    public void setGreenness(String greenness) {
        this.greenness = greenness;
    }

    @Override
    public String toString() {
        return "MotorDiesel{" +
                "greenness='" + greenness + '\'' +
                '}';
    }
}
