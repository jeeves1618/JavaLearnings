package Super;

public class Bike extends Vehicle{
    private String make;
    private String model;
    private String variant;

    public Bike() {
    }

    public Bike(int numberOfWheels, int engineVolumeInCC, String fuelType, boolean isHybrid, boolean isTurboCharged, String make, String model, String variant) {
        super(numberOfWheels, engineVolumeInCC, fuelType, isHybrid, isTurboCharged,engineVolumeInCC < 100 ? "Small" : (engineVolumeInCC > 150 ? "Large" : "Medium"));
        this.make = make;
        this.model = model;
        this.variant = variant;
    }

    @Override
    public void moveForward() {
        super.moveForward();
        System.out.println("Propelled by the rear wheels which is powered by a " + super.getEngineVolumeInCC() + " cc engine.");
    }

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", variant='" + variant + '\'' +
                "} " + super.toString();
    }
}
