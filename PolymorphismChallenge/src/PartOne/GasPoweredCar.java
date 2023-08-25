package PartOne;

public class GasPoweredCar extends Car{
    public void startEngine(String carType) {
        super.startEngine(this.getClass().getSimpleName());
    }

    public void drive(String carType) {
        super.drive(this.getClass().getSimpleName());
    }

    protected void runEngine(String carType) {
        super.runEngine(this.getClass().getSimpleName());
    }
}
