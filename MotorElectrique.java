package Vehicules;

public class MotorElectrique  extends Motor {

        //attributes
        private String greenness;

        //constructors
        public MotorElectrique() {
            super();
        }
        public MotorElectrique(double speed, double mileage, double fuelEfficiency) {
            super(speed, mileage, fuelEfficiency);
        }
        public MotorElectrique(double speed, double mileage, double fuelEfficiency, String greenness) {
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
            return "MotorElectrique{" +
                    "greenness='" + greenness + '\'' +
                    '}';
        }
    }
