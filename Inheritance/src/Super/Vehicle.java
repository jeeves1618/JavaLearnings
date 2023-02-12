package Super;

public class Vehicle {

    private int numberOfWheels;
    private int engineVolumeInCC;
    private String fuelType;
    private boolean isHybrid;
    private boolean isTurboCharged;
    private String vehicleClass;

    public Vehicle() {
    }

    public Vehicle(int numberOfWheels, int engineVolumeInCC, String fuelType, boolean isHybrid, boolean isTurboCharged, String vehicleClass) {
        this.numberOfWheels = numberOfWheels;
        this.engineVolumeInCC = engineVolumeInCC;
        this.fuelType = fuelType;
        this.isHybrid = isHybrid;
        this.isTurboCharged = isTurboCharged;
        this.vehicleClass = vehicleClass;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getEngineVolumeInCC() {
        return engineVolumeInCC;
    }

    public void setEngineVolumeInCC(int engineVolumeInCC) {
        this.engineVolumeInCC = engineVolumeInCC;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public void setHybrid(boolean hybrid) {
        isHybrid = hybrid;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }

    public void moveForward(){
        System.out.println("Vehicle is moving forward");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfWheels=" + numberOfWheels +
                ", engineVolumeInCC=" + engineVolumeInCC +
                ", fuelType='" + fuelType + '\'' +
                ", isHybrid=" + isHybrid +
                ", isTurboCharged=" + isTurboCharged +
                ", vehicleClass='" + vehicleClass + '\'' +
                '}';
    }
}
