public abstract class Car {

    protected int engineCapacity;
    protected String make;
    protected String model;

    public Car(int engineCapacity, String make, String model) {
        this.engineCapacity = engineCapacity;
        this.make = make;
        this.model = model;
    }

    public abstract void driveCar();
    public abstract void listSpecs();
}
