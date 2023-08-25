package PartOne;

public abstract class Car {

    private String description;

    public void startEngine(String carType){
        System.out.println(carType + " car Engine started");
    }

    public void drive(String carType){
        System.out.println("Driving the " + carType + " car");
    }

    protected void runEngine(String carType){
        System.out.println("Just running the engine of " + carType);
    }
}
