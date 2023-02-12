package Super;

public class Car extends Vehicle{
    private String make;
    private String model;
    private String variant;

    public Car() {
    }

    public Car(int numberOfWheels, int engineVolumeInCC, String fuelType, boolean isHybrid, boolean isTurboCharged, String make, String model, String variant) {
        super(numberOfWheels, engineVolumeInCC, fuelType, isHybrid, isTurboCharged,engineVolumeInCC < 1000 ? "Small" : (engineVolumeInCC > 1500 ? "Large" : "Medium"));
        this.make = make;
        this.model = model;
        this.variant = variant;
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.println("Propelled by two front wheels which were powered by a " + super.getEngineVolumeInCC() + " cc engine.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", variant='" + variant + '\'' +
                "} " + super.toString();
    }
}
